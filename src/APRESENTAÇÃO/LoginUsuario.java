package APRESENTAÇÃO;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import PERSISTÊNCIA.DB_SISTFOOD;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.Window.Type;
import javax.swing.JSlider;

public class LoginUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pwrSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUsuario frame = new LoginUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginUsuario() {
		setVisible(true);
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		setTitle("LOGIN DE ACESSO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\valmir.lisa\\Desktop\\img\\images (2).jfif"));
		lblNewLabel_2.setBounds(157, 27, 216, 118);
		contentPane.add(lblNewLabel_2);

		pwrSenha = new JPasswordField();
		pwrSenha.setBounds(261, 330, 111, 20);
		contentPane.add(pwrSenha);

		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				try {
					Connection conexao = DB_SISTFOOD.faz_conexao();

					String sql = "select * from LOGIN_USUARIO Where NM_USUARIO=? and NM_SENHA =?";

					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, txtUsuario.getText());
					stmt.setString(2, new String(pwrSenha.getPassword()));

					ResultSet result = stmt.executeQuery();

					if (result.next()) {
						JOptionPane.showMessageDialog(null, "BEM VINDO AO SISTEMA ");
						
						TelaVenda telavenda = new TelaVenda();
						telavenda.setVisible(true);
						
					} else {
						JOptionPane.showMessageDialog(null, "USUARIO E/OU SENHA INVÁLIDO");
					}

					stmt.close();
					conexao.close();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(146, 371, 95, 27);
		contentPane.add(btnNewButton);

		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Arial Black", lblUsuario.getFont().getStyle(), 15));
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(171, 294, 80, 22);
		contentPane.add(lblUsuario);

		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Arial Black", lblSenha.getFont().getStyle(), 15));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(181, 327, 60, 22);
		contentPane.add(lblSenha);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(261, 297, 111, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(50, 152, 46, 14);
		contentPane.add(lblNewLabel_4);
				
				JButton btnSair = new JButton("SAIR");
				btnSair.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnSair.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
				btnSair.setBounds(271, 371, 95, 27);
				contentPane.add(btnSair);
				
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\valmir.lisa\\Desktop\\img\\istockphoto-1006893418-170667a.jpg"));
				lblNewLabel_1.setBounds(47, 134, 496, 347);
				contentPane.add(lblNewLabel_1);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setHorizontalTextPosition(SwingConstants.RIGHT);
				lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\valmir.lisa\\Desktop\\img\\pngtree-cool-poster-tech-poster-tall-bluestar-colorbackgroundbanneradvancedcoil-image_49916.jpg"));
				lblNewLabel.setBounds(0, 0, 585, 123);
				contentPane.add(lblNewLabel);
	}
}
