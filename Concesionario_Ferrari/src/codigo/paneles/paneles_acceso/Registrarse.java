package codigo.paneles.paneles_acceso;

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;

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
	private JButton btnRegistrar;
	
	// Variable encargada de establecer una conexión con la ventana que va a mostrar su contenido
	private Acceso ventanaAcceso;
	
	// Método get de "textFieldCorreo" para que se pueda usar en otras clases
	public JTextField getTextFieldCorreo() { return this.textFieldCorreo; }
	
	/* Método encargado de vaciar los datos que hay en los TextField del panel (en caso
	 * se haya ingresado). Además, se encarga de reiniciar el valor del label
	 * "lblErrorDatos" a "", y de ocultarlo
	 */
	public void vaciarDatos() {
		textFieldCorreo.setText("");
		passwordFieldContrasenia.setText("");
		lblErrorDatos.setText("");
		lblErrorDatos.setVisible(false);
	}
	
	/* Método encargado de modificar el comportamiento de los TextField, PasswordField, Buttons 
	 * y Labels al momento de procesar los datos del usuario, mostrando dos Labels que tienen de 
	 * fondo un gif de carga. Para ello, lo primero que hace es inhabilitar los componentes 
	 * mencionados al inicio, para que el usuario no pueda hacer nada hasta que la carga de datos 
	 * haya terminado. Por último, habilita la visibilidad de los dos Labels mencionados anteriormente, 
	 * para mostrar los gifs de carga. Cabe mencionar que este método puede ejecutar todo lo 
	 * mencionado anteriormente a la inversa, ya que los componentes mencionados al inicio tienen
	 * que volver a habilitarse y los dos Labels que muestran los gifs tienen que ocultarse cuando 
	 * termine la carga de datos.
	 * 
	 * Este método requiere de una variable booliana que va a, o bien, inhabilitar los componentes 
	 * interactivos del panel y habilitar la visibilidad de los dos Labels que contienen un gif de 
	 * carga como fondo (false), o habilitar los componentes interactivos del panel y ocultar los dos Labels
	 * mencionados anteriormente (true)
	 * */
	private void mostrarOcultarElementosCarga(boolean valor) {
		// Líneas donde se habilitan o inhabilitan los componentes interactivos del panel
		textFieldCorreo.setEnabled(valor);
		passwordFieldContrasenia.setEnabled(valor);
		btnRegistrar.setEnabled(valor);
		lblIniciarSesion.setEnabled(valor);
		lblVista.setEnabled(valor);
		lblVista.setFocusable(valor);
		
		// Líneas donde se habilita o inhabilita la visibilidad de los Labels con gif de carga
		lblCargaCorreo.setVisible(!valor);
		lblCargaContrasenia.setVisible(!valor);
	}
	
	/* Método que va a ejecutarse al momento de darle click al boton "Registrar". En este método
	 * se crea un timer que por 3 segundos (3000 milisegundos), va a mantener los botones dinámicos
	 * del panel inhabilitados y los dos Labels con los gifs de carga de fondo con la visibilidad
	 * habilitada. Para que luego de esos 3 segundos haga lo mencionado anteriormente pero a la 
	 * inversa (Esta dinámica lo logra por medio del método "mostrarOcultarElementosCarga"
	 * */
	private void accionBotonRegistrar() {
		// Se ejecuta el método "mostrarOcultarElementosCarga" pero con false como booliano
		mostrarOcultarElementosCarga(false);
		
		// Creación del timer
		Timer timer = new Timer(3000, new ActionListener() {
            @Override
            /* Método que se ejecuta justo después de que terminaran los 3 segundos (3000 
             * milisegundos)
             * */
            public void actionPerformed(ActionEvent evt) {
            	/* Condicional que en caso el resultado del método "verificarDatos" haya sido
            	 * verdadero, va a ejecutar el método "vaciarDatos", va a ocultar la visibilidad 
            	 * del panel, va a cambiar el panel que se muestra en la ventana donde se encuentra
            	 * al de "Iniciar_sesion", y va a mostrar la visibilidad de la ventana "menu" que 
            	 * contiene a la ventana que lo está mostrando (Acceso)
            	 * */
            	if (verificarDatos()) {
            		ventanaAcceso.panelRegistrar.vaciarDatos();
            		ventanaAcceso.setVisible(false);
            		ventanaAcceso.mostrarPanel(ventanaAcceso.panelIniciar);
            		ventanaAcceso.ventanaMenu.modificarVisible(true);
            	}
            	
            	// Se ejecuta el método "mostrarOcultarElementosCarga" pero con true como booliano
            	mostrarOcultarElementosCarga(true);
        		
            	/* Se detiene el timer por medio de la siguiente línea, donde primero, por medio de
            	 * la variable evt, se obtiene el componente que ejecuto ese método, que fue el mismo
            	 * timer, por medio del método "getSource()". Sin embargo, este método retorna 
            	 * cualquier componente como una variable de tipo "Object". Por lo tanto, se usa 
            	 * "(Timer)" para convertir el componente de tipo "Object" a tipo "Timer", para que
            	 * se pueda ejecutar el método "stop()" y así detener el timer
            	 * */
                ((Timer) evt.getSource()).stop();
            }
        });
		
		// Se inhabilitan las repeticiones del timer, para que solo se ejecute una vez
		timer.setRepeats(false);
		// Se inicia el timer.
		timer.start();
	}
	
	/* Método encargado de registrar el usuario a la pequeña base de datos que contiene
	 * la ventana que está mostrando el panel ("Acceso"). Para ello, se necesitan dos variables de
	 * cadena, que son las que almacenan el correo del usuario ("correoIngre") y su contraseña
	 * ("contraseniaIngre"). Dentro del método, primero se crea una variable llamada "registroHecho"
	 * , que va a indicar si se realizo el registro o no. Luego, se verifica si hay al menos un 
	 * espacio de los dos que cuenta la base de datos. En caso no haya, se habilita la visibilidad
	 * del label "lblErrorDatos" y se cambia el texto de este label a uno que indica que la base
	 * de datos está llena. Caso contrario, se busca el espacio disponible y se ejecuta el método
	 * "agregarUsuario" de parte de la ventana que muestra el panel ("Acceso")
	 * */
	private boolean registrarUsuario(String correoIngre, String contraseniaIngre) {
		boolean registroHecho = false;
		
		// Condicional que verifica si hay al menos un espacio en la base de datos o sistema
		if (ventanaAcceso.correoUsuario1.equals("") || ventanaAcceso.correoUsuario2.equals("")) {
			// Condicional que verifica si el espacio disponible detectado es en el espacio 1
			if (ventanaAcceso.correoUsuario1.equals("")) {
				// Se agrega el usuario al espacio 1 a la base de datos
				ventanaAcceso.agregarUsuario1(correoIngre, contraseniaIngre);
				// Se cambia el valor de la variable "registroHecho" para confirmar el registro
				registroHecho = true;
			} else {
				// Condicional que verifica si el espacio disponible detectado es en el espacio 2
				if (ventanaAcceso.correoUsuario2.equals("")){
					// Se agrega el usuario al espacio 1 a la base de datos
					ventanaAcceso.agregarUsuario2(correoIngre, contraseniaIngre);
					// Se cambia el valor de la variable "registroHecho" para confirmar el registro
					registroHecho = true;
				}
			}
			
		} else {
			// Se muestra el Label de "lblErrorDatos"
			lblErrorDatos.setVisible(true);
			// Se cambia el texto del Label de "lblErrorDatos" 
			lblErrorDatos.setText("Servidor lleno. Intente de nuevo más tarde.");
		}
		
		/* Se retorna el valor de la variable "registroHecho", donde puede ser true si se realizó
		 * con exito, o false si fue el caso contrario
		 * */
		return registroHecho;
	}
	
	/* Método encargado de la validación de los datos ingresados por el usuario. Para eso, se 
	 * almacenan los datos ingresados por el usuario en dos variables llamadas "correoIngre" y 
	 * "contraseniaIngre", las cuales van a ser verificadas por medio de unas condicionales 
	 * que van a buscar si hay algún error en estos. Además, hay una variable booliana llamada
	 * "datosCorrectos" que se va a encargar de confirmar si los datos ingresados han sido
	 * correctos y registrados
	 * */
	private boolean verificarDatos() {
		// Variables que almacenan los datos ingresados por el usuario
		String correoIngre, contraseniaIngre;
		// Variable booliana encargada de indicar si los datos son correctos o no
		boolean datosCorrectos = false;
		
		/* Bloque try and catch que se va a asegurar de detectar y captar algún error de parte del 
		 * aplicativo al momento de recibir los datos
		 * */
		try {
			// Se reciben los datos ingresados en las dos variables creadas anteriormente
			correoIngre = textFieldCorreo.getText();
			contraseniaIngre = new String(passwordFieldContrasenia.getPassword());
			
			// Condicional que verifica si no se han ingresado datos
			if (correoIngre.isEmpty() || contraseniaIngre.isEmpty()) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("No se han ingresado los datos");
				datosCorrectos = false;
				
			  // Condicional que verifica si el correo ingresado no tiene el "@gmail.com"
			} else if (!(correoIngre.contains("@gmail.com"))) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("El correo es incorrecto");
				datosCorrectos = false;
			  // Condicional que verifica si el tamaño de la contraseña es mayor a 8
			} else if (!(contraseniaIngre.length() > 8)) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("La contraseña es muy corta");
				datosCorrectos = false;
			} else {
				/* Se llama el método "registrarUsuario" para proceder con el registro en caso
				 * no se hayan detectado errores en los datos ingresados. El resultado de ese
				 * método par a ser almacenado por "datosCorrectos".
				 * */
				datosCorrectos = registrarUsuario(correoIngre, contraseniaIngre);
			}
			
		} catch(Exception e) {
			// Muestra del error (o excepción) ocurrido dentro del bloque try
			JOptionPane.showMessageDialog(this, "Exception - " + e, "Exception", JOptionPane.ERROR_MESSAGE);
		}
		
		// Retorno del valor "datosCorrectos"
		return datosCorrectos;
	}
	
	/**
	 * Create the panel.
	 */
	
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
	
	/* Método encargado de ocultar el contenido del PasswordField del panel al soltar 
	 * el click del mouse sobre el Label "lblVista", que tiene como fondo un ícono
	 * de un ojo cerrado
	 * */
	public void mouseReleased(MouseEvent e) {
		// Se verifica si el label que se etá presionando está habilitado
		if (lblVista.isEnabled() == true) {
			// Se cambia el ícono del ojo cerrado al ojo abierto
			lblVista.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
			
			// Se oculta el contenido del PasswordField del panel con "*"
			passwordFieldContrasenia.setEchoChar('*');
		}
	}
	
	/* Método encargado de mostrar el contenido del PasswordField del panel al mantener 
	 * presionado el click del mouse sobre el Label "lblVista", que tiene como fondo un ícono
	 * de un ojo abierto
	 * */
	protected void mousePressedLblVista(MouseEvent e) {
		// Se verifica si el label que se etá presionando está habilitado
		if (lblVista.isEnabled() == true) {
			// Se cambia el ícono del ojo cerrado al ojo cerrado
			lblVista.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_cerrado_rend.png")));
			
			/* Se muestra el contenido del PasswordField del panel con "((char)0)", que indica
			 * al PasswordField que no tiene que ocultar ningún carácter, permitiendo ver el
			 * texto que contiene
			 * */
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
	/* Método que se ejecuta al detectar la pulsación de teclas cuando el usuario se encuentra en
	 * el TexField "textFieldCorreo" 
	 */
	protected void keyPressedTextFieldCorreo(KeyEvent e) {
		// Si el usuario le ha dado click a ENTER
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			/* Si en caso el PasswordField "passwordFieldContrasenia" ya contiene texto, se supone
			 * que el usuario solo tenía problemas con el correo, procediendo con el registro. Caso
			 * contrario, este PasswordField agarra la posición del cursor
			 * */
			if (new String(passwordFieldContrasenia.getPassword()).isEmpty()) {
				passwordFieldContrasenia.grabFocus();
			} else {
				accionBotonRegistrar();
			}
		  /* Si el usuario le ha dado click a la flecha de abajo, el PasswordField
		   * "passwordFieldContrasenia" agarra la posición del cursor
		   */
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			passwordFieldContrasenia.grabFocus();
		}
	}
	/* Método que se ejecuta al detectar la pulsación de teclas cuando el usuario se encuentra en
	 * el TexField "textFieldCorreo" 
	 */
	protected void keyPressedPasswordFieldContrasenia(KeyEvent e) {
		// Si el usuario le ha dado click a ENTER
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			/* Si se detecta que el PasswordField "passwordFieldContrasenia" no está ocultando
			 * el texto que contiene, se procede a cambiar el ícono del Label "lblVista" al de un
			 * ojo abierto, se oculta el texto del PasswordField y se procede con el registro. La
			 * razón por la que se da esto, se debe a que se ha detectado que el usuario le ha dado
			 * click a enter mientras tenia el Label "lblVista" presionado. Caso contrario, solo se
			 * procede con el registro.
			 * */
			if (passwordFieldContrasenia.getEchoChar() != '*') {
				lblVista.setIcon(new ImageIcon(Iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
				
				passwordFieldContrasenia.setEchoChar('*');
				accionBotonRegistrar();
				
			} else {
				accionBotonRegistrar();
			}
		  /* Si el usuario le ha dado click a la flecha de arriba, el TextField
		   * "textFieldCorreo" agarra la posición del cursor
		   */
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			textFieldCorreo.grabFocus();
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblIniciarSesion) {
			mouseClickedLblIniciarSesion(e);
		}
	}
	
	/* Método encargado de cambiar del panel de registro al de inicio de sesión desde el mismo 
	 * panel de registro
	 * */
	protected void mouseClickedLblIniciarSesion(MouseEvent e) {
		// Condicional que verifica si el boton presionado está habilitado
		if (lblIniciarSesion.isEnabled()) {
			// Se vacían los datos del panel
			vaciarDatos();
			/* Se cambia el título de la ventana para indicar ahora que está en el panel de 
			 * inicio de sesión
			 * */
			ventanaAcceso.modificarTitulo("Iniciar sesión");
			// Se cambia la imagen decorativa de la ventana que muestra el panel
			ventanaAcceso.asignarImagenLabel(ventanaAcceso.lblImagen);
			// Se cambia el panel registro al panel de inicio de sesión
			ventanaAcceso.mostrarPanel(ventanaAcceso.panelIniciar);
			/* El TextField de correo del panel de inicio de sesión agarra el foco de atención
			 * para que el usuario ya sepa desde donde tiene que empezar a poner sus datos en 
			 * la ventana de inicio de sesión.
			 * */
			ventanaAcceso.panelIniciar.getTextFieldCorreo().grabFocus();
		}
	}
	protected void actionPerformedBtnRegistrar(ActionEvent e) {
		accionBotonRegistrar();
	}
}
