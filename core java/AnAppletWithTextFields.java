import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AnAppletWithTextFields extends Applet implements ActionListener {
	public void init() {
		Label label1 = new Label("First text field: ");

		textField1 = new TextField("Hello");

		swapEm = new Button("Swap");
		swapEm.addActionListener(this);

		Label label2 = new Label("Second text field: ");

		textField2 = new TextField("Goodbye");
		textField2.setEditable(false);

		add(label1);
		add(textField1);
		add(swapEm);
		add(label2);
		add(textField2);
	}

	public void actionPerformed(ActionEvent e) {
		String temp = textField1.getText();
		textField1.setText(textField2.getText());
		textField2.setText(temp);
	}

	TextField textField1, textField2;
	Button swapEm;
}