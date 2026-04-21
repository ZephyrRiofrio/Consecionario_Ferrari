package codigo.paneles;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;

public class SobreNosotros extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel portada;
	private JPanel informacion;
	private JPanel autores_1;
	private JPanel autores_2;
	private JLabel lblITitulo;
	private JLabel lblTituloInformacion;
	private JLabel lblInformacion;

	/**
	 * Create the panel.
	 */
	public SobreNosotros() {
		setPreferredSize(new Dimension(790, 1200));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		portada = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_sobreNosotros/imagen_1.jpg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		add(portada);
		portada.setLayout(null);
		
		lblITitulo = new JLabel("CONOCE A NUESTRO EQUIPO");
		lblITitulo.setForeground(new Color(255, 255, 255));
		lblITitulo.setFont(new Font("Host Grotesk ExtraBold", Font.BOLD, 25));
		lblITitulo.setBounds(227, 213, 367, 66);
		portada.add(lblITitulo);
		
		informacion = new JPanel();
		add(informacion);
		informacion.setLayout(null);
		
		lblTituloInformacion = new JLabel("<html> <pre>\r\nNuestro equipo de especialistas de \r\n              Ferrari\r\n</pre>\r\n<html>");
		lblTituloInformacion.setFont(new Font("Host Grotesk ExtraBold", Font.BOLD, 25));
		lblTituloInformacion.setBounds(142, 33, 535, 87);
		informacion.add(lblTituloInformacion);
		
		lblInformacion = new JLabel("<html><pre>\r\nConoce a nuestro apasionado y único equipo que respalda Ferrari \r\n    Bogotá, un grupo de profesionales dedicados a brindar una \r\n  experiencia excepcional que captura la esencia de la marca \r\n  del Cavallino Rampante. Cada uno de nuestros especialistas \r\n contribuirá con su experiencia y dedicación para convertir en \r\n   realidad el sueño de experimentar la esencia de Ferrari.\r\n</pre>\r\n</html>\r\n</html>");
		lblInformacion.setFont(new Font("Host Grotesk Medium", Font.PLAIN, 13));
		lblInformacion.setBounds(152, 121, 512, 140);
		informacion.add(lblInformacion);
		
		autores_1 = new JPanel();
		add(autores_1);
		
		autores_2 = new JPanel();
		add(autores_2);

	}
}
