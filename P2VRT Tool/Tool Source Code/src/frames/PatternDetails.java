package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
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
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.SystemColor;


public class PatternDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/** Launch the application */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					File path = null;
					String name = null;
					int showSemso = 0;
					int PU = 0;
					PatternDetails frame = new PatternDetails(name, path,showSemso,PU);
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
	@SuppressWarnings("resource")
	public PatternDetails(String name,File path,int showSemso, int PU) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Images\\ToolIcon.png"));
		setBackground(UIManager.getColor("CheckBox.background"));
		setTitle("P2VRTOOL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 629);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel(name+" "+"Pattern");
		lblNewLabel_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel_3.setBackground(SystemColor.menu);
		lblNewLabel_3.setBounds(10, 26, 834, 43);
		contentPane.add(lblNewLabel_3);
		
		JButton ConfirmBtn = new JButton("Next");
		ConfirmBtn.setForeground(Color.WHITE);
		ConfirmBtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		ConfirmBtn.setBackground(new Color(25, 25, 112));
		ConfirmBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ConfirmBtn.setBounds(718, 521, 97, 35);
		contentPane.add(ConfirmBtn);
		ConfirmBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = {"Yes, please", "No, thanks"};
				int input = JOptionPane.showOptionDialog(null,
				    "Did you want to upload this pattern ?",
				    "Question",
				    JOptionPane.YES_NO_OPTION,
				    JOptionPane.QUESTION_MESSAGE,
				    null,
				    options,
				    options[0]);
				if(input == JOptionPane.YES_OPTION){
					//Create new directory
					String fileName = (String) path.getPath().subSequence(0, path.getPath().length()-path.getName().length());	
					String fileNamef = (String) path.getPath().subSequence(0, path.getPath().length()-(path.getName().length()+1))+"_"+name+"/";	
					File src = Paths.get(fileName).toFile();
				    File dest = Paths.get(fileNamef).toFile();
				    try{
				      copy(src, dest);
				    }catch(IOException ex){
				      ex.printStackTrace();
				    }
				    
				    //Copy pattern file
				    File uploadedFile = new File(this.getClass().getResource("/"+name+".profile.uml").getFile());
				    try {
						Files.copy(uploadedFile.toPath(), Paths.get(fileNamef+name+".profile.uml"), StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				    
				    dispose();	
					MainWindow frame = new MainWindow(2, null, showSemso, PU, name,path);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					JOptionPane.showMessageDialog(null, "The profile of the chosen pattern is successfully downloaded  ✔.");
				}
			}
		});
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setForeground(Color.WHITE);
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrevious.setBackground(new Color(25, 25, 112));
		btnPrevious.setBounds(43, 521, 115, 35);
		btnPrevious.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnPrevious);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.white);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/"+name+".PNG"));
		Image image = imageIcon.getImage(); 
		Image newimg = image.getScaledInstance(430, 260,  java.awt.Image.SCALE_SMOOTH);
		ImageIcon newImageIcon = new ImageIcon(newimg);	
		lblNewLabel.setIcon(newImageIcon);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(376, 124, 455, 324);
		contentPane.add(lblNewLabel);
		
		String desc = "";
		if(name.equals("FPPC_FPCT")) {
			desc = "FPPC_FPCT pattern solved the problem when the dependency between tasks is presented by precedence constraints with the existence also of tasks that communicate through messages at the same time. The FPPC_FPCT pattern is applicable when the model describing the real-time application is defined as a set of messages, networks, processors and tasks, dependent, periodic or sporadic. Moreover, the different tasks of this pattern can be assigned to the same or to different processors according to the needs. The structure of this pattern is presented in the figure on the right. This pattern defines the result of the collaboration of the Fixed Priority precedence Constraint (FPPC) pattern and the Fixed Priority precedence Constraint (FPCT) pattern.";
		}else if(name.equals("PUFP")) {
			desc = "This pattern defines a computational model as a collection of tasks and execution nodes (i.e., processors) in order to measure the processor utilization factor of a given task set. The worst case execution time and period are assigned to each task. Capacity can be used to define an execution node. It also defines how tasks are distributed across processors.";
		}else {
			desc = "This pattern is a specialization of the FPIT pattern. The priority of a task in this pattern is automatically assigned using the Rate Monotonic algorithm.";
		}
		
		/*
	    int i; 
	    try {
			while ((i=new FileReader(this.getClass().getResource("/"+name+".txt").getPath()).read()) != -1) 
			  desc = desc + (char) i;
		} catch (IOException e1) {
			e1.printStackTrace();
		} */
		
		JLabel lblNewLabel_1 = new JLabel("<html>"+desc+"</html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(43, 105, 334, 375);
		contentPane.add(lblNewLabel_1);
		
		
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				FirstStep frame = new FirstStep(path);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
	}
}