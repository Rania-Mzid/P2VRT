package frames;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.UIManager;
import javax.swing.JRadioButton;

public class FirstStep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	final JLabel label = new JLabel();
	int showSemso = 0;
	int PU = 0;
	
	/** Launch the application */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					File path = null;
					FirstStep frame = new FirstStep(path);
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
	
	
	public void setInvisible(JLabel L, JRadioButton B1, JRadioButton B2) {
		B1.setVisible(false);
		B2.setVisible(false);
		L.setVisible(false);
	}
	
	
	public void setVisible(JLabel L, JRadioButton B1, JRadioButton B2) {
		B1.setVisible(true);
		B2.setVisible(true);
		L.setVisible(true);
	}
	

	/** Create the frame */
	public FirstStep(File path) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Images\\ToolIcon.png"));
		setBackground(UIManager.getColor("CheckBox.background"));
		setTitle("P2VRTOOL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please              answer these questions in order to import the appropriate pattern.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 20, 839, 19);
		contentPane.add(lblNewLabel_1);
		
/************************************************   Independent Tasks   ************************************************************/
		JLabel lblNewLabel_1_1 = new JLabel("Which metric you want to evaluate :");
		lblNewLabel_1_1.setForeground(new Color(245, 245, 245));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBackground(Color.GRAY);
		lblNewLabel_1_1.setBounds(32, 83, 356, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Does your Architectural Model present dependent tasks ?");
		lblNewLabel_1_1_1.setForeground(new Color(245, 245, 245));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBackground(Color.GRAY);
		lblNewLabel_1_1_1.setBounds(32, 128, 440, 30);
		lblNewLabel_1_1_1.setVisible(false);
		contentPane.add(lblNewLabel_1_1_1);
		
		JRadioButton rdbtnNo_4 = new JRadioButton("No");
		buttonGroup_5.add(rdbtnNo_4);
		rdbtnNo_4.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNo_4.setForeground(new Color(0, 0, 0));
		rdbtnNo_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNo_4.setBackground(new Color(64, 224, 208));
		rdbtnNo_4.setBounds(695, 302, 56, 30);
		rdbtnNo_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(rdbtnNo_4);
		rdbtnNo_4.setVisible(false);
		rdbtnNo_4.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo_4.isSelected() ) {
					String[] options = {"DMIT", "RMCT", "DMCT"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(rdbtnNo_4),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});
		
		JRadioButton rdbtnYes_4 = new JRadioButton("Yes");
		buttonGroup_5.add(rdbtnYes_4);
		rdbtnYes_4.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnYes_4.setForeground(new Color(0, 0, 0));
		rdbtnYes_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnYes_4.setBackground(new Color(64, 224, 208));
		rdbtnYes_4.setBounds(535, 302, 67, 30);
		rdbtnYes_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(rdbtnYes_4);
		rdbtnYes_4.setVisible(false);
		rdbtnYes_4.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnYes_4.isSelected() ) {
					String[] options = {"OptimalDT"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(rdbtnYes_4),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});	
		
		JRadioButton rdbtnNo_3 = new JRadioButton("No");
		buttonGroup_5.add(rdbtnNo_3);
		rdbtnNo_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNo_3.setForeground(new Color(0, 0, 0));
		rdbtnNo_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNo_3.setBackground(new Color(216, 191, 216));
		rdbtnNo_3.setBounds(695, 302, 56, 30);
		rdbtnNo_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(rdbtnNo_3);
		rdbtnNo_3.setVisible(false);
		rdbtnNo_3.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNo_3.isSelected() ) {
					String[] options = {"RMIT"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(rdbtnNo_3),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});
		
		JRadioButton rdbtnYes_3 = new JRadioButton("Yes");
		buttonGroup_5.add(rdbtnYes_3);
		rdbtnYes_3.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnYes_3.setForeground(new Color(0, 0, 0));
		rdbtnYes_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnYes_3.setBackground(new Color(64, 224, 208));
		rdbtnYes_3.setBounds(535, 302, 67, 30);
		rdbtnYes_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(rdbtnYes_3);
		rdbtnYes_3.setVisible(false);
		rdbtnYes_3.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnYes_3.isSelected() ) {
					String[] options = {"OptimalRT"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(rdbtnYes_3),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});
/*********************************************************************************************************************************/
		
/************************************************   Dependent Tasks   ************************************************************/
		JLabel labesl1 = new JLabel("Do you have any shared resources in your model ?");
		labesl1.setForeground(new Color(245, 245, 245));
		labesl1.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl1.setBackground(Color.GRAY);
		labesl1.setBounds(32, 174, 451, 25);
		contentPane.add(labesl1);
		labesl1.setVisible(false);
		
		JLabel labesl2 = new JLabel("Do you have any precedence constraints in your model ?");
		labesl2.setForeground(new Color(245, 245, 245));
		labesl2.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl2.setBackground(Color.GRAY);
		labesl2.setBounds(32, 216, 440, 30);
		contentPane.add(labesl2);
		labesl2.setVisible(false);
		
		JLabel labesl3 = new JLabel("Is all tasks with precedence constraints are assigned to the");
		labesl3.setForeground(new Color(245, 245, 245));
		labesl3.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl3.setBackground(Color.GRAY);
		labesl3.setBounds(32, 256, 480, 34);
		contentPane.add(labesl3);
		labesl3.setVisible(false);
		
		JLabel labesl33 = new JLabel("same processor ?");
		labesl33.setForeground(new Color(245, 245, 245));
		labesl33.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl33.setBackground(Color.GRAY);
		labesl33.setBounds(32, 275, 480, 34);
		contentPane.add(labesl33);
		labesl33.setVisible(false);
		
		
		JLabel labesl4 = new JLabel("Is all tasks with precedence constraints are assigned to the");
		labesl4.setForeground(new Color(245, 245, 245));
		labesl4.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl4.setBackground(Color.GRAY);
		labesl4.setBounds(32, 316, 480, 32);
		contentPane.add(labesl4);
		labesl4.setVisible(false);
		
		JLabel labesl44 = new JLabel("different processors ?");
		labesl44.setForeground(new Color(245, 245, 245));
		labesl44.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl44.setBackground(Color.GRAY);
		labesl44.setBounds(32, 335, 480, 32);
		contentPane.add(labesl44);
		labesl44.setVisible(false);
		
		
		JLabel labesl5 = new JLabel("Is all tasks with precedence constraints are assigned to the");
		labesl5.setForeground(new Color(245, 245, 245));
		labesl5.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl5.setBackground(Color.GRAY);
		labesl5.setBounds(32, 216, 480, 30);
		contentPane.add(labesl5);
		labesl5.setVisible(false);
		
		JLabel labesl55 = new JLabel("same processor ?");
		labesl55.setForeground(new Color(245, 245, 245));
		labesl55.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl55.setBackground(Color.GRAY);
		labesl55.setBounds(32, 235, 440, 30);
		contentPane.add(labesl55);
		labesl55.setVisible(false);
		
		JLabel labesl6 = new JLabel("Is all tasks with precedence constraints are assigned to the");
		labesl6.setForeground(new Color(245, 245, 245));
		labesl6.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl6.setBackground(Color.GRAY);
		labesl6.setBounds(32, 275, 480, 34);
		contentPane.add(labesl6);
		labesl6.setVisible(false);
		
		JLabel labesl66 = new JLabel("different processors ?");
		labesl66.setForeground(new Color(245, 245, 245));
		labesl66.setFont(new Font("Tahoma", Font.BOLD, 15));
		labesl66.setBackground(Color.GRAY);
		labesl66.setBounds(32, 294, 434, 34);
		contentPane.add(labesl66);
		labesl66.setVisible(false);
		
		JRadioButton RbtnNo4 = new JRadioButton("No");
		buttonGroup_5.add(RbtnNo4);
		RbtnNo4.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnNo4.setForeground(new Color(0, 0, 0));
		RbtnNo4.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnNo4.setBackground(new Color(64, 224, 208));
		RbtnNo4.setBounds(695, 318, 56, 30);
		RbtnNo4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnNo4);
		RbtnNo4.setVisible(false);
		RbtnNo4.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RbtnNo4.isSelected() ) {
					showSemso = 1;
					String[] options = {"FPSR_FPCT_FPPC","RMSR_RMCT_RMPC","DMSR_DMCT_DMPC"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnNo4),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});
		
		JRadioButton RbtnYes4 = new JRadioButton("Yes");
		buttonGroup_5.add(RbtnYes4);
		RbtnYes4.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnYes4.setForeground(new Color(0, 0, 0));
		RbtnYes4.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnYes4.setBackground(new Color(64, 224, 208));
		RbtnYes4.setBounds(535, 318, 67, 30);
		RbtnYes4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnYes4);
		RbtnYes4.setVisible(false);
		RbtnYes4.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(RbtnYes4.isSelected() ) {
					showSemso = 1;
					String[] options = {"FPSR_FPCT","RMSR_RMCT","DMSR_DMCT"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnYes4),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});	
		
		JRadioButton RbtnYes6 = new JRadioButton("Yes");
		buttonGroup_4.add(RbtnYes6);
		RbtnYes6.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnYes6.setForeground(new Color(0, 0, 0));
		RbtnYes6.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnYes6.setBackground(new Color(64, 224, 208));
		RbtnYes6.setBounds(535, 278, 67, 30);
		RbtnYes6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnYes6);
		RbtnYes6.setVisible(false);
		RbtnYes6.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_5.clearSelection();
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnYes6.isSelected()) {
					showSemso = 1;
					String[] options = {"FPCT", "RMCT", "DMCT"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnYes6),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});

		JRadioButton RbtnNo6 = new JRadioButton("No");
		buttonGroup_4.add(RbtnNo6);
		RbtnNo6.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnNo6.setForeground(new Color(0, 0, 0));
		RbtnNo6.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnNo6.setBackground(new Color(64, 224, 208));
		RbtnNo6.setBounds(695, 278, 56, 30);
		RbtnNo6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnNo6);
		RbtnNo6.setVisible(false);
		RbtnNo6.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_5.clearSelection();
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnNo6.isSelected() ) {
					showSemso = 1;
					String[] options = {"FPPC_FPCT","RMPC_RMCT","DMPC_DMCT"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnNo6),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});
		
		
		
		JRadioButton RbtnYes3 = new JRadioButton("Yes");
		buttonGroup_4.add(RbtnYes3);
		RbtnYes3.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnYes3.setForeground(new Color(0, 0, 0));
		RbtnYes3.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnYes3.setBackground(new Color(64, 224, 208));
		RbtnYes3.setBounds(535, 260, 67, 30);
		RbtnYes3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnYes3);
		RbtnYes3.setVisible(false);
		RbtnYes3.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_5.clearSelection();
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				if(RbtnYes3.isSelected() ) {
					setInvisible(labesl4,RbtnNo4,RbtnYes4);
					labesl44.setVisible(false);
					String[] options = {"FPSR_FPPC","RMSR_RMPC","DMSR_DMPC"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnYes3),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});

		JRadioButton RbtnNo3 = new JRadioButton("No");
		buttonGroup_4.add(RbtnNo3);
		RbtnNo3.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnNo3.setForeground(new Color(0, 0, 0));
		RbtnNo3.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnNo3.setBackground(new Color(64, 224, 208));
		RbtnNo3.setBounds(695, 260, 56, 30);
		RbtnNo3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnNo3);
		RbtnNo3.setVisible(false);
		RbtnNo3.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_5.clearSelection();
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				if(RbtnNo3.isSelected() ) {
					setVisible(labesl4,RbtnNo4,RbtnYes4);
					labesl44.setVisible(true);
				}
			}
		});
		
		JRadioButton RbtnNo2 = new JRadioButton("No");
		buttonGroup_3.add(RbtnNo2);
		RbtnNo2.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnNo2.setForeground(new Color(0, 0, 0));
		RbtnNo2.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnNo2.setBackground(new Color(64, 224, 208));
		RbtnNo2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		RbtnNo2.setBounds(695, 217, 56, 30);
		contentPane.add(RbtnNo2);
		RbtnNo2.setVisible(false);
		RbtnNo2.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnNo2.isSelected() ) {
			        String[] options = {"FPSR","RMSR","DMSR"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnNo2),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
			        
				}else {
					setVisible(labesl3,RbtnNo3,RbtnYes3);
					labesl33.setVisible(true);
				}
			}
		});
		
		JRadioButton RbtnYes2 = new JRadioButton("Yes");
		buttonGroup_3.add(RbtnYes2);
		RbtnYes2.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnYes2.setForeground(new Color(0, 0, 0));
		RbtnYes2.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnYes2.setBackground(new Color(64, 224, 208));
		RbtnYes2.setBounds(535, 217, 67, 30);
		RbtnYes2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnYes2);
		RbtnYes2.setVisible(false);
		RbtnYes2.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnYes2.isSelected() ) {
					setVisible(labesl3,RbtnNo3,RbtnYes3);
					labesl33.setVisible(true);
				}else {
					setInvisible(labesl3,RbtnNo3,RbtnYes3);
					labesl33.setVisible(false);
				}
			}
		});
		
		JRadioButton RbtnNo5 = new JRadioButton("No");
		buttonGroup_3.add(RbtnNo5);
		RbtnNo5.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnNo5.setForeground(new Color(0, 0, 0));
		RbtnNo5.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnNo5.setBackground(new Color(64, 224, 208));
		RbtnNo5.setBounds(695, 217, 56, 30);
		RbtnNo5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnNo5);
		RbtnNo5.setVisible(false);
		RbtnNo5.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnNo5.isSelected() ) {
					setVisible(labesl6,RbtnNo6,RbtnYes6);
					labesl66.setVisible(true);
				}
			}
		});
		
		JRadioButton RbtnYes5 = new JRadioButton("Yes");
		buttonGroup_3.add(RbtnYes5);
		RbtnYes5.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnYes5.setForeground(new Color(0, 0, 0));
		RbtnYes5.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnYes5.setBackground(new Color(64, 224, 208));
		RbtnYes5.setBounds(535, 217, 67, 30);
		RbtnYes5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnYes5);
		RbtnYes5.setVisible(false);
		RbtnYes5.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnYes5.isSelected() ) {
					String[] options = {"FPPC","RMPC","DMPC"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnYes5),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});
		
		
		JRadioButton RbtnYes1 = new JRadioButton("Yes");
		buttonGroup_2.add(RbtnYes1);
		RbtnYes1.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnYes1.setForeground(new Color(0, 0, 0));
		RbtnYes1.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnYes1.setBackground(new Color(64, 224, 208));
		RbtnYes1.setBounds(535, 172, 67, 30);
		RbtnYes1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnYes1);
		RbtnYes1.setVisible(false);
		RbtnYes1.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl5,RbtnNo5,RbtnYes5);
				labesl55.setVisible(false);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnYes1.isSelected() ) {
					setVisible(labesl2,RbtnNo2,RbtnYes2);
				}else {
					setInvisible(labesl2,RbtnNo2,RbtnYes2);
				}
			}
		});
		
		JRadioButton RbtnNo1 = new JRadioButton("No");
		buttonGroup_2.add(RbtnNo1);
		RbtnNo1.setHorizontalAlignment(SwingConstants.CENTER);
		RbtnNo1.setForeground(new Color(0, 0, 0));
		RbtnNo1.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnNo1.setBackground(new Color(64, 224, 208));
		RbtnNo1.setBounds(695, 172, 56, 30);
		RbtnNo1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(RbtnNo1);
		RbtnNo1.setVisible(false);
		RbtnNo1.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl5,RbtnNo5,RbtnYes5);
				labesl55.setVisible(false);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				if(RbtnNo1.isSelected() ) {
					setVisible(labesl5,RbtnNo5,RbtnYes5);
					labesl55.setVisible(true);
				}else {
					setInvisible(labesl5,RbtnNo5,RbtnYes5);
					labesl55.setVisible(false);
				}
			}
		});

/*********************************************************************************************************************************/

		
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		buttonGroup_1.add(rdbtnYes);
		rdbtnYes.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnYes.setForeground(new Color(0, 0, 0));
		rdbtnYes.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnYes.setBackground(new Color(64, 224, 208));
		rdbtnYes.setBounds(535, 128, 67, 30);
		rdbtnYes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnYes.setVisible(false);
		contentPane.add(rdbtnYes);
		rdbtnYes.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_2.clearSelection();
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				setInvisible(labesl5,RbtnNo5,RbtnYes5);
				labesl55.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				if(rdbtnYes.isSelected() ) {
					setVisible(labesl1,RbtnYes1,RbtnNo1);
				}
			}
		});
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		buttonGroup_1.add(rdbtnNo);
		rdbtnNo.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNo.setForeground(new Color(0, 0, 0));
		rdbtnNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnNo.setBackground(new Color(64, 224, 208));
		rdbtnNo.setBounds(695, 128, 56, 30);
		rdbtnNo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(rdbtnNo);
		rdbtnNo.setVisible(false);
		rdbtnNo.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_2.clearSelection();
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				setInvisible(labesl5,RbtnNo5,RbtnYes5);
				labesl55.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				if(rdbtnNo.isSelected() ) {
					setInvisible(labesl1,RbtnYes1,RbtnNo1);
					String[] options = {"FPIT","RMIT","DMIT","OptimalRM","OptimalDM"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(RbtnYes5),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}
			}
		});
		
		JRadioButton ResponseTimeBtn = new JRadioButton("Response Time");
		buttonGroup_6.add(ResponseTimeBtn);
		ResponseTimeBtn.setHorizontalAlignment(SwingConstants.CENTER);
		ResponseTimeBtn.setForeground(new Color(0, 0, 0));
		ResponseTimeBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		ResponseTimeBtn.setBackground(new Color(64, 224, 208));
		ResponseTimeBtn.setBounds(695, 83, 136, 30);
		ResponseTimeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(ResponseTimeBtn);
		ResponseTimeBtn.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl1,RbtnNo1,RbtnYes1);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				setInvisible(labesl5,RbtnNo5,RbtnYes5);
				labesl55.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				if(ResponseTimeBtn.isSelected() ) {
					setVisible(lblNewLabel_1_1_1,rdbtnNo,rdbtnYes);
				}else {
					setInvisible(lblNewLabel_1_1_1,rdbtnNo,rdbtnYes);
				}
			}
		});
		
		JRadioButton ProcessUtilizationBtn = new JRadioButton("Process utilization");
		buttonGroup_6.add(ProcessUtilizationBtn);
		ProcessUtilizationBtn.setHorizontalAlignment(SwingConstants.CENTER);
		ProcessUtilizationBtn.setForeground(new Color(0, 0, 0));
		ProcessUtilizationBtn.setFont(new Font("Tahoma", Font.BOLD, 13));
		ProcessUtilizationBtn.setBackground(new Color(64, 224, 208));
		ProcessUtilizationBtn.setBounds(535, 83, 158, 30);
		ProcessUtilizationBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(ProcessUtilizationBtn);
		ProcessUtilizationBtn.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
				buttonGroup_3.clearSelection();
				buttonGroup_4.clearSelection();
				buttonGroup_5.clearSelection();
				setInvisible(labesl2,RbtnNo2,RbtnYes2);
				setInvisible(labesl3,RbtnNo3,RbtnYes3);
				labesl33.setVisible(false);
				setInvisible(labesl1,RbtnNo1,RbtnYes1);
				setInvisible(labesl4,RbtnNo4,RbtnYes4);
				labesl44.setVisible(false);
				setInvisible(labesl5,RbtnNo5,RbtnYes5);
				labesl55.setVisible(false);
				setInvisible(labesl6,RbtnNo6,RbtnYes6);
				labesl66.setVisible(false);
				if(ProcessUtilizationBtn.isSelected() ) {
					setInvisible(lblNewLabel_1_1_1,rdbtnNo,rdbtnYes);
					PU = 1;
					String[] options = {"PUFP"}; 
					PatternsList PLframe = new PatternsList(options,path,(FirstStep) SwingUtilities.getRoot(ProcessUtilizationBtn),showSemso,PU);
					PLframe.setLocationRelativeTo(null);
					PLframe.setVisible(true);
				}else {
					setVisible(lblNewLabel_1_1_1,rdbtnNo,rdbtnYes);
				}
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("carefully");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(198, 20, 56, 19);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 224, 208));
		panel_1.setBounds(517, 64, 343, 324);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 64, 517, 324);
		contentPane.add(panel);
		
		JButton btnPrevious = new JButton("Previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainWindow frame = new MainWindow(1,null,0,0,"",null);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		btnPrevious.setForeground(Color.WHITE);
		btnPrevious.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrevious.setBackground(new Color(25, 25, 112));
		btnPrevious.setBounds(30, 415, 115, 35);
		btnPrevious.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnPrevious);
		
	}
}