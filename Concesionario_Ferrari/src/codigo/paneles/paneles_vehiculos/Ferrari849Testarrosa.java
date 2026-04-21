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
import javax.swing.SwingConstants;

public class Ferrari849Testarrosa extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Ferrari849Testarrosa() {
		setPreferredSize(new Dimension(790, 2800));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_principal_gif = new JPanel();
			
	
		panel_principal_gif.setBackground(new Color(0, 0, 0));
		add(panel_principal_gif);
		panel_principal_gif.setLayout(null);
		
		JPanel panel = new JPanel() {	
	            private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari849Testarrosa/gif_1.gif")).getImage();

	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);

	                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
	            }
		};
		panel.setBounds(32, 0, 720, 400);
		panel_principal_gif.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Paquete Base");
		lblNewLabel_1.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(193, 193, 193));
		lblNewLabel_1.setBounds(185, 196, 139, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("<html>\r\nEmisiones: 212 G/KM <br>\r\nCarburante: 9,3 L/100 KM <br>\r\nEnergía eléctrica: 99 WH/KM\r\n</html>");
		lblNewLabel_1_1.setForeground(new Color(234, 234, 234));
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(185, 249, 185, 84);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("<html>\r\nEmisiones: 216 G/KM <br>\r\nCarburante: 9,5 L/100 KM <br>\r\nEnergía eléctrica: 103 WH/KM <br>\r\n</html>\r\n");
		lblNewLabel_1_1_1.setForeground(new Color(234, 234, 234));
		lblNewLabel_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(434, 249, 185, 84);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Paquete Fiorano");
		lblNewLabel_1_3.setForeground(new Color(193, 193, 193));
		lblNewLabel_1_3.setFont(new Font("Roboto", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(434, 196, 156, 29);
		panel_1.add(lblNewLabel_1_3);
		
		JPanel panel_8 = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/image_7.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_8.setBounds(138, 37, 506, 148);
		panel_1.add(panel_8);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_7 = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/image_1.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
			
		};
		panel_7.setBounds(34, 0, 720, 400);
		panel_2.add(panel_7);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_9 = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/image_2.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_9.setBounds(31, 0, 720, 253);
		panel_3.add(panel_9);
		
		JPanel panel_10 = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/image_3.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_10.setBounds(31, 252, 720, 148);
		panel_3.add(panel_10);
		
		JPanel panel_4 = new JPanel();
		add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblMotorDeCombustin_1 = new JLabel("<html>\r\nMOTOR DE<br>\r\nCOMBUSTIÓN<br>\r\nINTERNA\r\n</html>");
		lblMotorDeCombustin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotorDeCombustin_1.setForeground(Color.BLACK);
		lblMotorDeCombustin_1.setFont(new Font("Roboto ExtraBold", Font.PLAIN, 32));
		lblMotorDeCombustin_1.setBounds(56, 48, 218, 131);
		panel_4.add(lblMotorDeCombustin_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("<html>\r\nEl motor térmico del 849 Testarossa <br>\r\ncorresponde a la última evolución del <br>\r\ngalardonado V8 biturbo de Ferrari: entrega <br>\r\n830 CV —50 más que su predecesor— y <br>\r\nalcanza una potencia específica de 208 CV/l. <br>\r\nEste rendimiento se ha logrado sin modificar la <br>\r\ncilindrada, gracias a una revisión completa de <br>\r\nsus componentes.\r\n</html>");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(56, 190, 266, 161);
		panel_4.add(lblNewLabel_2_1);
		
		JPanel imagenMotorCombustionInterna = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/image_4.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		imagenMotorCombustionInterna.setBounds(368, 0, 382, 400);
		panel_4.add(imagenMotorCombustionInterna);
		
		JPanel panel_5 = new JPanel();
		add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblMotoresElctricosY_1 = new JLabel("<html>\r\nMOTORES <br>\r\nELÉCTRICOS Y <br>\r\nSISTEMA HÍBRIDO\r\n</html>");
		lblMotoresElctricosY_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotoresElctricosY_1.setForeground(Color.BLACK);
		lblMotoresElctricosY_1.setFont(new Font("Roboto ExtraBold", Font.PLAIN, 32));
		lblMotoresElctricosY_1.setBounds(56, 11, 284, 122);
		panel_5.add(lblMotoresElctricosY_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("<html>\r\nEl 849 Testarossa incorpora una arquitectura <br>\r\nPHEV inspirada en el SF90 Stradale, que <br>\r\ncombina el motor térmico V8 con tres <br>\r\npropulsores eléctricos para alcanzar una <br>\r\npotencia total de 220 CV. Dos de estos <br>\r\nmotores están ubicados en el eje delantero y <br> \r\nconforman el sistema RAC-e (Regulador <br>\r\nEléctrico de Ajuste de Curva), responsable de <br>\r\nhabilitar la tracción total (4WD) y el torque <br>\r\nvectoring, optimizando así la adherencia y la <br>\r\neficacia en la salida de las curvas. El tercer <br>\r\nmotor eléctrico, situado en el eje trasero, es el <br> \r\nMGU-K (Motor Generator Unit, Kinetic), <br>\r\nderivado directamente de la experiencia de la <br>\r\nScuderia Ferrari en la Fórmula 1.\r\n</html>");
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(56, 138, 258, 251);
		panel_5.add(lblNewLabel_2_1_1);
		
		JPanel panel_11 = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/image_5.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_11.setBounds(368, 0, 382, 400);
		panel_5.add(panel_11);
		
		JPanel panel_6 = new JPanel();
		add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_12 = new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari849Testarrosa/image_6.png")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            }
		};
		panel_12.setBounds(29, 0, 340, 400);
		panel_6.add(panel_12);
		
		JLabel lblMotoresElctricosY_1_1 = new JLabel("<html>\r\nSONIDO\r\n</html>");
		lblMotoresElctricosY_1_1.setBounds(429, 57, 118, 38);
		panel_6.add(lblMotoresElctricosY_1_1);
		lblMotoresElctricosY_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblMotoresElctricosY_1_1.setForeground(Color.BLACK);
		lblMotoresElctricosY_1_1.setFont(new Font("Roboto ExtraBold", Font.PLAIN, 32));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("<html>\r\nEl sonido en el habitáculo del nuevo modelo <br>\r\ntope de gama es potente y envolvente. <br>\r\nAdemás, el 849 Testarossa incorpora una <br>\r\nnueva dimensión acústica: la estrategia de <br>\r\ncambio, heredada del SF90 XX Stradale, ha <br>\r\nsido revisada para intensificar aún más la <br>\r\nexperiencia sonora al subir de marcha durante <br>\r\nla conducción deportiva.\r\n</html>");
		lblNewLabel_2_1_1_1.setBounds(429, 162, 251, 120);
		panel_6.add(lblNewLabel_2_1_1_1);
		lblNewLabel_2_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));

	}
}
