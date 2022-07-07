package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.SystemColor;

public class PatternsList extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String selected;
	
	/** Launch the application */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					File path = null;
					String[] options = null;
					FirstStep FSframe = null;
					int showSemso = 0;
					int PU = 0;
					PatternsList frame = new PatternsList(options,path,FSframe,showSemso,PU);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void setWarningMsg(String text){
	    Toolkit.getDefaultToolkit().beep();
	    JOptionPane optionPane = new JOptionPane(text,JOptionPane.ERROR_MESSAGE);
	    JDialog dialog = optionPane.createDialog("Warning!");
	    dialog.setAlwaysOnTop(true);
	    dialog.setVisible(true);
	}
	
	
	
	public static void copy(File src, File dest) throws IOException{
	      if(src.isDirectory()){
	        //if the directory does not exist, create it
	        if(!dest.exists()){
	           dest.mkdir();
	           System.out.println("Directory "+ src + "  > " + dest);
	        }
	        //list the contents of the directory
	        String files[] = src.list();
	        for (String f : files) {
	           //build the structure of the src and dest files
	           File srcF = new File(src, f);
	           File destF = new File(dest, f);
	           //recursive copy
	           copy(srcF, destF);
	        }
	      }else{
	          //if src is a file, copy it.
	          InputStream in = new FileInputStream(src);
	          OutputStream out = new FileOutputStream(dest); 	                           
	          byte[] buffer = new byte[1024];
	          int length;
	          //copy the contents of the file
	          while ((length = in.read(buffer)) > 0){
	            out.write(buffer, 0, length);
	          }	 
	          in.close();
	          out.close();
	          System.out.println("File " + src + " > " + dest);
	      }
	}
	

	/** Create the frame */
	public PatternsList(String[] options, File path, FirstStep FSframe, int showSemso, int PU) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Images\\faqs.png"));
		setBackground(UIManager.getColor("CheckBox.background"));
		setTitle("Recommanded Patterns");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton ConfirmBtn = new JButton("Select");
		ConfirmBtn.setEnabled(false);
		ConfirmBtn.setForeground(new Color(255, 255, 255));
		ConfirmBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		ConfirmBtn.setBackground(Color.GRAY);
		ConfirmBtn.setBounds(205, 213, 79, 30);
		ConfirmBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(ConfirmBtn);
		ConfirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Yes, please", "No, thanks"};
				int input = JOptionPane.showOptionDialog(null,
				    "Do you want to download this pattern ?",
				    "Question",
				    JOptionPane.YES_NO_OPTION,
				    JOptionPane.QUESTION_MESSAGE,
				    null,
				    options,
				    options[0]);
				if(input == JOptionPane.YES_OPTION){
					//Create new directory
					String fileName = (String) path.getPath().subSequence(0, path.getPath().length()-path.getName().length());	
					String fileNamef = (String) path.getPath().subSequence(0, path.getPath().length()-(path.getName().length()+1))+"_"+selected+"/";	
					File src = Paths.get(fileName).toFile();
				    File dest = Paths.get(fileNamef).toFile();
				    try{
				      copy(src, dest);
				    }catch(IOException ex){
				      ex.printStackTrace();
				    }
				    
				    //Copy pattern file
				    File uploadedFile = new File(this.getClass().getResource("/"+selected+".profile.uml").getFile());
				    try {
						Files.copy(uploadedFile.toPath(), Paths.get(fileNamef+selected+".profile.uml"), StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				    
				    FSframe.dispose();
				    dispose();	
					MainWindow frame = new MainWindow(2, null, showSemso, PU, selected,path);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					JOptionPane.showMessageDialog(null, "The profile of the chosen pattern is successfully downloaded ✔.");
				}
			}
		});

		JButton btnShowDetails = new JButton("Show Details");
		btnShowDetails.setEnabled(false);
		btnShowDetails.setForeground(new Color(32, 178, 170));
		btnShowDetails.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnShowDetails.setBackground(SystemColor.control);
		btnShowDetails.setBounds(95, 213, 104, 30);
		contentPane.add(btnShowDetails);
		btnShowDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnShowDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FSframe.dispose();
				dispose();
				PatternDetails frame = new PatternDetails(selected,path,showSemso,PU);	
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
		JList<Object> list = new JList<Object>();
		list.setFont(new Font("Tahoma", Font.BOLD, 15));
		list.setModel(new AbstractListModel<Object>() {
			private static final long serialVersionUID = 1L;
			public int getSize() {
				return options.length;
			}
			public Object getElementAt(int index) {
				return options[index];
			}
		});
		list.setFixedCellHeight(30);
		list.setBounds(54, 45, 189, 150);
		contentPane.add(list);
		list.addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent e) {
				selected = list.getSelectedValue().toString();
				btnShowDetails.setEnabled(true);
				ConfirmBtn.setEnabled(true);
			}		
		});
		list.addMouseMotionListener(new MouseMotionListener(){
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				final int x = e.getX();
			    final int y = e.getY();
			    // only display a hand if the cursor is over the items
			    final Rectangle cellBounds = list.getCellBounds(0, list.getModel().getSize() - 1);
			    if (cellBounds != null && cellBounds.contains(x, y)) {
			      list.setCursor(new Cursor(Cursor.HAND_CURSOR));
			    } else {
			      list.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			    }
			}	
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 37, 274, 166);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Select one of the patterns :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(10, 0, 279, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBackground(Color.GRAY);
		btnCancel.setBounds(10, 213, 79, 30);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}
}