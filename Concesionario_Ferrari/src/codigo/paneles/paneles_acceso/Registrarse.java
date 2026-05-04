package codigo.paneles.paneles_acceso;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import codigo.ventanas.Acceso;

public class Registrarse extends JPanel implements MouseListener, KeyListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel formularioRegistro;
	private JLabel lblTitulo;
	private JLabel lblRegistrarse;
	private JLabel lblCorreo;
	private JTextField textFieldCorreo;
	private JSeparator separatorCorreo;
	private JLabel lblContrasenia;
	private JLabel lblVista;
	private JPasswordField passwordFieldContrasenia;
	private JSeparator separatorContrasenia;
	private JLabel lblCargaCorreo;
	private JLabel lblCargaContrasenia;
	private JLabel lblErrorDatos;
	private JLabel lblPregIniciarSesion;
	private JLabel lblIniciarSesion;
	
	private Acceso ventanaAcceso;
	
	private boolean acceso = false;
	private JButton btnRegistrar;

	/**
	 * Create the panel.
	 */
	
	public void vaciarDatos() {
		textFieldCorreo.setText("");
		passwordFieldContrasenia.setText("");
		lblErrorDatos.setText("");
		lblErrorDatos.setVisible(false);
	}
	
	private void mostrarOcultarElementosCarga(boolean valor) {
		textFieldCorreo.setEnabled(valor);
		passwordFieldContrasenia.setEnabled(valor);
		btnRegistrar.setEnabled(valor);
		lblIniciarSesion.setEnabled(valor);
		lblVista.setEnabled(valor);
		lblVista.setFocusable(valor);
		
		lblCargaCorreo.setVisible(!valor);
		lblCargaContrasenia.setVisible(!valor);
	}
	
	private void accionBotonRegistrar() {
		mostrarOcultarElementosCarga(false);
		
		Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            	if (verificarDatos()) {
            		ventanaAcceso.panelRegistrar.vaciarDatos();
            		ventanaAcceso.setVisible(false);
            		ventanaAcceso.mostrarPanel(ventanaAcceso.panelIniciar);
            		ventanaAcceso.ventanaMenu.modificarVisible(true);
            	}
            	
            	mostrarOcultarElementosCarga(true);
        		
                ((Timer) evt.getSource()).stop();
            }
        });
		
		timer.setRepeats(false);
		timer.start();
	}
	
	private boolean registrarUsuario(String correoIngre, String contraseniaIngre) {
		boolean registroHecho = false;
		
		if (ventanaAcceso.correoUsuario1.equals("") || ventanaAcceso.correoUsuario2.equals("")) {
			if (ventanaAcceso.correoUsuario1.equals("")) {
				ventanaAcceso.agregarUsuario1(correoIngre, contraseniaIngre);
				registroHecho = true;
			} else {
				if (ventanaAcceso.correoUsuario2.equals("")){
					ventanaAcceso.agregarUsuario2(correoIngre, contraseniaIngre);
					registroHecho = true;
				}
			}
			
		} else {
			lblErrorDatos.setVisible(true);
			lblErrorDatos.setText("Servidor lleno. Intente de nuevo más tarde.");
		}
		
		return registroHecho;
	}
	
	private boolean verificarDatos() {
		String correoIngre, contraseniaIngre;
		boolean datosCorrectos = false;
		
		try {
			correoIngre = textFieldCorreo.getText();
			contraseniaIngre = new String(passwordFieldContrasenia.getPassword());
			
			if (correoIngre.isEmpty() || contraseniaIngre.isEmpty()) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("No se han ingresado los datos");
				datosCorrectos = false;
			} else if (!(correoIngre.contains("@gmail.com"))) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("El correo es incorrecto");
				datosCorrectos = false;
			} else if (!(contraseniaIngre.length() > 8)) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("La contraseña es muy corta");
				datosCorrectos = false;
			} else {
				datosCorrectos = registrarUsuario(correoIngre, contraseniaIngre);
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(this, "Exception - " + e, "Exception", JOptionPane.ERROR_MESSAGE);
		}
		
		return datosCorrectos;
	}
	
	public boolean obtenerAcceso() {
		return acceso;
	}
	
	public void modificarAcceso(boolean acceso) {
		this.acceso = acceso;
	}
	
	public Registrarse(Acceso ventanaAcceso) {
		this.ventanaAcceso = ventanaAcceso;
		this.ventanaAcceso.setVisible(false);
		setPreferredSize(new Dimension(450, 400));
		setLayout(new BorderLayout(0, 0));
		
		formularioRegistro = new JPanel();
		formularioRegistro.setBackground(new Color(255, 255, 255));
		add(formularioRegistro, BorderLayout.CENTER);
		formularioRegistro.setLayout(null);
		
		lblTitulo = new JLabel("");
		lblTitulo.setIcon(new ImageIcon(Registrarse.class.getResource("/recursos/imagenes/imagenes_login/título_rend.png")));
		lblTitulo.setBounds(22, 22, 141, 24);
		formularioRegistro.add(lblTitulo);
		
		lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setFont(new Font("Roboto Thin", Font.BOLD, 25));
		lblRegistrarse.setBounds(22, 57, 195, 41);
		formularioRegistro.add(lblRegistrarse);
		
		lblCorreo = new JLabel("Correo electrónico:");
		lblCorreo.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		lblCorreo.setBounds(22, 109, 174, 29);
		formularioRegistro.add(lblCorreo);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.addKeyListener(this);
		textFieldCorreo.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		textFieldCorreo.setColumns(10);
		textFieldCorreo.setBorder(new EmptyBorder(0, 0, 0, 0));
		textFieldCorreo.setBounds(22, 142, 281, 20);
		formularioRegistro.add(textFieldCorreo);
		
		separatorCorreo = new JSeparator();
		separatorCorreo.setForeground(Color.WHITE);
		separatorCorreo.setBackground(Color.BLACK);
		separatorCorreo.setBounds(22, 168, 281, 4);
		formularioRegistro.add(separatorCorreo);
		
		lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		lblContrasenia.setBounds(22, 196, 174, 24);
		formularioRegistro.add(lblContrasenia);
		
		lblVista = new JLabel("");
		lblVista.addMouseListener(this);
		lblVista.setIcon(new ImageIcon(Registrarse.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
		lblVista.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVista.setBounds(313, 225, 14, 20);
		formularioRegistro.add(lblVista);
		
		passwordFieldContrasenia = new JPasswordField();
		passwordFieldContrasenia.addKeyListener(this);
		passwordFieldContrasenia.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		passwordFieldContrasenia.setEchoChar('*');
		passwordFieldContrasenia.setBorder(new EmptyBorder(0, 0, 0, 0));
		passwordFieldContrasenia.setBounds(22, 225, 281, 20);
		formularioRegistro.add(passwordFieldContrasenia);
		
		separatorContrasenia = new JSeparator();
		separatorContrasenia.setForeground(Color.WHITE);
		separatorContrasenia.setBackground(Color.BLACK);
		separatorContrasenia.setBounds(22, 252, 281, 4);
		formularioRegistro.add(separatorContrasenia);
		
		lblCargaCorreo = new JLabel("");
		lblCargaCorreo.setFocusable(false);
		lblCargaCorreo.setVisible(false);
		lblCargaCorreo.setIcon(new ImageIcon(Registrarse.class.getResource("/recursos/gifs/gifs_login/circulo_de_carga_rend.gif")));
		lblCargaCorreo.setBounds(336, 142, 20, 20);
		formularioRegistro.add(lblCargaCorreo);
		
		lblCargaContrasenia = new JLabel("");
		lblCargaContrasenia.setVisible(false);
		lblCargaContrasenia.setIcon(new ImageIcon(Registrarse.class.getResource("/recursos/gifs/gifs_login/circulo_de_carga_rend.gif")));
		lblCargaContrasenia.setFocusable(false);
		lblCargaContrasenia.setBounds(336, 225, 20, 20);
		formularioRegistro.add(lblCargaContrasenia);
		
		lblErrorDatos = new JLabel("");
		lblErrorDatos.setFont(new Font("Roboto Light", Font.PLAIN, 10));
		lblErrorDatos.setFocusable(false);
		lblErrorDatos.setVisible(false);
		lblErrorDatos.setForeground(new Color(255, 0, 0));
		lblErrorDatos.setBounds(138, 293, 250, 14);
		formularioRegistro.add(lblErrorDatos);
		
		lblPregIniciarSesion = new JLabel("<html>¿Ya tienes una cuenta?</html>");
		lblPregIniciarSesion.setForeground(Color.GRAY);
		lblPregIniciarSesion.setFont(new Font("Roboto Light", Font.PLAIN, 12));
		lblPregIniciarSesion.setBounds(22, 324, 127, 20);
		formularioRegistro.add(lblPregIniciarSesion);
		
		lblIniciarSesion = new JLabel("<html><u>Iniciar sesión</u></html>");
		lblIniciarSesion.addMouseListener(this);
		lblIniciarSesion.setForeground(Color.BLUE);
		lblIniciarSesion.setFont(new Font("Roboto Light", Font.PLAIN, 12));
		lblIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIniciarSesion.setBounds(150, 324, 76, 20);
		formularioRegistro.add(lblIniciarSesion);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(this);
		btnRegistrar.setForeground(Color.WHITE);
		btnRegistrar.setFont(new Font("Roboto", Font.BOLD, 13));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBackground(SystemColor.textHighlight);
		btnRegistrar.setBounds(22, 285, 97, 29);
		formularioRegistro.add(btnRegistrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRegistrar) {
			actionPerformedBtnRegistrar(e);
		}
	}
	

	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == lblVista) {
			mousePressedLblVista(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
		if (lblVista.isEnabled() == true) {
			lblVista.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
			
			passwordFieldContrasenia.setEchoChar('*');
		}
	}
	
	protected void mousePressedLblVista(MouseEvent e) {
		if (lblVista.isEnabled() == true) {
			lblVista.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_cerrado_rend.png")));
			
			passwordFieldContrasenia.setEchoChar((char)0);
		}
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == passwordFieldContrasenia) {
			keyPressedPasswordFieldContrasenia(e);
		}
		if (e.getSource() == textFieldCorreo) {
			keyPressedTextFieldCorreo(e);
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
	protected void keyPressedTextFieldCorreo(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (new String(passwordFieldContrasenia.getPassword()).isEmpty()) {
				passwordFieldContrasenia.grabFocus();
			} else {
				accionBotonRegistrar();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			passwordFieldContrasenia.grabFocus();
		}
	}
	protected void keyPressedPasswordFieldContrasenia(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (passwordFieldContrasenia.getEchoChar() != '*') {
				lblVista.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
				
				passwordFieldContrasenia.setEchoChar('*');
				accionBotonRegistrar();
				
			} else {
				accionBotonRegistrar();
			}
			
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			textFieldCorreo.grabFocus();
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblIniciarSesion) {
			mouseClickedLblIniciarSesion(e);
		}
	}
	
	protected void mouseClickedLblIniciarSesion(MouseEvent e) {
		if (lblIniciarSesion.isEnabled()) {
			vaciarDatos();
			ventanaAcceso.modificarTitulo("Iniciar sesión");
			ventanaAcceso.asignarImagenLabel(ventanaAcceso.lblImagen);
			ventanaAcceso.mostrarPanel(ventanaAcceso.panelIniciar);
		}
	}
	protected void actionPerformedBtnRegistrar(ActionEvent e) {
		accionBotonRegistrar();
	}
}
