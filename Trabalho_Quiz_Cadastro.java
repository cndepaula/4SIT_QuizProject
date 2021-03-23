package Interface_Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Trabalho_Quiz_Cadastro extends JFrame {
	/*
	 
	 by: Cauan de Paula, Gustavo Candido e Heleno Matos - 4SIT
	
	 */
	Trabalho_Quiz_Cadastro frame;
	private static Container ctela;
	private JLabel lbnome;
	private JTextField tfnome;
	private static JButton btenviar;
	private JPanel panel1;

	public Trabalho_Quiz_Cadastro() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		ctela = getContentPane();
		
		panel1 = new JPanel((null));
		
		lbnome = new JLabel("Nome ou Apelido:");
		tfnome = new JTextField();	
		btenviar = new JButton("Cadastrar");
		
	    lbnome.setBounds(30, 30, 100, 20);
		tfnome.setBounds(132, 31, 220, 20);
		btenviar.setBounds(140, 65, 91, 25);
		
		panel1.add(lbnome);
		panel1.add(tfnome);
		panel1.add(btenviar);
		panel1.setBounds(450,200,468,390);
		add(panel1);
	}
	
	public void definirEventos() {
		btenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbnome.setVisible(true);
				lbnome.setText(tfnome.getText());
				}
			});
	}
	
	public static void main(String args[]) {
		Trabalho_Quiz_Cadastro frame = new Trabalho_Quiz_Cadastro();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(450,300,400,150);
		frame.setVisible(true);
		frame.setTitle("Quiz CGH - Cadastro ");
		
		 btenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trabalho_Quiz t2 = new Trabalho_Quiz();
				ctela.removeAll();
				frame.setBounds(450,300,468,390);
				ctela.add(t2);
				ctela.validate();
				}
			});
	}
}

