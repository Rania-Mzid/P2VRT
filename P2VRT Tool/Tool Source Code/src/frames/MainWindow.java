package frames;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JRadioButton;


public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFileChooser openFileChooser;
	private BufferedImage originalBI;
	private JTextField textField1;
	private JTextField textField2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	ArrayList<Component> Elems = new ArrayList<Component>();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	JRadioButton rdbtnMast = new JRadioButton("MAST");
	JRadioButton rdbtnCheddar = new JRadioButton("Cheddar");
	JRadioButton rdbtnSimso = new JRadioButton("SimSo");
	private File Selectedfile = null;
	
	/** Launch the application */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					int step = 1;
					int showSemso = 0;
					int PU = 0;
					File file = null;
					File Initialfile = null;
					String selected = "";
					MainWindow frame = new MainWindow(step,file,showSemso,PU,selected,Initialfile);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/** Create the frame */
	public MainWindow(Integer step, File file, int showSemso, int PU, String selected, File Initialfile) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Images\\ToolIcon.png"));
		setBackground(UIManager.getColor("CheckBox.background"));
		setTitle("P2VRTOOL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 651);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome To ");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(98, 23, 197, 44);
		contentPane.add(lblNewLabel_2);
		Elems.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("P2VRTOOL");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel_3.setBackground(SystemColor.menu);
		lblNewLabel_3.setBounds(292, 24, 190, 43);
		contentPane.add(lblNewLabel_3);
		Elems.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel(". We're");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(475, 23, 115, 44);
		contentPane.add(lblNewLabel_1);
		Elems.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Glad You're Here.");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(10, 77, 676, 44);
		contentPane.add(lblNewLabel_4);
		Elems.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("Folow these steps :");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(10, 144, 676, 32);
		contentPane.add(lblNewLabel_2_2);
		Elems.add(lblNewLabel_2_2);
		
	/*  ******************************  Step 1   *****************************   */
		
		if(step == 1) {
			JLabel lblGetyourPattern1 = new JLabel("Get your Pattern");
			lblGetyourPattern1.setForeground(new Color(25, 25, 112));
			lblGetyourPattern1.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblGetyourPattern1.setBounds(150, 206, 183, 44);
			contentPane.add(lblGetyourPattern1);
			Elems.add(lblGetyourPattern1);
			
			JLabel lblCheckyourModel1 = new JLabel("Check your Model consistency");
			lblCheckyourModel1.setEnabled(false);
			lblCheckyourModel1.setForeground(new Color(25, 25, 112));
			lblCheckyourModel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblCheckyourModel1.setBounds(222, 305, 390, 44);
			Elems.add(lblCheckyourModel1);
			contentPane.add(lblCheckyourModel1);
			
			JLabel lblVerifyyourModel1 = new JLabel("Analyze your Model");
			lblVerifyyourModel1.setEnabled(false);
			lblVerifyyourModel1.setForeground(new Color(25, 25, 112));
			lblVerifyyourModel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblVerifyyourModel1.setBounds(222, 349, 343, 44);
			Elems.add(lblVerifyyourModel1);
			contentPane.add(lblVerifyyourModel1);
			
			JPanel panel1 = new JPanel();
			panel1.setBackground(Color.DARK_GRAY);
			panel1.setBounds(160, 248, 2, 170);
			Elems.add(panel1);
			contentPane.add(panel1);
			
			JLabel lblone1 = new JLabel("1.");
			lblone1.setForeground(new Color(25, 25, 112));
			lblone1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblone1.setBounds(122, 205, 31, 44);
			Elems.add(lblone1);
			contentPane.add(lblone1);
			
			JPanel panell1 = new JPanel();
			panell1.setBackground(Color.DARK_GRAY);
			panell1.setBounds(160, 335, 16, 2);
			Elems.add(panell1);
			contentPane.add(panell1);
			
			JPanel panelgd1 = new JPanel();
			panelgd1.setBackground(Color.DARK_GRAY);
			panelgd1.setBounds(160, 378, 16, 2);
			Elems.add(panelgd1);
			contentPane.add(panelgd1);
			
			JLabel lbltwo1 = new JLabel("2.");
			lbltwo1.setEnabled(false);
			lbltwo1.setForeground(new Color(25, 25, 112));
			lbltwo1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbltwo1.setBounds(195, 305, 31, 44);
			Elems.add(lbltwo1);
			contentPane.add(lbltwo1);
			
			JLabel lblthree1 = new JLabel("3.");
			lblthree1.setEnabled(false);
			lblthree1.setForeground(new Color(25, 25, 112));
			lblthree1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblthree1.setBounds(195, 349, 31, 44);
			Elems.add(lblthree1);
			contentPane.add(lblthree1);
			
			textField1 = new JTextField("  "+"Enter your architectural model");
			textField1.setEditable(false);
			textField1.setColumns(10);
			textField1.setBounds(297, 263, 281, 32);
			Elems.add(textField1);
			contentPane.add(textField1);
			
			JButton uploadBtn1 = new JButton("Import");
			Elems.add(uploadBtn1);
			uploadBtn1.setFont(new Font("Tahoma", Font.BOLD, 15));
			uploadBtn1.setBackground(new Color(64, 224, 208));
			uploadBtn1.setBounds(195, 263, 103, 32);
			uploadBtn1.setForeground(new Color(25, 25, 112));
			uploadBtn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			contentPane.add(uploadBtn1);
			uploadBtn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int returnValue = openFileChooser.showDialog(uploadBtn1, getName());
					if(returnValue == JFileChooser.APPROVE_OPTION) {
						try {
							Selectedfile = openFileChooser.getSelectedFile();
							originalBI = ImageIO.read(Selectedfile);
							textField1.setText("  "+Selectedfile.getName());
							dispose();
							FirstStep frame = new FirstStep(Selectedfile);
							frame.setLocationRelativeTo(null);
							frame.setVisible(true);
							
						}catch(IOException ioe) {
							textField1.setText(" Failed to load UML file");
						}
					}else {
						textField1.setText(" No file chosen!");
					}
				}
			});
			
			JLabel lblGetyourcode1 = new JLabel("Get your code");
			lblGetyourcode1.setForeground(new Color(25, 25, 112));
			lblGetyourcode1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblGetyourcode1.setEnabled(false);
			lblGetyourcode1.setBounds(222, 392, 343, 44);
			Elems.add(lblGetyourcode1);
			contentPane.add(lblGetyourcode1);
			
			JLabel lblfour1 = new JLabel("4.");
			lblfour1.setForeground(new Color(25, 25, 112));
			lblfour1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblfour1.setEnabled(false);
			lblfour1.setBounds(195, 392, 31, 44);
			Elems.add(lblfour1);
			contentPane.add(lblfour1);
			
			JPanel panelez1 = new JPanel();
			panelez1.setBackground(Color.DARK_GRAY);
			panelez1.setBounds(160, 417, 16, 2);
			Elems.add(panelez1);
			contentPane.add(panelez1);
		}
		
	/*  ******************************  Step 2   *****************************   */

		if(step == 2) {
			JLabel lblVerifyyourModel2 = new JLabel("Analyze your Model");
			lblVerifyyourModel2.setEnabled(false);
			lblVerifyyourModel2.setForeground(new Color(25, 25, 112));
			lblVerifyyourModel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblVerifyyourModel2.setBounds(222, 437, 343, 44);
			Elems.add(lblVerifyyourModel2);
			contentPane.add(lblVerifyyourModel2);
			
			JPanel panelf2 = new JPanel();
			panelf2.setBackground(Color.DARK_GRAY);
			panelf2.setBounds(160, 228, 2, 21);
			Elems.add(panelf2);
			contentPane.add(panelf2);
			
			JLabel lblthree2 = new JLabel("3.");
			lblthree2.setEnabled(false);
			lblthree2.setForeground(new Color(25, 25, 112));
			lblthree2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblthree2.setBounds(195, 437, 31, 44);
			Elems.add(lblthree2);
			contentPane.add(lblthree2);
			
			JPanel panelff2 = new JPanel();
			panelff2.setBackground(Color.DARK_GRAY);
			panelff2.setBounds(160, 466, 16, 2);
			Elems.add(panelff2);
			contentPane.add(panelff2);
			
			JLabel lblone2 = new JLabel("1.");
			lblone2.setForeground(new Color(25, 25, 112));
			lblone2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblone2.setEnabled(false);
			lblone2.setBounds(195, 205, 31, 44);
			Elems.add(lblone2);
			contentPane.add(lblone2);
			
			JLabel lblGetyourPattern2 = new JLabel("Get your Pattern");
			lblGetyourPattern2.setForeground(new Color(25, 25, 112));
			lblGetyourPattern2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblGetyourPattern2.setEnabled(false);
			lblGetyourPattern2.setBounds(222, 206, 390, 44);
			Elems.add(lblGetyourPattern2);
			contentPane.add(lblGetyourPattern2);
			
			JLabel lblCheckyourModel2 = new JLabel("Check your Model consistency");
			lblCheckyourModel2.setForeground(new Color(25, 25, 112));
			lblCheckyourModel2.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblCheckyourModel2.setBounds(150, 253, 332, 44);
			Elems.add(lblCheckyourModel2);
			contentPane.add(lblCheckyourModel2);
			
			JLabel lbltwo2 = new JLabel("2.");
			lbltwo2.setForeground(new Color(25, 25, 112));
			lbltwo2.setFont(new Font("Tahoma", Font.BOLD, 20));
			lbltwo2.setBounds(122, 253, 31, 44);
			Elems.add(lbltwo2);
			contentPane.add(lbltwo2);
			
			JPanel panelfff2 = new JPanel();
			panelfff2.setBackground(Color.DARK_GRAY);
			panelfff2.setBounds(160, 228, 16, 2);
			Elems.add(panelfff2);
			contentPane.add(panelfff2);
			
			JPanel paneldf2 = new JPanel();
			paneldf2.setBackground(Color.DARK_GRAY);
			paneldf2.setBounds(160, 296, 2, 212);
			Elems.add(paneldf2);
			contentPane.add(paneldf2);
			
			textField2 = new JTextField("  "+"Enter your design model");
			textField2.setEditable(false);
			textField2.setColumns(10);
			textField2.setBounds(297, 310, 281, 32);
			Elems.add(textField2);
			contentPane.add(textField2);
			
			JLabel lblConsist = new JLabel("Following the execution of the java file, your model is :");
			lblConsist.setFont(new Font("Verdana", Font.PLAIN, 15));
			lblConsist.setBounds(195, 358, 464, 32);
			contentPane.add(lblConsist);
			lblConsist.setEnabled(false);
			
			JRadioButton rdbtnConsistent = new JRadioButton("Consistent");
			buttonGroup_2.add(rdbtnConsistent);
			rdbtnConsistent.setFont(new Font("Tahoma", Font.BOLD, 15));
			rdbtnConsistent.setBackground(SystemColor.menu);
			rdbtnConsistent.setBounds(195, 390, 121, 47);
			contentPane.add(rdbtnConsistent);
			rdbtnConsistent.setEnabled(false);
			rdbtnConsistent.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e) {
			        if(rdbtnConsistent.isSelected()) {
			        	dispose();	
						MainWindow frame = new MainWindow(3,Selectedfile, showSemso, PU, selected,Initialfile);
						frame.setLocationRelativeTo(null);
						frame.setVisible(true);
			        }
			      }
			  });
			
			JRadioButton rdbtnInconsistent = new JRadioButton("Inconsistent");
			buttonGroup_2.add(rdbtnInconsistent);
			rdbtnInconsistent.setFont(new Font("Tahoma", Font.BOLD, 15));
			rdbtnInconsistent.setBackground(SystemColor.menu);
			rdbtnInconsistent.setBounds(318, 390, 139, 47);
			contentPane.add(rdbtnInconsistent);
			rdbtnInconsistent.setEnabled(false);
			rdbtnInconsistent.addActionListener(new ActionListener(){
			    public void actionPerformed(ActionEvent e) {
			        if(rdbtnInconsistent.isSelected()) {
			        	dispose();	
						MainWindow frame = new MainWindow(2,null,showSemso,PU,selected,Initialfile);
						frame.setLocationRelativeTo(null);
						frame.setVisible(true);
						JOptionPane.showMessageDialog(null, "You have to correct your design model and try again.","Warning!",JOptionPane.ERROR_MESSAGE);
			        }
			      }
			  });
			
			JButton uploadBtn2 = new JButton("Import");
			uploadBtn2.setForeground(new Color(25, 25, 112));
			uploadBtn2.setFont(new Font("Tahoma", Font.BOLD, 15));
			uploadBtn2.setBackground(new Color(64, 224, 208));
			uploadBtn2.setBounds(195, 310, 103, 32);
			Elems.add(uploadBtn2);
			uploadBtn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			contentPane.add(uploadBtn2);
			uploadBtn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int returnValue = openFileChooser.showDialog(uploadBtn2, getName());
					
					if(returnValue == JFileChooser.APPROVE_OPTION) {
						try {
							Selectedfile = openFileChooser.getSelectedFile();
							originalBI = ImageIO.read(Selectedfile);
							textField2.setText("  "+Selectedfile.getName());	
						    File uploadedFile = new File(this.getClass().getResource("/"+selected+"_transToConsistency.txt").getFile());
							String fileName = (String) Selectedfile.getPath().subSequence(0, Selectedfile.getPath().length()-(Selectedfile.getName().length()))+"trans_models";
							File f = new File(fileName); 
							f.mkdir();
							f = new File((String) Selectedfile.getPath().subSequence(0, Selectedfile.getPath().length()-(Selectedfile.getName().length()))+"src_gen"); 
							f.mkdir();
						    try {
								Files.copy(uploadedFile.toPath(), Paths.get(fileName+"/"+selected+"_transToConsistency.txt"), StandardCopyOption.REPLACE_EXISTING);
							} catch (IOException e1) {
								e1.printStackTrace();
							}					
							JOptionPane.showMessageDialog(null, "The model that will be used to get the consistency check file is downloaded successfully ✔.");
							Selectedfile = Paths.get(fileName).toFile();
							lblConsist.setEnabled(true);
							rdbtnConsistent.setEnabled(true);
							rdbtnInconsistent.setEnabled(true);
							textField2.setEnabled(false);
							uploadBtn2.setEnabled(false);	
						}catch(IOException ioe) {
							textField2.setText(" Failed to load UML file");
							Selectedfile = null;
						}
					}else {
						textField2.setText(" No file chosen!");
						Selectedfile = null;
					}
				}
			});

			JLabel lblGetyourcode2 = new JLabel("Get your code");
			lblGetyourcode2.setForeground(new Color(25, 25, 112));
			lblGetyourcode2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblGetyourcode2.setEnabled(false);
			lblGetyourcode2.setBounds(222, 484, 343, 44);
			Elems.add(lblGetyourcode2);
			contentPane.add(lblGetyourcode2);
			
			JLabel lblfour2 = new JLabel("4.");
			lblfour2.setForeground(new Color(25, 25, 112));
			lblfour2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblfour2.setEnabled(false);
			lblfour2.setBounds(195, 484, 31, 44);
			Elems.add(lblfour2);
			contentPane.add(lblfour2);
			
			JPanel panelfdd2 = new JPanel();
			panelfdd2.setBackground(Color.DARK_GRAY);
			panelfdd2.setBounds(160, 507, 16, 2);
			Elems.add(panelfdd2);
			contentPane.add(panelfdd2);		
			
		}
		
	/*  ******************************  Step 3   *****************************   */
			
		if(step == 3) {
			JPanel paneld1 = new JPanel();
			paneld1.setBackground(Color.DARK_GRAY);
			paneld1.setBounds(160, 228, 2, 65);
			Elems.add(paneld1);
			contentPane.add(paneld1);
			
			JLabel lblone3 = new JLabel("1.");
			lblone3.setForeground(new Color(25, 25, 112));
			lblone3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblone3.setEnabled(false);
			lblone3.setBounds(195, 205, 31, 44);
			Elems.add(lblone3);
			contentPane.add(lblone3);
			
			JLabel GetyourPattern3 = new JLabel("Get your Pattern");
			GetyourPattern3.setForeground(new Color(25, 25, 112));
			GetyourPattern3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GetyourPattern3.setEnabled(false);
			GetyourPattern3.setBounds(222, 206, 390, 44);
			Elems.add(GetyourPattern3);
			contentPane.add(GetyourPattern3);
			
			JPanel panels3 = new JPanel();
			panels3.setBackground(Color.DARK_GRAY);
			panels3.setBounds(160, 228, 16, 2);
			Elems.add(panels3);
			contentPane.add(panels3);
			
			JLabel lblCheckyourModel3 = new JLabel("Check your Model consistency");
			lblCheckyourModel3.setForeground(new Color(25, 25, 112));
			lblCheckyourModel3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblCheckyourModel3.setEnabled(false);
			Elems.add(lblCheckyourModel3);
			lblCheckyourModel3.setBounds(222, 249, 343, 44);
			contentPane.add(lblCheckyourModel3);
			
			JLabel lbltwo3 = new JLabel("2.");
			lbltwo3.setForeground(new Color(25, 25, 112));
			lbltwo3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbltwo3.setEnabled(false);
			lbltwo3.setBounds(195, 248, 31, 44);
			Elems.add(lbltwo3);
			contentPane.add(lbltwo3);
			
			JLabel lblVerifyyourModel3 = new JLabel("Analyze your Model");
			lblVerifyyourModel3.setForeground(new Color(25, 25, 112));
			lblVerifyyourModel3.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblVerifyyourModel3.setBounds(150, 296, 332, 44);
			Elems.add(lblVerifyyourModel3);
			contentPane.add(lblVerifyyourModel3);
			
			JLabel lblthree3 = new JLabel("3.");
			lblthree3.setForeground(new Color(25, 25, 112));
			lblthree3.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblthree3.setBounds(122, 295, 31, 44);
			Elems.add(lblthree3);
			contentPane.add(lblthree3);
			
			JPanel panelsd3 = new JPanel();
			panelsd3.setBackground(Color.DARK_GRAY);
			panelsd3.setBounds(160, 271, 16, 2);
			Elems.add(panelsd3);
			contentPane.add(panelsd3);
			
			if(PU == 1) {
				JPanel panelss3 = new JPanel();
				panelss3.setBackground(Color.DARK_GRAY);
				panelss3.setBounds(160, 342, 2, 166);
				Elems.add(panelss3);
				contentPane.add(panelss3);
			
				JLabel lblResAnalysis = new JLabel("The Processor Utilzation Factor of your system are:");
				lblResAnalysis.setEnabled(false);
				lblResAnalysis.setFont(new Font("Verdana", Font.PLAIN, 15));
				lblResAnalysis.setBounds(195, 405, 395, 32);
				contentPane.add(lblResAnalysis);
				
				JRadioButton rdbtnInfOne = new JRadioButton("<= 1");
				buttonGroup_3.add(rdbtnInfOne);
				rdbtnInfOne.setEnabled(false);
				rdbtnInfOne.setFont(new Font("Tahoma", Font.BOLD, 15));
				rdbtnInfOne.setBackground(SystemColor.menu);
				rdbtnInfOne.setBounds(195, 437, 75, 47);
				contentPane.add(rdbtnInfOne);
				rdbtnInfOne.addActionListener(new ActionListener(){
				    public void actionPerformed(ActionEvent e) {
				        if(rdbtnInfOne.isSelected()) {
				        	Object[] options = {"Generate a code", "Performe response time analysis"};
							int input = JOptionPane.showOptionDialog(null,
							    "What would you prefer at this level ?",
							    "Question",
							    JOptionPane.YES_NO_OPTION,
							    JOptionPane.QUESTION_MESSAGE,
							    null,
							    options,
							    options[0]);
							if(input == JOptionPane.YES_OPTION){
								dispose();	
								MainWindow frame = new MainWindow(4,file,0,0,selected,null);
								frame.setLocationRelativeTo(null);
								frame.setVisible(true);
							}else {
								dispose();	
								FirstStep frame = new FirstStep(Initialfile);
								frame.setLocationRelativeTo(null);
								frame.setVisible(true);
							}
				        }
				      }
				  });
				
				JRadioButton rdbtnSupEqOne = new JRadioButton("> 1");
				buttonGroup_3.add(rdbtnSupEqOne);
				rdbtnSupEqOne.setEnabled(false);
				rdbtnSupEqOne.setFont(new Font("Tahoma", Font.BOLD, 15));
				rdbtnSupEqOne.setBackground(SystemColor.menu);
				rdbtnSupEqOne.setBounds(282, 437, 75, 47);
				contentPane.add(rdbtnSupEqOne);
				rdbtnSupEqOne.addActionListener(new ActionListener(){
				    public void actionPerformed(ActionEvent e) {
				        if(rdbtnSupEqOne.isSelected()) {
				        	dispose();	
							MainWindow frame = new MainWindow(1,null,0,0,"",null);
							frame.setLocationRelativeTo(null);
							frame.setVisible(true);
							JOptionPane.showMessageDialog(null, "There is an error, you must correct your model and try again.","Warning!",JOptionPane.ERROR_MESSAGE);
				        }
				      }
				  });
				
				JButton btnImport_1 = new JButton("Compute Utilization Factor");
				btnImport_1.setForeground(Color.DARK_GRAY);
				btnImport_1.setFont(new Font("Tahoma", Font.BOLD, 17));
				btnImport_1.setBackground(SystemColor.controlHighlight);
				btnImport_1.setBounds(195, 350, 287, 44);
				contentPane.add(btnImport_1);
				btnImport_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						File uploadedFile = new File(this.getClass().getResource("/"+selected+"_transToPU.txt").getFile());
						try {
							Files.copy(uploadedFile.toPath(), Paths.get(file+"/"+selected+"_transToPU.txt"), StandardCopyOption.REPLACE_EXISTING);
						} catch (IOException e1) {
							e1.printStackTrace();
						}	
						JOptionPane.showMessageDialog(null, "The model that will be used to compute utilization factor is downloaded successfully  ✔.");
						rdbtnInfOne.setEnabled(true);
						rdbtnSupEqOne.setEnabled(true);
						lblResAnalysis.setEnabled(true);
						btnImport_1.setEnabled(false);	
					}
				});
				
				JLabel lblGetyourcode3 = new JLabel("Get your code");
				lblGetyourcode3.setForeground(new Color(25, 25, 112));
				Elems.add(lblGetyourcode3);
				lblGetyourcode3.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblGetyourcode3.setEnabled(false);
				lblGetyourcode3.setBounds(222, 484, 343, 44);
				contentPane.add(lblGetyourcode3);
				
				JLabel lblfour3 = new JLabel("4.");
				lblfour3.setForeground(new Color(25, 25, 112));
				Elems.add(lblfour3);
				lblfour3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblfour3.setEnabled(false);
				lblfour3.setBounds(195, 484, 31, 44);
				contentPane.add(lblfour3);
				
				JPanel panelfbf3 = new JPanel();
				Elems.add(panelfbf3);
				panelfbf3.setBackground(Color.DARK_GRAY);
				panelfbf3.setBounds(160, 507, 16, 2);
				contentPane.add(panelfbf3);
			}else {
				JPanel panelss3 = new JPanel();
				panelss3.setBackground(Color.DARK_GRAY);
				panelss3.setBounds(160, 342, 2, 184);
				Elems.add(panelss3);
				contentPane.add(panelss3);
				
				JLabel lblanalysistool = new JLabel("Choose an analysis tool :");
				lblanalysistool.setFont(new Font("Verdana", Font.PLAIN, 15));
				lblanalysistool.setBounds(195, 343, 212, 32);
				Elems.add(lblanalysistool);
				contentPane.add(lblanalysistool);
				
				JLabel lblResAnalysis = new JLabel("Your analysis model is:");
				lblResAnalysis.setEnabled(false);
				lblResAnalysis.setFont(new Font("Verdana", Font.PLAIN, 15));
				lblResAnalysis.setBounds(195, 424, 312, 32);
				contentPane.add(lblResAnalysis);
				
				JRadioButton rdbtnSchedulable = new JRadioButton("Schedulable");
				buttonGroup_3.add(rdbtnSchedulable);
				rdbtnSchedulable.setEnabled(false);
				rdbtnSchedulable.setFont(new Font("Tahoma", Font.BOLD, 15));
				rdbtnSchedulable.setBackground(SystemColor.menu);
				rdbtnSchedulable.setBounds(195, 456, 120, 47);
				contentPane.add(rdbtnSchedulable);
				rdbtnSchedulable.addActionListener(new ActionListener(){
				    public void actionPerformed(ActionEvent e) {
				        if(rdbtnSchedulable.isSelected()) {
				        	dispose();	
							MainWindow frame = new MainWindow(4,file,0,0,selected,Initialfile);
							frame.setLocationRelativeTo(null);
							frame.setVisible(true);
				        }
				      }
				  });
				
				JRadioButton rdbtnNotSchedulable = new JRadioButton("Not schedulable");
				buttonGroup_3.add(rdbtnNotSchedulable);
				rdbtnNotSchedulable.setEnabled(false);
				rdbtnNotSchedulable.setFont(new Font("Tahoma", Font.BOLD, 15));
				rdbtnNotSchedulable.setBackground(SystemColor.menu);
				rdbtnNotSchedulable.setBounds(333, 456, 149, 47);
				contentPane.add(rdbtnNotSchedulable);
				rdbtnNotSchedulable.addActionListener(new ActionListener(){
				    public void actionPerformed(ActionEvent e) {
				        if(rdbtnNotSchedulable.isSelected()) {
				        	dispose();	
							MainWindow frame = new MainWindow(1,null,0,0,"",null);
							frame.setLocationRelativeTo(null);
							frame.setVisible(true);
							JOptionPane.showMessageDialog(null, "You have to correct your model and try again.","Warning!",JOptionPane.ERROR_MESSAGE);
				        }
				      }
				  });
				
				
				buttonGroup.add(rdbtnMast);
				Elems.add(rdbtnMast);
				rdbtnMast.setFont(new Font("Tahoma", Font.BOLD, 15));
				rdbtnMast.setBackground(SystemColor.control);
				rdbtnMast.setBounds(195, 375, 82, 47);
				contentPane.add(rdbtnMast);
				rdbtnMast.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				rdbtnMast.addActionListener(new ActionListener(){
				    public void actionPerformed(ActionEvent e) {
				        if(rdbtnMast.isSelected()) {
				        	File uploadedFile = new File(this.getClass().getResource("/"+selected+"_transToMast.txt").getFile());
							try {
								Files.copy(uploadedFile.toPath(), Paths.get(file+"/"+selected+"_transToMast.txt"), StandardCopyOption.REPLACE_EXISTING);
							} catch (IOException e1) {
								e1.printStackTrace();
							}	
							JOptionPane.showMessageDialog(null, "The model that will be used to get the analysis model file is downloaded successfully ✔.");
							lblResAnalysis.setEnabled(true);
							rdbtnSchedulable.setEnabled(true);
							rdbtnNotSchedulable.setEnabled(true);
							lblanalysistool.setEnabled(false);
							rdbtnMast.setEnabled(false);
							rdbtnCheddar.setEnabled(false);
							rdbtnSimso.setEnabled(false);
				        }
				      }
				  });
				
				buttonGroup.add(rdbtnCheddar);
				Elems.add(rdbtnCheddar);
				rdbtnCheddar.setFont(new Font("Tahoma", Font.BOLD, 15));
				rdbtnCheddar.setBackground(SystemColor.control);
				rdbtnCheddar.setBounds(279, 375, 96, 47);
				contentPane.add(rdbtnCheddar);
				rdbtnCheddar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				rdbtnCheddar.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
					    if(rdbtnCheddar.isSelected()) {	
					    	File uploadedFile = new File(this.getClass().getResource("/"+selected+"_transToCheddar.txt").getFile());
							try {
								Files.copy(uploadedFile.toPath(), Paths.get(file+"/"+selected+"_transToCheddar.txt"), StandardCopyOption.REPLACE_EXISTING);
							} catch (IOException e1) {
								e1.printStackTrace();
							}	
							JOptionPane.showMessageDialog(null, "The model that will be used to get the analysis model file is downloaded successfully ✔.");
							lblResAnalysis.setEnabled(true);
							rdbtnSchedulable.setEnabled(true);
							rdbtnNotSchedulable.setEnabled(true);
							lblanalysistool.setEnabled(false);
							rdbtnMast.setEnabled(false);
							rdbtnCheddar.setEnabled(false);
							rdbtnSimso.setEnabled(false);
					    }
					}
				});
				
				buttonGroup.add(rdbtnSimso);
				Elems.add(rdbtnSimso);
				rdbtnSimso.setFont(new Font("Tahoma", Font.BOLD, 15));
				rdbtnSimso.setBackground(SystemColor.menu);
				rdbtnSimso.setBounds(377, 375, 82, 47);
				contentPane.add(rdbtnSimso);
				if(showSemso == 1) {
					rdbtnSimso.setEnabled(false);
				}
				rdbtnSimso.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				rdbtnSimso.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) {
					    if(rdbtnSimso.isSelected()) {
					    	File uploadedFile = new File(this.getClass().getResource("/"+selected+"_transToSimso.txt").getFile());
							try {
								Files.copy(uploadedFile.toPath(), Paths.get(file+"/"+selected+"_transToSimso.txt"), StandardCopyOption.REPLACE_EXISTING);
							} catch (IOException e1) {
								e1.printStackTrace();
							}	
							JOptionPane.showMessageDialog(null, "The model that will be used to get the analysis model file is downloaded successfully ✔.");
							lblResAnalysis.setEnabled(true);
							rdbtnSchedulable.setEnabled(true);
							rdbtnNotSchedulable.setEnabled(true);
							lblanalysistool.setEnabled(false);
							rdbtnMast.setEnabled(false);
							rdbtnCheddar.setEnabled(false);
							rdbtnSimso.setEnabled(false);
					   }
					}
				});
				
				JLabel lblGetyourcode3 = new JLabel("Get your code");
				lblGetyourcode3.setForeground(new Color(25, 25, 112));
				Elems.add(lblGetyourcode3);
				lblGetyourcode3.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblGetyourcode3.setEnabled(false);
				lblGetyourcode3.setBounds(222, 503, 343, 44);
				contentPane.add(lblGetyourcode3);
				
				JLabel lblfour3 = new JLabel("4.");
				lblfour3.setForeground(new Color(25, 25, 112));
				Elems.add(lblfour3);
				lblfour3.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblfour3.setEnabled(false);
				lblfour3.setBounds(195, 503, 31, 44);
				contentPane.add(lblfour3);
				
				JPanel panelfbf3 = new JPanel();
				Elems.add(panelfbf3);
				panelfbf3.setBackground(Color.DARK_GRAY);
				panelfbf3.setBounds(160, 526, 16, 2);
				contentPane.add(panelfbf3);
			}
			
		}

	/*  ******************************  Step 4   *****************************   */
		if(step == 4) {
			JPanel panel4 = new JPanel();
			panel4.setBackground(Color.DARK_GRAY);
			panel4.setBounds(160, 228, 2, 108);
			Elems.add(panel4);
			contentPane.add(panel4);
			
			JLabel lblone4 = new JLabel("1.");
			lblone4.setForeground(new Color(25, 25, 112));
			lblone4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblone4.setEnabled(false);
			lblone4.setBounds(195, 205, 31, 44);
			Elems.add(lblone4);
			contentPane.add(lblone4);
			
			JLabel lblGetyourPattern4 = new JLabel("Get your Pattern");
			lblGetyourPattern4.setForeground(new Color(25, 25, 112));
			lblGetyourPattern4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblGetyourPattern4.setEnabled(false);
			lblGetyourPattern4.setBounds(222, 206, 390, 44);
			Elems.add(lblGetyourPattern4);
			contentPane.add(lblGetyourPattern4);
			
			JPanel panele4 = new JPanel();
			panele4.setBackground(Color.DARK_GRAY);
			panele4.setBounds(160, 228, 16, 2);
			Elems.add(panele4);
			contentPane.add(panele4);
			
			JLabel CheckyourModel4 = new JLabel("Check your Model consistency");
			CheckyourModel4.setForeground(new Color(25, 25, 112));
			CheckyourModel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			CheckyourModel4.setEnabled(false);
			CheckyourModel4.setBounds(222, 249, 343, 44);
			Elems.add(CheckyourModel4);
			contentPane.add(CheckyourModel4);
			
			JLabel lbltwo4 = new JLabel("2.");
			lbltwo4.setForeground(new Color(25, 25, 112));
			lbltwo4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbltwo4.setEnabled(false);
			lbltwo4.setBounds(195, 248, 31, 44);
			Elems.add(lbltwo4);
			contentPane.add(lbltwo4);
			
			JPanel panelee4 = new JPanel();
			panelee4.setBackground(Color.DARK_GRAY);
			panelee4.setBounds(160, 271, 16, 2);
			Elems.add(panelee4);
			contentPane.add(panelee4);

			JLabel lblVerifyyourModel4 = new JLabel("Analyze your Model");
			lblVerifyyourModel4.setForeground(new Color(25, 25, 112));
			lblVerifyyourModel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblVerifyyourModel4.setEnabled(false);
			lblVerifyyourModel4.setBounds(222, 292, 343, 44);
			Elems.add(lblVerifyyourModel4);
			contentPane.add(lblVerifyyourModel4);
			
			JLabel lblthree4 = new JLabel("3.");
			lblthree4.setForeground(new Color(25, 25, 112));
			lblthree4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblthree4.setEnabled(false);
			lblthree4.setBounds(195, 292, 31, 44);
			Elems.add(lblthree4);
			contentPane.add(lblthree4);
			
			JPanel paneler4 = new JPanel();
			paneler4.setBackground(Color.DARK_GRAY);
			paneler4.setBounds(160, 417, 16, 2);
			Elems.add(paneler4);
			contentPane.add(paneler4);
			
			JPanel panelerr4 = new JPanel();
			panelerr4.setBackground(Color.DARK_GRAY);
			panelerr4.setBounds(160, 315, 16, 2);
			Elems.add(panelerr4);
			contentPane.add(panelerr4);
			
			JLabel lblfour4 = new JLabel("4.");
			lblfour4.setForeground(new Color(25, 25, 112));
			lblfour4.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblfour4.setBounds(122, 339, 31, 44);
			Elems.add(lblfour4);
			contentPane.add(lblfour4);
			
			JLabel lblGetyourcode4 = new JLabel("Get your code");
			lblGetyourcode4.setForeground(new Color(25, 25, 112));
			lblGetyourcode4.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblGetyourcode4.setBounds(150, 339, 332, 44);
			Elems.add(lblGetyourcode4);
			contentPane.add(lblGetyourcode4);
			
			JButton btnImport = new JButton("Generate");
			btnImport.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnImport.setForeground(Color.DARK_GRAY);
			btnImport.setFont(new Font("Tahoma", Font.BOLD, 17));
			btnImport.setBackground(SystemColor.controlHighlight);
			btnImport.setBounds(195, 394, 131, 44);
			Elems.add(btnImport);
			contentPane.add(btnImport);
			btnImport.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					File uploadedFile = new File(this.getClass().getResource("/"+selected+"_transToPosix.txt").getFile());
					try {
						Files.copy(uploadedFile.toPath(), Paths.get(file+"/"+selected+"_transToPosix.txt"), StandardCopyOption.REPLACE_EXISTING);
					} catch (IOException e1) {
						e1.printStackTrace();
					}	
					dispose();	
					MainWindow frame = new MainWindow(1,null,0,0,"",null);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					JOptionPane.showMessageDialog(null, "Your code is successfully downloaded  ✔");
				}
			});
			
			JPanel panely4 = new JPanel();
			panely4.setBackground(Color.DARK_GRAY);
			panely4.setBounds(160, 385, 2, 32);
			Elems.add(panely4);
			contentPane.add(panely4);
		}
			
	/* *************************************************************************************** */
	
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainWindow frame = new MainWindow(1,null,0,0,"",null);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBackground(new Color(0, 0, 0));
		btnReset.setBounds(10, 569, 75, 35);
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Elems.add(btnReset);
		contentPane.add(btnReset);
		
		openFileChooser = new JFileChooser();
		openFileChooser.setCurrentDirectory(new File("C:\\Users\\mariem\\eclipse-workspace\\"));
		openFileChooser.setFileFilter(new FileNameExtensionFilter("UML files","uml"));
	}
}