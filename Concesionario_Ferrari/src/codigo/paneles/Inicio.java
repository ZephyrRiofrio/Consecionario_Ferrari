package codigo.paneles;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.Timer;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.util.ArrayList;

import codigo.paneles.paneles_inicio_presentacion.*;
import codigo.paneles.paneles_inicio_noticias.*;
import codigo.paneles.paneles_inicio_bloques_paginas.*;

public class Inicio extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	private JPanel contenido;
	private JPanel cuadrosPaginas;
	private JPanel presentacionPaginas;
	private JPanel noticiasCortas;
	private JPanel panelBotonIzquierdo;
	private JPanel panelBotonDerecho;
	private JLabel lblBotonIzquierdo;
	private JLabel lblBotonDerecho;
	private JPanel panel_noticia;
	
	private Presentacion_1 presentacion_1 = new Presentacion_1();
	private Presentacion_2 presentacion_2 = new Presentacion_2();
	
	private Noticia_1 noticia_1 = new Noticia_1();
	private Noticia_2 noticia_2 = new Noticia_2();
	private Noticia_3 noticia_3 = new Noticia_3();
	private Noticia_4 noticia_4 = new Noticia_4();
	
	private Bloques_paginas bloques_1 = new Bloques_paginas();
	
	private ArrayList<JPanel> presentaciones = new ArrayList<>();
	private ArrayList<JPanel> noticias = new ArrayList<>();
	
	private int posicionPresentacion = 0;
	private int posicionNoticia = 0;
	
	private void mostrarPresentacion(JPanel panel) {
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
	
	// Constructor
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
		
		// Líneas donde se agregan las presentaciones al ArrayList de presentaciones
		presentaciones.add(presentacion_1);
		presentaciones.add(presentacion_2);
		
		mostrarPresentacion(presentaciones.get(posicionPresentacion));
		
		Timer timerPresentaciones = new Timer(7000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evento) {
				if (posicionPresentacion == presentaciones.size() - 1) {
					posicionPresentacion = 0;
					mostrarPresentacion(presentaciones.get(posicionPresentacion));
				} else {
					posicionPresentacion++;
					mostrarPresentacion(presentaciones.get(posicionPresentacion));
				}
			}
		});
		
		timerPresentaciones.setRepeats(true);
		timerPresentaciones.start();
		
		contenido.add(presentacionPaginas);
		
		noticiasCortas = new JPanel();
		noticiasCortas.setBorder(new EmptyBorder(0, 15, 0, 15));
		contenido.add(noticiasCortas);
		noticiasCortas.setLayout(new BorderLayout(0, 0));
		
		// Líneas donde se agregan las noticias al ArrayList de noticias
		noticias.add(noticia_1);
		noticias.add(noticia_2);
		noticias.add(noticia_3);
		noticias.add(noticia_4);
		
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
		
		mostrarNoticia(noticias.get(posicionNoticia));
		
		noticiasCortas.add(panel_noticia, BorderLayout.CENTER);
		
		cuadrosPaginas = new JPanel();
		cuadrosPaginas.setBackground(new Color(0, 0, 0));
		cuadrosPaginas.setBorder(new EmptyBorder(0, 0, 0, 0));
		
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
		if (posicionNoticia == 0) {
			posicionNoticia = 3;
			mostrarNoticia(noticias.get(posicionNoticia));
		} else {
			posicionNoticia--;
			mostrarNoticia(noticias.get(posicionNoticia));
		}
	}
	protected void mouseClickedLblBotonDerecho(MouseEvent e) {
		if (posicionNoticia == noticias.size() - 1) {
			posicionNoticia = 0;
			mostrarNoticia(noticias.get(posicionNoticia));
		} else {
			posicionNoticia++;
			mostrarNoticia(noticias.get(posicionNoticia));
		}
	}
}
