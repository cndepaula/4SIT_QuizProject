package Interface_Grafica;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class Trabalho_QuizFinalVersion extends JPanel {
	/*
	 * 
	 * by: Cauan de Paula, Gustavo Candido e Heleno Matos - 4SIT
	 * 
	 */
	String nome = "";
	String user = Trabalho_Quiz_CadastroFinalVersion.nome(nome);
	JPanel tela;
	JRadioButton rb1a, rb1b, rb1c, rb1d, rb2a, rb2b, rb2c, rb2d, rb3a, rb3b, rb3c, rb3d, rb4a, rb4b, rb4c, rb4d, rb5a,
			rb5b, rb5c, rb5d, rb6a, rb6b, rb6c, rb6d;

	ButtonGroup btg1, btg2, btg3, btg4, btg5, btg6;

	JLabel lbq1, lbq2, lbq3, lbq4, lbq5, lbq6, lbdiv, lbdiv2, lbup;
	ImageIcon div, div2, up, bt;
	int pont = 0;
	JButton btfinalizar;

	public Trabalho_QuizFinalVersion() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		Color azul = new Color(65, 130, 180);
		Color az = new Color(55, 110, 170);
		setBackground(azul);
		setLayout(null);
		tela = new JPanel((null));
		// Questão 1
		lbq1 = new JLabel("1. Quem pintou “Guernica”?");
		rb1a = new JRadioButton("Paul Cézanne");
		rb1b = new JRadioButton("Pablo Picasso"); // resposta certa
		rb1c = new JRadioButton("Tarsila do Amaral");
		rb1d = new JRadioButton("Salvador Dalí");

		// Questão 2
		lbq2 = new JLabel("4. Qual a nacionalidade de Che Guevara?");
		rb2a = new JRadioButton("Argentina"); // resposta certa
		rb2b = new JRadioButton("Cubana");
		rb2c = new JRadioButton("Boliviana");
		rb2d = new JRadioButton("Peruana");

		// Questão 3
		lbq3 = new JLabel("2. Qual a velocidade da luz?");
		rb3a = new JRadioButton("199 792 458 (m/s)");
		rb3b = new JRadioButton("300 000 000 (m/s)");
		rb3c = new JRadioButton("299 792 458 (m/s)"); // resposta certa
		rb3d = new JRadioButton("294 852 666 (m/s)");

		// Questão 4
		lbq4 = new JLabel("5. Qual local da Ásia o português é língua oficial?");
		rb4a = new JRadioButton("Filipinas");
		rb4b = new JRadioButton("Macau"); // resposta certa
		rb4c = new JRadioButton("índia");
		rb4d = new JRadioButton("Moçambique");

		// Questão 5
		lbq5 = new JLabel("3. Quem é o autor de “O Príncipe”?");
		rb5a = new JRadioButton("Maquiavel"); // resposta certa
		rb5b = new JRadioButton("Rousseau");
		rb5c = new JRadioButton("Montesquieu");
		rb5d = new JRadioButton("Thomas Hobbes");

		// Questão 6
		lbq6 = new JLabel("6. Qual destes países é transcontinental?");
		rb6a = new JRadioButton("Groenlândia");
		rb6b = new JRadioButton("Rússia"); // resposta certa
		rb6c = new JRadioButton("Istambul");
		rb6d = new JRadioButton("Filipinas");

		// estilo
		div = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\rest.png");
		lbdiv = new JLabel(div);
		div2 = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\rest2.png");
		lbdiv2 = new JLabel(div2);
		up = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\up.png");
		lbup = new JLabel(up);

		// Fontes
		lbq1.setFont(new Font("Arial", Font.ITALIC, 12));
		lbq1.setForeground(Color.white);

		lbq2.setFont(new Font("Arial", Font.ITALIC, 12));
		lbq2.setForeground(Color.white);

		lbq3.setFont(new Font("Arial", Font.ITALIC, 12));
		lbq3.setForeground(Color.white);

		lbq4.setFont(new Font("Arial", Font.ITALIC, 12));
		lbq4.setForeground(Color.white);

		lbq5.setFont(new Font("Arial", Font.ITALIC, 12));
		lbq5.setForeground(Color.white);

		lbq6.setFont(new Font("Arial", Font.ITALIC, 12));
		lbq6.setForeground(Color.white);

		btg1 = new ButtonGroup();
		btg2 = new ButtonGroup();
		btg3 = new ButtonGroup();
		btg4 = new ButtonGroup();
		btg5 = new ButtonGroup();
		btg6 = new ButtonGroup();

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

		// Q1
		lbq1.setBounds(25, 80, 160, 30);
		rb1a.setBounds(25, 100, 150, 30);
		rb1b.setBounds(25, 120, 150, 30);
		rb1c.setBounds(25, 140, 150, 30);
		rb1d.setBounds(25, 160, 150, 30);

		// Q2
		lbq2.setBounds(240, 80, 250, 30);
		rb2a.setBounds(240, 100, 150, 30);
		rb2b.setBounds(240, 120, 150, 30);
		rb2c.setBounds(240, 140, 150, 30);
		rb2d.setBounds(240, 160, 150, 30);

		// Q3
		lbq3.setBounds(25, 215, 200, 30);
		rb3a.setBounds(25, 235, 150, 30);
		rb3b.setBounds(25, 255, 150, 30);
		rb3c.setBounds(25, 275, 150, 30);
		rb3d.setBounds(25, 295, 150, 30);

		// Q4
		lbq4.setBounds(240, 215, 280, 30);
		rb4a.setBounds(240, 235, 150, 30);
		rb4b.setBounds(240, 255, 150, 30);
		rb4c.setBounds(240, 275, 150, 30);
		rb4d.setBounds(240, 295, 150, 30);

		// Q5
		lbq5.setBounds(25, 350, 200, 30);
		rb5a.setBounds(25, 370, 150, 30);
		rb5b.setBounds(25, 390, 150, 30);
		rb5c.setBounds(25, 410, 150, 30);
		rb5d.setBounds(25, 430, 150, 30);

		// Q6
		lbq6.setBounds(240, 350, 250, 30);
		rb6a.setBounds(240, 370, 150, 30);
		rb6b.setBounds(240, 390, 150, 30);
		rb6c.setBounds(240, 410, 150, 30);
		rb6d.setBounds(240, 430, 150, 30);

		lbup.setBounds(220, 10, 64, 64);
		lbdiv.setBounds(5, 60, 500, 70);
		lbdiv2.setBounds(5, 450, 500, 70);

		// tela
		Border lineBorder = BorderFactory.createLineBorder(Color.black);
		TitledBorder title = BorderFactory.createTitledBorder(lineBorder, "Boa sorte "+user+"!");;
		tela.setBorder(title);
		tela.setBounds(10, 10, 510, 535);
		tela.setBackground(azul);

		bt = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\bt.png");

		btfinalizar = new JButton(bt);
		btfinalizar.setBackground(az);
		btfinalizar.setBounds(185, 480, 120, 45);
		btfinalizar.setToolTipText("Enviar respostas");

		rb1a.setBackground(az);
		rb1b.setBackground(az);
		rb1c.setBackground(az);
		rb1d.setBackground(az);
		rb1a.setForeground(Color.white);
		rb1b.setForeground(Color.white);
		rb1c.setForeground(Color.white);
		rb1d.setForeground(Color.white);

		rb2a.setBackground(az);
		rb2b.setBackground(az);
		rb2c.setBackground(az);
		rb2d.setBackground(az);
		rb2a.setForeground(Color.white);
		rb2b.setForeground(Color.white);
		rb2c.setForeground(Color.white);
		rb2d.setForeground(Color.white);

		rb3a.setBackground(az);
		rb3b.setBackground(az);
		rb3c.setBackground(az);
		rb3d.setBackground(az);
		rb3a.setForeground(Color.white);
		rb3b.setForeground(Color.white);
		rb3c.setForeground(Color.white);
		rb3d.setForeground(Color.white);

		rb4a.setBackground(az);
		rb4b.setBackground(az);
		rb4c.setBackground(az);
		rb4d.setBackground(az);
		rb4a.setForeground(Color.white);
		rb4b.setForeground(Color.white);
		rb4c.setForeground(Color.white);
		rb4d.setForeground(Color.white);

		rb5a.setBackground(az);
		rb5b.setBackground(az);
		rb5c.setBackground(az);
		rb5d.setBackground(az);
		rb5a.setForeground(Color.white);
		rb5b.setForeground(Color.white);
		rb5c.setForeground(Color.white);
		rb5d.setForeground(Color.white);

		rb6a.setBackground(az);
		rb6b.setBackground(az);
		rb6c.setBackground(az);
		rb6d.setBackground(az);
		rb6a.setForeground(Color.white);
		rb6b.setForeground(Color.white);
		rb6c.setForeground(Color.white);
		rb6d.setForeground(Color.white);

		tela.add(lbq1);
		tela.add(rb1a);
		tela.add(rb1b);
		tela.add(rb1c);
		tela.add(rb1d);

		tela.add(lbq2);
		tela.add(rb2a);
		tela.add(rb2b);
		tela.add(rb2c);
		tela.add(rb2d);

		tela.add(lbq3);
		tela.add(lbq1);
		tela.add(rb3a);
		tela.add(rb3b);
		tela.add(rb3c);
		tela.add(rb3d);

		tela.add(lbq4);
		tela.add(rb4a);
		tela.add(rb4b);
		tela.add(rb4c);
		tela.add(rb4d);

		tela.add(lbq5);
		tela.add(rb5a);
		tela.add(rb5b);
		tela.add(rb5c);
		tela.add(rb5d);

		tela.add(lbq6);
		tela.add(rb6a);
		tela.add(rb6b);
		tela.add(rb6c);
		tela.add(rb6d);

		tela.add(lbup);
		tela.add(lbdiv);
		tela.add(lbdiv2);
		tela.add(btfinalizar);

		add(tela);

	}

	public void definirEventos() {
		btfinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				if (rb1b.isSelected()) {
					pont = pont + 1;
				}
				if ( rb2a.isSelected()) {
					pont = pont + 1;	
				}
				if (rb3c.isSelected()) {
					pont = pont + 1;	
				}
				if (rb4b.isSelected()) {
					pont = pont + 1;	
				}
				if (rb5a.isSelected()) {
					pont = pont + 1;	
				}
				if (rb6b.isSelected()) {
					pont = pont + 1;	
				}
				if(btg1.isSelected(null)||btg2.isSelected(null)||btg3.isSelected(null)||btg4.isSelected(null)
						||btg5.isSelected(null)||btg6.isSelected(null)) {
							UIManager.getDefaults().put("OptionPane.background",new Color(65, 130, 180));
							UIManager.put ("Panel.background", new Color(65,130,180));
							UIManager.put("OptionPane.okButtonText", "Fechar");
							JOptionPane.showMessageDialog(null, "Respostas incompletas. Por favor, preencha todas as questões e tente novamente.", "Erro",2);
						}else {
							UIManager.getDefaults().put("OptionPane.background",new Color(65, 130, 180));
							UIManager.put ("Panel.background", new Color(65,130,180));
							UIManager.put("OptionPane.okButtonText", "Fechar");
							if(pont>2&&pont<=4) {
							ImageIcon icon = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\medio.png");
							JOptionPane.showMessageDialog(null, user+" você obteve uma pontuação mediana, total de pontos: "+pont+" acertos.", "Pontuação",0,icon);
							System.exit(0);
							}
							if(pont>4) {
								ImageIcon icon = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\bom.png");
								JOptionPane.showMessageDialog(null, "Parabéns "+user+"! Você obteve: "+pont+" acertos.", "Pontuação",0,icon);
								System.exit(0);
								}
							if(pont<=2) {
								ImageIcon icon = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\ruim.png");
								JOptionPane.showMessageDialog(null, "Shiii "+user+", você obteve: "+pont+" acertos.", "Pontuação",0,icon);
								System.exit(0);
								}
						}
			}
		});
	}

	public static void main(String args[]) {
		JFrame frame = new JFrame("Quiz GCH");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Trabalho_QuizFinalVersion());
		frame.setBounds(450, 60, 545, 595);
		frame.setVisible(true);
		frame.setResizable(false);
		Image Icone = Toolkit.getDefaultToolkit().getImage("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\logo.png"); 
		frame.setIconImage(Icone);
	}

}