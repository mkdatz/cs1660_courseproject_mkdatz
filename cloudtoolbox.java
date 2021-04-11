import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.lang.*;

public class cloudtoolbox {
	JLabel label;
	JLabel instructions;
	JFrame frame;
	JPanel panel;
	public cloudtoolbox() throws Exception {
		frame = new JFrame();
		JButton button = new JButton("RStudio");
		button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:8787").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button2 = new JButton("Spyder");
		button2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("https://mybinder.org/v2/gh/spyder-ide/spyder/4.x?urlpath=/desktop").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button3 = new JButton("IBM SAS");
		button3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("https://welcome.oda.sas.com/login").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button4 = new JButton("Git");
		button4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:3000").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button5 = new JButton("Jupyter Notebook");
		button5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:8889").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button6 = new JButton("Orange");
		button6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:6901").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button7 = new JButton("Visual Studio Code IDE");
		button7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:8443").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button8 = new JButton("Apache Hadoop");
		button8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:8787").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button9 = new JButton("Apache Spark/Pyspark");
		button9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:8080").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button10 = new JButton("Tableau");
		button10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://public.tableau.com/en-us/s/").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button11 = new JButton("SonarQube");
		button11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:9000").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button12 = new JButton("Tensorflow");
		button12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:8888").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
		JButton button13 = new JButton("Markdown");
		button13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
		        Desktop.getDesktop().browse(new URL("http://localhost:12345").toURI());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		  }
		});
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
	public static void main(String[] args) throws Exception {
		new cloudtoolbox();
	}
}