import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Calc {
	double inti=-999999999;
	double intii=-999999999;
	double total;
	
	String action;
	String ans;
	
	

	private JFrame frame;
	private JTextField textField;
	//Declaration of all the buttons:
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btnCos;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnTan;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnB;
	private JButton btnSquare;
	private JButton btnCube;
	private JButton btnSqrt;
	private JButton btnExp;
	private JButton btnLn;
	private JButton btnPow;
	private JButton btnCE;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnEql;
	private JButton btnDiv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 701, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Cambria", Font.BOLD, 31));
		textField.setBounds(10, 11, 665, 80);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnSin = new JButton("sin");
		btnSin.setForeground(Color.WHITE);
		btnSin.setBackground(Color.DARK_GRAY);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(((Double)(s)).toString());
			}
		});
		btnSin.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSin.setBounds(10, 102, 100, 55);
		frame.getContentPane().add(btnSin);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 24));
		btn7.setBounds(10, 176, 100, 55);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 24));
		btn4.setBounds(10, 242, 100, 55);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Calibri", Font.BOLD, 24));
		btn1.setBounds(10, 313, 100, 55);
		frame.getContentPane().add(btn1);
		
		btnCos = new JButton("cos");
		btnCos.setForeground(Color.WHITE);
		btnCos.setBackground(Color.DARK_GRAY);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(((Double)(s)).toString());
			}
		});
		btnCos.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCos.setBounds(119, 102, 100, 55);
		frame.getContentPane().add(btnCos);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 24));
		btn8.setBounds(120, 176, 100, 55);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Calibri", Font.BOLD, 24));
		btn5.setBounds(120, 242, 100, 55);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Calibri", Font.BOLD, 24));
		btn2.setBounds(120, 313, 100, 55);
		frame.getContentPane().add(btn2);
		
		btnTan = new JButton("tan");
		btnTan.setForeground(Color.WHITE);
		btnTan.setBackground(Color.DARK_GRAY);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(((Double)(s)).toString());
			}
		});
		btnTan.setFont(new Font("Calibri", Font.BOLD, 24));
		btnTan.setBounds(229, 102, 100, 55);
		frame.getContentPane().add(btnTan);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 24));
		btn9.setBounds(230, 176, 100, 55);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Calibri", Font.BOLD, 24));
		btn6.setBounds(230, 242, 100, 55);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 24));
		btn3.setBounds(229, 313, 100, 55);
		frame.getContentPane().add(btn3);
		
		btnB = new JButton("|←");
		btnB.setBackground(new Color(255, 51, 51));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(str.length()-1);
					bck = str.toString();
					textField.setText(bck);
				}
			}
		});
		btnB.setFont(new Font("Calibri", Font.BOLD, 24));
		btnB.setBounds(339, 102, 100, 55);
		frame.getContentPane().add(btnB);
		
		btnSquare = new JButton("x^2");
		btnSquare.setForeground(Color.WHITE);
		btnSquare.setBackground(Color.DARK_GRAY);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				Double ans = a*a;
				textField.setText(ans.toString());
			}
		});
		btnSquare.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSquare.setBounds(340, 176, 100, 55);
		frame.getContentPane().add(btnSquare);
		
		btnCube = new JButton("x^3");
		btnCube.setForeground(Color.WHITE);
		btnCube.setBackground(Color.DARK_GRAY);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				Double ans = a*a*a;
				textField.setText(ans.toString());
			}
		});
		btnCube.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCube.setBounds(340, 242, 100, 55);
		frame.getContentPane().add(btnCube);
		
		btnSqrt = new JButton("Sqrt");
		btnSqrt.setForeground(Color.WHITE);
		btnSqrt.setBackground(Color.DARK_GRAY);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				Double ans = Math.sqrt(a);
				textField.setText(ans.toString());
			}
		});
		btnSqrt.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSqrt.setBounds(339, 313, 100, 55);
		frame.getContentPane().add(btnSqrt);
		
		btnExp = new JButton("e^x");
		btnExp.setForeground(Color.WHITE);
		btnExp.setBackground(Color.DARK_GRAY);
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.pow(Math.E,Double.parseDouble(textField.getText()));
				textField.setText(((Double)(s)).toString());
			}
		});
		btnExp.setFont(new Font("Calibri", Font.BOLD, 24));
		btnExp.setBounds(450, 176, 100, 55);
		frame.getContentPane().add(btnExp);
		
		btnLn = new JButton("ln");
		btnLn.setForeground(Color.WHITE);
		btnLn.setBackground(Color.DARK_GRAY);
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.log(Double.parseDouble(textField.getText()));
				textField.setText(((Double)(s)).toString());
			}
		});
		btnLn.setFont(new Font("Calibri", Font.BOLD, 24));
		btnLn.setBounds(450, 242, 100, 55);
		frame.getContentPane().add(btnLn);
		
		btnPow = new JButton("x^n");
		btnPow.setForeground(Color.WHITE);
		btnPow.setBackground(Color.DARK_GRAY);
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inti= Double.parseDouble(textField.getText());
				textField.setText(null);
				action = "^";
			}
		});
		btnPow.setFont(new Font("Calibri", Font.BOLD, 24));
		btnPow.setBounds(449, 313, 100, 55);
		frame.getContentPane().add(btnPow);
		
		btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCE.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCE.setBounds(449, 102, 226, 55);
		frame.getContentPane().add(btnCE);
		
		btnAdd = new JButton("+");
		btnAdd.setBackground(SystemColor.activeCaptionBorder);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inti!=-999999999) {
					intii = Double.parseDouble(textField.getText());
					Double s = inti+intii;
					textField.setText(s.toString());
					inti = s;
					intii = -999999999;
					action=null;
				}
				inti = Double.parseDouble(textField.getText());
				textField.setText(null);
				action="+";
			}
		});
		btnAdd.setFont(new Font("Calibri", Font.BOLD, 24));
		btnAdd.setBounds(560, 176, 115, 55);
		frame.getContentPane().add(btnAdd);
		
		btnSub = new JButton("-");
		btnSub.setBackground(SystemColor.activeCaptionBorder);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inti!=-999999999) {
					intii = Double.parseDouble(textField.getText());
					Double s = inti-intii;
					textField.setText(s.toString());
					inti = s;
					intii = -999999999;
					action=null;
				}
				inti = Double.parseDouble(textField.getText());
				textField.setText(null);
				action="-";
			}
		});
		btnSub.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSub.setBounds(560, 242, 115, 55);
		frame.getContentPane().add(btnSub);
		
		btnMul = new JButton("x");
		btnMul.setBackground(SystemColor.activeCaptionBorder);
		btnMul.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(inti!=-999999999) {
					intii = Double.parseDouble(textField.getText());
					Double s = inti*intii;
					textField.setText(s.toString());
					inti = s;
					intii = -999999999;
					action=null;
				}
				else {
				inti = Double.parseDouble(textField.getText());
				action="*";
				}
				textField.setText(null);
			}
		});
		btnMul.setFont(new Font("Calibri", Font.BOLD, 24));
		btnMul.setBounds(561, 313, 114, 55);
		frame.getContentPane().add(btnMul);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 24));
		btn0.setBounds(10, 379, 209, 55);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Calibri", Font.BOLD, 24));
		btnDot.setBounds(229, 379, 100, 55);
		frame.getContentPane().add(btnDot);
		
		btnEql = new JButton("=");
		btnEql.setBackground(new Color(255, 51, 51));
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intii = Double.parseDouble(textField.getText());
				if(action.equals("+")) {
					Double ans = inti+intii;
					textField.setText(ans.toString());
				}
				else if(action.equals("-")) {
					Double ans = inti-intii;
					inti =ans;
					textField.setText(ans.toString());
				}
				else if(action.equals("*")) {
					Double ans = inti*intii;
					textField.setText(ans.toString());
				}
				else if(action.equals("/")) {
					Double ans = inti/intii;
					textField.setText(ans.toString());
				}
				else if(action.equals("^")){
					intii = Double.parseDouble(textField.getText());
					Double ans = Math.pow(inti, intii);
					textField.setText(ans.toString());
				}
				inti=-999999999;
				intii=-999999999;
			}
		});
		btnEql.setFont(new Font("Calibri", Font.BOLD, 24));
		btnEql.setBounds(339, 379, 209, 55);
		frame.getContentPane().add(btnEql);
		
		btnDiv = new JButton("÷");
		btnDiv.setBackground(SystemColor.activeCaptionBorder);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inti!=-999999999) {
					intii = Double.parseDouble(textField.getText());
					Double s = inti/intii;
					textField.setText(s.toString());
					inti = s;
					intii = -999999999;
					action=null;
				}
				inti = Double.parseDouble(textField.getText());
				textField.setText(null);
				action="/";
			}
		});
		btnDiv.setFont(new Font("Calibri", Font.BOLD, 24));
		btnDiv.setBounds(561, 379, 114, 55);
		frame.getContentPane().add(btnDiv);
		
		JRadioButton btnWant = new JRadioButton("Want");
		btnWant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnLn.setEnabled(true);
				btnExp.setEnabled(true);
				btnSqrt.setEnabled(true);
				btnPow.setEnabled(true);
				btnSquare.setEnabled(true);
				btnCube.setEnabled(true);
			}
		});
		btnWant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnWant.setBounds(20, 437, 109, 23);
		frame.getContentPane().add(btnWant);
		
		JRadioButton btnClose = new JRadioButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnLn.setEnabled(false);
				btnExp.setEnabled(false);
				btnSqrt.setEnabled(false);
				btnPow.setEnabled(false);
				btnSquare.setEnabled(false);
				btnCube.setEnabled(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClose.setBounds(566, 437, 109, 23);
		frame.getContentPane().add(btnClose);
	}
}
