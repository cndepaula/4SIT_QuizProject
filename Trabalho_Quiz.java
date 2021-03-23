package Interface_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Trabalho_Quiz extends JPanel {
	/*
	 
	 by: Cauan de Paula, Gustavo Candido e Heleno Matos - 4SIT
	
	 */
	private JLabel lbq1, lbq2, lbq3, lbq4, lbq5, lbq6, lbq7, lbq8, lbq9, lbq10;
	private JRadioButton rb1a, rb1b, rb1c, rb1d, 
	rb2a, rb2b, rb2c, rb2d, 
	rb3a, rb3b, rb3c, rb3d, 
	rb4a, rb4b, rb4c, rb4d, 
	rb5a, rb5b, rb5c, rb5d,
	rb6a, rb6b, rb6c, rb6d, 
	rb7a, rb7b, rb7c, rb7d, 
	rb8a, rb8b, rb8c, rb8d, 
	rb9a, rb9b, rb9c, rb9d, 
	rb10a, rb10b, rb10c, rb10d;
	private ButtonGroup btg1, btg2, btg3, btg4, btg5, btg6, btg7, btg8, btg9, btg10;
	
	private JButton btenviar;
	
	JScrollPane scrollT;

	
	public Trabalho_Quiz() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		setLayout(null);
		//Questão 1
		lbq1 = new JLabel("Questão 1 vai aq");
		rb1a = new JRadioButton("Alternativa a, vai aqui");
		rb1b = new JRadioButton("Alternativa b, vai aqui");
		rb1c = new JRadioButton("Alternativa c, vai aqui");
		rb1d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 2
		lbq2 = new JLabel("Questão 2 vai aq");
		rb2a = new JRadioButton("Alternativa a, vai aqui");
		rb2b = new JRadioButton("Alternativa b, vai aqui");
		rb2c = new JRadioButton("Alternativa c, vai aqui");
		rb2d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 3
		lbq3 = new JLabel("Questão 3 vai aq");
		rb3a = new JRadioButton("Alternativa a, vai aqui");
		rb3b = new JRadioButton("Alternativa b, vai aqui");
		rb3c = new JRadioButton("Alternativa c, vai aqui");
		rb3d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 4
		lbq4 = new JLabel("Questão 4 vai aq");
		rb4a = new JRadioButton("Alternativa a, vai aqui");
		rb4b = new JRadioButton("Alternativa b, vai aqui");
		rb4c = new JRadioButton("Alternativa c, vai aqui");
		rb4d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 5
		lbq5 = new JLabel("Questão 5 vai aq");
		rb5a = new JRadioButton("Alternativa a, vai aqui");
		rb5b = new JRadioButton("Alternativa b, vai aqui");
		rb5c = new JRadioButton("Alternativa c, vai aqui");
		rb5d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 6
		lbq6 = new JLabel("Questão 6 vai aq");
		rb6a = new JRadioButton("Alternativa a, vai aqui");
		rb6b = new JRadioButton("Alternativa b, vai aqui");
		rb6c = new JRadioButton("Alternativa c, vai aqui");
		rb6d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 7
		lbq7 = new JLabel("Questão 7 vai aq");
		rb7a = new JRadioButton("Alternativa a, vai aqui");
		rb7b = new JRadioButton("Alternativa b, vai aqui");
		rb7c = new JRadioButton("Alternativa c, vai aqui");
		rb7d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 8
		lbq8 = new JLabel("Questão 8 vai aq");
		rb8a = new JRadioButton("Alternativa a, vai aqui");
		rb8b = new JRadioButton("Alternativa b, vai aqui");
		rb8c = new JRadioButton("Alternativa c, vai aqui");
		rb8d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 9
		lbq9 = new JLabel("Questão 9 vai aq");
		rb9a = new JRadioButton("Alternativa a, vai aqui");
		rb9b = new JRadioButton("Alternativa b, vai aqui");
		rb9c = new JRadioButton("Alternativa c, vai aqui");
		rb9d = new JRadioButton("Alternativa d, vai aqui");
		
		//Questão 10
		lbq10 = new JLabel("Questão 10 vai aq");
		rb10a = new JRadioButton("Alternativa a, vai aqui");
		rb10b = new JRadioButton("Alternativa b, vai aqui");
		rb10c = new JRadioButton("Alternativa c, vai aqui");
		rb10d = new JRadioButton("Alternativa d, vai aqui");
		
		btg1= new ButtonGroup();
		btg2= new ButtonGroup();
		btg3= new ButtonGroup();
		btg4= new ButtonGroup();
		btg5= new ButtonGroup();
		btg6= new ButtonGroup();
		btg7= new ButtonGroup();
		btg8= new ButtonGroup();
		btg9= new ButtonGroup();
		btg10= new ButtonGroup();
		
		
		btg1.add(rb1a);
		btg1.add(rb1b);
		btg1.add(rb1c);
		btg1.add(rb1d);
		
		btg2.add(rb2a);
		btg2.add(rb2b);
		btg2.add(rb2c);
		btg2.add(rb2d);
		
		btg3.add(rb3a);
		btg3.add(rb3b);
		btg3.add(rb3c);
		btg3.add(rb3d);
		
		btg4.add(rb4a);
		btg4.add(rb4b);
		btg4.add(rb4c);
		btg4.add(rb4d);
		
		btg5.add(rb5a);
		btg5.add(rb5b);
		btg5.add(rb5c);
		btg5.add(rb5d);
		
		btg6.add(rb6a);
		btg6.add(rb6b);
		btg6.add(rb6c);
		btg6.add(rb6d);
		
		btg7.add(rb7a);
		btg7.add(rb7b);
		btg7.add(rb7c);
		btg7.add(rb7d);
		
		btg8.add(rb8a);
		btg8.add(rb8b);
		btg8.add(rb8c);
		btg8.add(rb8d);
		
		btg9.add(rb9a);
		btg9.add(rb9b);
		btg9.add(rb9c);
		btg9.add(rb9d);
		
		btg10.add(rb10a);
		btg10.add(rb10b);
		btg10.add(rb10c);
		btg10.add(rb10d);
		
		//Q1
		lbq1.setBounds(0,10,150,30);
		rb1a.setBounds(0,30,150,30);
		rb1b.setBounds(0,50,150,30);
		rb1c.setBounds(0,70,150,30);
		rb1d.setBounds(0,90,150,30);
		
		//Q2
		lbq2.setBounds(0,10,150,30);
		rb2a.setBounds(0,0,150,30);
		rb2b.setBounds(0,0,150,30);
		rb2c.setBounds(0,0,150,30);
		rb2d.setBounds(0,0,150,30);
		
		//Q3
		lbq3.setBounds(0,10,150,30);
		rb3a.setBounds(0,0,150,30);
		rb3b.setBounds(0,0,150,30);
		rb3c.setBounds(0,0,150,30);
		rb3d.setBounds(0,0,150,30);
		
		//Q4
		lbq4.setBounds(0,10,150,30);
		rb4a.setBounds(0,0,150,30);
		rb4b.setBounds(0,0,150,30);
		rb4c.setBounds(0,0,150,30);
		rb4d.setBounds(0,0,150,30);
		
		//Q5
		lbq5.setBounds(0,10,150,30);
		lbq4.setBounds(0,10,150,30);
		rb5a.setBounds(0,0,150,30);
		rb5b.setBounds(0,0,150,30);
		rb5c.setBounds(0,0,150,30);
		rb5d.setBounds(0,0,150,30);
		
		//Q6
		lbq6.setBounds(0,10,150,30);
		rb6a.setBounds(0,0,150,30);
		rb6b.setBounds(0,0,150,30);
		rb6c.setBounds(0,0,150,30);
		rb6d.setBounds(0,0,150,30);
		
		//Q7
		lbq7.setBounds(0,10,150,30);
		rb7a.setBounds(0,0,150,30);
		rb7b.setBounds(0,0,150,30);
		rb7c.setBounds(0,0,150,30);
		rb7d.setBounds(0,0,150,30);
		
		//Q8
		lbq8.setBounds(0,10,150,30);
		rb8a.setBounds(0,0,150,30);
		rb8b.setBounds(0,0,150,30);
		rb8c.setBounds(0,0,150,30);
		rb8d.setBounds(0,0,150,30);
		
		//Q9
		lbq9.setBounds(0,10,150,30);
		rb9a.setBounds(0,0,150,30);
		rb9b.setBounds(0,0,150,30);
		rb9c.setBounds(0,0,150,30);
		rb9d.setBounds(0,0,150,30);
		
		//Q10
		lbq10.setBounds(0,10,150,30);
		rb10a.setBounds(0,0,150,30);
		rb10b.setBounds(0,0,150,30);
		rb10c.setBounds(0,0,150,30);
		rb10d.setBounds(0,0,150,30);
		
		add(lbq1);
		add(rb1a);
		add(rb1b);
		add(rb1c);
		add(rb1d);
		
		add(lbq2);
		add(rb2a);
		add(rb2b);
		add(rb2c);
		add(rb2d);
		
		add(lbq3);
		add(lbq1);
		add(rb3a);
		add(rb3b);
		add(rb3c);
		add(rb3d);
		
		add(lbq4);
		add(rb4a);
		add(rb4b);
		add(rb4c);
		add(rb4d);
		
		add(lbq5);
		add(rb5a);
		add(rb5b);
		add(rb5c);
		add(rb5d);
		
		add(lbq6);
		add(rb6a);
		add(rb6b);
		add(rb6c);
		add(rb6d);
		
		add(lbq7);
		add(rb7a);
		add(rb7b);
		add(rb7c);
		add(rb7d);
		
		add(lbq8);
		add(rb8a);
		add(rb8b);
		add(rb8c);
		add(rb8d);
		
		add(lbq9);
		add(rb9a);
		add(rb9b);
		add(rb9c);
		add(rb9d);
		
		add(lbq10);
		add(rb10a);
		add(rb10b);
		add(rb10c);
		add(rb10d);
		
	}
	
	public void definirEventos() {
		
	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("Quiz CGH");
		frame.setResizable(false);
		frame.getContentPane().add(new Trabalho_Quiz());
		frame.setBounds(300,0,725,725);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Quiz CGH ");
		
	}
}
