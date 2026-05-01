package codigo.paneles;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class Mantenimiento extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panelPresentacion;
	private JPanel panelAdminVehiculos;
	private JPanel panelAdminUsuarios;
	private JPanel panelInformacion_1;
	private JPanel panelModelos;
	private JPanel panelVistaAccion;
	private JLabel lblFerrariLuce;
	private JLabel lbl849Testarossa;
	private JLabel lbl849TestarossaSpider;
	private JLabel lbl296gtb;
	private JLabel lbl296gts;
	private JLabel lblFerrari12Cilindri;
	private JLabel lblFerrari12CilindriSpider;
	private JLabel lblFerrariPurosangre;
	private JLabel lblFerrariAmalfi;
	private JLabel lblFerrariAmalfiSpider;
	private JLabel lblFerrariNombre;
	private JButton btnNewButton;
	private JButton btnOcultar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panelAccion;
	private JPanel panelUsuarios;
	private JPanel panelInformacion_2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel panelUsuario1;
	private JLabel lblUsuario1;
	private JLabel lblCorreo1;
	private JPanel panelUsuario2;
	private JLabel lblUsuario2;
	private JLabel lblCorreo2;
	private JButton btnOcultar_1;
	private JLabel lblNewLabel_4;

	/**
	 * Create the panel.
	 */
	public Mantenimiento() {
		setMinimumSize(new Dimension(790, 1095));
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setMinimumSize(new Dimension(790, 1095));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		panelPresentacion = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_mantenimiento/fondo_mantenimiento.jpg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		panel.add(panelPresentacion);
		
		panelAdminVehiculos = new JPanel();
		panelAdminVehiculos.setBackground(new Color(0, 0, 0));
		panel.add(panelAdminVehiculos);
		panelAdminVehiculos.setLayout(new GridLayout(1, 3, 0, 0));
		
		panelInformacion_1 = new JPanel();
		panelInformacion_1.setBackground(new Color(0, 0, 0));
		panelAdminVehiculos.add(panelInformacion_1);
		panelInformacion_1.setLayout(null);
		
		lblNewLabel = new JLabel("<html>\r\nHabilite u oculte <br>\r\nmodelos\r\n</html>");
		lblNewLabel.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 23));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 26, 243, 79);
		panelInformacion_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("<html>\r\nEn este apartado puede modificar la visibilidad <br>\r\nde los modelos de la marca, eligiendo que <br>\r\nmodelos pueden o no ser vistos por el usuario\r\n</html>");
		lblNewLabel_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 103, 243, 99);
		panelInformacion_1.add(lblNewLabel_1);
		
		panelModelos = new JPanel();
		panelModelos.setBorder(new EmptyBorder(35, 70, 0, 0));
		panelModelos.setBackground(new Color(0, 0, 0));
		panelAdminVehiculos.add(panelModelos);
		panelModelos.setLayout(new BoxLayout(panelModelos, BoxLayout.Y_AXIS));
		
		lblFerrariLuce = new JLabel("Ferrari  Luce");
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariLuce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariLuce.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariLuce);
		
		lbl849Testarossa = new JLabel("849 Testarossa");
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl849Testarossa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl849Testarossa.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl849Testarossa);
		
		lbl849TestarossaSpider = new JLabel("849 Testarossa Spider");
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl849TestarossaSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl849TestarossaSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl849TestarossaSpider);
		
		lbl296gtb = new JLabel("296 GTB");
		lbl296gtb.setForeground(new Color(162, 162, 162));
		lbl296gtb.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl296gtb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl296gtb.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl296gtb);
		
		lbl296gts = new JLabel("296 GTS");
		lbl296gts.setForeground(new Color(162, 162, 162));
		lbl296gts.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl296gts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl296gts.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl296gts);
		
		lblFerrari12Cilindri = new JLabel("Ferrari 12 Cilindri");
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrari12Cilindri.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrari12Cilindri.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrari12Cilindri);
		
		lblFerrari12CilindriSpider = new JLabel("Ferrari 12 Cilindri Spider");
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrari12CilindriSpider.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrari12CilindriSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrari12CilindriSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrari12CilindriSpider);
		
		lblFerrariPurosangre = new JLabel("Ferrari Purosangre");
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariPurosangre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariPurosangre.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariPurosangre);
		
		lblFerrariAmalfi = new JLabel("Ferrari Amalfi");
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariAmalfi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariAmalfi.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariAmalfi);
		
		lblFerrariAmalfiSpider = new JLabel("Ferrari Amalfi Spider");
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariAmalfiSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariAmalfiSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariAmalfiSpider);
		
		panelVistaAccion = new JPanel();
		panelVistaAccion.setBackground(new Color(0, 0, 0));
		panelAdminVehiculos.add(panelVistaAccion);
		panelVistaAccion.setLayout(null);
		
		lblFerrariNombre = new JLabel("");
		lblFerrariNombre.setPreferredSize(new Dimension(200, 49));
		lblFerrariNombre.setIcon(new ImageIcon(Mantenimiento.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_1_rend.jpeg")));
		lblFerrariNombre.setBounds(34, 90, 200, 35);
		panelVistaAccion.add(lblFerrariNombre);
		
		btnNewButton = new JButton("Habilitar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(226, 232, 26));
		btnNewButton.setFont(new Font("Ferrari Sans", Font.PLAIN, 15));
		btnNewButton.setBounds(64, 155, 146, 35);
		panelVistaAccion.add(btnNewButton);
		
		btnOcultar = new JButton("Ocultar");
		btnOcultar.setForeground(new Color(255, 255, 255));
		btnOcultar.setBorder(null);
		btnOcultar.setBackground(new Color(228, 29, 34));
		btnOcultar.setFont(new Font("Ferrari Sans", Font.PLAIN, 15));
		btnOcultar.setBounds(64, 209, 146, 35);
		panelVistaAccion.add(btnOcultar);
		
		panelAdminUsuarios = new JPanel();
		panelAdminUsuarios.setBackground(new Color(0, 0, 0));
		panel.add(panelAdminUsuarios);
		panelAdminUsuarios.setLayout(new GridLayout(1, 3, 0, 0));
		
		panelAccion = new JPanel();
		panelAccion.setBackground(new Color(0, 0, 0));
		panelAdminUsuarios.add(panelAccion);
		panelAccion.setLayout(null);
		
		btnOcultar_1 = new JButton("Ocultar");
		btnOcultar_1.setForeground(Color.WHITE);
		btnOcultar_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 15));
		btnOcultar_1.setBorder(null);
		btnOcultar_1.setBackground(new Color(228, 29, 34));
		btnOcultar_1.setBounds(64, 44, 146, 35);
		panelAccion.add(btnOcultar_1);
		
		lblNewLabel_4 = new JLabel("<html>\r\n¡Advertencia! Al borrar una cuenta<br>\r\nes imposible recuperarla <br>\r\n</html>");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(10, 80, 243, 61);
		panelAccion.add(lblNewLabel_4);
		
		panelUsuarios = new JPanel();
		panelUsuarios.setBackground(new Color(0, 0, 0));
		panelAdminUsuarios.add(panelUsuarios);
		panelUsuarios.setLayout(null);
		
		panelUsuario1 = new JPanel();
		panelUsuario1.setBounds(26, 44, 210, 73);
		panelUsuarios.add(panelUsuario1);
		panelUsuario1.setLayout(null);
		
		lblUsuario1 = new JLabel("Usuario 1");
		lblUsuario1.setFont(new Font("Ferrari Sans", Font.PLAIN, 17));
		lblUsuario1.setBounds(10, 10, 103, 24);
		panelUsuario1.add(lblUsuario1);
		
		lblCorreo1 = new JLabel("");
		lblCorreo1.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblCorreo1.setBounds(10, 40, 190, 20);
		panelUsuario1.add(lblCorreo1);
		
		panelUsuario2 = new JPanel();
		panelUsuario2.setLayout(null);
		panelUsuario2.setBounds(26, 167, 210, 73);
		panelUsuarios.add(panelUsuario2);
		
		lblUsuario2 = new JLabel("Usuario 1");
		lblUsuario2.setFont(new Font("Ferrari Sans", Font.PLAIN, 17));
		lblUsuario2.setBounds(10, 10, 103, 24);
		panelUsuario2.add(lblUsuario2);
		
		lblCorreo2 = new JLabel("");
		lblCorreo2.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblCorreo2.setBounds(10, 40, 190, 20);
		panelUsuario2.add(lblCorreo2);
		
		panelInformacion_2 = new JPanel();
		panelInformacion_2.setBackground(new Color(0, 0, 0));
		panelAdminUsuarios.add(panelInformacion_2);
		panelInformacion_2.setLayout(null);
		
		lblNewLabel_2 = new JLabel("<html>\r\nEn este apartado puede modificar la visibilidad <br>\r\nde los modelos de la marca, eligiendo que <br>\r\nmodelos pueden o no ser vistos por el usuario\r\n</html>");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(10, 103, 243, 99);
		panelInformacion_2.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("<html>\r\nAdministre usuarios\r\n</html>");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 23));
		lblNewLabel_3.setBounds(10, 26, 243, 79);
		panelInformacion_2.add(lblNewLabel_3);

	}
}
