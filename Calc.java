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
import javax.swing.SwingConstants;
import javax.swing.JList;

public class Calc {
	double inti=-999999999;
	double intii=-999999999;
	Double total=0.0;
	
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
	private JButton btnMadd;
	private JButton btnM;
	private JButton btnPi;
	private JButton btnE;
	private JButton btnAC;
	private JButton btnSinh;
	private JButton btnCosh;
	private JButton btnTanh;

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
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 697, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 31));
		textField.setBounds(10, 11, 665, 93);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnSin = new JButton("sin");
		btnSin.setForeground(Color.WHITE);
		btnSin.setBackground(Color.DARK_GRAY);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.sin(Double.parseDouble(textField.getText()));
				total = s;
				textField.setText(((Double)(s)).toString());
			}
		});
		btnSin.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSin.setBounds(10, 181, 100, 55);
		frame.getContentPane().add(btnSin);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 24));
		btn7.setBounds(120, 247, 100, 55);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 24));
		btn4.setBounds(120, 313, 100, 55);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Calibri", Font.BOLD, 24));
		btn1.setBounds(120, 379, 100, 55);
		frame.getContentPane().add(btn1);
		
		btnCos = new JButton("cos");
		btnCos.setForeground(Color.WHITE);
		btnCos.setBackground(Color.DARK_GRAY);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.cos(Double.parseDouble(textField.getText()));
				total=s;
				textField.setText(((Double)(s)).toString());
			}
		});
		btnCos.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCos.setBounds(120, 181, 100, 55);
		frame.getContentPane().add(btnCos);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 24));
		btn8.setBounds(230, 247, 100, 55);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Calibri", Font.BOLD, 24));
		btn5.setBounds(230, 313, 100, 55);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Calibri", Font.BOLD, 24));
		btn2.setBounds(230, 379, 100, 55);
		frame.getContentPane().add(btn2);
		
		btnTan = new JButton("tan");
		btnTan.setForeground(Color.WHITE);
		btnTan.setBackground(Color.DARK_GRAY);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.tan(Double.parseDouble(textField.getText()));
				total=s;
				textField.setText(((Double)(s)).toString());
			}
		});
		btnTan.setFont(new Font("Calibri", Font.BOLD, 24));
		btnTan.setBounds(230, 181, 100, 55);
		frame.getContentPane().add(btnTan);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 24));
		btn9.setBounds(340, 247, 100, 55);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Calibri", Font.BOLD, 24));
		btn6.setBounds(340, 313, 100, 55);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 24));
		btn3.setBounds(340, 379, 100, 55);
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
		btnB.setBounds(340, 115, 100, 55);
		frame.getContentPane().add(btnB);
		
		btnSquare = new JButton("x^2");
		btnSquare.setForeground(Color.WHITE);
		btnSquare.setBackground(Color.DARK_GRAY);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				Double ans = a*a;
				total  = ans;
				textField.setText(ans.toString());
			}
		});
		btnSquare.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSquare.setBounds(10, 247, 100, 55);
		frame.getContentPane().add(btnSquare);
		
		btnCube = new JButton("x^3");
		btnCube.setForeground(Color.WHITE);
		btnCube.setBackground(Color.DARK_GRAY);
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				Double ans = a*a*a;
				total = ans;
				textField.setText(ans.toString());
			}
		});
		btnCube.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCube.setBounds(10, 313, 100, 55);
		frame.getContentPane().add(btnCube);
		
		btnSqrt = new JButton("Sqrt");
		btnSqrt.setForeground(Color.WHITE);
		btnSqrt.setBackground(Color.DARK_GRAY);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(textField.getText());
				Double ans = Math.sqrt(a);
				total = ans;
				textField.setText(ans.toString());
			}
		});
		btnSqrt.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSqrt.setBounds(10, 379, 100, 55);
		frame.getContentPane().add(btnSqrt);
		
		btnExp = new JButton("e^x");
		btnExp.setForeground(Color.WHITE);
		btnExp.setBackground(Color.DARK_GRAY);
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.pow(Math.E,Double.parseDouble(textField.getText()));
				total = s;
				textField.setText(((Double)(s)).toString());
			}
		});
		btnExp.setFont(new Font("Calibri", Font.BOLD, 24));
		btnExp.setBounds(450, 247, 100, 55);
		frame.getContentPane().add(btnExp);
		
		btnLn = new JButton("ln");
		btnLn.setForeground(Color.WHITE);
		btnLn.setBackground(Color.DARK_GRAY);
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.log(Double.parseDouble(textField.getText()));
				total = s;
				textField.setText(((Double)(s)).toString());
			}
		});
		btnLn.setFont(new Font("Calibri", Font.BOLD, 24));
		btnLn.setBounds(450, 313, 100, 55);
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
		btnPow.setBounds(450, 379, 100, 55);
		frame.getContentPane().add(btnPow);
		
		btnCE = new JButton("CE");
		btnCE.setBackground(new Color(255, 51, 51));
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCE.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCE.setBounds(450, 115, 100, 55);
		frame.getContentPane().add(btnCE);
		
		btnAdd = new JButton("+");
		btnAdd.setBackground(new Color(255, 51, 51));
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
		btnAdd.setBounds(560, 313, 115, 55);
		frame.getContentPane().add(btnAdd);
		
		btnSub = new JButton("-");
		btnSub.setBackground(new Color(255, 51, 51));
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
		btnSub.setBounds(560, 379, 115, 55);
		frame.getContentPane().add(btnSub);
		
		btnMul = new JButton("x");
		btnMul.setBackground(new Color(255, 51, 51));
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
				inti = Double.parseDouble(textField.getText());
				textField.setText(null);
				action="*";
			}
		});
		btnMul.setFont(new Font("Calibri", Font.BOLD, 24));
		btnMul.setBounds(561, 247, 114, 55);
		frame.getContentPane().add(btnMul);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 24));
		btn0.setBounds(230, 445, 100, 55);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Calibri", Font.BOLD, 24));
		btnDot.setBounds(119, 445, 100, 55);
		frame.getContentPane().add(btnDot);
		
		btnEql = new JButton("=");
		btnEql.setBackground(new Color(255, 51, 51));
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intii = Double.parseDouble(textField.getText());
				if(action.equals("+")) {
					Double ans = inti+intii;
					total = ans;
					textField.setText(ans.toString());
				}
				else if(action.equals("-")) {
					Double ans = inti-intii;
					total =ans;
					textField.setText(ans.toString());
				}
				else if(action.equals("*")) {
					Double ans = inti*intii;
					total=ans;
					textField.setText(ans.toString());
				}
				else if(action.equals("/")) {
					if(intii!=0) {
					Double ans = inti/intii;
					total = ans;
					textField.setText(ans.toString());
					}
					else {
						textField.setText("Not defined");
					}
				}
				else if(action.equals("^")){
					intii = Double.parseDouble(textField.getText());
					Double ans = Math.pow(inti, intii);
					total = ans;
					textField.setText(ans.toString());
				}
				inti=-999999999;
				intii=-999999999;
			}
		});
		btnEql.setFont(new Font("Calibri", Font.BOLD, 24));
		btnEql.setBounds(560, 445, 115, 55);
		frame.getContentPane().add(btnEql);
		
		btnDiv = new JButton("÷");
		btnDiv.setBackground(new Color(255, 51, 51));
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
		btnDiv.setBounds(560, 181, 114, 55);
		frame.getContentPane().add(btnDiv);
		
		JRadioButton btnWant = new JRadioButton("Want");
		btnWant.setForeground(Color.WHITE);
		btnWant.setBackground(Color.DARK_GRAY);
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
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
			}
		});
		btnWant.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnWant.setBounds(10, 502, 109, 23);
		frame.getContentPane().add(btnWant);
		
		JRadioButton btnClose = new JRadioButton("Close");
		btnClose.setForeground(Color.WHITE);
		btnClose.setBackground(Color.DARK_GRAY);
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
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClose.setBounds(566, 502, 109, 23);
		frame.getContentPane().add(btnClose);
		
		JButton Ans = new JButton("Ans");
		Ans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(total.toString());
			}
		});
		Ans.setFont(new Font("Calibri", Font.BOLD, 24));
		Ans.setBounds(340, 445, 100, 55);
		frame.getContentPane().add(Ans);
		
		btnMadd = new JButton("M+");
		btnMadd.setForeground(Color.WHITE);
		btnMadd.setBackground(Color.DARK_GRAY);
		btnMadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total+Double.parseDouble(textField.getText());
			}
		});
		btnMadd.setFont(new Font("Calibri", Font.BOLD, 24));
		btnMadd.setBounds(340, 181, 100, 55);
		frame.getContentPane().add(btnMadd);
		
		btnM = new JButton("M-");
		btnM.setForeground(Color.WHITE);
		btnM.setBackground(Color.DARK_GRAY);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = total-Double.parseDouble(textField.getText());
			}
		});
		btnM.setFont(new Font("Calibri", Font.BOLD, 24));
		btnM.setBounds(450, 181, 100, 55);
		frame.getContentPane().add(btnM);
		
		btnPi = new JButton("π");
		btnPi.setForeground(Color.WHITE);
		btnPi.setBackground(Color.DARK_GRAY);
		btnPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x=Math.PI;
				textField.setText(x.toString());
			}
		});
		btnPi.setFont(new Font("Calibri", Font.BOLD, 24));
		btnPi.setBounds(10, 445, 100, 55);
		frame.getContentPane().add(btnPi);
		
		btnE = new JButton("e");
		btnE.setBackground(Color.DARK_GRAY);
		btnE.setForeground(Color.WHITE);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x=Math.E;
				textField.setText(x.toString());
			}
		});
		btnE.setFont(new Font("Calibri", Font.BOLD, 24));
		btnE.setBounds(450, 445, 100, 55);
		frame.getContentPane().add(btnE);
		
		btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				total=0.0;
			}
		});
		btnAC.setFont(new Font("Calibri", Font.BOLD, 24));
		btnAC.setBackground(new Color(255, 51, 51));
		btnAC.setBounds(560, 115, 114, 55);
		frame.getContentPane().add(btnAC);
		
		btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x=Double.parseDouble(textField.getText());
				Double s = (Math.pow(Math.E, x)-Math.pow(Math.E, -x))/2;
				total=s;
				textField.setText(s.toString());
			}
		});
		btnSinh.setForeground(Color.WHITE);
		btnSinh.setFont(new Font("Calibri", Font.BOLD, 24));
		btnSinh.setBackground(Color.DARK_GRAY);
		btnSinh.setBounds(10, 115, 100, 55);
		frame.getContentPane().add(btnSinh);
		
		btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x=Double.parseDouble(textField.getText());
				Double s = (Math.pow(Math.E, x)+Math.pow(Math.E, -x))/2;
				total = s;
				textField.setText(s.toString());
			}
		});
		btnCosh.setForeground(Color.WHITE);
		btnCosh.setFont(new Font("Calibri", Font.BOLD, 24));
		btnCosh.setBackground(Color.DARK_GRAY);
		btnCosh.setBounds(120, 115, 100, 55);
		frame.getContentPane().add(btnCosh);
		
		btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x=Double.parseDouble(textField.getText());
				Double s = (Math.pow(Math.E, x)-Math.pow(Math.E, -x))/(Math.pow(Math.E, x)+Math.pow(Math.E, -x));
				total = s;
				textField.setText(s.toString());
			}
		});
		btnTanh.setForeground(Color.WHITE);
		btnTanh.setFont(new Font("Calibri", Font.BOLD, 24));
		btnTanh.setBackground(Color.DARK_GRAY);
		btnTanh.setBounds(230, 115, 100, 55);
		frame.getContentPane().add(btnTanh);
	}
}
