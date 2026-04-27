package codigo.paneles;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image; // MPORTANTE
import java.awt.Graphics;// IMPORTANTE
import javax.swing.ImageIcon; // IMPORTANTE
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;


public class SobreNosotros extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel Portada;
	private JPanel PortadaInformacion;
	private JPanel Integrantes01;
	private JPanel Integrantes02;
	private JLabel lblTitulo;
	private JLabel lblTituloInformacion;
	private JLabel lblInformacion;
	private JPanel panel_Int1;
	private JPanel panel_Int2;
	private JPanel panel_Int3;
	private JLabel lblInt01;
	private JLabel lblInt02;
	private JPanel panel_Int5;
	private JPanel panel_Int4;
	private JLabel lblInt03;
	private JLabel lblInt04;
	private JLabel lblInt05;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	

	/**
	 * Create the panel.
	 */
	public SobreNosotros() {
		setPreferredSize(new Dimension(790, 1300));
		setRequestFocusEnabled(false);
		setLayout(new GridLayout(4, 1, 0, 0));
		
		Portada = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/foto_portada.jpg")).getImage();
			
			//Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		add(Portada);
		Portada.setLayout(null);
		
		lblTitulo = new JLabel("<html>\r\nCONOCE A NUESTRO<br>\r\nEQUIPO\r\n<html>");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 30));
		lblTitulo.setBounds(32, 109, 413, 93);
		Portada.add(lblTitulo);
		
		PortadaInformacion = new JPanel();
		PortadaInformacion.setBackground(new Color(255, 255, 255));
		add(PortadaInformacion);
		PortadaInformacion.setLayout(null);
		
		lblTituloInformacion = new JLabel("<html><center>\r\n<b>NUESTRO EQUIPO </b><br><b> DE ESPECIALISTAS DE FERRARI</b></center></html>");
		lblTituloInformacion.setFont(new Font("Ferrari Sans Medium", Font.PLAIN, 28));
		lblTituloInformacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloInformacion.setBounds(68, 62, 634, 86);
		PortadaInformacion.add(lblTituloInformacion);
		
		lblInformacion = new JLabel("<html><center><b>Conoce a nuestro apasionado y único equipo que respalda Ferrari Bogotá, un</b><br><b>grupo de profesionales dedicados a brindar una experiencia excepcional que</b><br><b>captura la esencia de la marca del Cavallino Rampante. Cada uno de nuestros</b><br><b>especialistas contribuirá con su experiencia y dedicación para convertir en</b><br><b>realidad el sueño de experimentar la esencia de Ferrari.</b></html></center>");
		lblInformacion.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblInformacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInformacion.setBounds(121, 150, 523, 86);
		PortadaInformacion.add(lblInformacion);
		
		Integrantes01 = new JPanel();
		Integrantes01.setBackground(new Color(255, 255, 255));
		add(Integrantes01);
		Integrantes01.setLayout(new GridLayout(1, 3, 0, 0));
		
		panel_Int1 = new JPanel();
		panel_Int1.setBackground(new Color(255, 255, 255));
		Integrantes01.add(panel_Int1);
		
		//INTEGRANTE 1 JLABEL
		lblInt01 = new JLabel("");
		lblInt01.setBounds(72, 47, 158, 138);
		
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen1.jpg"));
		Image img1 = icon1.getImage().getScaledInstance(158, 138, Image.SCALE_SMOOTH);
		panel_Int1.setLayout(null);
		lblInt01.setIcon(new ImageIcon(img1));
		panel_Int1.add(lblInt01);
		
		lblNewLabel_5 = new JLabel("Sale Manager");
		lblNewLabel_5.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(72, 220, 158, 17);
		panel_Int1.add(lblNewLabel_5);
		
		lblNewLabel_8 = new JLabel("Correo@");
		lblNewLabel_8.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_8.setBounds(72, 245, 58, 12);
		panel_Int1.add(lblNewLabel_8);
		
		lblNewLabel_15 = new JLabel("+51 999 999 999");
		lblNewLabel_15.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_15.setBounds(72, 258, 144, 12);
		panel_Int1.add(lblNewLabel_15);
		
		lblNewLabel = new JLabel("<html>\r\nMathias Garcia <br>\r\nRiofrio\r\n<html>");
		lblNewLabel.setBounds(72, 189, 158, 33);
		panel_Int1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 12));
		
		panel_Int2 = new JPanel();
		panel_Int2.setBackground(new Color(255, 255, 255));
		Integrantes01.add(panel_Int2);
		panel_Int2.setLayout(null);
		
		//INTEGRANTE 2 JLABEL
		lblInt02 = new JLabel("");
		
		ImageIcon icon2 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen4.png"));
		Image img2 = icon2.getImage().getScaledInstance(158, 138, Image.SCALE_SMOOTH);
		lblInt02.setIcon(new ImageIcon(img2));
		lblInt02.setBounds(37, 46, 158, 138);
		panel_Int2.add(lblInt02);
		
		lblNewLabel_6 = new JLabel("Marketing Manager");
		lblNewLabel_6.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(37, 219, 158, 17);
		panel_Int2.add(lblNewLabel_6);
		
		lblNewLabel_9 = new JLabel("Correo@");
		lblNewLabel_9.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_9.setBounds(37, 247, 66, 12);
		panel_Int2.add(lblNewLabel_9);
		
		lblNewLabel_16 = new JLabel("+51 999 999 999");
		lblNewLabel_16.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_16.setBounds(37, 259, 158, 12);
		panel_Int2.add(lblNewLabel_16);
		
		lblNewLabel_1 = new JLabel("<html>Leonardo Gavancho <br>Tenorio</br></html>");
		lblNewLabel_1.setBounds(36, 185, 193, 36);
		panel_Int2.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 12));
		
		panel_Int3 = new JPanel();
		panel_Int3.setBackground(new Color(255, 255, 255));
		Integrantes01.add(panel_Int3);
		panel_Int3.setLayout(null);
		
		//INTEGRANTE 3 JLABEL
		lblInt03 = new JLabel("");
		ImageIcon icon3 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen3.jpg"));
		Image img3 = icon3.getImage().getScaledInstance(158, 138, Image.SCALE_SMOOTH);
		lblInt03.setIcon(new ImageIcon(img3));
		lblInt03.setBounds(10, 46, 158, 138);
		panel_Int3.add(lblInt03);
		
		lblNewLabel_2 = new JLabel("<html>\r\nGabriela Ramos<br>\r\nMarin\r\n<html>");
		lblNewLabel_2.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 183, 148, 33);
		panel_Int3.add(lblNewLabel_2);
		
		lblNewLabel_7 = new JLabel("Sales Executive");
		lblNewLabel_7.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(10, 216, 158, 19);
		panel_Int3.add(lblNewLabel_7);
		
		lblNewLabel_10 = new JLabel("Correo@");
		lblNewLabel_10.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_10.setBounds(10, 246, 51, 12);
		panel_Int3.add(lblNewLabel_10);
		
		lblNewLabel_17 = new JLabel("+51 999 999 999");
		lblNewLabel_17.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_17.setBounds(10, 260, 120, 12);
		panel_Int3.add(lblNewLabel_17);
		
		Integrantes02 = new JPanel();
		Integrantes02.setBackground(new Color(255, 255, 255));
		add(Integrantes02);
		Integrantes02.setLayout(new GridLayout(1, 0, 0, 0));
		
		panel_Int4 = new JPanel();
		panel_Int4.setBackground(new Color(255, 255, 255));
		Integrantes02.add(panel_Int4);
		
		//INTEGRANTE 4 JLABEL
		lblInt04 = new JLabel("");
		lblInt04.setBounds(173, 10, 158, 136);
		ImageIcon icon4 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen5.png"));
		Image img4 = icon4.getImage().getScaledInstance(158, 138, Image.SCALE_SMOOTH);
		panel_Int4.setLayout(null);
		lblInt04.setIcon(new ImageIcon (img4));
		panel_Int4.add(lblInt04);
		
		lblNewLabel_3 = new JLabel("<html>Alexander Hernández <br>León</html>");
		lblNewLabel_3.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 12));
		lblNewLabel_3.setBounds(173, 150, 173, 36);
		panel_Int4.add(lblNewLabel_3);
		
		lblNewLabel_11 = new JLabel("Service Manager");
		lblNewLabel_11.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_11.setBounds(173, 186, 158, 12);
		panel_Int4.add(lblNewLabel_11);
		
		lblNewLabel_13 = new JLabel("Correo@");
		lblNewLabel_13.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_13.setBounds(173, 209, 68, 12);
		panel_Int4.add(lblNewLabel_13);
		
		lblNewLabel_18 = new JLabel("+51 999 999 999");
		lblNewLabel_18.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_18.setBounds(173, 223, 158, 12);
		panel_Int4.add(lblNewLabel_18);
		
		panel_Int5 = new JPanel();
		panel_Int5.setBackground(new Color(255, 255, 255));
		Integrantes02.add(panel_Int5);
		panel_Int5.setLayout(null);
		
		lblInt05 = new JLabel("");
		ImageIcon icon5 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen2.png"));
		Image img5 = icon5.getImage().getScaledInstance(158, 138, Image.SCALE_SMOOTH);
		lblInt05.setIcon(new ImageIcon (img5));
		lblInt05.setBounds(31, 10, 158, 138);
		panel_Int5.add(lblInt05);
		
		lblNewLabel_4 = new JLabel("<html>Mathias Talavera <br>Torres</br></html>");
		lblNewLabel_4.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 12));
		lblNewLabel_4.setBounds(31, 150, 158, 36);
		panel_Int5.add(lblNewLabel_4);
		
		lblNewLabel_12 = new JLabel("Master Technician");
		lblNewLabel_12.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_12.setBounds(31, 186, 158, 15);
		panel_Int5.add(lblNewLabel_12);
		
		lblNewLabel_14 = new JLabel("Correo@");
		lblNewLabel_14.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_14.setBounds(31, 209, 54, 12);
		panel_Int5.add(lblNewLabel_14);
		
		lblNewLabel_19 = new JLabel("+51 999 999 999");
		lblNewLabel_19.setFont(new Font("Ferrari Sans", Font.PLAIN, 9));
		lblNewLabel_19.setBounds(31, 223, 158, 12);
		panel_Int5.add(lblNewLabel_19);

	}
}
