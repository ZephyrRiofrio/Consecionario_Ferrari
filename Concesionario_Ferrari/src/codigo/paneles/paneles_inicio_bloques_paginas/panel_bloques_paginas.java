package codigo.paneles.paneles_inicio_bloques_paginas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class panel_bloques_paginas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contenido;
	private JPanel bloque_scudFerra;
	private JPanel bloque_Deportivos;
	private JLabel lblScuderiaFerrari;
	private JLabel lblReplica;
	private JLabel lblDescubrir;
	private JLabel lblFlecha;
	private JLabel lblDeportivos;
	private JLabel lblNuevosModelos;
	private JLabel lblDescubrir_1;
	private JLabel lblFlecha_1;

	/**
	 * Create the panel.
	 */
	public panel_bloques_paginas() {
		setPreferredSize(new Dimension(790, 252));
		setBackground(new Color(252, 252, 252));
		setLayout(new BorderLayout(0, 0));
		
		contenido = new JPanel();
		add(contenido);
		contenido.setLayout(new GridLayout(1, 2, 0, 0));
		
		bloque_scudFerra = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_inicio/bloques_imagen_1_rend.jpg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		bloque_scudFerra.setBackground(new Color(0, 0, 0));
		contenido.add(bloque_scudFerra);
		bloque_scudFerra.setLayout(null);
		
		lblScuderiaFerrari = new JLabel("Scuderia Ferrari");
		lblScuderiaFerrari.setForeground(Color.WHITE);
		lblScuderiaFerrari.setFont(new Font("Ferrari Sans", Font.PLAIN, 13));
		lblScuderiaFerrari.setBounds(128, 129, 137, 31);
		bloque_scudFerra.add(lblScuderiaFerrari);
		
		lblReplica = new JLabel("REPLICA 2026");
		lblReplica.setForeground(Color.WHITE);
		lblReplica.setFont(new Font("Ferrari Sans", Font.BOLD, 20));
		lblReplica.setBounds(105, 155, 199, 31);
		bloque_scudFerra.add(lblReplica);
		
		lblDescubrir = new JLabel("DESCUBRIR");
		lblDescubrir.setForeground(Color.WHITE);
		lblDescubrir.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblDescubrir.setBounds(136, 196, 84, 31);
		bloque_scudFerra.add(lblDescubrir);
		
		lblFlecha = new JLabel("");
		lblFlecha.setIcon(new ImageIcon(panel_bloques_paginas.class.getResource("/recursos/imagenes/imagenes_inicio/flecha_presentacion_rend.png")));
		lblFlecha.setBounds(230, 197, 31, 31);
		bloque_scudFerra.add(lblFlecha);
		
		bloque_Deportivos = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_inicio/bloques_imagen_2_rend.jpg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		bloque_Deportivos.setBackground(new Color(0, 0, 0));
		contenido.add(bloque_Deportivos);
		bloque_Deportivos.setLayout(null);
		
		lblDeportivos = new JLabel("Deportivos");
		lblDeportivos.setForeground(Color.WHITE);
		lblDeportivos.setFont(new Font("Ferrari Sans", Font.PLAIN, 13));
		lblDeportivos.setBounds(143, 129, 100, 31);
		bloque_Deportivos.add(lblDeportivos);
		
		lblNuevosModelos = new JLabel("NUEVOS MODELOS\r\n");
		lblNuevosModelos.setForeground(Color.WHITE);
		lblNuevosModelos.setFont(new Font("Ferrari Sans", Font.BOLD, 20));
		lblNuevosModelos.setBounds(73, 155, 250, 31);
		bloque_Deportivos.add(lblNuevosModelos);
		
		lblDescubrir_1 = new JLabel("DESCUBRIR");
		lblDescubrir_1.setForeground(Color.WHITE);
		lblDescubrir_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 11));
		lblDescubrir_1.setBounds(133, 195, 88, 31);
		bloque_Deportivos.add(lblDescubrir_1);
		
		lblFlecha_1 = new JLabel("");
		lblFlecha_1.setIcon(new ImageIcon(panel_bloques_paginas.class.getResource("/recursos/imagenes/imagenes_inicio/flecha_presentacion_rend.png")));
		lblFlecha_1.setBounds(229, 195, 31, 31);
		bloque_Deportivos.add(lblFlecha_1);

	}

}
