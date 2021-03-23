package Interface_Grafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class Trabalho_Quiz_CadastroFinalVersion extends JFrame {
	/*
	 
	 by: Cauan de Paula, Gustavo Candido e Heleno Matos - 4SIT
	
	 */
	Trabalho_Quiz_Cadastro frame;
	private static Container ctela;
	private JLabel lbnome, lbuser;
	private static JTextField tfnome;
	private static JButton btenviar;
	private JPanel panel1;
	ImageIcon user, bt;

	public Trabalho_Quiz_CadastroFinalVersion() {
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
		ctela = getContentPane();
		
		panel1 = new JPanel((null));
		
		Color azul = new Color(65, 130, 180);
		panel1.setBackground(azul);
		
		Border lineBorder = BorderFactory.createLineBorder(Color.black);
		panel1.setBorder(lineBorder);
		panel1.setBackground(azul);
		
		lbnome = new JLabel("Nome ou apelido:");
		tfnome = new JTextField();	
		bt = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\bt.png");
		btenviar = new JButton(bt);
		btenviar.setBackground(Color.white);
		btenviar.setToolTipText("Cadastrar");

		lbnome.setBounds(73, 30, 120, 20);
		tfnome.setBounds(194, 31, 150, 20);
		btenviar.setBounds(142, 65, 91, 25);
		
		lbnome.setFont(new Font("Arial", Font.BOLD, 13));
		lbnome.setForeground(Color.white);
		
		user = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\user.png");
		lbuser = new JLabel(user);
		
		lbuser.setBounds(25, 22, 32, 32);
		
		panel1.add(lbuser);
		
		add(lbnome);
		add(tfnome);
		panel1.add(btenviar);
		add(panel1);
	}
	public static String nome(String palavras){
		palavras = tfnome.getText();
		return palavras;
	}
	public static void main(String args[]) {
		Trabalho_Quiz_CadastroFinalVersion frame = new Trabalho_Quiz_CadastroFinalVersion();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(450,300,400,150);
		frame.setVisible(true);
		frame.setTitle("Quiz CGH - Cadastro");
		Image Icone = Toolkit.getDefaultToolkit().getImage("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\imgs_quiz\\logo.png"); 
		frame.setIconImage(Icone);
		
		 btenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfnome.getText().trim().isEmpty()) {
					UIManager.getDefaults().put("OptionPane.background",new Color(65, 130, 180));
					UIManager.put ("Panel.background", new Color(65,130,180));
					UIManager.put("OptionPane.okButtonText", "Fechar");
					JOptionPane.showMessageDialog(null, "Respostas incompletas. Por favor, preencha o campo de texto e tente novamente.", "Erro",2);
				}else {
				Trabalho_QuizFinalVersion t2 = new Trabalho_QuizFinalVersion();
				ctela.removeAll();
				frame.setBounds(450, 30, 545, 590);
				ctela.add(t2);
				frame.setTitle("Quiz GCH - Conhecimentos Gerais");
				ctela.validate();
				}
				}
			});
	}
}

