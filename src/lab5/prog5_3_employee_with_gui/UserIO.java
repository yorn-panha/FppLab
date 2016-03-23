package lab5.prog5_3_employee_with_gui;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import lab5.prog5_3_employee_with_gui.prog3_2_employee.Main;



public class UserIO extends JFrame  {
	//////////////constants
	private final String MAIN_LABEL = "User Input/Output Tool";
	private final String USER_INPUT = "User Input";
	private final String OUTPUT = "Output";
	private final String SUBMIT = "Submit";
	private final String CLEAR = "Clear Screen";
	private Main main;
	private static final long serialVersionUID = 1L;
	
	
	//text areas
	private JTextArea upperText;
	private JTextArea lowerText;
	
	
	//JPanels
	private JPanel mainPanel;
	private JPanel upperSubpanel;
	private JPanel middleSubpanel;
	private JPanel lowerSubpanel;	

	//altered constructor
	public UserIO() {
		
		initializeWindow();
		defineMainPanel();
		getContentPane().add(mainPanel);
		
		//pack();
			
	}
	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setSize(GuiControl.SCREEN_WIDTH,GuiControl.SCREEN_HEIGHT);
		GuiControl.centerFrameOnDesktop(this);
		
	}
	
	private void defineMainPanel() {
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(GuiControl.FILLER_COLOR);
		mainPanel.setBorder(new WindowBorder(GuiControl.WINDOW_BORDER));
		defineUpperPanel();
		defineMiddlePanel();
		defineLowerPanel();
		mainPanel.add(upperSubpanel,BorderLayout.NORTH);
		mainPanel.add(middleSubpanel,BorderLayout.CENTER);
		mainPanel.add(lowerSubpanel,BorderLayout.SOUTH);
			
	}
		
	private void defineUpperPanel() {
		upperSubpanel = new JPanel();
		upperSubpanel.setBackground(GuiControl.FILLER_COLOR);
		upperSubpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel mainLabel = new JLabel(MAIN_LABEL);
		Font f = GuiControl.makeVeryLargeFont(mainLabel.getFont());
		f = GuiControl.makeBoldFont(f);
		mainLabel.setFont(f);
		upperSubpanel.add(mainLabel);		
	}
	private void defineMiddlePanel() {
		middleSubpanel = new JPanel();
		middleSubpanel.setLayout(new BorderLayout());
		middleSubpanel.setBackground(GuiControl.FILLER_COLOR);	
		middleSubpanel.setBorder(GuiControl.createBlueTitledBorder(USER_INPUT,middleSubpanel.getFont()));
		JPanel textPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		//define textPanel
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		textPanel.setBackground(GuiControl.FILLER_COLOR);
		textPanel.setBorder(new WindowBorder(GuiControl.WINDOW_BORDER));
		upperText = new JTextArea(8,54);
		textPanel.add(upperText);
		middleSubpanel.add(textPanel,BorderLayout.NORTH);
		
		//define button panel
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setBackground(GuiControl.FILLER_COLOR);
		JButton submitButn = new JButton(SUBMIT);
		SubmitListener sl = new SubmitListener();
		@SuppressWarnings("unused")
		int y = sl.k;
		submitButn.addActionListener(sl);
		buttonPanel.add(submitButn);
		middleSubpanel.add(buttonPanel,BorderLayout.SOUTH);
		
	}
	private void defineLowerPanel() {
		lowerSubpanel = new JPanel();
		lowerSubpanel.setLayout(new BorderLayout());
		lowerSubpanel.setBackground(GuiControl.FILLER_COLOR);	
		lowerSubpanel.setBorder(GuiControl.createBlueTitledBorder(OUTPUT,lowerSubpanel.getFont()));
		JPanel textPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		//define textPanel
		textPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		textPanel.setBackground(GuiControl.OUTPUT_SCREEN);
		textPanel.setBorder(new WindowBorder(GuiControl.WINDOW_BORDER));
		lowerText = new JTextArea(8,54);
		lowerText.setText("See a report of all account balances? (y/n)");
		JScrollPane scroll = new JScrollPane(lowerText);
		lowerText.setBackground(GuiControl.OUTPUT_SCREEN);
		lowerText.setEditable(false);
		textPanel.add(scroll);
		lowerSubpanel.add(textPanel,BorderLayout.NORTH);
		
		//define button panel
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.setBackground(GuiControl.FILLER_COLOR);
		JButton clearButn = new JButton(CLEAR);
		clearButn.addActionListener(new ClearListener());
		buttonPanel.add(clearButn);
		lowerSubpanel.add(buttonPanel,BorderLayout.SOUTH);        
				
	}
	public void setOutputValue(String val){
		lowerText.setText(val);
	}


	class SubmitListener implements ActionListener {
		private int k;
		public void actionPerformed(ActionEvent evt) {
			main=new Main();
			String inputString = upperText.getText();
			if(inputString.equalsIgnoreCase("y")){
				setOutputValue(main.getFormattedAccountInfo());
			}
			if(inputString.equalsIgnoreCase("n")){
				//setOutputValue(main.getFormattedAccountInfo());
				showMessage("We will exit the system now.");
			}else{
				
			}
			
			System.out.println("Got input: "+inputString);
		    			
		}
	}
	private void showMessage(String message){
	//	JOptionPane.showConfirmDialog(this, message, "Information", JOptionPane.CLOSED_OPTION, JOptionPane.ABORT);
		JOptionPane.showMessageDialog(this,         									          
		          message,
		          "Information", 
		          JOptionPane.INFORMATION_MESSAGE); //could also be INFORMATION_MESSAGE
		System.exit(0);
	}
	class ClearListener implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			
			setOutputValue("");	
		    System.out.println("Clearing output text area.");
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				UserIO userIo = new UserIO();
				userIo.setVisible(true);
			}
		});
	}

}


