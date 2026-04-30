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

public class Ferrari296GTB extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public Ferrari296GTB() {
		setPreferredSize(new Dimension(790, 9408));
		setLayout(new GridLayout(24, 1, 0, 0));
		
		JPanel gif_presentacion = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari296GTB/intro_presentacion.gif")).getImage();

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
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_1.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_1.setBackground(new Color(0, 0, 0));
		panel_1_1.setBounds(0, 0, 790, 283);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblDiseadoParaSuperar = new JLabel("FERRARI 296 GTB");
		lblDiseadoParaSuperar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiseadoParaSuperar.setForeground(Color.WHITE);
		lblDiseadoParaSuperar.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 38));
		lblDiseadoParaSuperar.setBackground(Color.BLACK);
		lblDiseadoParaSuperar.setBounds(124, 127, 514, 51);
		panel_1_1.add(lblDiseadoParaSuperar);
		
		JPanel panel_1_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_2.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_1_2.setBackground(new Color(0, 0, 0));
		panel_1_2.setBounds(0, 281, 790, 119);
		panel_1.add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblElGtb = new JLabel("<html><body style='text-align: center;'>\r\nEl 296 GTB, la evolución del concepto de berlinetta deportiva biplaza con motor central-trasero de Ferrari, supone toda una revolución para la Casa de Maranello al incluir un nuevo motor V6 de 120º acoplado a un motor eléctrico enchufable o plug-in (PHEV) capaz de entregar hasta 830 CV. Este coche una vez más redefine la idea de diversión al volante para garantizar la máxima emoción, no solo cuando se buscan las máximas prestaciones, sino también en su uso diario\r\n</body></html>");
		lblElGtb.setHorizontalAlignment(SwingConstants.CENTER);
		lblElGtb.setForeground(Color.WHITE);
		lblElGtb.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lblElGtb.setBackground(Color.BLACK);
		lblElGtb.setBounds(134, 23, 495, 85);
		panel_1_2.add(lblElGtb);
		
		JPanel panel_2 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_3.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_2.setBackground(new Color(0, 0, 0));
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCompacidadYModernidad = new JLabel("DISEÑO");
		lblCompacidadYModernidad.setBounds(217, 157, 334, 79);
		panel_2.add(lblCompacidadYModernidad);
		lblCompacidadYModernidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompacidadYModernidad.setForeground(Color.WHITE);
		lblCompacidadYModernidad.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 56));
		lblCompacidadYModernidad.setBackground(Color.BLACK);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_3_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_4.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_3_1.setBounds(394, 0, 396, 392);
		panel_3.add(panel_3_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("<html>\r\nCOMPACIDAD Y MODERNIDAD\r\n</html>");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_3_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1.setBackground(Color.BLACK);
		lblNewLabel_3_1.setBounds(41, 43, 313, 67);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("<html>\r\nEl diseño del 296 GTB redefine la identidad de la berlinetta Ferrari con motor central-trasero, dotando al automóvil de una línea compacta, moderna y original. Gracias a su batalla corta y a su aspecto monolítico, es la berlinetta más compacta que ha construido Ferrari en la última década. El Centro Stile Ferrari ha abandonado la típica disposición fastback de las berlinettas y se ha centrado en el concepto de un habitáculo situado dentro de una poderosa volumetría, resultado de su batalla corta y de algunos elementos como los musculosos guardabarros, el techo de visera, los arcos rampantes y una novedosa luneta vertical\r\n</html>");
		lblNewLabel_2_1_1_1_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1.setBounds(41, 121, 278, 216);
		panel_3.add(lblNewLabel_2_1_1_1_2_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_4_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_4_mitad.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_4_1.setBounds(0, 0, 395, 392);
		panel_4.add(panel_4_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("<html>\r\nESTILO ITALIANO Y TRADICIÓN\r\n</html>");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_1.setBounds(431, 36, 313, 67);
		panel_4.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_1 = new JLabel("<html>\r\nEl 296 GTB parece surgir de un solo trazo de lápiz, sin efectos ópticos de aclaración ni contrastes cromáticos. El coche tiene una identidad única, que reescribe las reglas mientras redescubre los principios de un diseño marcadamente italiano donde la limpieza de sus formas y sus uniones bien definidas acentúan la deportividad de este digno heredero de una filosofía muy arraigada en la tradición de Ferrari. Su modernidad encuentra referencias válidas en los coches de los años 60 caracterizados por la simplicidad y la funcionalidad, como el 250 LM de 1963, que ha aportado notables elementos de inspiración como el corte del montante «B», los guardabarros traseros y la coda tronca\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_1.setBounds(431, 118, 278, 244);
		panel_4.add(lblNewLabel_2_1_1_1_2_1_1);
		
		JPanel panel_5 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_5.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_5.setBackground(new Color(0, 0, 0));
		add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblAerodinmica = new JLabel("AERODINÁMICA");
		lblAerodinmica.setHorizontalAlignment(SwingConstants.CENTER);
		lblAerodinmica.setForeground(Color.WHITE);
		lblAerodinmica.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 56));
		lblAerodinmica.setBackground(Color.BLACK);
		lblAerodinmica.setBounds(81, 158, 621, 79);
		panel_5.add(lblAerodinmica);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_6_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_6.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_6_1.setBounds(394, 0, 397, 392);
		panel_6.add(panel_6_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("<html>\r\nINNOVACIÓN AL PODER\r\n</html>");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2.setForeground(Color.BLACK);
		lblNewLabel_3_1_2.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2.setBackground(Color.BLACK);
		lblNewLabel_3_1_2.setBounds(41, 48, 313, 67);
		panel_6.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2 = new JLabel("<html>\r\nEl 296 GTB irrumpe en el segmento de las berlinettas deportivas con soluciones aerodinámicas radicales e innovadoras. De hecho, el turbocompresor en la \"V\" del bloque motor mejora la gestión térmica del compartimento motor y de los componentes eléctricos. La discontinuidad se evidencia gracias a la inversión de un paradigma de Ferrari en la aerodinámica activa de los últimos años, ya que en el 296 GTB, el uso de un dispositivo activo no está destinado a gestionar la resistencia al avance, sino a generar una carga adicional\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2.setBounds(41, 126, 278, 200);
		panel_6.add(lblNewLabel_2_1_1_1_2_1_2);
		
		JPanel panel_7 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_7.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_7.setBackground(new Color(0, 0, 0));
		add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblDinmicaDelVehculo = new JLabel("<html><body style='text-align: center;'>\r\nDINÁMICA DEL VEHÍCULO\r\n</body></html>");
		lblDinmicaDelVehculo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDinmicaDelVehculo.setForeground(Color.WHITE);
		lblDinmicaDelVehculo.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 42));
		lblDinmicaDelVehculo.setBackground(Color.BLACK);
		lblDinmicaDelVehculo.setBounds(81, 158, 621, 121);
		panel_7.add(lblDinmicaDelVehculo);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_8_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_8.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_8_1.setBounds(394, 0, 396, 392);
		panel_8.add(panel_8_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("<html>\r\nFUNCIONES DE CONTROL EVOLUCIONADAS\r\n</html>");
		lblNewLabel_3_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_2_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_2_1.setBounds(41, 52, 313, 91);
		panel_8.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2_1 = new JLabel("<html>\r\nEl desarrollo dinámico del 296 GTB tenía como objetivo aumentar las\r\nprestaciones del coche, ofrecer la máxima diversión al volante en su categoría,\r\nasí como mejorar la usabilidad de sus prestaciones y la configuración híbrida.\r\nAdemás, se han desarrollado nuevos componentes, como el actuador TMA y el\r\nsensor body ECS, o funciones, como el controlador \"ABS evo\", que es\r\nuna primicia absoluta, junto con el estimador de grip integrado en el EPS\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2_1.setBounds(41, 154, 278, 178);
		panel_8.add(lblNewLabel_2_1_1_1_2_1_2_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 255, 255));
		add(panel_9);
		panel_9.setLayout(null);
		
		JPanel panel_9_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_9.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_9_1.setBounds(394, 0, 396, 392);
		panel_9.add(panel_9_1);
		
		JLabel lblNewLabel_3_1_2_1_1 = new JLabel("<html>\r\n¿EN QUÉ CONSISTE LA DIVERSIÓN AL VOLANTE?\r\n</html>");
		lblNewLabel_3_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_2_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_2_1_1.setBounds(41, 38, 313, 98);
		panel_9.add(lblNewLabel_3_1_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2_1_1 = new JLabel("<html>\r\nEn Ferrari, el concepto de diversión al volante o fun to drive se asienta en cinco indicadores:<br>\r\n1. Lateral: respuesta a los mandos del volante, sensación de reactividad de la parte trasera, facilidad de manejo<br>\r\n2. Longitudinal: rapidez y constancia de la curva de respuesta al acelerador<br>\r\n3. Cambios: tiempos de cambio, sensación de progresión de las marchas en cada cambio de marcha<br>\r\n4. Frenado: tacto del pedal de freno, tanto en recorrido como en respuesta (eficacia y modulabilidad)<br>\r\n5. Sonido: nivel y calidad en el habitáculo, y progresividad del sonido del motor al aumentar las revoluciones<br>\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2_1_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2_1_1.setBounds(41, 134, 292, 232);
		panel_9.add(lblNewLabel_2_1_1_1_2_1_2_1_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		add(panel_10);
		panel_10.setLayout(null);
		
		JPanel panel_10_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_10.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_10_1.setBounds(394, 0, 396, 392);
		panel_10.add(panel_10_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1 = new JLabel("<html>\r\nPOTENCIA EXPLOSIVA, CONTROL AVANZADO\r\n</html>");
		lblNewLabel_3_1_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1.setBounds(41, 32, 285, 115);
		panel_10.add(lblNewLabel_3_1_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2_1_1_1 = new JLabel("<html>\r\nLa usabilidad de las prestaciones es de gran importancia en el 296 GTB. A modo de ejemplo, la conducción eléctrica en modo eDrive permite alcanzar una velocidad de 135 km/h sin ayuda del motor de combustión. En el modo Hybrid, el motor de combustión solo apoya al motor eléctrico si se requieren mayores prestaciones. Las distancias de frenado en superficies secas se han reducido significativamente gracias al nuevo «ABS evo» y su integración con el nuevo sensor 6w-CDS, que también garantiza una mayor repetibilidad de la acción de frenado\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2_1_1_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2_1_1_1.setBounds(41, 158, 292, 198);
		panel_10.add(lblNewLabel_2_1_1_1_2_1_2_1_1_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_11_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_10_mitad.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_11_1.setBounds(0, 0, 396, 392);
		panel_11.add(panel_11_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1_1 = new JLabel("<html>\r\nAGILIDAD Y REACTIVIDAD\r\n</html>");
		lblNewLabel_3_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1.setBounds(431, 49, 285, 115);
		panel_11.add(lblNewLabel_3_1_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2_1_1_1_1 = new JLabel("<html>\r\nEl chasis tiene una batalla 50 mm más corta que las anteriores berlinettas con motor central-trasero de Ferrari, solución que mejora su agilidad dinámica. Cabe destacar el sistema brake-by-wire  o freno por cable, y la renovada pinza de frenos \"Aero\", junto con los amortiguadores magnetoreológicos SCM-Frs\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1.setBounds(431, 147, 292, 141);
		panel_11.add(lblNewLabel_2_1_1_1_2_1_2_1_1_1_1);
		
		JPanel panel_12 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_11.png")).getImage();

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
		lblInterior.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 56));
		lblInterior.setBackground(Color.BLACK);
		lblInterior.setBounds(177, 157, 431, 79);
		panel_12.add(lblInterior);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 255));
		add(panel_13);
		panel_13.setLayout(null);
		
		JPanel panel_13_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_12.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_13_1.setBounds(394, 0, 396, 392);
		panel_13.add(panel_13_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1_1_1 = new JLabel("<html>\r\nLA VERTIENTE REFINADA DIGITAL\r\n</html>");
		lblNewLabel_3_1_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2_1_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1_1.setBounds(41, 40, 285, 103);
		panel_13.add(lblNewLabel_3_1_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_1 = new JLabel("<html>\r\nEl habitáculo del coche se ha\r\ndesarrollado en torno a la interfaz full-digital introducida en el SF90 Stradale. Si, en el SF90 Stradale, la intención eradestacar la tecnología avanzada y la ruptura con el pasado, en el 296 GTB, laidea era lograr que el contenido técnico presentara un aspecto elegante. La sensación obtenida es pura y se caracteriza por una elegancia exquisita, además de estar\r\nen consonancia con el diseño del exterior\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_1.setBounds(41, 137, 292, 157);
		panel_13.add(lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_1);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		add(panel_14);
		panel_14.setLayout(null);
		
		JPanel panel_14_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_12_mitad.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_14_1.setBounds(0, 0, 396, 392);
		panel_14.add(panel_14_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1_1_1_1 = new JLabel("<html>\r\nPILOTO Y COPILOTO\r\n</html>");
		lblNewLabel_3_1_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2_1_1_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1_1_1.setBounds(431, 41, 239, 93);
		panel_14.add(lblNewLabel_3_1_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2 = new JLabel("<html>\r\nGran parte de la\r\ninstrumentación se concentra en el lado del piloto. El habitáculo está creado\r\npor una apertura en la tapicería del salpicadero del que salen el volante y el\r\npanel de instrumentos, apoyado en la parte central por dos soportes visibles\r\nque convergen en el salpicadero. La figura está cerrada por dos satélites\r\nlaterales que acogen un área capacitiva. La zona del pasajero tiene un aspecto\r\nminimalista con una pantalla que ofrece la posibilidad de vivir el viaje de\r\nforma participativa, prácticamente como un copiloto\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2.setBounds(431, 134, 292, 194);
		panel_14.add(lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2);
		
		JPanel panel_15 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_13.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_15.setBackground(new Color(0, 0, 0));
		add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblAssettoFiorano = new JLabel("<html><body style='text-align: center;'>\r\nASSETTO FIORANO\r\n</body></html>");
		lblAssettoFiorano.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssettoFiorano.setForeground(Color.WHITE);
		lblAssettoFiorano.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 42));
		lblAssettoFiorano.setBackground(Color.BLACK);
		lblAssettoFiorano.setBounds(77, 157, 621, 121);
		panel_15.add(lblAssettoFiorano);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_16_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_14.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_16_1.setBounds(394, 0, 396, 392);
		panel_16.add(panel_16_1);
		
		JLabel lblNewLabel_3_1_2_1_1_1_1_1_1_1 = new JLabel("<html>\r\nCONFIGURACIÓN DE PISTA\r\n</html>");
		lblNewLabel_3_1_2_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1_1_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 22));
		lblNewLabel_3_1_2_1_1_1_1_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_3_1_2_1_1_1_1_1_1_1.setBounds(41, 23, 279, 61);
		panel_16.add(lblNewLabel_3_1_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2_1 = new JLabel("<html>\r\nPara aumentar aún más sus prestaciones, el 296 GTB, se puede configurar en la versión Assetto Fiorano. Esta configuración incluye elementos aerodinámicos y reducción del peso, entre los que destacan los amortiguadores Multimatic derivados de las carreras GT con regulación fija (optimizada para su uso en circuito), los apéndices en fibra de carbono con alta carga en el parachoques delantero, y el uso extensivo de materiales ligeros tanto en el interior como en el exterior. La estructura de algunos componentes, incluido el panel de la puerta, se ha rediseñado por completo para reducir el peso global en más de 12 kg. Además de la luneta trasera ultraligera de Lexan®, el Assetto Fiorano también ofrece una librea inspirada en el 250 LM, que parte del parachoques delantero con un diseño que envuelve la parrilla central y perfila sus contornos, continuando, primero, por el capó y, luego, longitudinalmente hasta el techo y el alerón trasero\r\n</html>");
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2_1.setFont(new Font("Ferrari Sans", Font.PLAIN, 10));
		lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2_1.setBounds(41, 84, 292, 297);
		panel_16.add(lblNewLabel_2_1_1_1_2_1_2_1_1_1_1_2_1);
		
		JPanel panel_17 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_15.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_17.setBackground(new Color(0, 0, 0));
		add(panel_17);
		panel_17.setLayout(null);
		
		JLabel lblEspecificacionesTcnicas = new JLabel("<html><body style='text-align: center;'>\r\nESPECIFICACIONES TÉCNICAS\r\n</body></html>");
		lblEspecificacionesTcnicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspecificacionesTcnicas.setForeground(Color.WHITE);
		lblEspecificacionesTcnicas.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 42));
		lblEspecificacionesTcnicas.setBackground(Color.BLACK);
		lblEspecificacionesTcnicas.setBounds(70, 146, 621, 121);
		panel_17.add(lblEspecificacionesTcnicas);
		
		JPanel panel_18 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_16.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_18);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1 = new JLabel("RENDIMIENTO");
		lblNewLabel_1_1_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		panel_18.add(lblNewLabel_1_1_1_1_1_1_2_1);
		
		JPanel panel_19 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_17.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_19);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1 = new JLabel("MOTOR");
		lblNewLabel_1_1_1_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		panel_19.add(lblNewLabel_1_1_1_1_1_1_2_1_1);
		
		JPanel panel_20 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_18.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_20);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1_1 = new JLabel("DIMENSIONES Y PESOS");
		lblNewLabel_1_1_1_1_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		panel_20.add(lblNewLabel_1_1_1_1_1_1_2_1_1_1);
		
		JPanel panel_21 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_19.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_21);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1_1_1 = new JLabel("CONTROLES ELECTRÓNICOS");
		lblNewLabel_1_1_1_1_1_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_1_1_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		panel_21.add(lblNewLabel_1_1_1_1_1_1_2_1_1_1_1);
		
		JPanel panel_22 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_20.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		add(panel_22);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1_1_2 = new JLabel("NEUMÁTICOS Y FRENOS");
		lblNewLabel_1_1_1_1_1_1_2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_1_1_2.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		panel_22.add(lblNewLabel_1_1_1_1_1_1_2_1_1_1_2);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		add(panel_23);
		panel_23.setLayout(null);
		
		JPanel panel_23_1 = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari296GTB/img_21.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_23_1.setBounds(247, 68, 286, 301);
		panel_23.add(panel_23_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2_1_1_1_2_1 = new JLabel("CONSUMO/EMISIONES DE CO2");
		lblNewLabel_1_1_1_1_1_1_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_2_1_1_1_2_1.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 16));
		lblNewLabel_1_1_1_1_1_1_2_1_1_1_2_1.setBounds(220, 27, 355, 20);
		panel_23.add(lblNewLabel_1_1_1_1_1_1_2_1_1_1_2_1);

	}
}
