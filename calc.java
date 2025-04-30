package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 337, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(175, 207, 207));
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(29, 27, 260, 80);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(192, 192, 192));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(29, 255, 67, 62);
		frame.getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(192, 192, 192));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(29, 195, 67, 62);
		frame.getContentPane().add(btn7);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.setBackground(new Color(255, 128, 128));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btnBackspace.setFont(new Font("Windings", Font.BOLD, 20));
		btnBackspace.setBounds(29, 136, 67, 62);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(192, 192, 192));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(29, 314, 67, 62);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(192, 192, 192));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(29, 374, 67, 62);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 0, 0));
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(94, 136, 67, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(192, 192, 192));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(94, 195, 67, 62);
		frame.getContentPane().add(btn8);
		
		JButton btn00 = new JButton("00");
		btn00.setBackground(new Color(192, 192, 192));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn00.setBounds(159, 136, 67, 60);
		frame.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(128, 128, 192));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(225, 136, 67, 62);
		frame.getContentPane().add(btnPlus);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(192, 192, 192));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(159, 195, 67, 62);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBackground(new Color(128, 128, 192));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(225, 195, 67, 62);
		frame.getContentPane().add(btnMinus);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(192, 192, 192));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(94, 255, 67, 62);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(192, 192, 192));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(159, 255, 67, 62);
		frame.getContentPane().add(btn6);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBackground(new Color(128, 128, 192));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(225, 314, 67, 62);
		frame.getContentPane().add(btnDivide);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(192, 192, 192));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(94, 314, 67, 62);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(192, 192, 192));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(159, 314, 67, 62);
		frame.getContentPane().add(btn3);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBackground(new Color(128, 128, 192));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(225, 255, 67, 62);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(192, 192, 192));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(94, 374, 67, 62);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(64, 128, 128));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+")
				{
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "-")
				{
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/")
				{
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*")
				{
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "%")
				{
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(159, 374, 67, 62);
		frame.getContentPane().add(btnEqual);
		
		JButton btnMod = new JButton("%");
		btnMod.setBackground(new Color(128, 128, 192));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMod.setBounds(225, 374, 67, 62);
		frame.getContentPane().add(btnMod);
	}
}
