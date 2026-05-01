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

public class Ferrari296GTS extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public Ferrari296GTS() {
		setPreferredSize(new Dimension(790, 8515));
		setLayout(new GridLayout(22, 1, 0, 0));
		
		JPanel gif_presentacion = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari296GTS/intro_presentacion.gif")).getImage();

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
		
		JPanel panel_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_1.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1.setBackground(new Color(0, 0, 0));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFerrariGts = new JLabel("FERRARI 296 GTS");
		lblFerrariGts.setHorizontalAlignment(SwingConstants.CENTER);
		lblFerrariGts.setForeground(Color.WHITE);
		lblFerrariGts.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 28));
		lblFerrariGts.setBackground(Color.BLACK);
		lblFerrariGts.setBounds(202, 240, 349, 41);
		panel_1.add(lblFerrariGts);
		
		JLabel lblElTestarossa_1 = new JLabel("<html><body style='text-align: center;'>\r\nEl 296 GTS, evolución de la berlinetta deportiva spider biplaza de Ferrari con motor central trasero, se beneficia del nuevo motor V6 de 120° acoplado a un motor eléctrico enchufable (PHEV), ya visto en el 296 GTB, capaz de entregar hasta 830 cv. El automóvil redefine así la idea de diversión al volante al garantizar emociones puras no solo cuando se buscan las máximas prestaciones, sino también en su conducción diaria.\r\n</body></html>");
		lblElTestarossa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblElTestarossa_1.setForeground(Color.WHITE);
		lblElTestarossa_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 10));
		lblElTestarossa_1.setBackground(Color.BLACK);
		lblElTestarossa_1.setBounds(96, 310, 564, 51);
		panel_1.add(lblElTestarossa_1);
		
		JPanel panel_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_2.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_3_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari296GTS/gif_1.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_3_1.setBounds(395, 63, 345, 237);
		panel_3.add(panel_3_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("FUN TO DRIVE");
		lblNewLabel_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1.setBounds(41, 24, 245, 55);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>\r\nEn Ferrari, el “fun to drive” o diversión al volante se caracteriza por cinco indicadores que se utilizan como objetivos en las fases de desarrollo. El primero es la aceleración lateral, determinada por la velocidad y calidad de la respuesta a los mandos del volante, por la sensación de disponibilidad de la zaga y, en consecuencia, por la facilidad de conducción. Por aceleración longitudinal, en cambio, entendemos la velocidad y la constancia de la curva de respuesta cuando se acciona el acelerador. Un tercer parámetro es el del cambio de marchas, que a su vez se divide en tiempos de cambio de marchas y sensación de progresión de las mismas. El cuarto criterio, el frenado, tiene como objetivo determinar la sensación del pedal del freno en términos de recorrido y respuesta. Finalmente, se monitoriza el nivel y la calidad del sonido en el habitáculo, así como su progresividad a medida que aumentan las revoluciones.\r\n</html>");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(41, 73, 318, 281);
		panel_3.add(lblNewLabel_2_1);
		
		JPanel panel_4 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_3.png")).getImage();

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
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_4.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_5.setBackground(new Color(0, 0, 0));
		add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("DISEÑO");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setBounds(201, 140, 389, 123);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblProyectadoHaciaEl = new JLabel("PROYECTADO HACIA EL FUTURO");
		lblProyectadoHaciaEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblProyectadoHaciaEl.setForeground(Color.WHITE);
		lblProyectadoHaciaEl.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblProyectadoHaciaEl.setBackground(Color.BLACK);
		lblProyectadoHaciaEl.setBounds(211, 276, 381, 58);
		panel_5.add(lblProyectadoHaciaEl);
		
		JLabel lblLneasnicasY = new JLabel("Líneas únicas y atemporales inspiradas en los prototipos deportivos de los años 70.");
		lblLneasnicasY.setHorizontalAlignment(SwingConstants.CENTER);
		lblLneasnicasY.setForeground(Color.WHITE);
		lblLneasnicasY.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblLneasnicasY.setBackground(Color.BLACK);
		lblLneasnicasY.setBounds(148, 313, 495, 51);
		panel_5.add(lblLneasnicasY);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_6_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_5.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_6_1.setBounds(384, 0, 406, 387);
		panel_6.add(panel_6_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("<html>\r\nUNA COMPLEJIDAD SOLUCIONADA\r\n</html>");
		lblNewLabel_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1_1.setBounds(41, 36, 318, 100);
		panel_6.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("<html>\r\nEl 296 GTS resalta aún más las líneas limpias y refinadas que caracterizan al 296 GTB. Con techo descubierto, representa la versión más elegante del concepto híbrido al aire libre y, con su nueva arquitectura spider, abre un nuevo capítulo en la historia de la marca. La intención de preservar las principales características del 296 GTB requirió una intensa fase de análisis de las dimensiones técnicas, con la intención de minimizar el impacto de los cambios en el exterior e identificar un gesto claro y particularmente reconocible, que trasmitiría la complejidad del proyecto, traduciéndolo en formas lineales y completas.\r\n</html>");
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(41, 143, 318, 197);
		panel_6.add(lblNewLabel_2_1_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_7_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_6.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_7_1.setBounds(384, 0, 406, 387);
		panel_7.add(panel_7_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("<html>\r\nESTILO Y TRADICIONES ITALIANOS\r\n</html>");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1_1_1.setBounds(41, 26, 308, 113);
		panel_7.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("<html>\r\nEl 296 GTS parece salido de un solo trazo de lápiz, sin efectos de aclarado óptico ni desprendimientos cromáticos. El automóvil tiene una identidad única, que reescribe las reglas al tiempo que redescubre los principios auténticos de un diseño marcadamente italiano donde la limpieza formal y los volúmenes bien definidos, de hecho, ensalzan la deportividad del digno heredero de una filosofía bien arraigada en la tradición Ferrari. Su modernidad encuentra referencias válidas en los coches de los años 60 caracterizados por la sencillez y la funcionalidad, entre ellos el 250 LM de 1963, que aportó importantes elementos de inspiración como el corte del pilar 'B', los guardabarros traseros y el colín truncado.\r\n</html>");
		lblNewLabel_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(41, 150, 318, 221);
		panel_7.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_8_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_7.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_8_1.setBounds(384, 0, 406, 387);
		panel_8.add(panel_8_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("<html>\r\nUN VERDADERO COUPÉ Y UN VERDADERO SPIDER\r\n</html>");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1_1_1_1.setBounds(41, 27, 330, 121);
		panel_8.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("<html>\r\nLa necesidad de guardar el techo rígido retráctil (RHT) dentro del compartimiento del motor permitió al equipo del Centro Stile Ferrari capitaneado por Flavio Manzoni, un nuevo diseño para la cubierta del techo, cuyas geometrías definen características distintivas en comparación con los spider Ferrari recientes. Si en el 296 GTB el capó es horizontal y está dominado por dos arbotantes, recreación del 250 Le Mans, la zona trasera del 296 GTS adquiere un aspecto absolutamente único.\r\n</html>");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(41, 163, 318, 162);
		panel_8.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_9 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_8.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_9.setBackground(new Color(0, 0, 0));
		add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DINÁMICA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(191, 143, 389, 123);
		panel_9.add(lblNewLabel);
		
		JLabel lblDiseadoParaSuperar = new JLabel("DISEÑADO PARA SUPERAR LOS LÍMITES");
		lblDiseadoParaSuperar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiseadoParaSuperar.setForeground(Color.WHITE);
		lblDiseadoParaSuperar.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblDiseadoParaSuperar.setBackground(Color.BLACK);
		lblDiseadoParaSuperar.setBounds(191, 285, 381, 58);
		panel_9.add(lblDiseadoParaSuperar);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_10_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_9.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_10_1.setBounds(384, 0, 406, 387);
		panel_10.add(panel_10_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("<html>\r\nFUNCIONES DE CONTROL EVOLUCIONADAS\r\n</html>");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1_1_2.setBounds(41, 28, 318, 125);
		panel_10.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("<html>\r\nEl desarrollo dinámico del 296 GTB tenía como objetivo aumentar las prestaciones del coche, ofrecer la máxima diversión al volante en su categoría, así como mejorar la usabilidad de sus prestaciones y la configuración híbrida.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1.setBounds(41, 164, 274, 99);
		panel_10.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("<html>\r\nAdemás, se han desarrollado nuevos componentes, como el actuador TMA y el sensor body ECS, o funciones, como el controlador \"ABS evo\", que es una primicia absoluta, junto con el estimador de grip integrado en el EPS\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(41, 257, 274, 87);
		panel_10.add(lblNewLabel_2_1_1_1_1_1_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_11_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_10.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_11_1.setBounds(0, 0, 385, 387);
		panel_11.add(panel_11_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("<html>\r\nPOTENCIA EXPLOSIVA, CONTROL HABILITADO\r\n</html>");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1_1_2_1.setBounds(419, 32, 361, 109);
		panel_11.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("<html>\r\nLa usabilidad del rendimiento es de gran importancia en el 296 GTS. Así por ejemplo, el cambio eléctrico en modo eDrive permite alcanzar una velocidad de 135 km/h sin la ayuda del motor de combustión interna. \r\n</html>");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(419, 153, 276, 85);
		panel_11.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("<html>\r\nEn la posición Hybrid, el motor térmico apoya al eléctrico solo cuando se pide mayor rendimiento. Las distancias de frenado en seco se han acortado significativamente gracias al nuevo 'ABS EVO' y su integración con el nuevo sensor 6w-CDS, que también garantiza una mayor repetitividad de la acción de frenado.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(419, 249, 276, 114);
		panel_11.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JPanel panel_12 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_11.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_12.setBackground(new Color(0, 0, 0));
		add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblInterior = new JLabel("INTERIOR");
		lblInterior.setHorizontalAlignment(SwingConstants.CENTER);
		lblInterior.setForeground(Color.WHITE);
		lblInterior.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblInterior.setBackground(Color.BLACK);
		lblInterior.setBounds(185, 143, 389, 123);
		panel_12.add(lblInterior);
		
		JLabel lblDiseadoParaSuperar_1 = new JLabel("DISEÑADO PARA SUPERAR LOS LÍMITES");
		lblDiseadoParaSuperar_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiseadoParaSuperar_1.setForeground(Color.WHITE);
		lblDiseadoParaSuperar_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblDiseadoParaSuperar_1.setBackground(Color.BLACK);
		lblDiseadoParaSuperar_1.setBounds(193, 277, 381, 58);
		panel_12.add(lblDiseadoParaSuperar_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 255));
		add(panel_13);
		panel_13.setLayout(null);
		
		JPanel panel_13_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_12.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_13_1.setBounds(384, 0, 406, 387);
		panel_13.add(panel_13_1);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("<html>\r\nLA CARA REFINADA DE LO DIGITAL\r\n</html>");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1_1_3.setBounds(41, 36, 318, 100);
		panel_13.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("<html>\r\nEl habitáculo del coche se desarrolla en torno a la interfaz totalmente digital introducida en el SF90 Stradale. Sin embargo, si en su momento se había destacado la tecnología avanzada y la ruptura con el pasado, el 296 GTS quiso asimilar el contenido técnico dentro de una apariencia refinada. La connotación resultante es pura y se caracteriza por una notable elegancia, además de ser coherente con el diseño exterior.\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(41, 158, 276, 172);
		panel_13.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		add(panel_14);
		panel_14.setLayout(null);
		
		JPanel panel_14_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_13.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_14_1.setBounds(0, 0, 385, 387);
		panel_14.add(panel_14_1);
		
		JLabel lblNewLabel_1_1_1_1_3_1 = new JLabel("<html>\r\nPILOTO Y COPILOTO\r\n</html>");
		lblNewLabel_1_1_1_1_3_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1_1_3_1.setBounds(431, 34, 282, 100);
		panel_14.add(lblNewLabel_1_1_1_1_3_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1 = new JLabel("<html>\r\nGran parte de la instrumentación se centra en el lado del piloto. El habitáculo se obtiene a partir de un corte en el asiento del salpicadero del que emergen el volante y el cuadro de instrumentos, sostenidos en la parte central por dos soportes visibles que confluyen en el salpicadero. La figura está cerrada por dos satélites laterales que acomodan un área capacitiva. El área de pasajeros tiene un aspecto minimalista; la pantalla ofrece la posibilidad de vivir el viaje de forma participativa, casi como un copiloto\r\n</html>");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setBounds(431, 145, 276, 201);
		panel_14.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(0, 0, 0));
		add(panel_15);
		panel_15.setLayout(null);
		
		JPanel panel_15_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_14.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_15_1.setBounds(125, 40, 533, 270);
		panel_15.add(panel_15_1);
		
		JLabel lblDiseadoParaSuperar_1_1 = new JLabel("ESPECIFICACIONES TÉCNICAS");
		lblDiseadoParaSuperar_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiseadoParaSuperar_1_1.setForeground(Color.WHITE);
		lblDiseadoParaSuperar_1_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblDiseadoParaSuperar_1_1.setBackground(Color.BLACK);
		lblDiseadoParaSuperar_1_1.setBounds(201, 316, 381, 58);
		panel_15.add(lblDiseadoParaSuperar_1_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_16_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_15.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_16_1.setBounds(131, 0, 515, 385);
		panel_16.add(panel_16_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1 = new JLabel("RENDIMIENTO");
		lblNewLabel_1_1_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_16_1.add(lblNewLabel_1_1_1_1_1_1_2_1);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(255, 255, 255));
		add(panel_17);
		panel_17.setLayout(null);
		
		JPanel panel_17_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_16.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_17_1.setBounds(34, 11, 708, 374);
		panel_17.add(panel_17_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1 = new JLabel("MOTOR");
		lblNewLabel_1_1_1_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_17_1.add(lblNewLabel_1_1_1_1_1_1_2_1_1);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 255, 255));
		add(panel_18);
		panel_18.setLayout(null);
		
		JPanel panel_18_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_17.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_18_1.setBounds(47, 21, 683, 353);
		panel_18.add(panel_18_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("DIMENSIONES Y PESOS");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_18_1.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 255));
		add(panel_19);
		panel_19.setLayout(null);
		
		JPanel panel_19_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_18.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_19_1.setBounds(152, 24, 462, 363);
		panel_19.add(panel_19_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("TRANSMISIÓN Y CONTROLES ELECTRÓNICOS");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_19_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		add(panel_20);
		panel_20.setLayout(null);
		
		JPanel panel_20_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_19.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_20_1.setBounds(129, 74, 209, 256);
		panel_20.add(panel_20_1);
		
		JPanel panel_20_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_20.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_20_2.setBounds(390, 82, 318, 256);
		panel_20.add(panel_20_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_2 = new JLabel("NEÚMATICOS Y FRENOS");
		lblNewLabel_1_1_1_1_1_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_2.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_1_2.setBounds(271, 22, 202, 19);
		panel_20.add(lblNewLabel_1_1_1_1_1_1_2_1_2);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(255, 255, 255));
		add(panel_21);
		panel_21.setLayout(null);
		
		JPanel panel_21_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTS/img_21.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_21_1.setBounds(294, 58, 167, 339);
		panel_21.add(panel_21_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_3 = new JLabel("CONSUMO/EMISIONES  DE CO2");
		lblNewLabel_1_1_1_1_1_1_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_3.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_1_3.setBounds(232, 0, 284, 19);
		panel_21.add(lblNewLabel_1_1_1_1_1_1_2_1_3);

	}
}
