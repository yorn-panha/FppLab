package lab5.prog5_2_string_util;

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

public class StringUtilityFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel leftPanel, rightPanel, labelTextPanel;
	static private JTextField txtInput, txtOutput;
	private JLabel lbInput, lbOutput;
	private JButton bCount, bReverse, bRemoveDuplicates;

	public StringUtilityFrame() {
		super();
		initializeWindow();
		JPanel mainPanel = new JPanel();
		defineLeftPanel();
		defineRightPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);
		// mainPanel.add(buttomPanel, BorderLayout.SOUTH);
		getContentPane().add(mainPanel);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Address Form");
		centerFrameOnDesktop(this);
		setSize(500, 180);
		setResizable(false);
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

	private void defineLabelTextPanel() {
		JPanel inputLabel = new JPanel();
		JPanel inputText = new JPanel();
		JPanel outputLabel = new JPanel();
		JPanel outputText = new JPanel();
		inputLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		inputText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		outputLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
		outputText.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

		lbInput = new JLabel("Input");
		lbOutput = new JLabel("Output");
		txtInput = new JTextField(15);
		txtOutput = new JTextField(15);
		inputLabel.add(lbInput);
		inputText.add(txtInput);
		outputLabel.add(lbOutput);
		outputText.add(txtOutput);
		labelTextPanel = new JPanel();
		JPanel labelTextPanel1 = new JPanel();
		JPanel labelTextPanel2 = new JPanel();
		labelTextPanel1.setLayout(new BorderLayout());
		labelTextPanel1.add(inputLabel, BorderLayout.NORTH);
		labelTextPanel1.add(inputText, BorderLayout.CENTER);
		labelTextPanel2.setLayout(new BorderLayout());
		labelTextPanel2.add(outputLabel, BorderLayout.NORTH);
		labelTextPanel2.add(outputText, BorderLayout.CENTER);

		labelTextPanel.setLayout(new BorderLayout());
		labelTextPanel.add(labelTextPanel1, BorderLayout.NORTH);
		labelTextPanel.add(labelTextPanel2, BorderLayout.CENTER);

	}

	private void defineRightPanel() {
		rightPanel = new JPanel();
		defineLabelTextPanel();
		rightPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		rightPanel.add(labelTextPanel);

	}

	private void defineLeftPanel() {
		leftPanel = new JPanel();
		leftPanel.setLayout(new BorderLayout());
		JPanel bCountPanel = new JPanel();
		bCountPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bCount = new JButton("    Count Letters    ");
		bCountPanel.add(bCount);
		bCount.addActionListener(new ButtonListener());
		JPanel bReversePanel = new JPanel();
		bReversePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bReverse = new JButton("   Reverse Letters   ");
		bReversePanel.add(bReverse);
		bReverse.addActionListener(new ButtonListener());
		JPanel bRemoveDouplicatedPanel = new JPanel();
		bRemoveDouplicatedPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		bRemoveDuplicates = new JButton("Remove Duplicates");
		bRemoveDouplicatedPanel.add(bRemoveDuplicates);
		bRemoveDuplicates.addActionListener(new ButtonListener());
		leftPanel.add(bCountPanel, BorderLayout.NORTH);
		leftPanel.add(bReversePanel, BorderLayout.CENTER);
		leftPanel.add(bRemoveDouplicatedPanel, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				StringUtilityFrame mf = new StringUtilityFrame();
				mf.setVisible(true);
			}
		});
	}

	public class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String txtInputValue = txtInput.getText();
			if (evt.getSource() == bCount) {
				txtOutput.setText("" + txtInputValue.length());
			}
			if (evt.getSource() == bReverse) {
				txtOutput.setText(reverse(txtInputValue));
			}
			if (evt.getSource() == bRemoveDuplicates) {
				txtOutput.setText(removeDuplicates(txtInputValue));
			}
		}

		public String reverse(String str) {
			char[] charArray = new char[str.length()];
			for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
				charArray[j] = str.charAt(i);
			}
			String reverseString = new String(charArray);
			return reverseString;
		}
		public String removeDuplicates(String str) {
			char[] charCopy = new char[str.length()];
			for(int i=0;i<str.length();i++){
				charCopy[i]=str.charAt(i);
			}
			charCopy=removeDuplicatesChar(charCopy);
			return new String(charCopy);
		}
		public char[] removeDuplicatesChar(char[] ch) {

			char[] noDupCh = new char[ch.length];
			int index = 0;
			boolean flag = false;
			noDupCh[index] = ch[0];
			for (int i = 1; i < ch.length; i++) {
				flag = false;
				for (int j = 0; j <= index; j++) {
					if (noDupCh[j] == ch[i]) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					index++;
					noDupCh[index] = ch[i];
				}
			}
			char[] result = new char[index + 1];
			for (int i = 0; i < result.length; i++) {
				result[i] = noDupCh[i];
			}
			return result;
		}
	}
}
