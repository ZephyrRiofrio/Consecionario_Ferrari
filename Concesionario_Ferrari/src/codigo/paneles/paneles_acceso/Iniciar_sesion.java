package codigo.paneles.paneles_acceso;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Color;
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
import java.util.Random;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import codigo.ventanas.Acceso;

public class Iniciar_sesion extends JPanel implements ActionListener, MouseListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel formularioInicioSesion;
	private JLabel lblTitulo;
	private JLabel lblIniciarSesion;
	private JLabel lblCorreo;
	private JTextField textFieldCorreo;
	private JSeparator separatorCorreo;
	private JLabel lblContrasenia;
	private JLabel lblVista;
	private JPasswordField passwordFieldContrasenia;
	private JSeparator separatorContrasenia;
	private JButton btnAcceder;
	private JLabel lblCargaCorreo;
	private JLabel lblCargaContrasenia;
	private JLabel lblErrorDatos;
	private JLabel lblRegistrarse;
	private JLabel lblPregRegistro;
	
	private Acceso ventanaAcceso;
	
	private boolean acceso = false;
	
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
		btnAcceder.setEnabled(valor);
		lblRegistrarse.setEnabled(valor);
		lblVista.setEnabled(valor);
		lblVista.setFocusable(valor);
		
		lblCargaCorreo.setVisible(!valor);
		lblCargaContrasenia.setVisible(!valor);
	}
	
	private void accionBotonAcceder() {
		mostrarOcultarElementosCarga(false);
		
		Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            	if (verificarDatos()) {
            		acceso = true;
            	} 
            	
            	mostrarOcultarElementosCarga(true);
        		
                ((Timer) evt.getSource()).stop();
            }
        });
		
		timer.setRepeats(false);
		timer.start();
	}
	
	private boolean verificarCorreoContrasenia(String correoIngre, String contraseniaIngre) {
		boolean datosCorrectos = false;
		
		if (ventanaAcceso.correoAdmin.equals(correoIngre)) {
			if (ventanaAcceso.contraseniaAdmin.equals(contraseniaIngre)) {
				datosCorrectos = true;
				ventanaAcceso.modificarEsAdmin(true);
			}
			
			else {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("La contraseña es incorrecta");
				datosCorrectos = false;
			}
		} else if (!(ventanaAcceso.correoUsuario1.equals(""))) {
			if (ventanaAcceso.correoUsuario1.equals(correoIngre)) {
				if (ventanaAcceso.contraseniaUsuario1.equals(contraseniaIngre)) {
					datosCorrectos = true;
				}
				
				else {
					lblErrorDatos.setVisible(true);
					lblErrorDatos.setText("La contraseña es incorrecta");
					datosCorrectos = false;
				}
			}
		} else if (!(ventanaAcceso.correoUsuario2.equals(""))) {
			if (ventanaAcceso.correoUsuario2.equals(correoIngre)) {
				if (ventanaAcceso.contraseniaUsuario2.equals(contraseniaIngre)) {
					datosCorrectos = true;
				}
				
				else {
					lblErrorDatos.setVisible(true);
					lblErrorDatos.setText("La contraseña es incorrecta");
					datosCorrectos = false;
				}
			}
		} else {
			lblErrorDatos.setVisible(true);
			lblErrorDatos.setText("Los datos son incorrectos");
			datosCorrectos = false;
		}
		
		return datosCorrectos;
	}
	
	private boolean verificarDatos() {
		String correoIngre, contraseniaIngre;
		boolean datosValidos = false;
		
		
		try {
			correoIngre = textFieldCorreo.getText();
			contraseniaIngre = new String(passwordFieldContrasenia.getPassword());
			
			if (correoIngre.isEmpty() || contraseniaIngre.isEmpty()) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("No se han ingresado los datos");
				datosValidos = false;
			} else {
				datosValidos = verificarCorreoContrasenia(correoIngre, contraseniaIngre);
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(this, "Exception - " + e, "Exception", JOptionPane.ERROR_MESSAGE);
		}
		
		return datosValidos;
	}
	
	public boolean obtenerAcceso() {
		return acceso;
	}
	
	public void modificarAcceso(boolean acceso) {
		this.acceso = acceso;
	}
	
	public Iniciar_sesion(Acceso ventanaAcceso) {
		this.ventanaAcceso = ventanaAcceso;
		this.ventanaAcceso.setVisible(false);
		setPreferredSize(new Dimension(450, 400));
		setLayout(new BorderLayout(0, 0));
		
		formularioInicioSesion = new JPanel();
		formularioInicioSesion.setBackground(new Color(255, 255, 255));
		add(formularioInicioSesion, BorderLayout.CENTER);
		formularioInicioSesion.setLayout(null);
		
		lblTitulo = new JLabel("");
		lblTitulo.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/título_rend.png")));
		lblTitulo.setBounds(22, 22, 141, 24);
		formularioInicioSesion.add(lblTitulo);
		
		lblIniciarSesion = new JLabel("Iniciar sesión");
		lblIniciarSesion.setFont(new Font("Roboto Thin", Font.BOLD, 25));
		lblIniciarSesion.setBounds(22, 57, 195, 41);
		formularioInicioSesion.add(lblIniciarSesion);
		
		lblCorreo = new JLabel("Correo electrónico:");
		lblCorreo.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		lblCorreo.setBounds(22, 109, 174, 29);
		formularioInicioSesion.add(lblCorreo);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.addKeyListener(this);
		textFieldCorreo.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		textFieldCorreo.setColumns(10);
		textFieldCorreo.setBorder(new EmptyBorder(0, 0, 0, 0));
		textFieldCorreo.setBounds(22, 142, 281, 20);
		formularioInicioSesion.add(textFieldCorreo);
		
		separatorCorreo = new JSeparator();
		separatorCorreo.setForeground(new Color(255, 255, 255));
		separatorCorreo.setBackground(Color.BLACK);
		separatorCorreo.setBounds(22, 168, 281, 4);
		formularioInicioSesion.add(separatorCorreo);
		
		lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		lblContrasenia.setBounds(22, 196, 174, 24);
		formularioInicioSesion.add(lblContrasenia);
		
		lblVista = new JLabel("");
		lblVista.addMouseListener(this);
		lblVista.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
		lblVista.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVista.setBounds(313, 225, 14, 20);
		formularioInicioSesion.add(lblVista);
		
		passwordFieldContrasenia = new JPasswordField();
		passwordFieldContrasenia.addKeyListener(this);
		passwordFieldContrasenia.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		passwordFieldContrasenia.setEchoChar('*');
		passwordFieldContrasenia.setBorder(new EmptyBorder(0, 0, 0, 0));
		passwordFieldContrasenia.setBounds(22, 225, 281, 20);
		formularioInicioSesion.add(passwordFieldContrasenia);
		
		separatorContrasenia = new JSeparator();
		separatorContrasenia.setForeground(new Color(255, 255, 255));
		separatorContrasenia.setBackground(Color.BLACK);
		separatorContrasenia.setBounds(22, 252, 281, 4);
		formularioInicioSesion.add(separatorContrasenia);
		
		btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(this);
		btnAcceder.setForeground(Color.WHITE);
		btnAcceder.setFont(new Font("Roboto", Font.BOLD, 13));
		btnAcceder.setFocusPainted(false);
		btnAcceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAcceder.setBorderPainted(false);
		btnAcceder.setBackground(SystemColor.textHighlight);
		btnAcceder.setBounds(22, 285, 97, 29);
		formularioInicioSesion.add(btnAcceder);
		
		lblCargaCorreo = new JLabel("");
		lblCargaCorreo.setVisible(false);
		lblCargaCorreo.setFocusable(false);
		lblCargaCorreo.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/gifs/gifs_login/circulo_de_carga_rend.gif")));
		lblCargaCorreo.setBounds(336, 142, 20, 20);
		formularioInicioSesion.add(lblCargaCorreo);
		
		lblCargaContrasenia = new JLabel("");
		lblCargaContrasenia.setVisible(false);
		lblCargaContrasenia.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/gifs/gifs_login/circulo_de_carga_rend.gif")));
		lblCargaContrasenia.setFocusable(false);
		lblCargaContrasenia.setBounds(336, 225, 20, 20);
		formularioInicioSesion.add(lblCargaContrasenia);
		
		lblErrorDatos = new JLabel("");
		lblErrorDatos.setFont(new Font("Roboto Light", Font.PLAIN, 10));
		lblErrorDatos.setVisible(false);
		lblErrorDatos.setFocusable(false);
		lblErrorDatos.setForeground(new Color(255, 0, 0));
		lblErrorDatos.setBounds(129, 293, 174, 14);
		formularioInicioSesion.add(lblErrorDatos);
		
		lblPregRegistro = new JLabel("<html>¿Eres un nuevo usuario?</html>");
		lblPregRegistro.setForeground(new Color(128, 128, 128));
		lblPregRegistro.setFont(new Font("Roboto Light", Font.PLAIN, 12));
		lblPregRegistro.setBounds(22, 324, 141, 20);
		formularioInicioSesion.add(lblPregRegistro);
		
		lblRegistrarse = new JLabel("<html><u>Registrate</u></html>");
		lblRegistrarse.addMouseListener(this);
		lblRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRegistrarse.setForeground(new Color(0, 0, 255));
		lblRegistrarse.setFont(new Font("Roboto Light", Font.PLAIN, 12));
		lblRegistrarse.setBounds(155, 324, 63, 20);
		formularioInicioSesion.add(lblRegistrarse);

		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAcceder) {
			actionPerformedBtnAcceder(e);
		}
	}
	protected void actionPerformedBtnAcceder(ActionEvent e) {
		accionBotonAcceder();
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
				accionBotonAcceder();
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
				accionBotonAcceder();
				
			} else {
				accionBotonAcceder();
			}
			
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			textFieldCorreo.grabFocus();
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblRegistrarse) {
			mouseClickedLblRegistrarse(e);
		}
	}
	
	protected void mouseClickedLblRegistrarse(MouseEvent e) {
		if (lblRegistrarse.isEnabled()) {
			vaciarDatos();
			ventanaAcceso.modificarTitulo("Registrarse");
			ventanaAcceso.asignarImagenLabel(ventanaAcceso.lblImagen);
			ventanaAcceso.mostrarPanel(ventanaAcceso.panelRegistrar);
		}
	}
}
