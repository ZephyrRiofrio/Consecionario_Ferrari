package codigo.paneles.paneles_vehiculos;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

public class Ferrari12Cilindri extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Ferrari12Cilindri() {
		setPreferredSize(new Dimension(790, 9200));
		setLayout(new GridLayout(23, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_21 = new JPanel() {
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari12Cilindri/Ferrari12Cilindri.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel.add(panel_21, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_22 = new JPanel();
		panel_22.setForeground(Color.RED);
		FlowLayout flowLayout = (FlowLayout) panel_22.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_22.setBackground(Color.BLACK);
		panel_22.setPreferredSize(new Dimension(10, 50));
		panel_1.add(panel_22, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("1 ----------------------------------------------------------------------- MOTOR");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 9));
		lblNewLabel.setForeground(Color.RED);
		panel_22.add(lblNewLabel);
		
		JPanel panel_23 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari12Cilindri/motor111.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_1.add(panel_23, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setForeground(Color.WHITE);
		add(panel_2);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(Color.WHITE);
		panel_2.add(panel_24);
		panel_24.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_26 = new JPanel();
		panel_24.add(panel_26);
		panel_26.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_28 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/t1.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		
		panel_26.add(panel_28, BorderLayout.CENTER);
		
		JPanel panel_27 = new JPanel();
		panel_24.add(panel_27);
		panel_27.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_29 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/motorim.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_27.add(panel_29, BorderLayout.CENTER);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(Color.WHITE);
		panel_2.add(panel_25);
		panel_25.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_30 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/t2.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_25.add(panel_30, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_33 = new JPanel();
		panel_33.setPreferredSize(new Dimension(10, 150));
		panel_3.add(panel_33, BorderLayout.NORTH);
		panel_33.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_35 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/ne.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		
		panel_33.add(panel_35, BorderLayout.CENTER);
		
		JPanel panel_34 = new JPanel();
		panel_3.add(panel_34, BorderLayout.CENTER);
		panel_34.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_36 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/est.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_34.add(panel_36, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(Color.BLACK);
		panel_37.setPreferredSize(new Dimension(10, 50));
		panel_4.add(panel_37, BorderLayout.NORTH);
		panel_37.setLayout(null);
		
		JLabel lblNewLabel2 = new JLabel("2 ----------------------------------------------------------------------- DISEÑO");
		lblNewLabel2.setBounds(0, 0, 177, 12);
		lblNewLabel2.setForeground(Color.RED);
		lblNewLabel2.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 9));
		lblNewLabel2.setBackground(Color.RED);
		panel_37.add(lblNewLabel2);
		
		JPanel panel_38 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/carro1.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_4.add(panel_38, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		
		add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(Color.BLACK);
		panel_39.setPreferredSize(new Dimension(10, 50));
		panel_5.add(panel_39, BorderLayout.NORTH);
		panel_39.setLayout(null);
		
		JLabel lblNewLabel3 = new JLabel("3 ----------------------------------------------------------------------- INTERIOR");
		lblNewLabel3.setBounds(0, 0, 374, 12);
		lblNewLabel3.setForeground(Color.RED);
		lblNewLabel3.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 9));
		lblNewLabel3.setBackground(Color.RED);
		panel_39.add(lblNewLabel3);
		
		JPanel panel_40 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/interior.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		
		panel_5.add(panel_40, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		add(panel_6);
		panel_6.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_41 = new JPanel();
		panel_6.add(panel_41);
		panel_41.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_43 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/volante.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_41.add(panel_43, BorderLayout.CENTER);
		
		JPanel panel_42 = new JPanel();
		panel_6.add(panel_42);
		panel_42.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_44 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/tvolante.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		
		panel_42.add(panel_44, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		add(panel_7);
		panel_7.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_45 = new JPanel();
		panel_7.add(panel_45);
		panel_45.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_47 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/tinterfas.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_45.add(panel_47, BorderLayout.CENTER);
		
		JPanel panel_46 = new JPanel();
		panel_7.add(panel_46);
		panel_46.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_48 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/interfas.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_46.add(panel_48, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		add(panel_8);
		panel_8.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_49 = new JPanel();
		panel_8.add(panel_49);
		panel_49.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_51 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/cabina.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_49.add(panel_51, BorderLayout.CENTER);
		
		JPanel panel_50 = new JPanel();
		panel_8.add(panel_50);
		panel_50.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_52 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/tcabina.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_50.add(panel_52, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(Color.BLACK);
		panel_53.setPreferredSize(new Dimension(10, 50));
		panel_9.add(panel_53, BorderLayout.NORTH);
		panel_53.setLayout(null);
		
		JLabel lblNewLabel4 = new JLabel("4 -----------------------------------------------------------------------CHASIS Y BWI");
		lblNewLabel4.setForeground(Color.RED);
		lblNewLabel4.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 9));
		lblNewLabel4.setBackground(Color.RED);
		lblNewLabel4.setBounds(0, 0, 374, 12);
		panel_53.add(lblNewLabel4);
		
		JPanel panel_54 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/chasis.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_9.add(panel_54, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(Color.BLACK);
		panel_55.setPreferredSize(new Dimension(10, 50));
		panel_10.add(panel_55, BorderLayout.NORTH);
		panel_55.setLayout(null);
		
		JLabel lblNewLabel5 = new JLabel("5 ----------------------------------------------------------------------- AERODINAMICA");
		lblNewLabel5.setBounds(0, 0, 322, 12);
		lblNewLabel5.setForeground(Color.RED);
		lblNewLabel5.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 9));
		lblNewLabel5.setBackground(Color.RED);
		panel_55.add(lblNewLabel5);
		
		JPanel panel_56 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/aero.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_10.add(panel_56, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		add(panel_11);
		panel_11.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_57 = new JPanel();
		panel_11.add(panel_57);
		panel_57.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_59 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/circuito.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_57.add(panel_59, BorderLayout.CENTER);
		
		JPanel panel_58 = new JPanel();
		panel_11.add(panel_58);
		panel_58.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_60 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/tcircuito.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_58.add(panel_60, BorderLayout.CENTER);
		
		JPanel panel_12 = new JPanel();
		add(panel_12);
		panel_12.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_61 = new JPanel();
		panel_12.add(panel_61);
		panel_61.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_63 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/tcarga.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_61.add(panel_63, BorderLayout.CENTER);
		
		JPanel panel_62 = new JPanel();
		panel_12.add(panel_62);
		panel_62.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_64 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/carga.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_62.add(panel_64, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		add(panel_13);
		panel_13.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_65 = new JPanel();
		panel_13.add(panel_65);
		panel_65.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_67 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/aerodinamica.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_65.add(panel_67, BorderLayout.CENTER);
		
		JPanel panel_66 = new JPanel();
		panel_13.add(panel_66);
		panel_66.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_68 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/taerodinamica.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_66.add(panel_68, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		add(panel_14);
		panel_14.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_69 = new JPanel();
		panel_14.add(panel_69);
		panel_69.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_71 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/textractor.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_69.add(panel_71, BorderLayout.CENTER);
		
		JPanel panel_70 = new JPanel();
		panel_14.add(panel_70);
		panel_70.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_72 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/extractor.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_70.add(panel_72, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_73 = new JPanel();
		panel_73.setBackground(Color.BLACK);
		panel_73.setPreferredSize(new Dimension(10, 50));
		panel_15.add(panel_73, BorderLayout.NORTH);
		panel_73.setLayout(null);
		
		JLabel LBL6 = new JLabel("6 ----------------------------------------------------------------------- ESPECIFICACIONES TECNICAS");
		LBL6.setBounds(0, 0, 351, 12);
		LBL6.setForeground(Color.RED);
		LBL6.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 9));
		LBL6.setBackground(Color.RED);
		panel_73.add(LBL6);
		
		JPanel panel_74 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/tecnicas.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_15.add(panel_74, BorderLayout.CENTER);
		
		JPanel panel_16 = new JPanel();
		add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_75 = new JPanel();
		panel_75.setBackground(Color.WHITE);
		panel_75.setPreferredSize(new Dimension(10, 75));
		panel_16.add(panel_75, BorderLayout.NORTH);
		panel_75.setLayout(null);
		
		JLabel lblrendimiento = new JLabel("RENDIMIENTO");
		lblrendimiento.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 35));
		lblrendimiento.setBounds(10, 11, 286, 53);
		panel_75.add(lblrendimiento);
		
		JPanel panel_77 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/1rendimiento.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_16.add(panel_77, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_76 = new JPanel();
		panel_76.setBackground(Color.WHITE);
		panel_76.setPreferredSize(new Dimension(10, 75));
		panel_17.add(panel_76, BorderLayout.NORTH);
		panel_76.setLayout(null);
		
		JLabel lblMotor = new JLabel("MOTOR");
		lblMotor.setBounds(10, 11, 215, 42);
		lblMotor.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 35));
		panel_76.add(lblMotor);
		
		JPanel panel_78 = new JPanel();
		panel_78.setPreferredSize(new Dimension(10, 115));
		panel_17.add(panel_78, BorderLayout.SOUTH);
		panel_78.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_80 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/2motor.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_80.setPreferredSize(new Dimension(440, 10));
		panel_78.add(panel_80, BorderLayout.WEST);
		
		JPanel panel_81 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/2motor.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_81.setPreferredSize(new Dimension(350, 10));
		panel_78.add(panel_81, BorderLayout.EAST);
		
		JPanel panel_79 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/1motor.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_17.add(panel_79, BorderLayout.CENTER);
		
		JPanel panel_18 = new JPanel();
		add(panel_18);
		panel_18.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_82 = new JPanel();
		panel_82.setBackground(Color.WHITE);
		panel_82.setPreferredSize(new Dimension(10, 100));
		panel_18.add(panel_82, BorderLayout.NORTH);
		panel_82.setLayout(null);
		
		JLabel lbltrans = new JLabel("TRANSMISION Y");
		lbltrans.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 20));
		lbltrans.setBounds(10, 11, 149, 29);
		panel_82.add(lbltrans);
		
		JLabel lblControles = new JLabel("ELECTRONICOS");
		lblControles.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 20));
		lblControles.setBounds(10, 60, 149, 29);
		panel_82.add(lblControles);
		
		JLabel lblControles_1 = new JLabel("CONTROLES");
		lblControles_1.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 20));
		lblControles_1.setBounds(10, 35, 149, 29);
		panel_82.add(lblControles_1);
		
		JPanel panel_83 = new JPanel();
		panel_83.setPreferredSize(new Dimension(395, 10));
		panel_18.add(panel_83, BorderLayout.WEST);
		panel_83.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_85 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/1controles.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_83.add(panel_85, BorderLayout.CENTER);
		
		JPanel panel_84 = new JPanel();
		panel_84.setPreferredSize(new Dimension(395, 10));
		panel_18.add(panel_84, BorderLayout.EAST);
		panel_84.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_86 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/2controles.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_84.add(panel_86, BorderLayout.CENTER);
		
		JPanel panel_19 = new JPanel();
		add(panel_19);
		panel_19.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_87 = new JPanel();
		panel_87.setBackground(Color.WHITE);
		panel_87.setPreferredSize(new Dimension(10, 75));
		panel_19.add(panel_87, BorderLayout.NORTH);
		panel_87.setLayout(null);
		
		JLabel lbldimensiones = new JLabel("DIMESIONES Y PESOS");
		lbldimensiones.setBounds(10, 11, 382, 42);
		lbldimensiones.setBackground(Color.WHITE);
		lbldimensiones.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 35));
		panel_87.add(lbldimensiones);
		
		JPanel panel_88 = new JPanel();
		panel_88.setPreferredSize(new Dimension(395, 10));
		panel_19.add(panel_88, BorderLayout.WEST);
		panel_88.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_90 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/1dimension.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_88.add(panel_90, BorderLayout.CENTER);
		
		JPanel panel_89 = new JPanel();
		panel_89.setPreferredSize(new Dimension(395, 10));
		panel_19.add(panel_89, BorderLayout.EAST);
		panel_89.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_91 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/2dimension.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_89.add(panel_91, BorderLayout.CENTER);
		
		JPanel panel_20 = new JPanel();
		add(panel_20);
		panel_20.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_92 = new JPanel();
		panel_92.setBackground(Color.WHITE);
		panel_92.setPreferredSize(new Dimension(10, 75));
		panel_20.add(panel_92, BorderLayout.NORTH);
		panel_92.setLayout(null);
		
		JLabel lblneumaticos = new JLabel("NEUMÁTICOS Y FRENOS");
		lblneumaticos.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 35));
		lblneumaticos.setBackground(Color.WHITE);
		lblneumaticos.setBounds(10, 11, 382, 42);
		panel_92.add(lblneumaticos);
		
		JPanel panel_93 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/neumaticos.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_20.add(panel_93, BorderLayout.CENTER);
		
		JPanel panel_31 = new JPanel();
		add(panel_31);
		panel_31.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_94 = new JPanel();
		panel_94.setBackground(Color.WHITE);
		panel_94.setPreferredSize(new Dimension(10, 80));
		panel_31.add(panel_94, BorderLayout.NORTH);
		panel_94.setLayout(null);
		
		JLabel lblco1 = new JLabel("CONSUMO/EMISIONES");
		lblco1.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 30));
		lblco1.setBackground(Color.WHITE);
		lblco1.setBounds(10, 11, 304, 36);
		panel_94.add(lblco1);
		
		JLabel lblco2 = new JLabel("DE CO2");
		lblco2.setFont(new Font("Roboto Condensed ExtraBold", Font.BOLD, 30));
		lblco2.setBackground(Color.WHITE);
		lblco2.setBounds(10, 44, 304, 36);
		panel_94.add(lblco2);
		
		JPanel panel_95 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari12Cilindri/co2.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_31.add(panel_95, BorderLayout.CENTER);
		
		JPanel panel_32 = new JPanel();
		add(panel_32);
		panel_32.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_96 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/gifs/gifs_vehiculos/gifs_Ferrari12Cilindri/0ultimo.gif")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_32.add(panel_96, BorderLayout.CENTER);

	}
}
