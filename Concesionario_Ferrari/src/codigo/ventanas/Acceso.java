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
	public Iniciar_sesion panelIniciar = new Iniciar_sesion(this);
	public Registrarse panelRegistrar = new Registrarse(this);
	private JPanel panelImagen;
	public JLabel lblImagen;
	private Random rand = new Random();
	
	// Indicador que detecta algún acceso a la plataforma
	public boolean acceso = false;
	
	// Indicador que detecta si se ha ingresado como administrador
	public boolean esAdmin = false;
	
	// Datos de admin
	public String correoAdmin = "mathiasriofrio488@gmail.com";
	public String contraseniaAdmin = "Cibertec20260912";
	
	// Datos de usuario
	public String correoUsuario1 = "";
	public String contraseniaUsuario1 = "";
	
	public String correoUsuario2 = "";
	public String contraseniaUsuario2 = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceso frame = new Acceso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void modificarTitulo(String titulo) {
		this.setTitle(titulo);
	}
	
	public void asignarImagenLabel(JLabel lblImagen) {
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
	
	public void mostrarPanel(JPanel panel) {
		panel.setSize(450, 400);
		panel.setLocation(0, 0);
		
		panelSeccion.removeAll();
		panelSeccion.setLayout(new BorderLayout(0, 0));
		panelSeccion.add(panel);
		panelSeccion.revalidate();
		panelSeccion.repaint();
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
	
	public void borrarUsuario1() {
		this.correoUsuario1 = "";
		this.contraseniaUsuario1 = "";
	}
	
	public void borrarUsuario2() {
		this.correoUsuario2 = "";
		this.contraseniaUsuario2 = "";
	}
	
	public void modificarAcceso(boolean acceso) {
		this.acceso = acceso;
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
		
		Timer timerRegistro = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panelRegistrar.obtenerAcceso()) {
					panelRegistrar.modificarAcceso(false);
					panelRegistrar.vaciarDatos();
					mostrarPanel(panelIniciar);
					modificarAcceso(true);
				}
			}
		});
		
		Timer timerIniciar = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panelIniciar.obtenerAcceso()) {
					panelIniciar.modificarAcceso(false);
					panelIniciar.vaciarDatos();
					modificarAcceso(true);
				}
			}
		});
		
		timerRegistro.setRepeats(true);
		timerIniciar.setRepeats(true);
		
		timerRegistro.start();
		timerIniciar.start();
	}

}
