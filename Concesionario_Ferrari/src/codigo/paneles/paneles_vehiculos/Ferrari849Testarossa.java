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

public class Ferrari849Testarossa extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public Ferrari849Testarossa() {
		setPreferredSize(new Dimension(790, 10008));
		setLayout(new GridLayout(24, 1, 0, 0));
		
		JPanel gif_presentacion = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/intro_presentacion.gif")).getImage();

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
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_1.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_1.setBounds(0, 0, 790, 271);
		panel_1.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_2.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_2.setBounds(0, 159, 790, 258);
		panel_1.add(panel_1_2);
		
		JPanel panel_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_3.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 0, 790, 0);
		panel_2.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel3_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/gif_1.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel3_1.setBounds(0, 0, 790, 301);
		panel_3.add(panel3_1);
		
		JPanel panel_3_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_4.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_3_2.setBounds(0, 238, 790, 179);
		panel_3.add(panel_3_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 240, 240));
		add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\nMOTOR DE<br>\r\nCOMBUSTIÓN<br>\r\nINTERNA\r\n</html>");
		lblNewLabel_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1.setBounds(20, 64, 228, 116);
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_4_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/gif_2.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_4_1.setBounds(364, 0, 426, 417);
		panel_4.add(panel_4_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>\r\nEl motor térmico del 849 Testarossa <br>\r\ncorresponde a la última evolución del <br>\r\ngalardonado V8 biturbo de Ferrari: entrega <br>\r\n830 CV —50 más que su predecesor— y <br>\r\nalcanza una potencia específica de 208 CV/l. <br>\r\nEste rendimiento se ha logrado sin modificar la <br>\r\ncilindrada, gracias a una revisión completa de <br>\r\nsus componentes.\r\n</html>");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 193, 266, 193);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_5_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_5.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_5_1.setBounds(364, 0, 426, 417);
		panel_5.add(panel_5_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html>\r\nMOTORES <br>\r\nELÉCTRICOS Y <br>\r\nSISTEMA HÍBRIDO\r\n</html>");
		lblNewLabel_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1.setBounds(20, 0, 288, 116);
		panel_5.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>\r\nEl 849 Testarossa incorpora una arquitectura <br>\r\nPHEV inspirada en el SF90 Stradale, que <br>\r\ncombina el motor térmico V8 con tres <br>\r\npropulsores eléctricos para alcanzar una <br>\r\npotencia total de 220 CV. Dos de estos <br>\r\nmotores están ubicados en el eje delantero y <br> \r\nconforman el sistema RAC-e (Regulador <br>\r\nEléctrico de Ajuste de Curva), responsable de <br>\r\nhabilitar la tracción total (4WD) y el torque <br>\r\nvectoring, optimizando así la adherencia y la <br>\r\neficacia en la salida de las curvas. El tercer <br>\r\nmotor eléctrico, situado en el eje trasero, es el <br> \r\nMGU-K (Motor Generator Unit, Kinetic), <br>\r\nderivado directamente de la experiencia de la <br>\r\nScuderia Ferrari en la Fórmula 1.\r\n</html>");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(20, 116, 266, 247);
		panel_5.add(lblNewLabel_2_1);
		
		JPanel panel_6 = new JPanel();
		add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_6_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_6.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_6_1.setBounds(0, 0, 366, 417);
		panel_6.add(panel_6_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("<html>\r\nSONIDO\r\n</html>");
		lblNewLabel_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1.setBounds(424, 38, 148, 89);
		panel_6.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("<html>\r\nEl sonido en el habitáculo del nuevo modelo <br>\r\ntope de gama es potente y envolvente. <br>\r\nAdemás, el 849 Testarossa incorpora una <br>\r\nnueva dimensión acústica: la estrategia de <br>\r\ncambio, heredada del SF90 XX Stradale, ha <br>\r\nsido revisada para intensificar aún más la <br>\r\nexperiencia sonora al subir de marcha durante <br>\r\nla conducción deportiva.\r\n</html>");
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(424, 109, 266, 247);
		panel_6.add(lblNewLabel_2_1_1);
		
		JPanel panel_7 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/gif_3.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_7);
		
		JPanel panel_8 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_7.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_8.setBackground(new Color(0, 0, 0));
		add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DINÁMICA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(191, 123, 389, 123);
		panel_8.add(lblNewLabel);
		
		JLabel lblDiseadoParaSuperar = new JLabel("DISEÑADO PARA SUPERAR LOS LÍMITES");
		lblDiseadoParaSuperar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiseadoParaSuperar.setForeground(Color.WHITE);
		lblDiseadoParaSuperar.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblDiseadoParaSuperar.setBackground(Color.BLACK);
		lblDiseadoParaSuperar.setBounds(191, 257, 381, 58);
		panel_8.add(lblDiseadoParaSuperar);
		
		JLabel lblElTestarossa = new JLabel("El 849 Testarossa ha sido concebido para elevar el rendimiento sin renunciar a un elevado nivel de placer al volante.");
		lblElTestarossa.setHorizontalAlignment(SwingConstants.CENTER);
		lblElTestarossa.setForeground(Color.WHITE);
		lblElTestarossa.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblElTestarossa.setBackground(Color.BLACK);
		lblElTestarossa.setBounds(141, 296, 495, 51);
		panel_8.add(lblElTestarossa);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(31, 31, 31));
		add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_9_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_8.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_9_1.setBounds(364, 0, 426, 417);
		panel_9.add(panel_9_1);
		
		JLabel lblNewLabel_3 = new JLabel("DINÁMICA");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setBounds(36, 28, 181, 58);
		panel_9.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("<html>\r\nEl Ferrari 849 Testarossa toma como referencia el SF90 Stradale, con un enfoque centrado en incrementar la potencia, mejorar el agarre y la respuesta de los neumáticos, optimizar la eficiencia del sistema de frenos y evolucionar los controles electrónicos mediante el nuevo sistema digital Ferrari Integrated Vehicle Estimator (FIVE).\r\n</html>");
		lblNewLabel_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1.setBounds(36, 87, 237, 140);
		panel_9.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("<html>\r\nLa mejora del rendimiento lateral respecto al SF90 Stradale es significativa, gracias a los nuevos neumáticos y a una configuración específica que ha permitido reducir el peso de los muelles en un 35%. El balanceo se ha disminuido en un 10%, lo que maximiza los beneficios aerodinámicos y optimiza el camber dinámico.\r\n</html>");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1.setBounds(36, 238, 237, 140);
		panel_9.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_10 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_9.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_10.setBackground(new Color(0, 0, 0));
		add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("DISEÑO");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setBounds(201, 140, 389, 123);
		panel_10.add(lblNewLabel_4);
		
		JLabel lblProyectadoHaciaEl = new JLabel("PROYECTADO HACIA EL FUTURO");
		lblProyectadoHaciaEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblProyectadoHaciaEl.setForeground(Color.WHITE);
		lblProyectadoHaciaEl.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblProyectadoHaciaEl.setBackground(Color.BLACK);
		lblProyectadoHaciaEl.setBounds(199, 261, 381, 58);
		panel_10.add(lblProyectadoHaciaEl);
		
		JLabel lblLneasnicasY = new JLabel("Líneas únicas y atemporales inspiradas en los prototipos deportivos de los años 70.");
		lblLneasnicasY.setHorizontalAlignment(SwingConstants.CENTER);
		lblLneasnicasY.setForeground(Color.WHITE);
		lblLneasnicasY.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblLneasnicasY.setBackground(Color.BLACK);
		lblLneasnicasY.setBounds(148, 303, 495, 51);
		panel_10.add(lblLneasnicasY);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(31, 31, 31));
		add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_11_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_10.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_11_1.setBounds(366, 0, 424, 417);
		panel_11.add(panel_11_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("EXTERIOR");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1.setBackground(Color.BLACK);
		lblNewLabel_3_1.setBounds(36, 60, 181, 58);
		panel_11.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("<html>\r\nDiseñado por el Centro Stile Ferrari, el 849 Testarossa redefine las líneas del SF90 Stradale con un perfil aún más tecnológico y centrado en el rendimiento. El frontal presenta volúmenes que evocan las geometrías clásicas de los Ferrari históricos, mientras que la zaga está dominada por una doble cola inspirada en el legendario 512 S.\r\n</html>");
		lblNewLabel_2_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2.setBounds(36, 170, 237, 140);
		panel_11.add(lblNewLabel_2_1_1_1_2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(31, 31, 31));
		add(panel_12);
		panel_12.setLayout(null);
		
		JPanel panel_12_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_11.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_12_1.setBounds(367, 0, 423, 417);
		panel_12.add(panel_12_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("INTERIOR");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_2.setBackground(Color.BLACK);
		lblNewLabel_3_2.setBounds(36, 60, 181, 58);
		panel_12.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("<html>\r\nEl habitáculo del 849 Testarossa representa una fusión elegante entre la amplitud de una berlina con salpicadero horizontal y la precisión envolvente de una cabina monoplaza. Cada elemento del mobiliario y la instrumentación ha sido diseñado para aprovechar al máximo el espacio disponible, para obtener el máximo confort a bordo.\r\n</html>");
		lblNewLabel_2_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_1.setBounds(36, 170, 237, 140);
		panel_12.add(lblNewLabel_2_1_1_1_2_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(31, 31, 31));
		add(panel_13);
		panel_13.setLayout(null);
		
		JPanel panel_13_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_12.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_13_1.setBounds(367, 0, 423, 417);
		panel_13.add(panel_13_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("HMI");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_2_1.setBackground(Color.BLACK);
		lblNewLabel_3_2_1.setBounds(36, 60, 181, 58);
		panel_13.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_1 = new JLabel("<html>\r\nEl volante combina funciones digitales y analógicas: se han recuperado los mandos mecánicos del F80, incluido el emblemático botón de encendido, como guiño a la tradición. Al mismo tiempo, el cuadro digital permite reconfigurar al instante los modos de conducción eléctrica mediante el innovador eManettino.\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_1_1.setBounds(36, 170, 237, 140);
		panel_13.add(lblNewLabel_2_1_1_1_2_1_1);
		
		JPanel panel_14 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/gif_4.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_14.setBackground(new Color(0, 0, 0));
		add(panel_14);
		panel_14.setLayout(null);
		
		JPanel panel_14_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/gif_5.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_14_1.setBounds(121, 39, 555, 278);
		panel_14.add(panel_14_1);
		
		JLabel lblConfiguracinFiorano = new JLabel("CONFIGURACIÓN FIORANO");
		lblConfiguracinFiorano.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfiguracinFiorano.setForeground(Color.WHITE);
		lblConfiguracinFiorano.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblConfiguracinFiorano.setBackground(Color.BLACK);
		lblConfiguracinFiorano.setBounds(184, 328, 381, 28);
		panel_14.add(lblConfiguracinFiorano);
		
		JLabel lblEstaConfiguracinExclusiva = new JLabel("<html>\r\nEsta configuración exclusiva se ha desarrollado para maximizar el rendimiento dinámico y     aerodinámico del coche.\r\n</html>");
		lblEstaConfiguracinExclusiva.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstaConfiguracinExclusiva.setForeground(Color.WHITE);
		lblEstaConfiguracinExclusiva.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblEstaConfiguracinExclusiva.setBackground(Color.BLACK);
		lblEstaConfiguracinExclusiva.setBounds(145, 354, 502, 28);
		panel_14.add(lblEstaConfiguracinExclusiva);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(31, 31, 31));
		add(panel_15);
		panel_15.setLayout(null);
		
		JPanel panel_15_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_13.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_15_1.setBounds(367, 0, 423, 417);
		panel_15.add(panel_15_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("<html>\r\nCONFIGURACIÓN FIORANO\r\n</html>");
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_2_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_2_1_1.setBounds(36, 60, 281, 89);
		panel_15.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_1_1 = new JLabel("<html>\r\nEl volante combina funciones digitales y analógicas: se han recuperado los mandos mecánicos del F80, incluido el emblemático botón de encendido, como guiño a la tradición. Al mismo tiempo, el cuadro digital permite reconfigurar al instante los modos de conducción eléctrica mediante el innovador eManettino.\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_1_1_1.setBounds(36, 190, 237, 140);
		panel_15.add(lblNewLabel_2_1_1_1_2_1_1_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(31, 31, 31));
		add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_16_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_14.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_16_1.setBounds(367, 0, 423, 417);
		panel_16.add(panel_16_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_1_1_1 = new JLabel("<html>\r\nEl volante combina funciones digitales y analógicas: se han recuperado los mandos mecánicos del F80, incluido el emblemático botón de encendido, como guiño a la tradición. Al mismo tiempo, el cuadro digital permite reconfigurar al instante los modos de conducción eléctrica mediante el innovador eManettino.\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_1_1_1_1.setBounds(36, 117, 237, 140);
		panel_16.add(lblNewLabel_2_1_1_1_2_1_1_1_1);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(0, 0, 0));
		add(panel_17);
		panel_17.setLayout(null);
		
		JLabel lblEspecificacionesTcnicas = new JLabel("ESPECIFICACIONES TÉCNICAS");
		lblEspecificacionesTcnicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspecificacionesTcnicas.setForeground(Color.WHITE);
		lblEspecificacionesTcnicas.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblEspecificacionesTcnicas.setBackground(Color.BLACK);
		lblEspecificacionesTcnicas.setBounds(184, 328, 381, 28);
		panel_17.add(lblEspecificacionesTcnicas);
		
		JLabel lblEstaConfiguracinExclusiva_2 = new JLabel("<html>\r\nEsta configuración exclusiva se ha desarrollado para maximizar el rendimiento dinámico y aerodinámico del coche.\r\n</html>");
		lblEstaConfiguracinExclusiva_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstaConfiguracinExclusiva_2.setForeground(Color.WHITE);
		lblEstaConfiguracinExclusiva_2.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblEstaConfiguracinExclusiva_2.setBackground(Color.BLACK);
		lblEstaConfiguracinExclusiva_2.setBounds(145, 354, 502, 28);
		panel_17.add(lblEstaConfiguracinExclusiva_2);
		
		JPanel panel_17_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/gif_6.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_17_1.setBounds(121, 39, 555, 278);
		panel_17.add(panel_17_1);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 255, 255));
		add(panel_18);
		panel_18.setLayout(null);
		
		JPanel panel_18_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_15.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_18_1.setBounds(10, 28, 770, 355);
		panel_18.add(panel_18_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("RENDIMIENTO");
		panel_18_1.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 255));
		add(panel_19);
		panel_19.setLayout(null);
		
		JPanel panel_19_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_16.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_19_1.setBounds(10, 0, 770, 417);
		panel_19.add(panel_19_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("MOTOR");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_19_1.add(lblNewLabel_1_1_1_1_1);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		add(panel_20);
		panel_20.setLayout(null);
		
		JPanel panel_20_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_17.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_20_1.setBounds(10, 54, 309, 363);
		panel_20.add(panel_20_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("SISTEMA ELÉCTRICO");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_20_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JPanel panel_20_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_18.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_20_2.setBounds(319, 54, 461, 363);
		panel_20.add(panel_20_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("TRANSMISIÓN Y CONTROLES ELECTRÓNICOS");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_20_2.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(255, 255, 255));
		add(panel_21);
		panel_21.setLayout(null);
		
		JPanel panel_21_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_19.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_21_1.setBounds(0, 0, 769, 362);
		panel_21.add(panel_21_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("DIMENSIONES Y PESOS");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_21_1.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(255, 255, 255));
		add(panel_22);
		panel_22.setLayout(null);
		
		JPanel panel_22_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_20.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_22_1.setBounds(91, 58, 285, 332);
		panel_22.add(panel_22_1);
		
		JPanel panel_22_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_21.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_22_2.setBounds(374, 58, 285, 332);
		panel_22.add(panel_22_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1 = new JLabel("NEÚMATICOS Y FRENOS");
		lblNewLabel_1_1_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_1.setBounds(291, 11, 202, 19);
		panel_22.add(lblNewLabel_1_1_1_1_1_1_2_1);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		add(panel_23);
		panel_23.setLayout(null);
		
		JPanel panel_23_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_22.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_23_1.setBounds(127, 37, 248, 361);
		panel_23.add(panel_23_1);
		
		JPanel panel_23_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/img_23.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_23_2.setBounds(374, 32, 221, 385);
		panel_23.add(panel_23_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1 = new JLabel("CONSUMO DE COMBUSTIBLE Y EMISIONES DE CO2");
		lblNewLabel_1_1_1_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_1_1.setBounds(161, 11, 417, 19);
		panel_23.add(lblNewLabel_1_1_1_1_1_1_2_1_1);

	}
}
