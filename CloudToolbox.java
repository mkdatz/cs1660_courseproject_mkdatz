import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CloudToolbox {
	JLabel label;
	JLabel instructions;
	JFrame frame;
	JPanel panel;
	public CloudToolbox() {
		frame = new JFrame();
		JButton button = new JButton("RStudio");
		JButton button2 = new JButton("Spyder");
		JButton button3 = new JButton("IBM SAS");
		JButton button4 = new JButton("Git");
		JButton button5 = new JButton("Jupyter Notebook");
		JButton button6 = new JButton("Orange");
		JButton button7 = new JButton("Viseual Studio Code IDE");
		JButton button8 = new JButton("Apache Hadoop");
		JButton button9 = new JButton("Apache Spark");
		JButton button10 = new JButton("Tableau");
		JButton button11 = new JButton("SonarQube");
		JButton button12 = new JButton("Tensorflow");
		JButton button13 = new JButton("Markdown");
		instructions = new JLabel("Select one of the services: ");
		label = new JLabel("Welcome to your Data Science Toolbox.");
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(instructions);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);

		panel.add(label);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Data Science Toolbox, Michael Datz");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new CloudToolbox();
	}
}