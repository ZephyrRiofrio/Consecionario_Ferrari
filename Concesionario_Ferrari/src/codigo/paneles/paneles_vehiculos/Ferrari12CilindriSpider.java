package codigo.paneles.paneles_vehiculos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ferrari12CilindriSpider extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public Ferrari12CilindriSpider() {
		setPreferredSize(new Dimension(790, 10000));
		setLayout(new GridLayout(25, 1, 0, 0));
		
		JPanel gif_presentacion = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/intro_presentacion.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		FlowLayout flowLayout = (FlowLayout) gif_presentacion.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		
		add(gif_presentacion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari12CilindriSpider/gif_1.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_1.setBounds(0, 0, 790, 281);
		panel_1.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_1.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_2.setBounds(206, 281, 367, 121);
		panel_1.add(panel_1_2);
		
		JPanel panel_1_3 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_1_color_fondo.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_3.setBounds(571, 281, 219, 121);
		panel_1.add(panel_1_3);
		
		JPanel panel_1_4 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_1_color_fondo.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_4.setBounds(0, 281, 207, 121);
		panel_1.add(panel_1_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_2.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_2_1.setBounds(385, 0, 405, 400);
		panel_2.add(panel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\nMOTOR DE<br>\r\nCOMBUSTIÓN<br>\r\nINTERNA\r\n</html>");
		lblNewLabel_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1.setBounds(40, 33, 228, 116);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>\r\nEl Ferrari 12Cilindri Spider mantiene el motor V12 atmosférico de 830 CV, capaz de alcanzar las 9.500 rpm. Esta versión integra avances del 812 Competizione, incluyendo bielas de titanio, pistones de aleación ligera y un sistema de escape con catalizador cerámico para optimizar su rendimiento.\nPara maximizar la eficiencia mecánica, emplea tecnología de la Fórmula 1 en el accionamiento de las válvulas mediante \"dedos deslizantes\". Este sistema reduce la fricción en los componentes internos, garantizando una entrega de potencia más precisa y prestacional.\r\n</html>");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(40, 147, 266, 233);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_3_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_3.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_3_1.setBounds(0, 0, 386, 400);
		panel_3.add(panel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>\r\nEl innovador control de la estructura de par ATS (Aspirated Torque Shaping) ha permitido a los ingenieros de Maranello cincelar la curva de par en tercera y cuarta marchas con un refinado control electrónico que mejora la percepción de su forma sin perder el nivel de aceleración, todo ello en beneficio del placer de conducción.\nLa introducción de nuevas marchas de cambio finales también mantiene altos los niveles y moldea la curva de par de una forma nunca vista en un motor atmosférico.\r\n</html>");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(451, 78, 266, 233);
		panel_3.add(lblNewLabel_2_1);
		
		JPanel panel_4 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_4.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_4);
		
		JPanel panel_5 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_5.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("DISEÑO");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel_4_1.setBackground(Color.BLACK);
		lblNewLabel_4_1.setBounds(201, 140, 389, 123);
		panel_5.add(lblNewLabel_4_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_6_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_6.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_6_1.setBounds(385, 0, 405, 400);
		panel_6.add(panel_6_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html>\r\nLINEAS \r\nESENCIALES ESTILO \r\nATEMPORAL\r\n</html>");
		lblNewLabel_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1.setBounds(41, 44, 225, 140);
		panel_6.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("<html>\r\nEl 12Cilindri Spider se caracteriza por la presencia de las dos \"aletas\" traseras, detrás de las cuales se encuentra un elemento transparente con un peculiar efecto de pantalla negra, ya presente en el 12Cilindri. \r\n</html>");
		lblNewLabel_2_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(41, 203, 266, 96);
		panel_6.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("<html>\r\nEn las aletas se pueden admirar dos líneas paralelas, una clara referencia al diseño del lateral, y que convierte el diseño de las aletas en algo muy característico.\r\n</html>");
		lblNewLabel_2_2_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(41, 291, 266, 80);
		panel_6.add(lblNewLabel_2_2_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_7_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_7.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_7_1.setBounds(0, 0, 386, 400);
		panel_7.add(panel_7_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("<html><body style='text-align: center;'>\r\nEl frontal pierde algunos rasgos característicos, como los faros en forma de ojo y la parrilla que se asemeja a una boca, en favor de geometrías e intersecciones innatas al diseño del automóvil.\r\n</body></html>");
		lblNewLabel_2_2_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(485, 85, 205, 127);
		panel_7.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("<html><body style='text-align: center;'>\r\nUn único salpicadero envolvente integra las funciones de iluminación y de él emergen, como aspas, las luces de cruce.\r\n</body></html>");
		lblNewLabel_2_2_1_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_2_1_2.setBounds(485, 193, 205, 112);
		panel_7.add(lblNewLabel_2_2_1_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_8_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_8.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_8_1.setBounds(385, 0, 405, 400);
		panel_8.add(panel_8_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("<html><body style='text-align: center;'>\r\nEl del Ferrari 12Cilindri Spider es un espejo de popa puro, obtenido por sustracción mediante la reducción del volumen del conjunto.\r\n</body></html>");
		lblNewLabel_2_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_2_1_1.setBounds(78, 67, 205, 88);
		panel_8.add(lblNewLabel_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("<html><body style='text-align: center;'>\r\nCoherente con el frontal, los faros se sitúan en el interior de una lámina que recorre todo el volumen, y de ella emerge quizás el tema más característico del Ferrari 12Cilindri Spider, que demuestra una vez más cómo los diseñadores del Centro Stile Ferrari consiguen conjugar las necesidades técnico-funcionales con la belleza.\r\n</body></html>");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_2_1_1_1.setBounds(78, 155, 205, 170);
		panel_8.add(lblNewLabel_2_2_1_1_1);
		
		JPanel panel_9 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_9.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_9.setBackground(new Color(0, 0, 0));
		add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("INTERIOR");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setBounds(201, 140, 389, 123);
		panel_9.add(lblNewLabel_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(31, 31, 31));
		add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_10_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_10.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_10_1.setBounds(0, 0, 388, 400);
		panel_10.add(panel_10_1);
		
		JLabel lblNewLabel_3 = new JLabel("VOLANTE");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setBounds(443, 58, 181, 58);
		panel_10.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("<html>\r\nEl Ferrari 12Cilindri Spider equipa un volante capacitivo con botones rediseñados para ser más precisos e intuitivos, facilitando el control durante la conducción deportiva.\r\nEn el apartado tecnológico, cuenta con conectividad de serie para Apple CarPlay® y Android Auto® mediante su pantalla central. Además, incluye un sistema de carga inalámbrica para teléfonos ubicado en el túnel central.\r\n</html>");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1.setBounds(443, 140, 237, 169);
		panel_10.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(31, 31, 31));
		add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_11_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_11.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_11_1.setBounds(387, 0, 403, 400);
		panel_11.add(panel_11_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("<html>\r\nINTERFAZ HOMBRE MÁQUINA\r\n</html>");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1.setBackground(Color.BLACK);
		lblNewLabel_3_1.setBounds(41, 33, 202, 151);
		panel_11.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("<html>\r\nEl Ferrari 12 Cilindri Spider integra una interfaz HMI de tres pantallas que transforma la experiencia interior. El sistema se divide en una pantalla central de 10,25\" para funciones generales, un panel de instrumentos de 15,6\" para el conductor y una pantalla dedicada de 8,8\" para el pasajero.\r\n</html>");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1.setBounds(41, 194, 237, 140);
		panel_11.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(31, 31, 31));
		add(panel_12);
		panel_12.setLayout(null);
		
		JPanel panel_12_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_12.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_12_1.setBounds(0, 0, 388, 400);
		panel_12.add(panel_12_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("CABINA DUAL");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_1.setBounds(443, 58, 251, 58);
		panel_12.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("<html>\r\nEl interior del Ferrari 12Cilindri Spider se basa en una arquitectura de cabina dual casi simétrica, diseñada para ofrecer confort e involucración tanto al conductor como al pasajero en módulos independientes.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1.setBounds(443, 136, 237, 103);
		panel_12.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("<html>\r\nEl diseño destaca por tener salpicaderos y salidas de aire separados, utilizando materiales y colores que crean un efecto visual de volúmenes suspendidos. Esta configuración acentúa la sensación de ligereza y modernidad dentro del habitáculo.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(443, 233, 237, 112);
		panel_12.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JPanel panel_13 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_13.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_13.setBackground(new Color(0, 0, 0));
		add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblNewLabel_4_2 = new JLabel("AERODINÁMICA");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setForeground(Color.WHITE);
		lblNewLabel_4_2.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel_4_2.setBackground(Color.BLACK);
		lblNewLabel_4_2.setBounds(82, 140, 606, 123);
		panel_13.add(lblNewLabel_4_2);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(31, 31, 31));
		add(panel_14);
		panel_14.setLayout(null);
		
		JPanel panel_14_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_14.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_14_1.setBounds(0, 0, 388, 400);
		panel_14.add(panel_14_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("<html>\r\nCIRCUITO DE REFRIGERACIÓN\r\n</html>");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_1_1.setBounds(443, 49, 251, 87);
		panel_14.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("<html>\r\nLas necesidades de refrigeración del motor y los elementos auxiliares implicaron rediseñar el sistema de refrigeración del automóvil, cuya consecuencia fue la optimización de las evacuaciones en la parte inferior delantera.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(443, 147, 237, 103);
		panel_14.add(lblNewLabel_2_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2_2 = new JLabel("<html>\r\nEl espacio entre los elementos longitudinales del chasis se dedica al radiador de agua del motor y al condensador del circuito de aire acondicionado, mientras que el radiador de aceite se divide en dos y se coloca delante de las ruedas delanteras.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2_2.setBounds(443, 241, 237, 103);
		panel_14.add(lblNewLabel_2_1_1_1_1_1_2_2);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(31, 31, 31));
		add(panel_15);
		panel_15.setLayout(null);
		
		JPanel panel_15_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_15.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_15_1.setBounds(387, 0, 403, 400);
		panel_15.add(panel_15_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("<html>\r\nLA CARGA PASA POR EL FONDO\r\n</html>");
		lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_1_1_1.setBounds(41, 33, 251, 120);
		panel_15.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2_1 = new JLabel("<html>\r\nEl diseño aerodinámico frontal optimiza el flujo de aire al canalizar las salidas calientes de los radiadores de forma eficiente. Para aumentar la estabilidad, utiliza un triple par de generadores de vórtices desarrollados en el túnel de viento que maximizan la carga vertical.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2_1.setBounds(41, 164, 237, 102);
		panel_15.add(lblNewLabel_2_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2_1_2 = new JLabel("<html>\r\nEn la parte trasera, se incluye una entrada de aire específica inspirada en la competición. Esta solución técnica está dedicada exclusivamente a refrigerar los componentes electrónicos del sistema de escape.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2_1_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2_1_2.setBounds(41, 265, 237, 94);
		panel_15.add(lblNewLabel_2_1_1_1_1_1_2_1_2);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(31, 31, 31));
		add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_16_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_16.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_16_1.setBounds(0, 0, 388, 400);
		panel_16.add(panel_16_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("<html>\r\nPARTE DELANTERA\r\n</html>");
		lblNewLabel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_1_1_1_1.setBounds(443, 57, 283, 86);
		panel_16.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2_1_1 = new JLabel("<html>\r\nEn la parte delantera de las jorobas se ha creado un pasaje aerodinámico cuya finalidad es facilitar el flujo de aire hacia la parte trasera del automóvil, facilitando la recompresión y reduciendo la cantidad de aire que circula por el habitáculo. Por otra parte, el perfil vertical del exterior del paso aerodinámico tiene la misión de dirigir correctamente el aire hacia la parte trasera, en beneficio de la eficacia y la estabilización del flujo.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2_1_1.setBounds(443, 166, 237, 183);
		panel_16.add(lblNewLabel_2_1_1_1_1_1_2_1_1);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(31, 31, 31));
		add(panel_17);
		panel_17.setLayout(null);
		
		JPanel panel_17_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_17.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_17_1.setBounds(387, 0, 403, 400);
		panel_17.add(panel_17_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("<html>\r\nLA AERODINÁMICA ENTRA EN ACCIÓN\r\n</html>");
		lblNewLabel_3_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1_1_1_1_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1_1_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_1_1_1_1_1.setBounds(41, 22, 314, 125);
		panel_17.add(lblNewLabel_3_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2_1_1_1 = new JLabel("<html>\r\nEl Ferrari 12Cilindri Spider utiliza aerodinámica activa trasera con dos modos: Low Drag (LD) y High Downforce (HD). En la configuración LD, los elementos se alinean con la carrocería para reducir la resistencia, activándose en velocidades bajas (menores a 60 km/h) y muy altas (superiores a 300 km/h).\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2_1_1_1.setBounds(41, 142, 237, 116);
		panel_17.add(lblNewLabel_2_1_1_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2_1_1_1_1 = new JLabel("<html>\r\nEn el rango intermedio, el sistema cambia a la posición HD según la aceleración y el frenado. Esto permite generar la máxima carga vertical cuando se requiere mayor estabilidad o maniobrabilidad en condiciones de conducción deportiva.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2_1_1_1_1.setBounds(41, 255, 237, 99);
		panel_17.add(lblNewLabel_2_1_1_1_1_1_2_1_1_1_1);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(0, 0, 0));
		add(panel_18);
		panel_18.setLayout(null);
		
		JPanel panel_18_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_18.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_18_1.setBounds(129, 51, 519, 270);
		panel_18.add(panel_18_1);
		
		JLabel lblEspecificacionesTcnicas = new JLabel("ESPECIFICACIONES TÉCNICAS");
		lblEspecificacionesTcnicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspecificacionesTcnicas.setForeground(Color.WHITE);
		lblEspecificacionesTcnicas.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblEspecificacionesTcnicas.setBackground(Color.BLACK);
		lblEspecificacionesTcnicas.setBounds(189, 342, 381, 28);
		panel_18.add(lblEspecificacionesTcnicas);
		
		JPanel panel_19 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_19.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_19);
		panel_19.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("RENDIMIENTO");
		lblNewLabel_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_19.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_20 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_20.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_20);
		panel_20.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("MOTOR");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_20.add(lblNewLabel_1_1_1_1_1);
		
		JPanel panel_21 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_21.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_21);
		panel_21.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("TRANSMISIÓN Y CONTROLES ELECTRÓNICOS");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_21.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JPanel panel_22 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_22.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_22);
		panel_22.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("DIMENSIONES Y PESOS");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_22.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		add(panel_23);
		panel_23.setLayout(null);
		
		JPanel panel_23_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_23.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_23_1.setBounds(106, 140, 283, 260);
		panel_23.add(panel_23_1);
		
		JPanel panel_23_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_24.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_23_2.setBounds(389, 140, 283, 260);
		panel_23.add(panel_23_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1 = new JLabel("NEÚMATICOS Y FRENOS");
		lblNewLabel_1_1_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_1.setBounds(283, 68, 202, 19);
		panel_23.add(lblNewLabel_1_1_1_1_1_1_2_1);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(255, 255, 255));
		add(panel_24);
		panel_24.setLayout(null);
		
		JPanel panel_24_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_25.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_24_1.setBounds(57, 69, 332, 331);
		panel_24.add(panel_24_1);
		
		JPanel panel_24_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12CilindriSpider/img_26.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_24_2.setBounds(389, 69, 332, 331);
		panel_24.add(panel_24_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_2 = new JLabel("CONSUMO/EMISIONES DE CO2");
		lblNewLabel_1_1_1_1_1_1_2_2.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_2.setBounds(267, 28, 244, 19);
		panel_24.add(lblNewLabel_1_1_1_1_1_1_2_2);

	}
}
