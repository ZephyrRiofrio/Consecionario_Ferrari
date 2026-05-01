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

public class Ferrari849TestarossaSpider extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public Ferrari849TestarossaSpider() {
		setPreferredSize(new Dimension(790, 9240));
		setLayout(new GridLayout(21, 1, 0, 0));
		
		JPanel gif_presentacion = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/intro_presentacion.gif")).getImage();

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
		panel_1.setBackground(new Color(255, 255, 255));
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/gif_1.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_1.setBounds(0, 0, 790, 293);
		panel_1.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_1.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_2.setBounds(0, 293, 790, 147);
		panel_1.add(panel_1_2);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\nMOTOR DE<br>\r\nCOMBUSTIÓN<br>\r\nINTERNA\r\n</html>");
		lblNewLabel_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1.setBounds(41, 49, 228, 116);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>\r\nEl motor térmico del 849 Testarossa Spider corresponde a la última evolución del galardonado V8 biturbo de Ferrari: entrega 830 CV —50 más que su predecesor— y alcanza una potencia específica de 208 CV/l. Este rendimiento se ha logrado sin modificar la cilindrada, gracias a una revisión completa de sus componentes.\r\n</html>");
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(41, 176, 266, 193);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/gif_2.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_2_1.setBounds(384, 0, 406, 440);
		panel_2.add(panel_2_1);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html>\r\nMOTORES <br>\r\nELÉCTRICOS Y <br>\r\nSISTEMA HÍBRIDO\r\n</html>");
		lblNewLabel_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1.setBounds(41, 11, 288, 116);
		panel_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>\r\nEl 849 Testarossa Spider incorpora una arquitectura PHEV inspirada en el SF90 Spider, que combina el motor térmico V8 con tres propulsores eléctricos para alcanzar una potencia total de 220 CV. Dos de estos motores están ubicados en el eje delantero y conforman el sistema RAC-e (Regulador Eléctrico de Ajuste de Curva), responsable de habilitar la tracción total (4WD) y el torque vectoring, optimizando así la adherencia y la eficacia en la salida de las curvas. El tercer motor eléctrico, situado en el eje trasero, es el MGU-K (Motor Generator Unit, Kinetic), derivado directamente de la experiencia de la Scuderia Ferrari en la Fórmula 1.\r\n</html>");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(41, 158, 266, 247);
		panel_3.add(lblNewLabel_2_1);
		
		JPanel panel_3_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_2.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_3_1.setBounds(384, 0, 406, 440);
		panel_3.add(panel_3_1);
		
		JPanel panel_4 = new JPanel();
		add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("<html>\r\nSONIDO\r\n</html>");
		lblNewLabel_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 32));
		lblNewLabel_1_1_1.setBounds(431, 43, 148, 89);
		panel_4.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("<html>\r\nEl sonido en el habitáculo del nuevo 849 Testarossa Spider es potente y envolvente. Además, el 849 Testarossa incorpora una nueva dimensión acústica: la estrategia de cambio, heredada del SF90 XX Spider, ha sido revisada para intensificar aún más la experiencia sonora al subir de marcha durante la conducción deportiva.\r\n</html>");
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(431, 140, 266, 201);
		panel_4.add(lblNewLabel_2_1_1);
		
		JPanel panel_4_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_3.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_4_1.setBounds(0, 0, 385, 440);
		panel_4.add(panel_4_1);
		
		JPanel panel_5 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/gif_3.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_5);
		
		JPanel panel_6 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_4.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_6.setBackground(new Color(0, 0, 0));
		add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DINÁMICA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(191, 143, 389, 123);
		panel_6.add(lblNewLabel);
		
		JLabel lblDiseadoParaSuperar = new JLabel("DISEÑADO PARA SUPERAR LOS LÍMITES");
		lblDiseadoParaSuperar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiseadoParaSuperar.setForeground(Color.WHITE);
		lblDiseadoParaSuperar.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblDiseadoParaSuperar.setBackground(Color.BLACK);
		lblDiseadoParaSuperar.setBounds(191, 257, 381, 58);
		panel_6.add(lblDiseadoParaSuperar);
		
		JLabel lblElTestarossa_1 = new JLabel("El 849 Testarossa Spider eleva aún más el rendimiento insuperable del SF90 Spider, manteniendo intacta la emoción al volante.");
		lblElTestarossa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblElTestarossa_1.setForeground(Color.WHITE);
		lblElTestarossa_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblElTestarossa_1.setBackground(Color.BLACK);
		lblElTestarossa_1.setBounds(105, 297, 564, 51);
		panel_6.add(lblElTestarossa_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(31, 31, 31));
		add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_7_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_5.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_7_1.setBounds(384, 0, 406, 440);
		panel_7.add(panel_7_1);
		
		JLabel lblNewLabel_3 = new JLabel("DINÁMICA");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setBounds(41, 39, 181, 58);
		panel_7.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("<html>\r\nEl Ferrari 849 Testarossa Spider toma como referencia el SF90 Spider, con un enfoque centrado en incrementar la potencia, mejorar el agarre y la respuesta de los neumáticos, optimizar la eficiencia del sistema de frenos y evolucionar los controles electrónicos mediante el nuevo sistema digital Ferrari Integrated Vehicle Estimator (FIVE).\r\n</html>");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1.setBounds(41, 97, 237, 140);
		panel_7.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("<html>\r\nLa mejora del rendimiento lateral respecto al SF90 Spider es significativa, gracias a los nuevos neumáticos y a una configuración específica que ha permitido reducir el peso de los muelles en un 35 %. El balanceo se ha disminuido en un 10 %, lo que maximiza los beneficios aerodinámicos y optimiza el camber dinámico.\r\n</html>");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1.setBounds(41, 230, 237, 140);
		panel_7.add(lblNewLabel_2_1_1_1_1);
		
		JPanel panel_8 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/gif_4.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_8.setBackground(new Color(0, 0, 0));
		add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_8_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/gif_5.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_8_1.setBounds(105, 40, 567, 266);
		panel_8.add(panel_8_1);
		
		JLabel lblElFerrariMs = new JLabel("EL FERRARI MÁS AUDAZ JAMÁS CREADO");
		lblElFerrariMs.setHorizontalAlignment(SwingConstants.CENTER);
		lblElFerrariMs.setForeground(Color.WHITE);
		lblElFerrariMs.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblElFerrariMs.setBackground(Color.BLACK);
		lblElFerrariMs.setBounds(183, 328, 381, 28);
		panel_8.add(lblElFerrariMs);
		
		JLabel lblLasSolucionesDe = new JLabel("<html><body style='text-align: center;'>\r\nLas soluciones de competición históricas y contemporáneas han permitido al 849 Testarossa Spider alcanzar una optimización significativa del rendimiento térmico, así como un incremento notable de la carga vertical\r\n</body></html>");
		lblLasSolucionesDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblLasSolucionesDe.setForeground(Color.WHITE);
		lblLasSolucionesDe.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblLasSolucionesDe.setBackground(Color.BLACK);
		lblLasSolucionesDe.setBounds(131, 356, 502, 28);
		panel_8.add(lblLasSolucionesDe);
		
		JPanel panel_9 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_6.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_9.setBackground(new Color(0, 0, 0));
		add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("DISEÑO");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 76));
		lblNewLabel_4.setBackground(Color.BLACK);
		lblNewLabel_4.setBounds(201, 140, 389, 123);
		panel_9.add(lblNewLabel_4);
		
		JLabel lblProyectadoHaciaEl = new JLabel("PROYECTADO HACIA EL FUTURO");
		lblProyectadoHaciaEl.setHorizontalAlignment(SwingConstants.CENTER);
		lblProyectadoHaciaEl.setForeground(Color.WHITE);
		lblProyectadoHaciaEl.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblProyectadoHaciaEl.setBackground(Color.BLACK);
		lblProyectadoHaciaEl.setBounds(211, 276, 381, 58);
		panel_9.add(lblProyectadoHaciaEl);
		
		JLabel lblLneasnicasY = new JLabel("Líneas únicas y atemporales inspiradas en los prototipos deportivos de los años 70.");
		lblLneasnicasY.setHorizontalAlignment(SwingConstants.CENTER);
		lblLneasnicasY.setForeground(Color.WHITE);
		lblLneasnicasY.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblLneasnicasY.setBackground(Color.BLACK);
		lblLneasnicasY.setBounds(148, 313, 495, 51);
		panel_9.add(lblLneasnicasY);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(31, 31, 31));
		add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_10_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_7.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_10_1.setBounds(384, 0, 406, 440);
		panel_10.add(panel_10_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("EXTERIOR");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_1.setBackground(Color.BLACK);
		lblNewLabel_3_1.setBounds(41, 32, 181, 58);
		panel_10.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("<html>\r\nDiseñado por el Centro Stile Ferrari, el 849 Testarossa Spider redefine las líneas del SF90 Spider con un perfil aún más tecnológico y centrado en el rendimiento. El frontal presenta volúmenes que evocan las geometrías clásicas de los Ferrari históricos, mientras que la zaga está dominada por una doble cola inspirada en el legendario 512 S.\r\n</html>");
		lblNewLabel_2_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2.setBounds(41, 79, 237, 166);
		panel_10.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2_2 = new JLabel("<html>\r\nEl 849 Testarossa Spider incorpora toda la experiencia que Ferrari ha acumulado en tecnología de techo rígido retráctil (RHT). Con el techo cerrado, conserva las proporciones del 849 Testarossa; al abrirse, la sección trasera destaca por sus formas icónicas y poderosas. En el 849 Testarossa Spider, la arquitectura de doble cola se convierte en la gran protagonista, aportando una identidad única al diseño general.\r\n</html>");
		lblNewLabel_2_1_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2_2.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_2.setBounds(41, 234, 237, 166);
		panel_10.add(lblNewLabel_2_1_1_1_2_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(31, 31, 31));
		add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_11_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_8.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_11_1.setBounds(384, 0, 406, 440);
		panel_11.add(panel_11_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("INTERIOR");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2.setForeground(Color.WHITE);
		lblNewLabel_3_2.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_2.setBackground(Color.BLACK);
		lblNewLabel_3_2.setBounds(41, 70, 181, 58);
		panel_11.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("<html>\r\nEl habitáculo del 849 Testarossa Spider representa una fusión elegante entre la amplitud de una berlinetta con un salpicadero horizontal, y la precisión envolvente de una cabina monoplaza. Cada elemento del mobiliario y la instrumentación ha sido diseñado para aprovechar al máximo el espacio disponible para obtener el máximo confort a bordo.\r\n</html>");
		lblNewLabel_2_1_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_1.setBounds(41, 175, 237, 140);
		panel_11.add(lblNewLabel_2_1_1_1_2_1);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(31, 31, 31));
		add(panel_12);
		panel_12.setLayout(null);
		
		JPanel panel_12_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_9.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_12_1.setBounds(384, 0, 406, 440);
		panel_12.add(panel_12_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("HMI");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_2_1.setForeground(Color.WHITE);
		lblNewLabel_3_2_1.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 32));
		lblNewLabel_3_2_1.setBackground(Color.BLACK);
		lblNewLabel_3_2_1.setBounds(41, 37, 181, 58);
		panel_12.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_1 = new JLabel("<html>\r\nEl volante combina funciones digitales y analógicas: se han recuperado los mandos mecánicos del F80, incluido el emblemático botón de encendido, como guiño a la tradición. Al mismo tiempo, el cuadro digital permite reconfigurar al instante los modos de conducción eléctrica mediante el innovador eManettino.\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_1_1.setBounds(41, 126, 237, 140);
		panel_12.add(lblNewLabel_2_1_1_1_2_1_1);
		
		JPanel panel_13 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/gif_6.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(0, 0, 0));
		add(panel_14);
		panel_14.setLayout(null);
		
		JPanel panel_14_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849TestarossaSpider/gif_7.gif")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_14_1.setBounds(129, 33, 519, 270);
		panel_14.add(panel_14_1);
		
		JLabel lblEspecificacionesTcnicas = new JLabel("ESPECIFICACIONES TÉCNICAS");
		lblEspecificacionesTcnicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspecificacionesTcnicas.setForeground(Color.WHITE);
		lblEspecificacionesTcnicas.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 16));
		lblEspecificacionesTcnicas.setBackground(Color.BLACK);
		lblEspecificacionesTcnicas.setBounds(184, 314, 381, 28);
		panel_14.add(lblEspecificacionesTcnicas);
		
		JLabel lblEstaConfiguracinExclusiva_2 = new JLabel("<html>\r\nEl Ferrari 849 Testarossa Spider cuenta con la mejor relación peso/potencia jamás vista en un modelo de gama.\r\n</html>");
		lblEstaConfiguracinExclusiva_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstaConfiguracinExclusiva_2.setForeground(Color.WHITE);
		lblEstaConfiguracinExclusiva_2.setFont(new Font("TT Interphases Pro Trl", Font.BOLD, 9));
		lblEstaConfiguracinExclusiva_2.setBackground(Color.BLACK);
		lblEstaConfiguracinExclusiva_2.setBounds(145, 340, 502, 28);
		panel_14.add(lblEstaConfiguracinExclusiva_2);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		add(panel_15);
		panel_15.setLayout(null);
		
		JPanel panel_15_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_10.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_15_1.setBounds(85, 11, 615, 395);
		panel_15.add(panel_15_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("RENDIMIENTO");
		lblNewLabel_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_15_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_16_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_11.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_16_1.setBounds(36, 22, 706, 373);
		panel_16.add(panel_16_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("MOTOR");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		panel_16_1.add(lblNewLabel_1_1_1_1_1);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(255, 255, 255));
		add(panel_17);
		panel_17.setLayout(null);
		
		JPanel panel_17_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_12.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_17_1.setBounds(204, 124, 373, 212);
		panel_17.add(panel_17_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("SISTEMA ELÉCTRICO");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(304, 58, 164, 19);
		panel_17.add(lblNewLabel_1_1_1_1_1_1);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 255, 255));
		add(panel_18);
		panel_18.setLayout(null);
		
		JPanel panel_18_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_13.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_18_1.setBounds(0, 43, 377, 322);
		panel_18.add(panel_18_1);
		
		JPanel panel_18_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_14.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_18_2.setBounds(376, 93, 414, 278);
		panel_18.add(panel_18_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("DIMENSIONES Y PESOS");
		lblNewLabel_1_1_1_1_1_1_2.setBounds(299, 11, 182, 19);
		panel_18.add(lblNewLabel_1_1_1_1_1_1_2);
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 255));
		add(panel_19);
		panel_19.setLayout(null);
		
		JPanel panel_19_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_15.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_19_1.setBounds(34, 39, 721, 368);
		panel_19.add(panel_19_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("TRANSMISIÓN Y CONTROLES ELECTRÓNICOS");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(196, 9, 353, 19);
		panel_19.add(lblNewLabel_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		add(panel_20);
		panel_20.setLayout(null);
		
		JPanel panel_20_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_16.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_20_1.setBounds(137, 79, 234, 215);
		panel_20.add(panel_20_1);
		
		JPanel panel_20_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849TestarossaSpider/img_17.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_20_2.setBounds(370, 79, 284, 227);
		panel_20.add(panel_20_2);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1 = new JLabel("NEÚMATICOS Y FRENOS");
		lblNewLabel_1_1_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1.setFont(new Font("Roboto ExtraBold", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_1.setBounds(276, 27, 202, 19);
		panel_20.add(lblNewLabel_1_1_1_1_1_1_2_1);

	}
}
