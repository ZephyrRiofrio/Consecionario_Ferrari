package codigo.paneles;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import java.awt.Image; // MPORTANTE
import java.awt.Graphics;// IMPORTANTE
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color; // IMPORTANTE

public class SobreNosotros extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel Portada;
	private JPanel InfoValores;
	private JPanel TiposValores;
	private JPanel InfoIntegrantes;
	private JLabel lblNewLabel;
	private JPanel Integrantes1;
	private JPanel Integrantes2;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

	/**
	 * Create the panel.
	 */
	public SobreNosotros() {
		setPreferredSize(new Dimension(790, 2100));
		setLayout(new GridLayout(6, 1, 0, 0));
		
		Portada = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/autito.jpg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
				
			}
		};
		add(Portada);
		Portada.setLayout(null);
		
		lblNewLabel = new JLabel("<html>\r\nConoce a nuestro <br>\r\nequipo\r\n</html>");
		lblNewLabel.setForeground(new Color(247, 247, 247));
		lblNewLabel.setBackground(new Color(248, 248, 248));
		lblNewLabel.setFont(new Font("Ferrari Sans", Font.BOLD, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 108, 405, 141);
		Portada.add(lblNewLabel);
		
		InfoValores = new JPanel();
		InfoValores.setBackground(new Color(245, 245, 245));
		add(InfoValores);
		InfoValores.setLayout(null);
		
		lblNewLabel_1 = new JLabel("<html><center>Nacido del espíritu de las carreras, Ferrari personifica el poder de una pasión de toda la vida y la belleza de los logros humanos ilimitados, creando iconos atemporales para un mundo cambiante\r\n</center></html>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		lblNewLabel_1.setBounds(177, 81, 412, 95);
		InfoValores.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("NUESTROS VALORES");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 20));
		lblNewLabel_2.setBounds(177, 245, 412, 95);
		InfoValores.add(lblNewLabel_2);
		
		TiposValores = new JPanel();
		TiposValores.setBackground(new Color(255, 255, 255));
		add(TiposValores);
		TiposValores.setLayout(null);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/foto_03.jpg")));
		ImageIcon imgIcon12 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/foto_03.jpg"));
		Image imgEscalada12= imgIcon12.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_3.setIcon(new ImageIcon(imgEscalada12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(294, 10, 190, 175);
		TiposValores.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/foto_02.jpg")));
		ImageIcon imgIcon11 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/foto_02.jpg"));
		Image imgEscalada11= imgIcon11.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_4.setIcon(new ImageIcon(imgEscalada11));	
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(57, 10, 190, 175);
		TiposValores.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/foto_04.jpg")));
		ImageIcon imgIcon13 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/foto_04.jpg"));
		Image imgEscalada13= imgIcon13.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_5.setIcon(new ImageIcon(imgEscalada13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(534, 10, 190, 175);
		TiposValores.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("<html><center>INDIVIDUAL Y EN EQUIPO</center></html>");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_6.setBounds(57, 164, 190, 95);
		TiposValores.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("<html><center>Nuestros talentosos individuos son nuestro mayor recurso. Sin embargo, solo pueden perseguir lo extraordinario trabajando juntos como un equipo. Fomentando la integridad, la excelencia y la generosidad</center><html>");
		lblNewLabel_7.setFont(new Font("Yu Gothic UI", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(57, 195, 190, 140);
		TiposValores.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("<html><center>TRADICION E INNOVACION</center></html>");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_8.setBounds(294, 164, 190, 95);
		TiposValores.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("<html><center>La tradición y la innovación van de la mano en Ferrari. Su constante búsqueda de crear algo nuevo, junto con tecnología avanzada y artesanía de alta calidad, le permite diseñar autos icónicos y atemporales.</center><html>");
		lblNewLabel_9.setFont(new Font("Yu Gothic UI", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(294, 195, 190, 140);
		TiposValores.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("<html><center>PASION Y LOGRO</center></html>");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_10.setBounds(534, 164, 190, 95);
		TiposValores.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("<html><center>El espíritu de carreras de Ferrari inspira emociones más allá de la pista, reflejándose en una actitud de vida basada en la pasión, metas ambiciosas y en superar límites para convertir el esfuerzo en logros.</center><html>");
		lblNewLabel_11.setFont(new Font("Yu Gothic UI", Font.PLAIN, 10));
		lblNewLabel_11.setBounds(534, 196, 190, 140);
		TiposValores.add(lblNewLabel_11);
		
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen1.jpg"));
		Image imgEscalada = imgIcon.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen4.png"));
		Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen3.jpg"));
		Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		
		InfoIntegrantes = new JPanel();
		InfoIntegrantes.setBackground(new Color(255, 255, 255));
		add(InfoIntegrantes);
		InfoIntegrantes.setLayout(null);
		
		lblNewLabel_12 = new JLabel("<html><center>NUESTRO EQUIPO DE ESPECIALISTAS DE FERRARI</center></html>");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 18));
		lblNewLabel_12.setBounds(180, 100, 412, 80);
		InfoIntegrantes.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("<html><center>Conoce a nuestro apasionado y único equipo que respalda Ferrari, un grupo de profesionales dedicados a brindar una experiencia excepcional que captura la esencia de la marca del Cavallino Rampante. Cada uno de nuestros especialistas contribuirá con su experiencia y dedicación para convertir en realidad el sueño de experimentar la esencia de Ferrari.</center><html>");
		lblNewLabel_13.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(136, 161, 513, 129);
		InfoIntegrantes.add(lblNewLabel_13);
		
		ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen5.png"));
		Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen2.png"));
		Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		
		Integrantes1 = new JPanel();
		Integrantes1.setBackground(new Color(255, 255, 255));
		add(Integrantes1);
		Integrantes1.setLayout(null);
		
		lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen1.jpg")));
		ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen1.jpg"));
		Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_14.setIcon(new ImageIcon(imgEscalada6));		
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(57, 41, 203, 193);
		Integrantes1.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen4.png")));
		ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen4.png"));
		Image imgEscalada7= imgIcon7.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_15.setIcon(new ImageIcon(imgEscalada7));	
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(289, 41, 203, 193);
		Integrantes1.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen3.jpg")));
		ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen3.jpg"));
		Image imgEscalada8= imgIcon8.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_16.setIcon(new ImageIcon(imgEscalada8));	
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setBounds(521, 41, 203, 193);
		Integrantes1.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("<html><center>Alexander Hernández León</center><html>");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		lblNewLabel_17.setBounds(289, 244, 203, 42);
		Integrantes1.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("<html>\r\nMathias Garcia <br>\r\nRiofrio\r\n</html>");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		lblNewLabel_18.setBounds(36, 244, 203, 42);
		Integrantes1.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("<html>\r\nGabriela Ramos <br>\r\nMarin\r\n</html>");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		lblNewLabel_19.setBounds(502, 244, 203, 42);
		Integrantes1.add(lblNewLabel_19);
		
		Integrantes2 = new JPanel();
		Integrantes2.setBackground(new Color(255, 255, 255));
		add(Integrantes2);
		Integrantes2.setLayout(null);
		
		lblNewLabel_20 =  new JLabel("New label");
		lblNewLabel_20.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen2.png")));
		ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen2.png"));
		Image imgEscalada10= imgIcon10.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_20.setIcon(new ImageIcon(imgEscalada10));	
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(427, 23, 203, 193);
		Integrantes2.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setIcon(new ImageIcon(SobreNosotros.class.getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen5.png")));
		ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen5.png"));
		Image imgEscalada9= imgIcon9.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		lblNewLabel_21.setIcon(new ImageIcon(imgEscalada9));	
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(162, 23, 203, 193);
		Integrantes2.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("<html>\r\nLeonardo Gavancho <br> \r\nTenorio\r\n</html>");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		lblNewLabel_22.setBounds(162, 224, 213, 55);
		Integrantes2.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("<html>\r\nMathias Talavera<br>\r\nTorres\r\n</html>");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		lblNewLabel_23.setBounds(415, 224, 203, 42);
		Integrantes2.add(lblNewLabel_23);

	}
}
