package codigo.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Rectangle;

public class Boleta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblPaisUsuario;
	private JLabel lblNomCompleUsuario;
	private JLabel lblCorreoUsuario;
	private JLabel lblCiudadUsuario;
	
	public void agregarDatos(String pais, String nombreCompleto, String correo, String ciudad) {
		lblPaisUsuario.setText(pais);
		lblNomCompleUsuario.setText(nombreCompleto);
		lblCorreoUsuario.setText(correo);
		lblCiudadUsuario.setText(ciudad);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boleta frame = new Boleta();
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
	public Boleta() {
		setBounds(new Rectangle(0, 0, 0, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Boleta.class.getResource("/recursos/imagenes/imagenes_ventana/logo.png")));
		setTitle("Boleta");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("País :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Ferrari Sans", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 14, 163, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombre completo :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Ferrari Sans", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 48, 163, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Correo electrónico :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Ferrari Sans", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 86, 163, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Ciudad:");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Ferrari Sans", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 124, 163, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("<html><center>\r\nSu solicitud ha sido procesada con éxito.\r\n</center></html>");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Ferrari Sans", Font.BOLD, 12));
		lblNewLabel_4.setBackground(new Color(210, 210, 210));
		lblNewLabel_4.setBounds(118, 158, 190, 77);
		contentPane.add(lblNewLabel_4);
		
		lblPaisUsuario = new JLabel("");
		lblPaisUsuario.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblPaisUsuario.setForeground(new Color(255, 255, 255));
		lblPaisUsuario.setBounds(180, 12, 227, 20);
		contentPane.add(lblPaisUsuario);
		
		lblNomCompleUsuario = new JLabel("");
		lblNomCompleUsuario.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblNomCompleUsuario.setForeground(new Color(255, 255, 255));
		lblNomCompleUsuario.setBounds(180, 45, 227, 20);
		contentPane.add(lblNomCompleUsuario);
		
		lblCorreoUsuario = new JLabel("");
		lblCorreoUsuario.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblCorreoUsuario.setForeground(new Color(255, 255, 255));
		lblCorreoUsuario.setBounds(180, 83, 227, 20);
		contentPane.add(lblCorreoUsuario);
		
		lblCiudadUsuario = new JLabel("");
		lblCiudadUsuario.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblCiudadUsuario.setForeground(new Color(255, 255, 255));
		lblCiudadUsuario.setBounds(180, 121, 227, 20);
		contentPane.add(lblCiudadUsuario);

	}

}
