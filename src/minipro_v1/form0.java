package minipro_v1;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JScrollBar;

public class form0 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public form0() {
		setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(381, 11, 17, 82);
		add(scrollBar);
		
		JLabel lblName = new JLabel("Text");
		lblName.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblName.setBounds(36, 11, 52, 30);
		add(lblName);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(161, 184, 41, 22);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(212, 184, 41, 22);
		add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(263, 184, 71, 22);
		add(spinner_2);
		
		JLabel label_1 = new JLabel("Start Date");
		label_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_1.setBounds(36, 184, 96, 22);
		add(label_1);
		
		JLabel label_2 = new JLabel("End Date");
		label_2.setFont(new Font("Arial Black", Font.BOLD, 15));
		label_2.setBounds(36, 217, 96, 22);
		add(label_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(161, 217, 41, 22);
		add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(212, 217, 41, 22);
		add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(263, 217, 71, 22);
		add(spinner_5);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(189, 266, 89, 23);
		add(btnSubmit);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(161, 11, 237, 82);
		add(editorPane);
		
		JLabel label = new JLabel("Image");
		label.setFont(new Font("Arial Black", Font.BOLD, 15));
		label.setBounds(36, 107, 56, 30);
		add(label);
		
		textField = new JTextField();
		textField.setBounds(161, 114, 173, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBounds(344, 114, 89, 20);
		add(btnUpload);

	}
}
