package lab13.Lab_13_2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lab13.Lab_13_2.database.ConnectManager;

/**
 * 
 * @author Sereypanha Yorn
 *
 */

public class AddressFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel topPanel;
	private JPanel middlePanel;
	private JPanel buttomPanel;
	// private JPanel labelTextPanel;
	private JTextField txtId = new JTextField(10);
	private JTextField txtFirstName = new JTextField(10);
	private JTextField txtLastName = new JTextField(10);
	private JTextField txtSSN = new JTextField(10);
	private JLabel lbId, lbFirstName, lbLastName, lbSSN;
	private JTextField txtStreet = new JTextField(10);
	private JTextField txtCity = new JTextField(10);
	private JTextField txtState = new JTextField(10);
	private JTextField txtZip = new JTextField(10);
	private JLabel lbStreet, lbCity, lbState, lbZip;
	private JButton btSearch, btSave, btClear;

	private JTextField txtShowInfo = new JTextField();
	ConnectManager cm = new ConnectManager();

	public AddressFrame() {
		super();
		initializeWindow();
		JPanel mainPanel = new JPanel();
		JPanel mainPanelButtom = new JPanel();
		defineTopPanel();
		defineMiddlePanel();
		defineButtomPanel();
		mainPanelButtom.setLayout(new BorderLayout());
		mainPanelButtom.add(txtShowInfo, BorderLayout.NORTH);
		mainPanelButtom.add(buttomPanel, BorderLayout.SOUTH);

		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(topPanel, BorderLayout.NORTH);
		mainPanel.add(middlePanel, BorderLayout.CENTER);
		mainPanel.add(mainPanelButtom, BorderLayout.SOUTH);

		getContentPane().add(mainPanel);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Address Form");
		centerFrameOnDesktop(this);
		setSize(500,180);
		//pack();
		setResizable(true);

	}

	public static void centerFrameOnDesktop(Component f) {
		final int SHIFT_AMOUNT = 0;
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT,
				(height - frameHeight) / 3);
	}

	private JPanel defineLabelTextPanel(JTextField txtField, JLabel label) {
		JPanel labelTextPanel = new JPanel();
		JPanel topLabel = new JPanel();
		JPanel buttomText = new JPanel();
		topLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		buttomText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		topLabel.add(label);
		buttomText.add(txtField);

		labelTextPanel.setLayout(new BorderLayout());
		labelTextPanel.add(topLabel, BorderLayout.NORTH);
		labelTextPanel.add(buttomText, BorderLayout.CENTER);
		return labelTextPanel;

	}

	private void defineTopPanel() {
		topPanel = new JPanel();
		lbId = new JLabel("ID");

		lbFirstName = new JLabel("First Name");

		lbLastName = new JLabel("Last Name");

		lbSSN = new JLabel("SSN");

		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		topPanel.add(defineLabelTextPanel(txtId, lbId));
		topPanel.add(defineLabelTextPanel(txtFirstName, lbFirstName));
		topPanel.add(defineLabelTextPanel(txtLastName, lbLastName));
		topPanel.add(defineLabelTextPanel(txtSSN, lbSSN));
		
	}

	private void defineMiddlePanel() {
		middlePanel = new JPanel();
		middlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		lbStreet = new JLabel("Street");
		lbCity = new JLabel("City");
		lbState = new JLabel("State");
		lbZip = new JLabel("Zip");
		middlePanel.add(defineLabelTextPanel(txtStreet, lbStreet));
		middlePanel.add(defineLabelTextPanel(txtCity, lbCity));
		middlePanel.add(defineLabelTextPanel(txtState, lbState));
		middlePanel.add(defineLabelTextPanel(txtZip, lbZip));

	}

	private void defineButtomPanel() {
		buttomPanel = new JPanel();
		buttomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		btSearch = new JButton("Search");
		btSearch.addActionListener(new SearchButtonListener());
		buttomPanel.add(btSearch);

		btSave = new JButton("Save");
		btSave.addActionListener(new SaveButtonListener());
		buttomPanel.add(btSave);

		btClear = new JButton("Clear");
		buttomPanel.add(btClear);
		btClear.addActionListener(new ClearButtonListener());
		

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				AddressFrame mf = new AddressFrame();
				mf.setVisible(true);
			}
		});
	}

	class MyButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			// String strName = txtName.getText();
			// String strStreet=txtStreet.getText();
			// String strCity=txtCity.getText();
			// String strSate=txtState.getText();
			// String strZip=txtZip.getText();
			// String result=String.format("%s%n%s%n%s, %s %s",
			// strName,strStreet,strCity,strSate,strZip);
			// System.out.println(result);

		}

	}

	class SearchButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String id = txtId.getText();
			 String queryStatement =
			 "SELECT * FROM Person as p, ADDRESS as a where p.ID=a.ID and p.id =" + id;
			 try {
				Connection con = cm.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(queryStatement);
				if(rs.next()){
					//String id = rs.getString("id").trim();
					String fname = rs.getString("firstname").trim();
					//System.out.println("id = " + id + " first name = " + fname);
					String lname = rs.getString("lastname").trim();
					String ssn = rs.getString("ssn").trim();
					String street = rs.getString("street").trim();
					String city = rs.getString("city").trim();
					String state = rs.getString("state").trim();
					String zip = rs.getString("zip").trim();
					txtFirstName.setText(fname);
					txtLastName.setText(lname);
					txtSSN.setText(ssn);
					txtStreet.setText(street);
					txtCity.setText(city);
					txtState.setText(state);
					txtZip.setText(zip);
					txtShowInfo.setText("Record Found");
					 stmt.close();
				} else
					txtShowInfo.setText("Record Not Found");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}

	}

	class SaveButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String fname = txtFirstName.getText();
			String lname = txtLastName.getText();
			String ssn = txtSSN.getText();
			String street = txtStreet.getText();
			String city = txtCity.getText();
			String state = txtState.getText();
			String zip = txtState.getText();
			if(fname.isEmpty() || lname.isEmpty() || ssn.isEmpty() || street.isEmpty() || city.isEmpty() || state.isEmpty() || zip.isEmpty()) {
				txtShowInfo.setText("To perform a Save, all fields but ID must be nonempty.");
			} else {
				String insertPersonStmt = "INSERT INTO Person(firstname, lastname, ssn) " +
						"VALUES('" + fname + "', '" + lname + "', '" + ssn + "')";
				 Connection con;
				try {
					con = cm.getConnection();
					Statement stmt = con.createStatement();
					stmt.executeUpdate(insertPersonStmt, Statement.RETURN_GENERATED_KEYS);
					ResultSet rs = stmt.getGeneratedKeys();
					
					int newPerId = -1;
					if (rs.next()) {
						newPerId = rs.getInt(1);
						 String insertAddStmt = "INSERT INTO Address(id, street, city, state, zip) " +
									"VALUES('" + newPerId +  "' ,'"+ street + "','" + city + "','" + state + "', '" + zip + "')";
						 stmt.executeUpdate(insertAddStmt, Statement.RETURN_GENERATED_KEYS);
						 ResultSet rsAddr = stmt.getGeneratedKeys();
						 if(rsAddr.next()) {
							 System.out.println("Insert successful. New row has id " + newPerId);
								txtShowInfo.setText("Database has been updated.");
						 }
						
					} else{
						System.out.println("Insert unsuccessful. No new row has been added.");
						//txtShowInfo.setText("To perform a Save, all fields but ID must be nonempty.");
					}
					stmt.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 
		}
	}

	class ClearButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			txtId.setText("");
			txtFirstName.setText("");
			txtLastName.setText("");
			txtSSN.setText("");
			txtStreet.setText("");
			txtCity.setText("");
			txtState.setText("");
			txtZip.setText("");
			txtShowInfo.setText("");
		}
	}
}
