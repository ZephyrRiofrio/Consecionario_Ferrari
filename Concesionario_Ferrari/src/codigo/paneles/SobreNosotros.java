package codigo.paneles;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SobreNosotros extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel portada;
	private JPanel presentacionValores;
	private JPanel tiposValores;
	private JPanel presentacionIntegrantes;
	private JLabel titulo1;
	private JPanel integrantes1;
	private JPanel integrantes2;
	private JLabel imagen8;
	private JLabel imagen7;
	private JLabel textoImg7;
	private JLabel textoImg8;
	private JLabel imagen4;
	private JLabel imagen5;
	private JLabel imagen6;
	private JLabel textoImg5;
	private JLabel textoImg4;
	private JLabel textoImg6;
	private JLabel titulo3;
	private JLabel presentacion2;
	private JLabel imagen2;
	private JLabel imagen1;
	private JLabel imagen3;
	private JLabel presentacion1;
	private JLabel titulo2;
	private JLabel subtitulo1;
	private JLabel textoSub1;
	private JLabel subtitulo2;
	private JLabel textoSub2;
	private JLabel subtitulo3;
	private JLabel textoSub3;

	/**
	 * Create the panel.
	 */
	public SobreNosotros() {
		ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN1.jpg"));
		Image imgEscalada1= imgIcon1.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN2.jpg"));
		Image imgEscalada2= imgIcon2.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN3.jpg"));
		Image imgEscalada3= imgIcon3.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN4.jpg"));
		Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN5.png"));
		Image imgEscalada5= imgIcon5.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN6.jpg"));
		Image imgEscalada6= imgIcon6.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN7.png"));
		Image imgEscalada7= imgIcon7.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagenSN8.png"));
		Image imgEscalada8 = imgIcon8.getImage().getScaledInstance(240, 190, Image.SCALE_SMOOTH);
		
		setPreferredSize(new Dimension(790, 2100));
		setLayout(new GridLayout(6, 1, 0, 0));
		
		portada = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/portada.jpg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
				
			}
		};
		add(portada);
		portada.setLayout(null);
		
		titulo1 = new JLabel("<html>\r\nConoce a nuestro <br>\r\nequipo\r\n</html>");
		titulo1.setForeground(new Color(240, 240, 240));
		titulo1.setBackground(new Color(248, 248, 248));
		titulo1.setFont(new Font("Ferrari Sans", Font.BOLD, 33));
		titulo1.setHorizontalAlignment(SwingConstants.CENTER);
		titulo1.setBounds(30, 108, 405, 141);
		portada.add(titulo1);
		
		presentacionValores = new JPanel();
		presentacionValores.setBackground(new Color(255, 255, 255));
		add(presentacionValores);
		presentacionValores.setLayout(null);
		
		presentacion1 = new JLabel("<html><center>Nacido del espíritu de las carreras, Ferrari personifica el poder de una pasión de toda la vida y la belleza de los logros humanos ilimitados, creando iconos atemporales para un mundo cambiante\r\n</center></html>");
		presentacion1.setFont(new Font("Ferrari Sans", Font.PLAIN, 12));
		presentacion1.setBounds(186, 81, 412, 95);
		presentacionValores.add(presentacion1);
		
		titulo2 = new JLabel("NUESTROS VALORES");
		titulo2.setHorizontalAlignment(SwingConstants.CENTER);
		titulo2.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 20));
		titulo2.setBounds(190, 245, 412, 95);
		presentacionValores.add(titulo2);
		
		tiposValores = new JPanel();
		tiposValores.setBackground(new Color(255, 255, 255));
		add(tiposValores);
		tiposValores.setLayout(null);
		
		imagen1 = new JLabel("");
		imagen1.setIcon(new ImageIcon(imgEscalada1));	
		imagen1.setHorizontalAlignment(SwingConstants.CENTER);
		imagen1.setBounds(41, 10, 190, 175);
		tiposValores.add(imagen1);
		
		imagen2 = new JLabel("");
		imagen2.setIcon(new ImageIcon(imgEscalada2));
		imagen2.setHorizontalAlignment(SwingConstants.CENTER);
		imagen2.setBounds(301, 10, 190, 175);
		tiposValores.add(imagen2);
		
		imagen3 = new JLabel("");
		imagen3.setIcon(new ImageIcon(imgEscalada3));
		imagen3.setHorizontalAlignment(SwingConstants.CENTER);
		imagen3.setBounds(559, 10, 190, 175);
		tiposValores.add(imagen3);
		
		subtitulo1 = new JLabel("<html><center>INDIVIDUAL Y EN EQUIPO</center></html>");
		subtitulo1.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo1.setFont(new Font("Ferrari Sans", Font.BOLD, 14));
		subtitulo1.setBounds(10, 195, 252, 31);
		tiposValores.add(subtitulo1);
		
		subtitulo2 = new JLabel("<html><center>TRADICION E INNOVACION</center></html>");
		subtitulo2.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo2.setFont(new Font("Ferrari Sans", Font.BOLD, 14));
		subtitulo2.setBounds(272, 195, 252, 31);
		tiposValores.add(subtitulo2);
		
		subtitulo3 = new JLabel("<html><center>PASION Y LOGRO</center></html>");
		subtitulo3.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo3.setFont(new Font("Ferrari Sans", Font.BOLD, 14));
		subtitulo3.setBounds(528, 195, 252, 31);
		tiposValores.add(subtitulo3);
		
		textoSub1 = new JLabel("<html><center>Nuestros talentosos individuos son nuestro mayor recurso. Sin embargo, solo pueden perseguir lo extraordinario trabajando juntos como un equipo. Fomentando la integridad, la excelencia y la generosidad</center><html>");
		textoSub1.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		textoSub1.setBounds(20, 222, 232, 114);
		tiposValores.add(textoSub1);
		
		textoSub2 = new JLabel("<html><center>La tradición y la innovación van de la mano en Ferrari. Su constante búsqueda de crear algo nuevo, junto con tecnología avanzada y artesanía de alta calidad, le permite diseñar autos icónicos y atemporales.</center><html>");
		textoSub2.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		textoSub2.setBounds(284, 222, 232, 114);
		tiposValores.add(textoSub2);
		
		textoSub3 = new JLabel("<html><center>El espíritu de carreras de Ferrari inspira emociones más allá de la pista, reflejándose en una actitud de vida basada en la pasión, metas ambiciosas y en superar límites para convertir el esfuerzo en logros.</center><html>");
		textoSub3.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		textoSub3.setBounds(537, 222, 232, 114);
		tiposValores.add(textoSub3);	

		presentacionIntegrantes = new JPanel();
		presentacionIntegrantes.setBackground(new Color(255, 255, 255));
		add(presentacionIntegrantes);
		presentacionIntegrantes.setLayout(null);
		
		titulo3 = new JLabel("<html><center>NUESTRO EQUIPO DE ESPECIALISTAS DE FERRARI</center></html>");
		titulo3.setHorizontalAlignment(SwingConstants.CENTER);
		titulo3.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 20));
		titulo3.setBounds(180, 100, 412, 80);
		presentacionIntegrantes.add(titulo3);
		
		presentacion2 = new JLabel("<html><center>Conoce a nuestro apasionado y único equipo que respalda Ferrari, un grupo de profesionales dedicados a brindar una experiencia excepcional que captura la esencia de la marca del Cavallino Rampante. Cada uno de nuestros especialistas contribuirá con su experiencia y dedicación para convertir en realidad el sueño de experimentar la esencia de Ferrari.</center><html>");
		presentacion2.setFont(new Font("Ferrari Sans", Font.PLAIN, 12));
		presentacion2.setBounds(136, 161, 513, 129);
		presentacionIntegrantes.add(presentacion2);
		
		integrantes1 = new JPanel();
		integrantes1.setBackground(new Color(255, 255, 255));
		add(integrantes1);
		integrantes1.setLayout(null);
		
		imagen4 = new JLabel("");
		imagen4.setIcon(new ImageIcon(imgEscalada4));		
		imagen4.setHorizontalAlignment(SwingConstants.CENTER);
		imagen4.setBounds(57, 41, 203, 193);
		integrantes1.add(imagen4);
		
		imagen5 = new JLabel("");
		imagen5.setIcon(new ImageIcon(imgEscalada5));	
		imagen5.setHorizontalAlignment(SwingConstants.CENTER);
		imagen5.setBounds(289, 41, 203, 193);
		integrantes1.add(imagen5);
		
		imagen6 = new JLabel("");
		imagen6.setIcon(new ImageIcon(imgEscalada6));	
		imagen6.setHorizontalAlignment(SwingConstants.CENTER);
		imagen6.setBounds(521, 41, 203, 193);
		integrantes1.add(imagen6);
		
		textoImg4 = new JLabel("<html><center>\r\nMathias Garcia <br>\r\nRiofrio\r\n</center></html>");
		textoImg4.setHorizontalAlignment(SwingConstants.CENTER);
		textoImg4.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		textoImg4.setBounds(57, 245, 203, 42);
		integrantes1.add(textoImg4);
		
		textoImg5 = new JLabel("<html><center>Alexander Hernández León</center><html>");
		textoImg5.setHorizontalAlignment(SwingConstants.CENTER);
		textoImg5.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		textoImg5.setBounds(289, 244, 203, 42);
		integrantes1.add(textoImg5);
		
		textoImg6 = new JLabel("<html><center>\r\nGabriela Ramos <br>\r\nMarin\r\n</center></html>");
		textoImg6.setHorizontalAlignment(SwingConstants.CENTER);
		textoImg6.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		textoImg6.setBounds(521, 245, 203, 42);
		integrantes1.add(textoImg6);
		
		integrantes2 = new JPanel();
		integrantes2.setBackground(new Color(255, 255, 255));
		add(integrantes2);
		integrantes2.setLayout(null);
		
		imagen7 = new JLabel("");
		imagen7.setIcon(new ImageIcon(imgEscalada7));	
		imagen7.setHorizontalAlignment(SwingConstants.CENTER);
		imagen7.setBounds(162, 23, 203, 193);
		integrantes2.add(imagen7);
		
		imagen8 =  new JLabel("");
		imagen8.setIcon(new ImageIcon(imgEscalada8));	
		imagen8.setHorizontalAlignment(SwingConstants.CENTER);
		imagen8.setBounds(427, 23, 203, 193);
		integrantes2.add(imagen8);
		
		textoImg7 = new JLabel("<html><center>\r\nLeonardo Gavancho <br> \r\nTenorio\r\n</center></html>");
		textoImg7.setHorizontalAlignment(SwingConstants.CENTER);
		textoImg7.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		textoImg7.setBounds(147, 219, 237, 55);
		integrantes2.add(textoImg7);
		
		textoImg8 = new JLabel("<html><center>\r\nMathias Talavera<br>\r\nTorres\r\n</center></html>");
		textoImg8.setHorizontalAlignment(SwingConstants.CENTER);
		textoImg8.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		textoImg8.setBounds(427, 225, 203, 42);
		integrantes2.add(textoImg8);
	}
}