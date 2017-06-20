package myprojects;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Frame1 extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnEncode = new JButton("Encode");
		JTextArea textArea = new JTextArea();
		JTextArea textArea_1 = new JTextArea();
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		
		
		//Button********************************************************************
		
		btnEncode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				final String sentence = textArea.getText();
				char[] charArray = sentence.toCharArray();
				
				for(int i = 0; i < charArray.length; i++){
					if(charArray[i] == 'a' || charArray[i] == 'A' ){ charArray[i] = 'g';}
					else if(charArray[i] == 'a' || charArray[i] == 'A' ){ charArray[i] = 'g';}
					else if(charArray[i] == 'b' || charArray[i] == 'B' ){ charArray[i] = 'j';}
					else if(charArray[i] == 'c' || charArray[i] == 'C' ){ charArray[i] = 'n';}
					else if(charArray[i] == 'd' || charArray[i] == 'D' ){ charArray[i] = 'c';}
					else if(charArray[i] == 'e' || charArray[i] == 'E' ){ charArray[i] = 'x';}
					else if(charArray[i] == 'f' || charArray[i] == 'F' ){ charArray[i] = 'r';}
					else if(charArray[i] == 'g' || charArray[i] == 'G' ){ charArray[i] = 'f';}
					else if(charArray[i] == 'h' || charArray[i] == 'H' ){ charArray[i] = 'i';}
					else if(charArray[i] == 'i' || charArray[i] == 'I' ){ charArray[i] = 'y';}
					else if(charArray[i] == 'j' || charArray[i] == 'J' ){ charArray[i] = 'a';}
					else if(charArray[i] == 'k' || charArray[i] == 'K' ){ charArray[i] = 'o';}
					else if(charArray[i] == 'l' || charArray[i] == 'L' ){ charArray[i] = 'z';}
					else if(charArray[i] == 'm' || charArray[i] == 'M' ){ charArray[i] = 's';}
					else if(charArray[i] == 'n' || charArray[i] == 'N' ){ charArray[i] = 'w';}
					else if(charArray[i] == 'o' || charArray[i] == 'O' ){ charArray[i] = 'b';}
					else if(charArray[i] == 'p' || charArray[i] == 'P' ){ charArray[i] = 'k';}
					else if(charArray[i] == 'q' || charArray[i] == 'Q' ){ charArray[i] = 'p';}
					else if(charArray[i] == 'r' || charArray[i] == 'R' ){ charArray[i] = 'e';}
					else if(charArray[i] == 's' || charArray[i] == 'S' ){ charArray[i] = 'u';}
					else if(charArray[i] == 't' || charArray[i] == 'T' ){ charArray[i] = 'l';}
					else if(charArray[i] == 'u' || charArray[i] == 'U' ){ charArray[i] = 'v';}
					else if(charArray[i] == 'v' || charArray[i] == 'V' ){ charArray[i] = 't';}
					else if(charArray[i] == 'w' || charArray[i] == 'W' ){ charArray[i] = 'h';}
					else if(charArray[i] == 'x' || charArray[i] == 'X' ){ charArray[i] = 'q';}
					else if(charArray[i] == 'y' || charArray[i] == 'Y' ){ charArray[i] = 'm';}
					else if(charArray[i] == 'z' || charArray[i] == 'Z' ){ charArray[i] = 'd';}
					else{ charArray[i] = charArray[i];}
				}
				
				String encode = String.valueOf(charArray);
				textArea_1.setText(encode);
			}
		});
		btnEncode.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEncode.setBounds(335, 120, 89, 23);
		frame.getContentPane().add(btnEncode);
		
		
		
		//Top Text Area***********************************************************************
		
		textArea.setLineWrap(true);
		textArea.setBounds(10, 11, 414, 98);
		frame.getContentPane().add(textArea);
		textArea.setBorder(border);
		
		//Result Text Area********************************************************************
		
		textArea_1.setEditable(false);
		textArea_1.setBounds(10, 154, 414, 96);
		frame.getContentPane().add(textArea_1);
		textArea_1.setRows(5);
		textArea_1.setColumns(10);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setLineWrap(true);
		textArea_1.setBorder(border);
		
		JButton btnDecode = new JButton("Decode");
		btnDecode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String sentence = textArea.getText();
				char[] charArray = sentence.toCharArray();
				
				for(int i = 0; i < charArray.length; i++){
					if(charArray[i] == 'a' || charArray[i] == 'A' ){ charArray[i] = 'g';}
					else if(charArray[i] == 'g' || charArray[i] == 'G' ){ charArray[i] = 'a';}
					else if(charArray[i] == 'j' || charArray[i] == 'J' ){ charArray[i] = 'b';}
					else if(charArray[i] == 'n' || charArray[i] == 'N' ){ charArray[i] = 'c';}
					else if(charArray[i] == 'c' || charArray[i] == 'C' ){ charArray[i] = 'd';}
					else if(charArray[i] == 'x' || charArray[i] == 'X' ){ charArray[i] = 'e';}
					else if(charArray[i] == 'r' || charArray[i] == 'R' ){ charArray[i] = 'f';}
					else if(charArray[i] == 'f' || charArray[i] == 'F' ){ charArray[i] = 'g';}
					else if(charArray[i] == 'i' || charArray[i] == 'I' ){ charArray[i] = 'h';}
					else if(charArray[i] == 'y' || charArray[i] == 'Y' ){ charArray[i] = 'i';}
					else if(charArray[i] == 'a' || charArray[i] == 'A' ){ charArray[i] = 'j';}
					else if(charArray[i] == 'o' || charArray[i] == 'O' ){ charArray[i] = 'k';}
					else if(charArray[i] == 'z' || charArray[i] == 'Z' ){ charArray[i] = 'l';}
					else if(charArray[i] == 's' || charArray[i] == 'S' ){ charArray[i] = 'm';}
					else if(charArray[i] == 'w' || charArray[i] == 'W' ){ charArray[i] = 'n';}
					else if(charArray[i] == 'b' || charArray[i] == 'B' ){ charArray[i] = 'o';}
					else if(charArray[i] == 'k' || charArray[i] == 'K' ){ charArray[i] = 'p';}
					else if(charArray[i] == 'p' || charArray[i] == 'P' ){ charArray[i] = 'q';}
					else if(charArray[i] == 'e' || charArray[i] == 'E' ){ charArray[i] = 'r';}
					else if(charArray[i] == 'u' || charArray[i] == 'U' ){ charArray[i] = 's';}
					else if(charArray[i] == 'l' || charArray[i] == 'L' ){ charArray[i] = 't';}
					else if(charArray[i] == 'v' || charArray[i] == 'V' ){ charArray[i] = 'u';}
					else if(charArray[i] == 't' || charArray[i] == 'T' ){ charArray[i] = 'v';}
					else if(charArray[i] == 'h' || charArray[i] == 'H' ){ charArray[i] = 'w';}
					else if(charArray[i] == 'q' || charArray[i] == 'Q' ){ charArray[i] = 'x';}
					else if(charArray[i] == 'm' || charArray[i] == 'M' ){ charArray[i] = 'y';}
					else if(charArray[i] == 'd' || charArray[i] == 'D' ){ charArray[i] = 'z';}
					else{ charArray[i] = charArray[i];}
				}
				
				String decode = String.valueOf(charArray);
				textArea_1.setText(decode);

			}
		});
		btnDecode.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDecode.setBounds(236, 120, 89, 23);
		frame.getContentPane().add(btnDecode);
	}
}
