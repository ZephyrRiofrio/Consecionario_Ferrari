package codigo.paneles.paneles_inicio_presentacion;

import javax.swing.JPanel;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class panel_presentacion_1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contenido;
	private JLabel lblTituloPagina;
	private JLabel lblInformacionPagina;
	private JLabel lblDescubrir;
	private JLabel lblFlecha;

	/**
	 * Create the panel.
	 */
	public panel_presentacion_1() {
		setPreferredSize(new Dimension(782, 252));
		setBorder(null);
		setBackground(new Color(0, 0, 0));
		setLayout(new BorderLayout(0, 0));
		
		contenido = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_inicio/gif_carrusel_1_rend.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		contenido.setBorder(null);
		contenido.setBackground(new Color(0, 0, 0));
		contenido.setPreferredSize(new Dimension(790, 252));
		
		
		add(contenido);
		contenido.setLayout(null);
		
		lblTituloPagina = new JLabel("Deporte");
		lblTituloPagina.setForeground(new Color(255, 255, 255));
		lblTituloPagina.setFont(new Font("Roboto Light", Font.PLAIN, 16));
		lblTituloPagina.setBounds(386, 123, 59, 31);
		contenido.add(lblTituloPagina);
		
		lblInformacionPagina = new JLabel("SCUDERIA FERRARI");
		lblInformacionPagina.setForeground(new Color(255, 255, 255));
		lblInformacionPagina.setFont(new Font("Roboto SemiBold", Font.PLAIN, 20));
		lblInformacionPagina.setBounds(322, 154, 188, 31);
		contenido.add(lblInformacionPagina);
		
		lblDescubrir = new JLabel("DESCUBRIR");
		lblDescubrir.setForeground(new Color(255, 255, 255));
		lblDescubrir.setFont(new Font("Roboto ExtraLight", Font.PLAIN, 14));
		lblDescubrir.setBounds(358, 195, 87, 31);
		contenido.add(lblDescubrir);
		
		lblFlecha = new JLabel("");
		lblFlecha.setIcon(new ImageIcon(panel_presentacion_1.class.getResource("/recursos/imagenes/imagenes_inicio/flecha_presentacion_rend.png")));
		lblFlecha.setBounds(443, 195, 31, 31);
		contenido.add(lblFlecha);
	}
}
