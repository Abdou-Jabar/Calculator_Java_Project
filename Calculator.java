package monPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.DefaultCaret;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.security.PublicKey;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	Double nombre1, nombre2, resulat;
	String operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					//UIManager.setLookAndFeel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 410, 626);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 181, 385, 426);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btn_1 = new JButton("1");
		btn_1.setForeground(Color.WHITE);
		btn_1.setBackground(Color.DARK_GRAY);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("1");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "1");
				}
			}
		});
		
		btn_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				textField.setText(String.valueOf(keyChar));
			}
		});
		btn_1.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_1.setBounds(12, 262, 60, 60);
		panel_1.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setForeground(Color.WHITE);
		btn_2.setBackground(Color.DARK_GRAY);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("2");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "2");
				}
			}
		});
		btn_2.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_2.setBounds(112, 262, 60, 60);
		panel_1.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setForeground(Color.WHITE);
		btn_3.setBackground(Color.DARK_GRAY);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("3");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "3");
				}
			}
		});
		btn_3.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_3.setBounds(212, 262, 60, 60);
		panel_1.add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("4");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "4");
				}
			}
		});
		btn_4.setForeground(Color.white);
		btn_4.setBackground(Color.DARK_GRAY);
		btn_4.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_4.setBounds(12, 172, 60, 60);
		panel_1.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("5");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "5");
				}
			}
		});
		btn_5.setForeground(Color.white);
		btn_5.setBackground(Color.DARK_GRAY);
		btn_5.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_5.setBounds(112, 172, 60, 60);
		panel_1.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("6");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "6");
				}
			}
		});
		btn_6.setForeground(Color.white);
		btn_6.setBackground(Color.DARK_GRAY);
		btn_6.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_6.setBounds(212, 172, 60, 60);
		panel_1.add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(UIManager.getColor("Button.foreground"));
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("7");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "7");
				}
			}
		});
		btn_7.setForeground(Color.white);
		btn_7.setBackground(Color.DARK_GRAY);
		btn_7.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_7.setBounds(12, 89, 60, 60);
		panel_1.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("8");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "8");
				}
			}
		});
		btn_8.setForeground(Color.white);
		btn_8.setBackground(Color.DARK_GRAY);
		btn_8.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_8.setBounds(112, 89, 60, 60);
		panel_1.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					textField.setText("9");
				}
				else {
					String current = textField.getText();
					textField.setText(current + "9");
				}
			}
		});
		btn_9.setForeground(Color.white);
		btn_9.setBackground(Color.DARK_GRAY);
		btn_9.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_9.setBounds(212, 89, 60, 60);
		panel_1.add(btn_9);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					//Pas de pmlusiers 0 au début du nombre
				}
				else {
					String current = textField.getText();
					textField.setText(current + "0");
				}
			}
		});
		btn_0.setForeground(Color.white);
		btn_0.setBackground(Color.DARK_GRAY);
		btn_0.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_0.setBounds(12, 354, 60, 60);
		panel_1.add(btn_0);
		
		JButton btn_virgule = new JButton(".");
		btn_virgule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String current = textField.getText();
				textField.setText(current + ".");
			}
		});
		btn_virgule.setForeground(Color.white);
		btn_virgule.setBackground(Color.DARK_GRAY);
		btn_virgule.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_virgule.setBounds(212, 354, 60, 60);
		panel_1.add(btn_virgule);
		
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().equals("0")) {
					//Ici nous ne voulons pas avoir plusieurs 0 au début des nombres
				}
				else {
					String current = textField.getText();
					textField.setText(current + "00");
				}
			}
		});
		btn_00.setForeground(Color.white);
		btn_00.setBackground(Color.DARK_GRAY);
		btn_00.setFont(new Font("Dialog", Font.BOLD, 15));
		btn_00.setBounds(112, 354, 60, 60);
		panel_1.add(btn_00);
		
		JButton btnPourcentage = new JButton("%");
		btnPourcentage.setBackground(new Color(255, 140, 0));
		btnPourcentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nbr = textField.getText();
				double nombre = Double.parseDouble(nbr);
				Double pourcent = nombre / 100;
				String pourcentString = Double.toString(pourcent);
				textField.setText(pourcentString);
			}
		});
		
		JButton btn_addition = new JButton("+");
		btn_addition.setBackground(new Color(255, 140, 0));
		btn_addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String current = textField.getText();
				textField.setText("");
				nombre1 = Double.parseDouble(current);
				operator = "+";
			}
		});
		btn_addition.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_addition.setBounds(312, 172, 60, 60);
		panel_1.add(btn_addition);
		
		JButton btn_soustraction = new JButton("-");
		btn_soustraction.setBackground(new Color(255, 140, 0));
		btn_soustraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String current = textField.getText();
				textField.setText("");
				nombre1 = Double.parseDouble(current);
				operator = "-";
			}
		});
		btn_soustraction.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_soustraction.setBounds(312, 89, 60, 60);
		panel_1.add(btn_soustraction);
		
		JButton btn_multiplication = new JButton("x");
		btn_multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String current = textField.getText();
				textField.setText("");
				nombre1 = Double.parseDouble(current);
				operator = "x";
			}
		});
		btn_multiplication.setBackground(new Color(255, 140, 0));
		btn_multiplication.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_multiplication.setBounds(312, 5, 60, 60);
		panel_1.add(btn_multiplication);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String current = textField.getText();
				textField.setText("");
				nombre1 = Double.parseDouble(current);
				operator = "/";
			}
		});
		btnDivision.setBackground(new Color(255, 140, 0));
		btnDivision.setFont(new Font("Dialog", Font.BOLD, 25));
		btnDivision.setBounds(212, 5, 60, 60);
		panel_1.add(btnDivision);
		btnPourcentage.setFont(new Font("Dialog", Font.BOLD, 25));
		btnPourcentage.setBounds(112, 5, 60, 60);
		panel_1.add(btnPourcentage);
		
		JButton btn_Equal = new JButton("=");
		btn_Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcul();
			}
		});
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 140, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("0");
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 25));
		btnClear.setBounds(12, 5, 60, 60);
		panel_1.add(btnClear);
		btn_Equal.setBackground(new Color(255, 140, 0));
		btn_Equal.setFont(new Font("Dialog", Font.BOLD, 25));
		btn_Equal.setBounds(312, 262, 60, 152);
		panel_1.add(btn_Equal);
		
		JLabel lblNewLabel = new JLabel("Calculatrice");
		lblNewLabel.setBounds(110, 12, 168, 30);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 56, 385, 113);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setFont(new Font("Dialog", Font.BOLD, 50));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setCaret(new DefaultCaret() {
            private static final long serialVersionUID = 1L;

			@Override
            public void paint(Graphics g){}
        });
		textField.setBounds(0, 0, 385, 113);
		panel.add(textField);
		textField.setColumns(10);
	}
	
	public void calcul() {
		String current2 = textField.getText();
		
		switch (operator) {
		
			case "+" : {
				nombre2 = Double.parseDouble(current2);
				resulat = nombre1 + nombre2;
				break;
			}
			
			case "-": {
				double nombre2 = Double.parseDouble(current2);
				resulat = nombre1 - nombre2;
				break;
			}
			
			case "x": {
				double nombre2 = Double.parseDouble(current2);
				resulat = nombre1 * nombre2;
				break;
			}
			
			case "/": {
				double nombre2 = Double.parseDouble(current2);
				if(nombre2 != 0) {
					resulat = nombre1 / nombre2;
				}
				else {
					textField.setText("ERROr");
				}
			}
		}
		textField.setText(String.valueOf(resulat));
		nombre1 = resulat;
	}	
}
