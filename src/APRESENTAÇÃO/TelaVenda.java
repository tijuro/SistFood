package APRESENTAÇÃO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;

public class TelaVenda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVenda frame = new TelaVenda();
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
	public TelaVenda() {
		setTitle("TELA DE VENDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 607);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMonitoramentoPedido = new JButton("MONITORAMENTO DE PEDIDO");
		btnMonitoramentoPedido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnMonitoramentoPedido.setBounds(38, 339, 309, 129);
		contentPane.add(btnMonitoramentoPedido);
		
		JButton btnCadastroDeCliente = new JButton("CADASTRO DE CLIENTE");
		btnCadastroDeCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCadastroDeCliente.setBounds(174, 142, 244, 114);
		contentPane.add(btnCadastroDeCliente);
		
		JButton btnCadastroDeProduto_1 = new JButton("CADASTRO DE PRODUTO");
		btnCadastroDeProduto_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCadastroDeProduto_1.setBounds(444, 143, 252, 121);
		contentPane.add(btnCadastroDeProduto_1);
		
		JButton btnCadastroDeMotoboy = new JButton("CADASTRO DE MOTOBOY");
		btnCadastroDeMotoboy.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCadastroDeMotoboy.setBounds(444, 348, 252, 114);
		contentPane.add(btnCadastroDeMotoboy);
		
		JButton btnCadastrar = new JButton("VENDA");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnCadastrar.setBounds(24, 142, 120, 114);
		contentPane.add(btnCadastrar);
		
		JLabel IMG_PANEL = new JLabel("");
		IMG_PANEL.setBackground(new Color(0, 0, 128));
		IMG_PANEL.setIcon(new ImageIcon("C:\\Users\\valmir.lisa\\Desktop\\img\\depositphotos_188874584-stock-photo-menu-background-with-old-marking111.jpg"));
		IMG_PANEL.setBounds(10, 0, 766, 561);
		contentPane.add(IMG_PANEL);
	}
}
