package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
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
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JDesktopPane desktop = new JDesktopPane();
		frame.getContentPane().add(desktop, BorderLayout.CENTER);

		JMenuBar barraMenu = new JMenuBar();
		frame.setJMenuBar(barraMenu);

		JMenu menuCadastro = new JMenu("Cadastros");
		barraMenu.add(menuCadastro);

		JMenuItem menuDisciplina = new JMenuItem("Disciplina");
		menuDisciplina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaCRUDDisciplina tela = new TelaCRUDDisciplina();
				tela.setVisible(true);
				desktop.add(tela);

			}
		});
		menuCadastro.add(menuDisciplina);

		JMenuItem menuProfessor = new JMenuItem("Professor");
		menuProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				TelaCRUDProfessor tela = new TelaCRUDProfessor();
				tela.setVisible(true);
				desktop.add(tela);
			}
		});
		menuCadastro.add(menuProfessor);
		
		JMenuItem mntmSair = new JMenuItem("sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		menuCadastro.add(mntmSair);
	}
}
