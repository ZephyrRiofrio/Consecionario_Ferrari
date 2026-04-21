package codigo.paneles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.Timer;
import java.awt.event.*;

import codigo.paneles.paneles_inicio_presentacion.*;
import codigo.paneles.paneles_inicio_noticias.*;
import codigo.paneles.paneles_inicio_bloques_paginas.*;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Cursor;
import java.awt.Color;

public class Inicio extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contenido;
	private JPanel cuadrosPaginas;
	private JPanel presentacionPaginas;
	private JPanel noticiasCortas;
	
	private int numero_panel_presentacion = 1;
	private JPanel panelBotonIzquierdo;
	private JPanel panelBotonDerecho;
	private JLabel lblBotonIzquierdo;
	private JLabel lblBotonDerecho;
	private JPanel panel_noticia;
	
	private panel_noticia_1 noticia_1 = new panel_noticia_1();
	private panel_noticia_2 noticia_2 = new panel_noticia_2();
	private panel_noticia_3 noticia_3 = new panel_noticia_3();
	private panel_noticia_4 noticia_4 = new panel_noticia_4();
	
	private int posicionNoticia = 1;
	
	private void mostrarPanel(JPanel panel) {
		panel.setSize(792, 330);
		panel.setLocation(0, 0);
		
		presentacionPaginas.removeAll();
		presentacionPaginas.setLayout(new BorderLayout(0, 0));
		presentacionPaginas.add(panel);
		presentacionPaginas.revalidate();
		presentacionPaginas.repaint();
	}
	
	private void mostrarNoticia(JPanel noticia) {
		noticia.setSize(692, 252);
		noticia.setLocation(0, 0);
		
		panel_noticia.removeAll();
		panel_noticia.setLayout(new BorderLayout(0, 0));
		panel_noticia.add(noticia);
		panel_noticia.revalidate();
		panel_noticia.repaint();
	}
	
	/**
	 * Create the panel.
	 */
	public Inicio() {
		setBorder(null);
		setLayout(new BorderLayout(0, 0));
		
		contenido = new JPanel();
		contenido.setBackground(new Color(240, 240, 240));
		contenido.setBorder(null);
		contenido.setPreferredSize(new Dimension(792, 800));
		add(contenido);
		contenido.setLayout(new GridLayout(3, 1, 0, 24));
		
		presentacionPaginas = new JPanel();
		presentacionPaginas.setBackground(new Color(0, 0, 0));
		presentacionPaginas.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		panel_presentacion_1 panel_1 = new panel_presentacion_1();
		panel_presentacion_2 panel_2 = new panel_presentacion_2();
		
		mostrarPanel(panel_1);
		
		Timer temporizador = new Timer(7000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evento) {
				if (numero_panel_presentacion == 1) {
					numero_panel_presentacion = 2;
					mostrarPanel(panel_2);
					
				} else if (numero_panel_presentacion == 2) {
					numero_panel_presentacion = 1;
					mostrarPanel(panel_1);	
				}
			}
		});
		
		temporizador.setRepeats(true);
		temporizador.start();
		
		contenido.add(presentacionPaginas);
		
		noticiasCortas = new JPanel();
		noticiasCortas.setBorder(new EmptyBorder(0, 15, 0, 15));
		contenido.add(noticiasCortas);
		noticiasCortas.setLayout(new BorderLayout(0, 0));
		
		panelBotonIzquierdo = new JPanel();
		noticiasCortas.add(panelBotonIzquierdo, BorderLayout.WEST);
		panelBotonIzquierdo.setLayout(new BoxLayout(panelBotonIzquierdo, BoxLayout.X_AXIS));
		
		lblBotonIzquierdo = new JLabel("");
		lblBotonIzquierdo.addMouseListener(this);
		lblBotonIzquierdo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBotonIzquierdo.setIcon(new ImageIcon(Inicio.class.getResource("/recursos/imagenes/imagenes_inicio/boton_izquierda_noticias.png")));
		panelBotonIzquierdo.add(lblBotonIzquierdo);
		
		panelBotonDerecho = new JPanel();
		noticiasCortas.add(panelBotonDerecho, BorderLayout.EAST);
		panelBotonDerecho.setLayout(new BoxLayout(panelBotonDerecho, BoxLayout.X_AXIS));
		
		lblBotonDerecho = new JLabel("");
		lblBotonDerecho.addMouseListener(this);
		lblBotonDerecho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblBotonDerecho.setIcon(new ImageIcon(Inicio.class.getResource("/recursos/imagenes/imagenes_inicio/boton_derecha_noticias.png")));
		panelBotonDerecho.add(lblBotonDerecho);
		
		panel_noticia = new JPanel();
		
		mostrarNoticia(noticia_1);
		
		noticiasCortas.add(panel_noticia, BorderLayout.CENTER);
		
		cuadrosPaginas = new JPanel();
		cuadrosPaginas.setBackground(new Color(0, 0, 0));
		cuadrosPaginas.setBorder(new EmptyBorder(0, 0, 0, 0));
		
		panel_bloques_paginas bloques_1 = new panel_bloques_paginas();
		bloques_1.setSize(792, 252);
		bloques_1.setLocation(0, 0);
		
		cuadrosPaginas.removeAll();
		cuadrosPaginas.setLayout(new BorderLayout(0, 0));
		cuadrosPaginas.add(bloques_1);
		cuadrosPaginas.revalidate();
		cuadrosPaginas.repaint();
		
		contenido.add(cuadrosPaginas);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblBotonDerecho) {
			mouseClickedLblBotonDerecho(e);
		}
		if (e.getSource() == lblBotonIzquierdo) {
			mouseClickedLblBotonIzquierdo(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblBotonIzquierdo(MouseEvent e) {
		posicionNoticia--;
		
		if (posicionNoticia == 0) {
			posicionNoticia = 4;
			mostrarNoticia(noticia_4);
		} 
		
		switch(posicionNoticia) {
		case 1: mostrarNoticia(noticia_1); break;
		case 2: mostrarNoticia(noticia_2); break;
		case 3: mostrarNoticia(noticia_3); break;
		case 4: mostrarNoticia(noticia_4); break;
		}
	}
	protected void mouseClickedLblBotonDerecho(MouseEvent e) {
		posicionNoticia++;
		
		if (posicionNoticia == 5) {
			posicionNoticia = 1;
			mostrarNoticia(noticia_1);
		}
		
		switch(posicionNoticia) {
		case 1: mostrarNoticia(noticia_1); break;
		case 2: mostrarNoticia(noticia_2); break;
		case 3: mostrarNoticia(noticia_3); break;
		case 4: mostrarNoticia(noticia_4); break;
		}
	}
}
