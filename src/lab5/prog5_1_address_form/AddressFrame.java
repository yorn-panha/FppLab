package lab5.prog5_1_address_form;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * 
 * @author Sereypanha Yorn
 *
 */
		
public class AddressFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel buttomPanel;
//	private JPanel labelTextPanel;
	private JTextField txtName,txtStreet,txtCity,txtState,txtZip;
	private JLabel lbName, lbStreet, lbCity, lbState, lbZip;
	private JButton btSubmit;
	
	
	
	public AddressFrame() {
		super();
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineButtomPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);	
		mainPanel.add(buttomPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
	}
	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Address Form");	
		centerFrameOnDesktop(this);
		setSize(500,180); 
		setResizable(false);
	}
	public static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width  = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth  = f.getSize().width;
        f.setLocation(((width-frameWidth)/2)-SHIFT_AMOUNT, (height-frameHeight)/3);    
    }
	private JPanel defineLabelTextPanel(JTextField txtField, JLabel label) {
		JPanel labelTextPanel=new JPanel();
		JPanel topLabel=new JPanel();
		JPanel buttomText=new JPanel();
		topLabel.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		buttomText.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
		
		topLabel.add(label);
		buttomText.add(txtField);
		
		labelTextPanel.setLayout(new BorderLayout());
		labelTextPanel.add(topLabel,BorderLayout.NORTH);
		labelTextPanel.add(buttomText,BorderLayout.CENTER);
		return labelTextPanel;
		
	}
	private void defineTopPanel() {
		JPanel[] labelTextPanel=new JPanel[3];
		topPanel = new JPanel();
		txtName=new JTextField(10);
		lbName=new JLabel("Name");
		labelTextPanel[0]=defineLabelTextPanel(txtName,lbName);
		txtStreet=new JTextField(10);
		lbStreet=new JLabel("Street");
		labelTextPanel[1]=defineLabelTextPanel(txtStreet,lbStreet);
		txtCity=new JTextField(10);
		lbCity=new JLabel("City");
		labelTextPanel[2]=defineLabelTextPanel(txtCity,lbCity);
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(labelTextPanel[0]);
		topPanel.add(labelTextPanel[1]);
		topPanel.add(labelTextPanel[2]);
	}
	private void defineMiddlePanel(){
		JPanel[] labelTextPanel=new JPanel[2];
		middlePanel=new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		txtState=new JTextField(10);
		lbState=new JLabel("State");
		labelTextPanel[0]=defineLabelTextPanel(txtState,lbState);
		txtZip=new JTextField(10);
		lbZip=new JLabel("Zip");
		labelTextPanel[1]=defineLabelTextPanel(txtZip,lbZip);
		middlePanel.add(labelTextPanel[0]);
		middlePanel.add(labelTextPanel[1]);
		
	}
	private void defineButtomPanel(){
		buttomPanel=new JPanel();
		buttomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		btSubmit = new JButton("Submit");
		btSubmit.addActionListener(new MyButtonListener());
		buttomPanel.add(btSubmit);
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				AddressFrame mf = new AddressFrame();
				mf.setVisible(true);
			}
		});
	}
	
	
	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			String strName = txtName.getText();
			String strStreet=txtStreet.getText();
			String strCity=txtCity.getText();
			String strSate=txtState.getText();
			String strZip=txtZip.getText();
			String result=String.format("%s%n%s%n%s, %s %s", strName,strStreet,strCity,strSate,strZip);
			System.out.println(result);
	
		}
	}
	
}
