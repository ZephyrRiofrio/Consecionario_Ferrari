package codigo.ventanas;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.paneles.paneles_acceso.*;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Cursor;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JLabel;

public class Acceso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelSeccion;
	private menu menu_frame = new menu();
	private Iniciar_sesion panelIniciar = new Iniciar_sesion(this);
	private Registrarse panelRegistrar = new Registrarse(this);
	private JPanel panelImagen;
	private JLabel lblImagen;
	private Random rand = new Random();
	
	// Indicador que detecta si se ha ingresado como administrador
	public boolean esAdmin = false;
	
	// Datos de admin
	public String correoAdmin = "mathiasriofrio488@gmail.com";
	public String contraseniaAdmin = "Cibertec20260912";
	
	// Datos de usuario
	public String correoUsuario1 = "";
	public String contraseniaUsuario1 = "";
	public int pedidosUsuario1 = 0;
	
	public String correoUsuario2 = "";
	public String contraseniaUsuario2 = "";
	public int pedidosUsuario2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceso frame = new Acceso();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void modificarTitulo(String titulo) {
		this.setTitle(titulo);
	}
	
	private void asignarImagenLabel(JLabel lblImagen) {
		int numeroMax = 4;
		int numeroMin = 1;
		
		int numeroAleatorio = rand.nextInt((numeroMax - numeroMin) + 1) + numeroMin;
		
		switch(numeroAleatorio) {
		case 1:
			lblImagen.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_1_rend.jpg")));
			break;
			
		case 2:
			lblImagen.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_2_rend.jpg")));
			break;
			
		case 3:
			lblImagen.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_3_rend.jpg")));
			break;
			
		case 4:
			lblImagen.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_4_rend.jpg")));
			break;
		}
	}
	
	private void mostrarPanel(JPanel panel) {
		panel.setSize(450, 400);
		panel.setLocation(0, 0);
		
		panelSeccion.removeAll();
		panelSeccion.setLayout(new BorderLayout(0, 0));
		panelSeccion.add(panel);
		panelSeccion.revalidate();
		panelSeccion.repaint();
	}
	
	private void accederMenu() {
		menu_frame.setLocationRelativeTo(null);
		menu_frame.setVisible(true);
		
		this.setVisible(false);
	}
	
	public void modificarEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	
	public void agregarUsuario1(String correo, String contrasenia) {
		this.correoUsuario1 = correo;
		this.contraseniaUsuario1 = contrasenia;
	}
	
	public void agregarUsuario2(String correo, String contrasenia) {
		this.correoUsuario2 = correo;
		this.contraseniaUsuario2 = contrasenia;
	}
	
	private void modificarVisibilidadVentana(boolean visible) {
		this.setVisible(visible);
	}
	
	/**
	 * Create the frame.
	 */
	public Acceso() {
		setResizable(false);
		setTitle("Iniciar sesión");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Acceso.class.getResource("/recursos/imagenes/imagenes_ventana/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelSeccion = new JPanel();
		contentPane.add(panelSeccion, BorderLayout.CENTER);
		
		panelImagen = new JPanel();
		panelImagen.setPreferredSize(new Dimension(250, 350));
		contentPane.add(panelImagen, BorderLayout.EAST);
		
		lblImagen = new JLabel("");
		
		asignarImagenLabel(lblImagen);
		
		panelImagen.setLayout(new BorderLayout(0, 0));
		
		panelImagen.add(lblImagen);
		
		mostrarPanel(panelIniciar);
		
		Timer timerCerrarSesion = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!(menu_frame.esVisible)) {
					modificarVisibilidadVentana(true);
					mostrarPanel(panelIniciar);
					
					((Timer) e.getSource()).stop();
				}
			}
		});
		
		timerCerrarSesion.setRepeats(true);
		
		Timer timerRegistro = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panelRegistrar.obtenerAcceso()) {
					panelRegistrar.modificarIniciarSesion(false);
					panelRegistrar.modificarAcceso(false);
					menu_frame.modificarEsAdmin(esAdmin);
					menu_frame.modificarEsVisible(true);
					panelRegistrar.vaciarDatos();
					timerCerrarSesion.start();
					accederMenu();
				} else if (panelRegistrar.obtenerIniciarSesion()) {
					panelRegistrar.modificarIniciarSesion(false);
					modificarTitulo("Iniciar sesión");
					asignarImagenLabel(lblImagen);
					mostrarPanel(panelIniciar);
				}
			}
		});
		
		Timer timerIniciar = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panelIniciar.obtenerAcceso()) {
					panelIniciar.modificarRegistro(false);
					panelIniciar.modificarAcceso(false);
					menu_frame.modificarEsAdmin(esAdmin);
					menu_frame.modificarEsVisible(true);
					panelIniciar.vaciarDatos();
					timerCerrarSesion.start();
					accederMenu();
				} else if (panelIniciar.obtenerRegistro()) {
					panelIniciar.modificarRegistro(false);
					modificarTitulo("Registrarse");
					asignarImagenLabel(lblImagen);
					mostrarPanel(panelRegistrar);
				}
			}
		});
		
		timerRegistro.setRepeats(true);
		timerIniciar.setRepeats(true);
		
		timerRegistro.start();
		timerIniciar.start();
	}

}
