package codigo.paneles.paneles_vehiculos;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class FerrariPurosangue extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel Portada;
	private JPanel Portadainformacion;
	private JPanel pruebaCO2;
	private JPanel TrenMotriz;
	private JPanel TrenMotriz_1;
	private JPanel Trenmotriz_2;
	private JPanel Trenmotriz_3;
	private JPanel Dinamica;
	private JPanel Dinamica_1;
	private JPanel Diseño;
	private JPanel DiseñoExterior;
	private JPanel DiseñoInterior;
	private JPanel HMI;
	private JPanel Aereodinamica;
	private JPanel Aereodinamica_1;
	private JPanel EspecificacionesTecnicas;
	private JPanel Rendimiento;
	private JPanel TrenMotriz_ET;
	private JPanel DimensionPesos;
	private JPanel ControlesElectricos;
	private JPanel NeumaticosFrenos;
	private JPanel ConsumoCO2;
	private JLabel FERRARIPUROSANGUE;
	private JLabel Informacion;
	private JLabel CO2;
	private JLabel infoCO2;
	private JLabel Combustibles;
	private JLabel infoCombustibles;
	private JPanel panel;
	private JLabel wltpCO2;
	private JLabel informCO2;
	private JLabel diagramaCO2;
	private JLabel categoria1;
	private JLabel imagenMotor1;
	private JLabel titulo;
	private JLabel info1;
	private JLabel motor_;
	private JLabel info2;
	private JLabel potenciamaxima;
	private JPanel panel_1;
	private JLabel subtitulo;
	private JLabel infosubtitulo;
	private JLabel imagen_1;
	private JPanel panel_2;
	private JLabel imagen_2;
	private JLabel subtitulo_3;
	private JLabel infor_3;
	private JLabel categoria2;
	private JLabel SCTitulo;
	private JPanel panel_3;
	private JLabel subtituloSC;
	private JLabel infoSC;
	private JLabel imagenDinamica;
	private JLabel DiseñoCategoria;
	private JLabel TituloDiseño;
	private JLabel ImagenDIseño1;
	private JLabel lblNewLabel_1;
	private JLabel DiseExterior;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblAereodinamica;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblEspecificaciones;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_15_2;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_15_3;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_15_4;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_15_5;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;

	/**
	 * Create the panel.
	 */
	public FerrariPurosangue() {
		setPreferredSize(new Dimension(790, 7500));
		setLayout(new GridLayout(22, 1, 0, 0));
		
		Portada = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Portada_01.jpg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		Portada.setPreferredSize(new Dimension(720, 337));
		add(Portada);
		Portada.setLayout(null);
		
		lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/CO2.png")));
		ImageIcon imgIconX = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/CO2.png"));
		Image imgEscaladaX = imgIconX.getImage().getScaledInstance(220, 45, Image.SCALE_SMOOTH);
		lblNewLabel_21.setIcon(new ImageIcon(imgEscaladaX));
		lblNewLabel_21.setBounds(10, 10, 220, 46);
		Portada.add(lblNewLabel_21);
		
		Portadainformacion = new JPanel();
		Portadainformacion.setBackground(new Color(0, 0, 0));
		add(Portadainformacion);
		Portadainformacion.setLayout(null);
		
		FERRARIPUROSANGUE = new JLabel("FERRARI PUROSANGUE");
		FERRARIPUROSANGUE.setHorizontalAlignment(SwingConstants.CENTER);
		FERRARIPUROSANGUE.setFont(new Font("Microsoft Tai Le", Font.BOLD, 28));
		FERRARIPUROSANGUE.setForeground(new Color(252, 204, 12));
		FERRARIPUROSANGUE.setBounds(220, 21, 369, 68);
		Portadainformacion.add(FERRARIPUROSANGUE);
		
		Informacion = new JLabel("<html><center>El Ferrari Purosangue es el primer coche de cuatro puertas y cuatro plazas en la historia de Ferrari, pero los modelos condos asientos traseros han desempeñado un papel importante en la estrategia de la compañía desde el principio. Ahora, tras 75 años de investigación de vanguardia, Ferrari ha creado un coche único y la encapsulación del ADN del Caballo Rampante, donde rendimiento, placer al volante y comodidad conviven en perfecta armonía. Y por eso este nuevo modelo se llamaba Ferrari Purosangue – italiano para pura sangre.</center></html>");
		Informacion.setFont(new Font("Lucida Sans", Font.PLAIN, 10));
		Informacion.setForeground(new Color(255, 255, 255));
		Informacion.setBounds(92, 61, 598, 110);
		Portadainformacion.add(Informacion);
		
		CO2 = new JLabel("<html>Emisiones de<br>CO2</br></html>");
		CO2.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		CO2.setForeground(new Color(255, 255, 255));
		CO2.setBounds(463, 181, 137, 39);
		Portadainformacion.add(CO2);
		
		infoCO2 = new JLabel("<html>MÍNIMA: 677 g/km</br><br></br><br>\r\nMEDIA: 399 g/km</br><br></br><br>\r\nMÁXIMO: 336 g/km\r\n</br><br></br><br>EXTRA ALTO: 333 g/km</br><br></br><br>\r\nTOTAL: 393 g/km</br></html>");
		infoCO2.setFont(new Font("Tw Cen MT", Font.PLAIN, 8));
		infoCO2.setForeground(new Color(255, 255, 255));
		infoCO2.setBounds(463, 212, 110, 103);
		Portadainformacion.add(infoCO2);
		
		Combustibles = new JLabel("<html>Consumo de<br>combustibles</br></html>");
		Combustibles.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		Combustibles.setForeground(new Color(255, 255, 255));
		Combustibles.setBounds(599, 181, 91, 39);
		Portadainformacion.add(Combustibles);
		
		infoCombustibles = new JLabel("<html><br>MÍNIMA: 27,8 l/100 km</br><br></br><br>\r\nMEDIA: 17,6 l/100 km</br><br></br><br>\r\nMÁXIMO: 14,8 l/100 km\r\n</br><br></br><br>EXTRA ALTO: 14,7 l/100 km</br><br></br><br>\r\nTOTAL: 17,3 l/100 km</br></html>");
		infoCombustibles.setFont(new Font("Tw Cen MT", Font.PLAIN, 8));
		infoCombustibles.setForeground(new Color(255, 255, 255));
		infoCombustibles.setBounds(599, 213, 99, 103);
		Portadainformacion.add(infoCombustibles);
		
		pruebaCO2 = new JPanel();
		pruebaCO2.setPreferredSize(new Dimension(720, 320));
		pruebaCO2.setBackground(new Color(221, 221, 221));
		add(pruebaCO2);
		pruebaCO2.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(229, 229, 229));
		panel.setBorder(new EmptyBorder(20, 40, 20, 20));
		pruebaCO2.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 1, 30, 0));
		
		wltpCO2 = new JLabel("<html><br></br><br></br><br></br>WLTP: test for CO2</br><br> emissions and fuel </br><br>consumption</br></html>");
		wltpCO2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		panel.add(wltpCO2);
		
		informCO2 = new JLabel("<html><center>Para poder salir al mercado, los turismos realizan una serie<br>de pruebas para verificar su cumplimiento de la normativa.</center><br></br><br></br><br></br><br></br><br></br><br></br></html>");
		informCO2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 10));
		panel.add(informCO2);
		
		diagramaCO2 = new JLabel("");
		diagramaCO2.setBorder(new EmptyBorder(0, 0, 0, 40));
		diagramaCO2.setHorizontalAlignment(SwingConstants.LEFT);
		ImageIcon imgIcon = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/ImagenC02_02.jpg"));
		Image imgEscalada = imgIcon.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH); 
		diagramaCO2.setIcon(new ImageIcon(imgEscalada));
		pruebaCO2.add(diagramaCO2, BorderLayout.EAST);
		
		TrenMotriz = new JPanel();
		TrenMotriz.setBackground(new Color(113, 0, 0));
		add(TrenMotriz);
		TrenMotriz.setLayout(null);
		
		categoria1 = new JLabel("1  ------------  TREN MOTRIZ");
		categoria1.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 13));
		categoria1.setForeground(new Color(255, 0, 0));
		categoria1.setBounds(33, 25, 201, 25);
		TrenMotriz.add(categoria1);
		
		imagenMotor1 = new JLabel("");
		imagenMotor1.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/MotorCarro1.png")));
		ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/MotorCarro1.png"));
		Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(350, 300, Image.SCALE_SMOOTH);
		imagenMotor1.setIcon(new ImageIcon(imgEscalada1));
		imagenMotor1.setBounds(240, 42, 319, 266);
		TrenMotriz.add(imagenMotor1);
		
		titulo = new JLabel("<html><br>V12 SOBRE </br><br>EL PAPEL,</br><br> EMOCIONES </br><br>AL VOLANTE </br><br> EN LA PRACTICA</br><html>");
		titulo.setForeground(new Color(242, 242, 242));
		titulo.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		titulo.setBounds(56, 28, 191, 250);
		TrenMotriz.add(titulo);
		
		info1 = new JLabel("V12 65°");
		info1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 37));
		info1.setForeground(new Color(245, 245, 245));
		info1.setBounds(576, 53, 155, 64);
		TrenMotriz.add(info1);
		
		motor_ = new JLabel("MOTOR");
		motor_.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 8));
		motor_.setForeground(new Color(255, 255, 255));
		motor_.setBounds(576, 110, 44, 12);
		TrenMotriz.add(motor_);
		
		info2 = new JLabel("725 cv");
		info2.setForeground(new Color(255, 255, 255));
		info2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 37));
		info2.setBounds(576, 152, 154, 41);
		TrenMotriz.add(info2);
		
		potenciamaxima = new JLabel("<html><br>POTENCIA</br><br>MAXIMA</br></html>");
		potenciamaxima.setForeground(new Color(255, 255, 255));
		potenciamaxima.setBounds(576, 170, 68, 64);
		TrenMotriz.add(potenciamaxima);
		
		TrenMotriz_1 = new JPanel();
		TrenMotriz_1.setBackground(new Color(255, 255, 255));
		add(TrenMotriz_1);
		TrenMotriz_1.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		TrenMotriz_1.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		subtitulo = new JLabel("<html><br>V12 SOBRE EL PAPEL,</br><br> EMOCIONES AL VOLANTE </br><br> EN LA PRACTICA</br><html>");
		subtitulo.setForeground(new Color(0, 0, 0));
		subtitulo.setEnabled(false);
		subtitulo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		subtitulo.setBorder(new EmptyBorder(40, 40, 0, 30));
		subtitulo.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(subtitulo);
		
		infosubtitulo = new JLabel("<html>El Ferrari Purosangue es el único coche con proporciones<br> similares que cuenta con un V12 atmosférico montado en</br><br> la parte central delantera: el motor más icónico de</br><br>Maranello debuta en esta nueva configuración para </br><br>asegurar que el coche despliegue más potencia que</br><br> cualquier otro en el segmento (725 cv) y garantiza la</br><br> banda sonora más fascinante del motor Ferrari.</br></html>");
		infosubtitulo.setForeground(new Color(92, 92, 92));
		infosubtitulo.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		infosubtitulo.setBorder(new EmptyBorder(0, 40, 40, 20));
		panel_1.add(infosubtitulo);
		
		imagen_1 = new JLabel("");
		ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Motor_05.png"));
		Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(400, 340, Image.SCALE_SMOOTH);
		imagen_1.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Motor_05.png")));
		imagen_1.setIcon(new ImageIcon(imgEscalada2));
		TrenMotriz_1.add(imagen_1, BorderLayout.EAST);
		
		Trenmotriz_2 = new JPanel();
		Trenmotriz_2.setBackground(new Color(255, 255, 255));
		add(Trenmotriz_2);
		Trenmotriz_2.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBounds(789, 0, 1, 340);
		panel_2.setBackground(new Color(255, 255, 255));
		Trenmotriz_2.add(panel_2);
		panel_2.setLayout(null);
		
		imagen_2 = new JLabel("");
		imagen_2.setBounds(0, 0, 400, 340);
		imagen_2.setHorizontalAlignment(SwingConstants.LEFT);
		imagen_2.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Motor_04.jpg")));
		ImageIcon imgIcon3= new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Motor_04.jpg"));
		Image imgEscalada3= imgIcon3.getImage().getScaledInstance(390, 340, Image.SCALE_SMOOTH);
		imagen_2.setIcon(new ImageIcon(imgEscalada3));
		Trenmotriz_2.add(imagen_2);
		
		lblNewLabel_22 = new JLabel("<html><div style= ' text-align:right; ' >El motor mantiene la arquitectura que hizo tan exitoso a los últimos 12 cilindros del Caballo Rampante: unángulo de 65°entre sus bancos de cilindros, una capacidad de 6,5 litros, cárter seco e inyección directa a alta presión. Para garantizar la máxima eficiencia mecánica, se han rediseñado las masas rotatorias. El cigüeñal de acero nitrurado fue modificado para alargar la carrera y los conductos internos deaceite han sido ediseñados para mejorar el flujo de aceite hacia los rodamientos de la parte grande. Tolerancias de juego de rodamientos más bajas mejoran el consumo de combustible.</div></html>");
		lblNewLabel_22.setForeground(new Color(92, 92, 92));
		lblNewLabel_22.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_22.setBounds(437, 106, 305, 186);
		Trenmotriz_2.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("MEJORA CONTINUA");
		lblNewLabel_23.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_23.setBounds(526, 54, 209, 42);
		Trenmotriz_2.add(lblNewLabel_23);
		
		Trenmotriz_3 = new JPanel();
		Trenmotriz_3.setPreferredSize(new Dimension(720, 320));
		Trenmotriz_3.setBackground(new Color(255, 255, 255));
		add(Trenmotriz_3);
		Trenmotriz_3.setLayout(null);
		
		subtitulo_3 = new JLabel("LA SINFONIA DE FERRARI");
		subtitulo_3.setHorizontalAlignment(SwingConstants.CENTER);
		subtitulo_3.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		subtitulo_3.setBounds(191, 86, 395, 44);
		Trenmotriz_3.add(subtitulo_3);
		
		infor_3 = new JLabel("<html><br><center>La banda sonora del F140IA es un ejemplo magnífico de integración entre la gloriosa sinfonía creada por la secuencia de</br><br> combustión del motor y la capacidad de Ferrari para controlar la acústica en la cabina. Los colectores de escape están</br><br> ajustados para garantizar que los 12 cilindros estén en perfecta armonía. El nuevo plenum acompaña las notas altas del V12</br><br> junto con el cuerpo de las frecuencias medias. Los dos silenciadores progresivos están diseñados para conducción en ciudad</br><br> y para altas prestaciones. La banda sonora resultante es la típica de Ferrari, con esos inconfundibles armónicos V12 que están</br><br> presentes hasta que el piloto acelera fuertemente: a medida que el motor se acerca al límite de 8250 rpm, hay un crescendo</br><br> fascinante que alcanza su punto álgido a las revoluciones altas que solo los motores Ferrari pueden ofrecer.</br></center></html>");
		infor_3.setForeground(new Color(70, 70, 70));
		infor_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		infor_3.setHorizontalAlignment(SwingConstants.CENTER);
		infor_3.setBounds(53, 112, 678, 147);
		Trenmotriz_3.add(infor_3);
		
		Dinamica = new JPanel(){
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Carro_07.png")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		add(Dinamica);
		Dinamica.setLayout(null);
		
		categoria2 = new JLabel("2  ------------  DINAMICA");
		categoria2.setBounds(33, 32, 217, 25);
		categoria2.setForeground(Color.RED);
		categoria2.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 13));
		Dinamica.add(categoria2);
		
		SCTitulo = new JLabel("<html>SPORTS</br><br>CONTROL</br></html>");
		SCTitulo.setBounds(23, 67, 191, 91);
		SCTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		SCTitulo.setForeground(new Color(255, 255, 255));
		SCTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		Dinamica.add(SCTitulo);
		
		Dinamica_1 = new JPanel();
		add(Dinamica_1);
		Dinamica_1.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		Dinamica_1.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));
		
		subtituloSC = new JLabel("<html><br>SPORTS</br><br>CONTROL</br></html>");
		subtituloSC.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		subtituloSC.setBorder(new EmptyBorder(60, 50, 10, 20));
		panel_3.add(subtituloSC);
		
		infoSC = new JLabel("<html>Ferrari también ha dotado al Ferrari Purosangue de las</br><br> últimas iteraciones de los sistemas de control dinámico </br><br> del vehículo introducidos en sus deportivos más potentes</br><br>  y exclusivos, incluyendo la dirección independiente en las</br><br>  cuatro ruedas del 812 Competizione y el ABS 'evo' con el </br><br> sensor dinámico de chasis de 6 posiciones (6w-CDS) del</br><br>  296 GTB. Debutando mundialmente también está el</br><br>  sistema de suspensión activa de Ferrari. Esto controla</br><br>  muy eficazmente el balanceo de la carrocería en curvas.</br></html>");
		infoSC.setForeground(new Color(46, 46, 46));
		infoSC.setFont(new Font("Yu Gothic UI", Font.PLAIN, 10));
		infoSC.setBorder(new EmptyBorder(20, 50, 50, 40));
		panel_3.add(infoSC);
		
		imagenDinamica = new JLabel("");
		imagenDinamica.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Dinamica_10.png")));
		ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Dinamica_10.png"));
		Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(400, 340, Image.SCALE_SMOOTH);
		imagenDinamica.setIcon(new ImageIcon(imgEscalada4));
		Dinamica_1.add(imagenDinamica, BorderLayout.EAST);
		
		Diseño = new JPanel();
		Diseño.setBackground(new Color(111, 0, 0));
		add(Diseño);
		Diseño.setLayout(null);
		
		DiseñoCategoria = new JLabel("3  ------------  DISEÑO");
		DiseñoCategoria.setForeground(Color.RED);
		DiseñoCategoria.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 13));
		DiseñoCategoria.setBounds(43, 31, 166, 25);
		Diseño.add(DiseñoCategoria);
		
		TituloDiseño = new JLabel("<html>PURASANGUE DE NOMBRE</br><br>PURASANGUE DE </br><br> DE NATURALEZA</br></html>");
		TituloDiseño.setHorizontalAlignment(SwingConstants.CENTER);
		TituloDiseño.setForeground(Color.WHITE);
		TituloDiseño.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		TituloDiseño.setBounds(0, 27, 427, 182);
		Diseño.add(TituloDiseño);
		
		ImagenDIseño1 = new JLabel("");
		ImagenDIseño1.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Diseño_09.png")));
		ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Diseño_09.png"));
		Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(650, 370, Image.SCALE_SMOOTH);
		ImagenDIseño1.setIcon(new ImageIcon(imgEscalada5));
		ImagenDIseño1.setBounds(93, 76, 587, 264);
		Diseño.add(ImagenDIseño1);
		
		DiseñoExterior = new JPanel();
		add(DiseñoExterior);
		DiseñoExterior.setLayout(null);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Carro_08.png")));
		ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Carro_08.png"));
		Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(400, 340, Image.SCALE_SMOOTH);
		lblNewLabel_1.setIcon(new ImageIcon(imgEscalada6));
		lblNewLabel_1.setBounds(0, 0, 386, 340);
		DiseñoExterior.add(lblNewLabel_1);
		
		DiseExterior = new JLabel("DISEÑO EXTERIOR");
		DiseExterior.setForeground(new Color(0, 0, 0));
		DiseExterior.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		DiseExterior.setHorizontalAlignment(SwingConstants.RIGHT);
		DiseExterior.setBounds(479, 24, 256, 74);
		DiseñoExterior.add(DiseExterior);
		
		lblNewLabel_3 = new JLabel("<html><div style= ' text-align:right; ' >El Ferrari Purosangue ha creado un nuevo segmento en el que el Caballo Rampante abre fronteras sin precedentes. Gracias a su arquitectura moderna, el Purosangue es un coche versátil que combina una comodidad inigualable con el rendimiento característico de Ferrari y el placer de conducción. El nombre Ferrari Purosangue (que significa pura sangre) describe de forma hermosa la arquitectura del coche. Su exterior elegante y atlético lo distingue de otros coches de cuatro puertas y cuatro plazas del mercado y se combina con un habitáculo sublimemente cómodo, lujosamente espacioso e impecablemente decorado. Sobre todo ofrece el espacio a bordo para garantizar una comodidad excepcional para los cuatro ocupantes.</div></html>");
		lblNewLabel_3.setForeground(new Color(55, 55, 55));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(439, 84, 303, 208);
		DiseñoExterior.add(lblNewLabel_3);
		
		DiseñoInterior = new JPanel();
		DiseñoInterior.setPreferredSize(new Dimension(720, 315));
		add(DiseñoInterior);
		DiseñoInterior.setLayout(null);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Interior_12.png")));
		ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Interior_12.png"));
		Image imgEscalada7 = imgIcon7.getImage().getScaledInstance(430, 340, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(imgEscalada7));
		lblNewLabel_2.setBounds(386, 0, 404, 340);
		DiseñoInterior.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("DISEÑO INTERIOR");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		lblNewLabel_4.setBounds(43, 51, 271, 71);
		DiseñoInterior.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("<html><div style=  ' text-align:left; ' >El Ferrari Purosangue no tiene parrilla delantera; esta ha sido sustituida por una diedra suspendida en la parte inferior. Dos carcasas forman una forma de disco con una ranura que alberga la cámara y los sensores de aparcamiento, de modo que se integran perfectamente en la forma del coche. A cada lado del capó están los DLR situados entre dos pares de tomas de aire que se funden con la parte superior de los flancos, subrayando el tema de estilo.</div></html>");
		lblNewLabel_5.setForeground(new Color(53, 53, 53));
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(43, 110, 277, 156);
		DiseñoInterior.add(lblNewLabel_5);
		
		HMI = new JPanel();
		add(HMI);
		HMI.setLayout(null);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Interior_11.jpg")));
		ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/Interior_11.jpg"));
		Image imgEscalada8 = imgIcon8.getImage().getScaledInstance(360, 340, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(imgEscalada7));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_6.setBounds(0, 0, 385, 340);
		HMI.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("<html><center><br>UN AUTENTICO </br><br>SALON FERRARI</br></center></html>");
		lblNewLabel_7.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		lblNewLabel_7.setLabelFor(this);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setBounds(512, 34, 221, 72);
		HMI.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("<html><div style= ' text-align:right; ' >La cabina parece y se siente como un salón extremadamente elegante y deportivo: al abrir las puertas, se revela un espacio sorprendentemente generoso. Igualmente sorprendente es el lujo sofisticado del interior, que desprende una sensación de elegancia y modernidad. Los lenguajes de diseño modernos se combinan armoniosamente con la estética característica de los deportivos GT de Ferrari. Todos los modelos son deliberadamente compactos para optimizar tanto el espacio disponible como su ergonomía.</div></html>");
		lblNewLabel_8.setForeground(new Color(44, 44, 44));
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(442, 116, 298, 180);
		HMI.add(lblNewLabel_8);
		
		Aereodinamica = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_FerrariPurosangue/Ferrari Purosangue como ningún otro - Ferrari.com.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
				}
		};
		add(Aereodinamica);
		Aereodinamica.setLayout(null);
		
		lblAereodinamica = new JLabel("4  ------------  AEREODINAMICA");
		lblAereodinamica.setForeground(Color.RED);
		lblAereodinamica.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 13));
		lblAereodinamica.setBounds(41, 39, 222, 25);
		Aereodinamica.add(lblAereodinamica);
		
		lblNewLabel_9 = new JLabel("VIENTO ESCULPIDO");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Segoe UI Black", Font.BOLD, 32));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(158, 110, 472, 116);
		Aereodinamica.add(lblNewLabel_9);
		
		
		Aereodinamica_1 = new JPanel();
		Aereodinamica_1.setBackground(new Color(254, 203, 1));
		add(Aereodinamica_1);
		Aereodinamica_1.setLayout(null);
		
		lblNewLabel_10 = new JLabel("");
		ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/autito_aereo2.png"));
		Image imgEscalada9 = imgIcon9.getImage().getScaledInstance(340, 200, Image.SCALE_SMOOTH);
		lblNewLabel_10.setIcon(new ImageIcon(imgEscalada9));
		lblNewLabel_10.setBounds(54, 71, 340, 199);
		Aereodinamica_1.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("VIENTO ESCULPIDO");
		lblNewLabel_11.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(501, 56, 222, 54);
		Aereodinamica_1.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("<html><center>El desarrollo aerodinámico del Ferrari Purosangue se centró en hacer que la carrocería, la parte inferior y el difusor trasero fueran lo más eficientes posible. Las nuevas soluciones incluyen sinergia entre el parachoques delantero y el entamate del paso de rueda, que genera una cortina de aire que sella aerodinámicamente las ruedas delanteras, evitando que se generen flujos de aire transversales turbulentos.</center></html>");
		lblNewLabel_12.setForeground(new Color(0, 0, 0));
		lblNewLabel_12.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setBounds(501, 108, 222, 162);
		Aereodinamica_1.add(lblNewLabel_12);
		
		EspecificacionesTecnicas = new JPanel() {
		Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/tecnicas_15 (1).png")).getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
		}
			
			
		};
		add(EspecificacionesTecnicas);
		EspecificacionesTecnicas.setLayout(null);
		
		lblEspecificaciones = new JLabel("5  ------------  ESPECIFICACIONES TECNICAS");
		lblEspecificaciones.setForeground(Color.RED);
		lblEspecificaciones.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 13));
		lblEspecificaciones.setBounds(39, 38, 338, 25);
		EspecificacionesTecnicas.add(lblEspecificaciones);
		
		lblNewLabel_13 = new JLabel("COMO NINGUN OTRO");
		lblNewLabel_13.setForeground(new Color(239, 239, 239));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblNewLabel_13.setBounds(131, 139, 478, 54);
		EspecificacionesTecnicas.add(lblNewLabel_13);
		
		Rendimiento = new JPanel();
		Rendimiento.setBackground(new Color(255, 255, 255));
		add(Rendimiento);
		Rendimiento.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("RENDIMIENTO");
		lblNewLabel_14.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setBounds(225, 11, 341, 66);
		Rendimiento.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/rendimieto.png")));
		ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/rendimieto.png"));
		Image imgEscalada10 = imgIcon10.getImage().getScaledInstance(790, 299, Image.SCALE_SMOOTH);
		lblNewLabel_15.setIcon(new ImageIcon(imgEscalada10));
		lblNewLabel_15.setBounds(52, 73, 690, 236);
		Rendimiento.add(lblNewLabel_15);
		
		TrenMotriz_ET = new JPanel();
		TrenMotriz_ET.setBackground(new Color(255, 255, 255));
		add(TrenMotriz_ET);
		TrenMotriz_ET.setLayout(null);
		
		JLabel lblNewLabel_15_1 = new JLabel("");
		lblNewLabel_15_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_15_1.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/trenmotriz.png")));
		ImageIcon imgIcon11 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/trenmotriz.png"));
		Image imgEscalada11 = imgIcon11.getImage().getScaledInstance(720, 369, Image.SCALE_SMOOTH);
		lblNewLabel_15_1.setIcon(new ImageIcon(imgEscalada11));
		lblNewLabel_15_1.setBounds(49, 86, 712, 229);
		TrenMotriz_ET.add(lblNewLabel_15_1);
		
		lblNewLabel_16 = new JLabel("TREN MOTRIZ");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel_16.setBounds(226, 21, 341, 66);
		TrenMotriz_ET.add(lblNewLabel_16);
		
		DimensionPesos = new JPanel();
		DimensionPesos.setBackground(new Color(255, 255, 255));
		add(DimensionPesos);
		DimensionPesos.setLayout(null);
		
		lblNewLabel_17 = new JLabel("DIMENSIONES Y PESOS");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel_17.setBounds(229, 23, 341, 66);
		DimensionPesos.add(lblNewLabel_17);
		
		lblNewLabel_15_2 = new JLabel("");
		lblNewLabel_15_2.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/dimensiones.png")));
		ImageIcon imgIcon12 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/dimensiones.png"));
		Image imgEscalada12 = imgIcon12.getImage().getScaledInstance(720, 369, Image.SCALE_SMOOTH);
		lblNewLabel_15_2.setIcon(new ImageIcon(imgEscalada12));
		lblNewLabel_15_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_15_2.setBounds(39, 100, 712, 229);
		DimensionPesos.add(lblNewLabel_15_2);
		
		ControlesElectricos = new JPanel();
		ControlesElectricos.setBackground(new Color(255, 255, 255));
		add(ControlesElectricos);
		ControlesElectricos.setLayout(null);
		
		lblNewLabel_18 = new JLabel("TRANSMICION Y CONTROLES ELECTRICOS");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel_18.setBounds(68, -20, 664, 136);
		ControlesElectricos.add(lblNewLabel_18);
		
		lblNewLabel_15_3 = new JLabel("");
		lblNewLabel_15_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_3.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/electricos.png")));
		ImageIcon imgIcon13 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/electricos.png"));
		Image imgEscalada13 = imgIcon13.getImage().getScaledInstance(800, 370, Image.SCALE_SMOOTH);
		lblNewLabel_15_3.setIcon(new ImageIcon(imgEscalada13));
		lblNewLabel_15_3.setBounds(42, 90, 712, 250);
		ControlesElectricos.add(lblNewLabel_15_3);
		
		NeumaticosFrenos = new JPanel();
		NeumaticosFrenos.setBackground(new Color(255, 255, 255));
		add(NeumaticosFrenos);
		NeumaticosFrenos.setLayout(null);
		
		lblNewLabel_19 = new JLabel("NEUMATICOS Y FRENOS");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel_19.setBounds(68, 0, 664, 85);
		NeumaticosFrenos.add(lblNewLabel_19);
		
		lblNewLabel_15_4 = new JLabel("");
		lblNewLabel_15_4.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/neumaticos.png")));
		ImageIcon imgIcon14 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/neumaticos.png"));
		Image imgEscalada14 = imgIcon14.getImage().getScaledInstance(660, 220, Image.SCALE_SMOOTH);
		lblNewLabel_15_4.setIcon(new ImageIcon(imgEscalada14));
		lblNewLabel_15_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_4.setBounds(38, 81, 712, 229);
		NeumaticosFrenos.add(lblNewLabel_15_4);
		
		ConsumoCO2 = new JPanel();
		ConsumoCO2.setBackground(new Color(255, 255, 255));
		add(ConsumoCO2);
		ConsumoCO2.setLayout(null);
		
		lblNewLabel_20 = new JLabel("NEUMATICOS Y FRENOS");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblNewLabel_20.setBounds(69, 0, 664, 85);
		ConsumoCO2.add(lblNewLabel_20);
		
		lblNewLabel_15_5 = new JLabel("");
		lblNewLabel_15_5.setIcon(new ImageIcon(FerrariPurosangue.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/emisionesCO2.png")));
		ImageIcon imgIconLOL = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariPurosangue/emisionesCO2.png"));
		Image imgEscaladaLOL = imgIconLOL.getImage().getScaledInstance(680, 240, Image.SCALE_SMOOTH);
		lblNewLabel_15_5.setIcon(new ImageIcon(imgEscaladaLOL));
		lblNewLabel_15_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15_5.setBounds(42, 79, 712, 229);
		ConsumoCO2.add(lblNewLabel_15_5);

	}
}
