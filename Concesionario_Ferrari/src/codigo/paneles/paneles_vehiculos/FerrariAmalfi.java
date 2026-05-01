package codigo.paneles.paneles_vehiculos;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;


public class FerrariAmalfi extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel Portada;
	private JPanel PortadaInfo;
	private JPanel PruebaCO2;
	private JPanel TrenMotriz;
	private JPanel TrenMotriz_1;
	private JPanel Dinamica;
	private JPanel Dinamica_1;
	private JPanel Dinamica_2;
	private JPanel Diseño;
	private JPanel DiseñoExterior;
	private JPanel DiseñoInterior;
	private JPanel DiseñoHMI;
	private JPanel Aereodinamica;
	private JPanel Aereodinamica_1;
	private JPanel EspecificacionesTecnicas;
	private JPanel Rendimiento;
	private JPanel TMotriz;
	private JPanel DimensionesPesos;
	private JPanel ControlesElectricos;
	private JPanel NeumaticosFrenos;
	private JPanel EmisionesCO2;
	private JLabel LogoAmalfi;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblcombinaPlacerConducente;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblunNuevoLenguaje;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblelAlernMvil;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_35;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_39;
	private JLabel lblNewLabel_40;
	private JLabel lblNewLabel_41;
	private JLabel lblNewLabel_42;
	private JLabel lblNewLabel_43;
	private JLabel lblNewLabel_44;

	/**
	 * Create the panel.
	 */
	public FerrariAmalfi() {
		setPreferredSize(new Dimension(790, 7100));
		setLayout(new GridLayout(21, 1, 0, 0));
		
		Portada = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_FerrariAmalfi/PortadaGif_1.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
			
		};
		add(Portada);
		Portada.setLayout(null);
		
		LogoAmalfi = new JLabel("");
		LogoAmalfi.setHorizontalAlignment(SwingConstants.CENTER);
		LogoAmalfi.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/LogoAmalfi.png")));
		ImageIcon imgIcon1 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/LogoAmalfi.png"));
		Image imgEscalada1 = imgIcon1.getImage().getScaledInstance(220, 40, Image.SCALE_SMOOTH);
		LogoAmalfi.setIcon(new ImageIcon(imgEscalada1));
		LogoAmalfi.setBounds(10, 10, 224, 45);
		Portada.add(LogoAmalfi);
		
		PortadaInfo = new JPanel();
		PortadaInfo.setBackground(new Color(243, 243, 243));
		add(PortadaInfo);
		PortadaInfo.setLayout(null);
		
		lblNewLabel = new JLabel("FERRARI AMALFI: PURO Y DEPORTIVO");
		lblNewLabel.setForeground(new Color(0, 71, 91));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 31));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 20, 677, 78);
		PortadaInfo.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Una mezcla de elegancia moderna y rendimiento");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 66, 91));
		lblNewLabel_1.setBounds(111, 71, 565, 47);
		PortadaInfo.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/infoPortadaCO2.png")));
		ImageIcon imgIcon2 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/infoPortadaCO2.png"));
		Image imgEscalada2 = imgIcon2.getImage().getScaledInstance(250, 130, Image.SCALE_SMOOTH);
		lblNewLabel_2.setIcon(new ImageIcon(imgEscalada2));
		lblNewLabel_2.setBounds(478, 168, 258, 134);
		PortadaInfo.add(lblNewLabel_2);
		
		PruebaCO2 = new JPanel();
		PruebaCO2.setBackground(new Color(255, 255, 255));
		add(PruebaCO2);
		PruebaCO2.setLayout(null);
		
		lblNewLabel_3 = new JLabel("<html><br>WLTP: prueba de emisiones de CO₂ </br><br>y consumo de</br><br> combustible</br></html>\r\n");
		lblNewLabel_3.setForeground(new Color(31, 31, 31));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(56, 44, 273, 157);
		PruebaCO2.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("<html>Para poder salir al mercado, los turimos realizan una serie <br>de pruebas para verificar el cumplimiento de su normativa</br></html>");
		lblNewLabel_4.setForeground(new Color(51, 51, 51));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(56, 206, 322, 38);
		PruebaCO2.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/DiagramaCO2_2.jpg")));
		ImageIcon imgIcon3 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/DiagramaCO2_2.jpg"));
		Image imgEscalada3 = imgIcon3.getImage().getScaledInstance(310, 230, Image.SCALE_SMOOTH);
		lblNewLabel_5.setIcon(new ImageIcon(imgEscalada3));
		lblNewLabel_5.setBounds(425, 52, 308, 236);
		PruebaCO2.add(lblNewLabel_5);
		
		TrenMotriz = new JPanel();
		TrenMotriz.setBackground(new Color(0, 88, 106));
		add(TrenMotriz);
		TrenMotriz.setLayout(null);
		
		lblNewLabel_6 = new JLabel("1 ------------ TREN MOTRIZ");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 15));
		lblNewLabel_6.setBounds(36, 27, 291, 38);
		TrenMotriz.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/MotorCarro_3.png")));
		ImageIcon imgIcon4 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/MotorCarro_3.png"));
		Image imgEscalada4 = imgIcon4.getImage().getScaledInstance(350, 330, Image.SCALE_SMOOTH);
		lblNewLabel_7.setIcon(new ImageIcon(imgEscalada4));
		lblNewLabel_7.setBounds(229, 37, 315, 280);
		TrenMotriz.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("<html>EL V8<br> BITURBO DE </br><br>FERRARI ES </br><br>AUN MAS </br><br>POTENTE</br></html>");
		lblNewLabel_8.setForeground(new Color(176, 204, 255));
		lblNewLabel_8.setFont(new Font("Segoe UI Black", Font.BOLD, 27));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setBounds(56, 67, 193, 233);
		TrenMotriz.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("<html><div style= ' text-align:right; ' >La nueva unidad de control del motor, la gestión avanzada del turbo y los nuevos sensores de presión llevan el V8 biturbo a una potencia máxima de 640 cv. Recorre de 0 a 100 km/h en 3,3 segundos.</div></html>");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9.setForeground(new Color(176, 204, 255));
		lblNewLabel_9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 17));
		lblNewLabel_9.setBounds(542, 54, 193, 250);
		TrenMotriz.add(lblNewLabel_9);
		
		TrenMotriz_1 = new JPanel();
		TrenMotriz_1.setBackground(new Color(234, 234, 234));
		add(TrenMotriz_1);
		TrenMotriz_1.setLayout(null);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/MotorAmalfi.png")));
		ImageIcon imgIcon5 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/MotorAmalfi.png"));
		Image imgEscalada5 = imgIcon5.getImage().getScaledInstance(395, 337, Image.SCALE_SMOOTH);
		lblNewLabel_10.setIcon(new ImageIcon(imgEscalada5));
		lblNewLabel_10.setBounds(0, 0, 395, 338);
		TrenMotriz_1.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("<html><div style= ' text-align:right; ' >POTENCIA DEL V8 BITURBO</div></html>");
		lblNewLabel_11.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11.setBounds(560, 36, 175, 68);
		TrenMotriz_1.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("<html><div style= ' text-align:right; ' >El motor del Ferrari Amalfi representa la última evolución del V8 biturbo de 3855 cc de la familia F154, el que ha recibido más premios internacionales en la historia reciente del automóvil. En esta configuración, la unidad motriz ha sido optimizada para ofrecer una potencia máxima de 640 cv a 7.500 rpm, con una potencia específica de 166 cv/l y un límite de potencia elevado a 7.600 rpm, permitiendo aprovechar al máximo su curva de potencia en constante aumento.</div></html>");
		lblNewLabel_12.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_12.setBounds(444, 100, 291, 206);
		TrenMotriz_1.add(lblNewLabel_12);
		
		Dinamica = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Dinamica_4.png")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0,getWidth(), getHeight(), this);
			}
		};
		
		add(Dinamica);
		Dinamica.setLayout(null);
		
		lblNewLabel_13 = new JLabel("2 ------------ DINAMICA");
		lblNewLabel_13.setForeground(new Color(0, 94, 138));
		lblNewLabel_13.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 15));
		lblNewLabel_13.setBounds(37, 22, 291, 38);
		Dinamica.add(lblNewLabel_13);
		
		lblcombinaPlacerConducente = new JLabel("<html><center>COMBINA PLACER CONDUCENTE Y VERSATILIDAD</center></html>");
		lblcombinaPlacerConducente.setHorizontalAlignment(SwingConstants.CENTER);
		lblcombinaPlacerConducente.setForeground(new Color(255, 255, 255));
		lblcombinaPlacerConducente.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblcombinaPlacerConducente.setBounds(48, 134, 706, 112);
		Dinamica.add(lblcombinaPlacerConducente);
		
		Dinamica_1 = new JPanel();
		add(Dinamica_1);
		Dinamica_1.setLayout(null);
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Dinamica_5.png")));
		ImageIcon imgIcon6 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Dinamica_5.png"));
		Image imgEscalada6 = imgIcon6.getImage().getScaledInstance(430, 337, Image.SCALE_SMOOTH);
		lblNewLabel_14.setIcon(new ImageIcon(imgEscalada6));
		lblNewLabel_14.setBounds(0, 0, 395, 338);
		Dinamica_1.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("<html><div style= ' text-align:right; ' >ELEGANCIA, POTENCIA Y RESPUESTA</div></html>");
		lblNewLabel_15.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_15.setBounds(471, 54, 265, 70);
		Dinamica_1.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("<html><div style= ' text-align:right; ' >La experiencia de conducción del Ferrari Amalfi es precisa, sensible y atractiva. Los avanzados sistemas de frenado se suman a una nueva calibración de dirección asistida eléctrica, capaz de aumentar en un 10% la velocidad de estimación de la adherencia asegurada por las ruedas de 20\".</div></html>");
		lblNewLabel_16.setForeground(new Color(40, 40, 40));
		lblNewLabel_16.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(455, 114, 285, 185);
		Dinamica_1.add(lblNewLabel_16);
		
		Dinamica_2 = new JPanel();
		add(Dinamica_2);
		Dinamica_2.setLayout(null);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Dinamica_5.png")));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(395, 0, 395, 338);
		Dinamica_2.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("<html><div style= ' text-align:left; ' >La dinámica del vehículo del Ferrari Amalfi representa una evolución significativa en el panorama de los coupés 2+ con motor delantero, gracias a la integración de las tecnologías más avanzadas desarrolladas por Ferrari en los últimos años. En el corazón de este sistema está la introducción del sistema de freno por cable, una solución que mejora significativamente la eficiencia de frenada, reduce el recorrido del pedal y mejora la modulación\" — incluso en situaciones donde el ABS está activado.</div></html>");
		lblNewLabel_18.setForeground(new Color(42, 42, 42));
		lblNewLabel_18.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(49, 47, 295, 251);
		Dinamica_2.add(lblNewLabel_18);
		
		Diseño = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Diseño_7.png")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		add(Diseño);
		Diseño.setLayout(null);
		
		lblNewLabel_19 = new JLabel("3 ------------ DISEÑO");
		lblNewLabel_19.setForeground(new Color(1, 79, 116));
		lblNewLabel_19.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 15));
		lblNewLabel_19.setBounds(37, 24, 291, 38);
		Diseño.add(lblNewLabel_19);
		
		lblunNuevoLenguaje = new JLabel("<html><center>UN NUEVO LENGUAJE DE DISEÑO</center></html>");
		lblunNuevoLenguaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblunNuevoLenguaje.setForeground(Color.WHITE);
		lblunNuevoLenguaje.setFont(new Font("Segoe UI Black", Font.BOLD, 37));
		lblunNuevoLenguaje.setBounds(37, 121, 706, 112);
		Diseño.add(lblunNuevoLenguaje);
		
		DiseñoExterior = new JPanel();
		DiseñoExterior.setPreferredSize(new Dimension(790, 330));
		add(DiseñoExterior);
		DiseñoExterior.setLayout(null);
		
		lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Diseño_8.png")));
		ImageIcon imgIcon7 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Diseño_8.png"));
		Image imgEscalada7 = imgIcon7.getImage().getScaledInstance(450, 337, Image.SCALE_SMOOTH);
		lblNewLabel_20.setIcon(new ImageIcon(imgEscalada7));
		lblNewLabel_20.setBounds(0, 0, 395, 338);
		DiseñoExterior.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("DISEÑO EXTERIOR");
		lblNewLabel_21.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_21.setBounds(527, 81, 213, 56);
		DiseñoExterior.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("<html><div style= ' text-align:right; ' >El diseño exterior del Ferrari Amalfi está inspirado en una forma de velocidad monolítica y elegante que le confiere una identidad fuerte y dinámica. Un enfoque minimalista que define una carrocería esculpida y refinada.</div></html>");
		lblNewLabel_22.setForeground(new Color(0, 0, 0));
		lblNewLabel_22.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 14));
		lblNewLabel_22.setBounds(454, 105, 286, 189);
		DiseñoExterior.add(lblNewLabel_22);
		
		DiseñoInterior = new JPanel();
		add(DiseñoInterior);
		DiseñoInterior.setLayout(null);
		
		lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Diseño_9.png")));
		ImageIcon imgIcon8 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Diseño_9.png"));
		Image imgEscalada8 = imgIcon8.getImage().getScaledInstance(450, 337, Image.SCALE_SMOOTH);
		lblNewLabel_23.setIcon(new ImageIcon(imgEscalada8));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_23.setBounds(395, 0, 395, 338);
		DiseñoInterior.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("<html><div style= ' text-align:left; ' >El interior del Ferrari Amalfi tiene una disposición de doble cabina que envuelve al conductor y al pasajero, conectados visualmente por el salpicadero, las puertas y el túnel central. Su diseño limpio y contemporáneo incorpora materiales premium, tecnología integrada y una pantalla táctil central destacada.</div></html>");
		lblNewLabel_24.setForeground(new Color(0, 0, 0));
		lblNewLabel_24.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 14));
		lblNewLabel_24.setBounds(50, 102, 294, 196);
		DiseñoInterior.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("DISEÑO INTERIOR");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_25.setBounds(50, 57, 213, 56);
		DiseñoInterior.add(lblNewLabel_25);
		
		DiseñoHMI = new JPanel();
		add(DiseñoHMI);
		DiseñoHMI.setLayout(null);
		
		lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Diseño_10.png")));
		ImageIcon imgIcon9 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Diseño_10.png"));
		Image imgEscalada9 = imgIcon9.getImage().getScaledInstance(450, 337, Image.SCALE_SMOOTH);
		lblNewLabel_26.setIcon(new ImageIcon(imgEscalada9));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBounds(0, 0, 395, 338);
		DiseñoHMI.add(lblNewLabel_26);
		
		lblNewLabel_27 = new JLabel("<html><div style= ' text-align:right; ' >La experiencia a bordo del Ferrari Amalfi ofrece una interacción intuitiva y avanzada gracias a su renovado sistema HMI. Su nuevo volante con botones físicos mejora la ergonomía y facilidad de uso, e incluye el regreso del icónico botón de arranque de aluminio. Además, integra controles ADAS, crucero adaptativo, teléfono y comandos de voz para mayor confort.</div></html>");
		lblNewLabel_27.setForeground(new Color(45, 45, 45));
		lblNewLabel_27.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 14));
		lblNewLabel_27.setBounds(451, 94, 286, 201);
		DiseñoHMI.add(lblNewLabel_27);
		
		lblNewLabel_28 = new JLabel("HMI");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_28.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_28.setBounds(524, 39, 213, 56);
		DiseñoHMI.add(lblNewLabel_28);
		
		Aereodinamica = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_FerrariAmalfi/Aereodinamica_11.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		add(Aereodinamica);
		Aereodinamica.setLayout(null);
		
		lblNewLabel_29 = new JLabel("4 ------------ AEREODINAMICA");
		lblNewLabel_29.setForeground(new Color(198, 219, 255));
		lblNewLabel_29.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 15));
		lblNewLabel_29.setBounds(26, 26, 291, 38);
		Aereodinamica.add(lblNewLabel_29);
		
		lblelAlernMvil = new JLabel("<html><center>EL ALERÓN MÓVIL ESTA INTEGRADO ARMONIOSAMENTE EN LA COLA DEL COCHE</center></html>");
		lblelAlernMvil.setHorizontalAlignment(SwingConstants.CENTER);
		lblelAlernMvil.setForeground(Color.WHITE);
		lblelAlernMvil.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblelAlernMvil.setBounds(40, 148, 706, 153);
		Aereodinamica.add(lblelAlernMvil);
		
		Aereodinamica_1 = new JPanel();
		Aereodinamica_1.setBackground(new Color(0, 100, 117));
		Aereodinamica_1.setForeground(new Color(0, 103, 121));
		add(Aereodinamica_1);
		Aereodinamica_1.setLayout(null);
		
		lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_30.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/gifs/gifs_vehiculos/gifs_FerrariAmalfi/Aereodinamica_12.gif")));
		lblNewLabel_30.setBounds(46, 69, 375, 207);
		Aereodinamica_1.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("<html><div style= ' text-align:right; ' >La aerodinámica activa se distingue por el alerón trasero, que puede asumir automáticamente tres configuraciones: baja resistencia aerodinámica (LD), carga aerodinámica media (MD) y alta carga aerodinámica (HD). La última posición genera 110 kg de carga aerodinámica a 250 km/h.</div></html>");
		lblNewLabel_31.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		lblNewLabel_31.setForeground(new Color(174, 205, 255));
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_31.setBounds(469, 69, 267, 207);
		Aereodinamica_1.add(lblNewLabel_31);
		
		EspecificacionesTecnicas = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_FerrariAmalfi/EspecTecni_13.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		add(EspecificacionesTecnicas);
		EspecificacionesTecnicas.setLayout(null);
		
		lblNewLabel_32 = new JLabel("4 ------------ ESPECIFICACIONES TECNICAS");
		lblNewLabel_32.setForeground(new Color(1, 79, 116));
		lblNewLabel_32.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 15));
		lblNewLabel_32.setBounds(35, 26, 389, 38);
		EspecificacionesTecnicas.add(lblNewLabel_32);
		
		Rendimiento = new JPanel();
		Rendimiento.setBackground(new Color(255, 255, 255));
		add(Rendimiento);
		Rendimiento.setLayout(null);
		
		lblNewLabel_33 = new JLabel("RENDIMIENTO");
		lblNewLabel_33.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_33.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblNewLabel_33.setBounds(270, 19, 213, 56);
		Rendimiento.add(lblNewLabel_33);
		
		lblNewLabel_34 = new JLabel("New label");
		lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_34.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Rendimiento1.png")));
		ImageIcon imgIcon10 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Rendimiento1.png"));
		Image imgEscalada10 = imgIcon10.getImage().getScaledInstance(684, 224, Image.SCALE_SMOOTH);
		lblNewLabel_34.setIcon(new ImageIcon(imgEscalada10));
		lblNewLabel_34.setBounds(49, 85, 684, 224);
		Rendimiento.add(lblNewLabel_34);
		
		TMotriz = new JPanel();
		TMotriz.setBackground(new Color(255, 255, 255));
		add(TMotriz);
		TMotriz.setLayout(null);
		
		lblNewLabel_35 = new JLabel("TREN MOTRIZ");
		lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_35.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblNewLabel_35.setBounds(279, 10, 213, 66);
		TMotriz.add(lblNewLabel_35);
		
		lblNewLabel_36 = new JLabel("New label");
		lblNewLabel_36.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/TrenMotriz2.png")));
		ImageIcon imgIcon11 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/TrenMotriz2.png"));
		Image imgEscalada11 = imgIcon11.getImage().getScaledInstance(720, 215, Image.SCALE_SMOOTH);
		lblNewLabel_36.setIcon(new ImageIcon(imgEscalada11));
		lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_36.setBounds(48, 86, 698, 224);
		TMotriz.add(lblNewLabel_36);
		
		DimensionesPesos = new JPanel();
		DimensionesPesos.setBackground(new Color(255, 255, 255));
		add(DimensionesPesos);
		DimensionesPesos.setLayout(null);
		
		lblNewLabel_37 = new JLabel("DIMENSIONES Y PESOS");
		lblNewLabel_37.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_37.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblNewLabel_37.setBounds(227, 22, 315, 56);
		DimensionesPesos.add(lblNewLabel_37);
		
		lblNewLabel_38 = new JLabel("New label");
		lblNewLabel_38.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/DimenPesos3.png")));
		ImageIcon imgIcon12 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/DimenPesos3.png"));
		Image imgEscalada12 = imgIcon12.getImage().getScaledInstance(730, 200, Image.SCALE_SMOOTH);
		lblNewLabel_38.setIcon(new ImageIcon(imgEscalada12));
		lblNewLabel_38.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_38.setBounds(48, 88, 698, 224);
		DimensionesPesos.add(lblNewLabel_38);
		
		ControlesElectricos = new JPanel();
		ControlesElectricos.setBackground(new Color(255, 255, 255));
		add(ControlesElectricos);
		ControlesElectricos.setLayout(null);
		
		lblNewLabel_39 = new JLabel("<html><center>TRANSMICION Y CONTROLES ELECTRICOS</center></html>");
		lblNewLabel_39.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_39.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblNewLabel_39.setBounds(172, 20, 469, 56);
		ControlesElectricos.add(lblNewLabel_39);
		
		lblNewLabel_40 = new JLabel("New label");
		lblNewLabel_40.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/TransContrElec4.png")));
		ImageIcon imgIcon13 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/TransContrElec4.png"));
		Image imgEscalada13 = imgIcon13.getImage().getScaledInstance(730, 200, Image.SCALE_SMOOTH);
		lblNewLabel_40.setIcon(new ImageIcon(imgEscalada13));
		lblNewLabel_40.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_40.setBounds(42, 86, 698, 224);
		ControlesElectricos.add(lblNewLabel_40);
		
		NeumaticosFrenos = new JPanel();
		NeumaticosFrenos.setBackground(new Color(255, 255, 255));
		add(NeumaticosFrenos);
		NeumaticosFrenos.setLayout(null);
		
		lblNewLabel_41 = new JLabel("<html><center>NEUMATICOS Y FRENOS</center></html>");
		lblNewLabel_41.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_41.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblNewLabel_41.setBounds(163, 20, 469, 56);
		NeumaticosFrenos.add(lblNewLabel_41);
		
		lblNewLabel_42 = new JLabel("New label");
		lblNewLabel_42.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Neumaticos5.png")));
		ImageIcon imgIcon14 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/Neumaticos5.png"));
		Image imgEscalada14 = imgIcon14.getImage().getScaledInstance(700, 200, Image.SCALE_SMOOTH);
		lblNewLabel_42.setIcon(new ImageIcon(imgEscalada14));
		lblNewLabel_42.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_42.setBounds(48, 86, 698, 224);
		NeumaticosFrenos.add(lblNewLabel_42);
		
		EmisionesCO2 = new JPanel();
		EmisionesCO2.setBackground(new Color(255, 255, 255));
		add(EmisionesCO2);
		EmisionesCO2.setLayout(null);
		
		lblNewLabel_43 = new JLabel("New label");
		lblNewLabel_43.setIcon(new ImageIcon(FerrariAmalfi.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/ConsumoCO26.png")));
		ImageIcon imgIcon15 = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_FerrariAmalfi/ConsumoCO26.png"));
		Image imgEscalada15 = imgIcon15.getImage().getScaledInstance(700, 200, Image.SCALE_SMOOTH);
		lblNewLabel_43.setIcon(new ImageIcon(imgEscalada15));
		lblNewLabel_43.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_43.setBounds(49, 104, 698, 224);
		EmisionesCO2.add(lblNewLabel_43);
		
		lblNewLabel_44 = new JLabel("<html><center>CONSUMO DE COMBUSTIBLES Y EMISIONES DE CO2</center></html>");
		lblNewLabel_44.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_44.setFont(new Font("Segoe UI Black", Font.PLAIN, 25));
		lblNewLabel_44.setBounds(150, 21, 469, 64);
		EmisionesCO2.add(lblNewLabel_44);

	}
}
