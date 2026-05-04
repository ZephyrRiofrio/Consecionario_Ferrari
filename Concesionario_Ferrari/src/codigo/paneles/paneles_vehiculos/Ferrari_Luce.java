package codigo.paneles.paneles_vehiculos;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Insets;
import java.awt.Cursor;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

public class Ferrari_Luce extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel1Luce;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	private JPanel panel10;
	private JPanel panel11;
	private JPanel panel12;
	private JPanel panel13;
	private JPanel panel14;
	private JPanel panel15;
	private JPanel panel16;
	private JPanel panel17;
	private JPanel panel18;
	private JPanel panel19;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JPanel panel_24;
	private JPanel panel_25;
	private JPanel panel_26;
	private JPanel panel_27;
	private JPanel panel_28;
	private JPanel panel_29;
	private JPanel panel_30;
	private JPanel panel_31;
	private JPanel panel_32;
	private JPanel logoFLuce;
	private JLabel lblNewLabel;
	private JPanel PImg1;
	private JPanel texto;
	private JLabel lblNewLabel_1;
	private JPanel txt1;
	private JPanel txt2;
	private JPanel img2;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPanel PImg3;
	private JLabel lblNewLabel_5;
	private JPanel panel;
	private JPanel PCentro;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel PImg101112;
	private JLabel lblNewLabel_7;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel p6img1;
	private JPanel p6img2;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JPanel panel_33;
	private JPanel panel_34;
	private JPanel panel_35;
	private JPanel panel_36;
	private JPanel imgC;
	private JPanel panel_37;
	private JPanel panel_38;
	private JPanel panel_39;
	private JPanel panel_40;
	private JPanel imgC2;
	private JPanel panel_41;
	private JPanel panel_42;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JPanel panel_6;
	private JPanel panel_43;
	private JPanel panel_44;
	private JPanel panel_45;
	private JPanel P7img;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JPanel panel_7;
	private JPanel panel_46;
	private JPanel panel_47;
	private JPanel panel_48;
	private JPanel panel_49;
	private JPanel panel_50;
	private JPanel panel_51;
	private JPanel panel_52;
	private JPanel panel_53;
	private JPanel panel_54;
	private JPanel panel_55;
	private JPanel P8img1;
	private JPanel P8img2;
	private JPanel panel_56;
	private JPanel panel_57;
	private JPanel panel_58;
	private JPanel panel_59;
	private JPanel panel_60;
	private JPanel panel_61;
	private JPanel P8txt1;
	private JPanel P8txt2;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JPanel panel_8;
	private JPanel panel_62;
	private JPanel panel_63;
	private JPanel panel_64;
	private JPanel P9gif;
	private JPanel panel_66;
	private JPanel panel_67;
	private JLabel lblNewLabel_21;
	private JPanel panel_9;
	private JPanel panel_65;
	private JPanel P10img;
	private JPanel panel_69;
	private JLabel lblNewLabel_22;
	private JPanel panel_68;
	private JPanel panel_70;
	private JPanel img10;
	private JLabel lblNewLabel_23;
	private JPanel panel_10;
	private JPanel panel_71;
	private JPanel panel_72;
	private JPanel panel_73;
	private JPanel panel_74;
	private JPanel panel_75;
	private JPanel P11img;
	private JPanel panel_76;
	private JPanel panel_77;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JPanel panel_78;
	private JPanel panel_79;
	private JPanel panel_80;
	private JPanel panel_81;
	private JPanel panel_82;
	private JPanel panel_83;
	private JPanel panel_84;
	private JPanel panel_11;
	private JPanel panel_85;
	private JPanel panel_86;
	private JPanel P12img;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_26;
	private JPanel panel_12;
	private JPanel panel_87;
	private JPanel panel_88;
	private JPanel panel_89;
	private JPanel panel_90;
	private JPanel panel_91;
	private JPanel panel_92;
	private JPanel panel_93;
	private JPanel panel_94;
	private JPanel P13gif;
	private JLabel lblNewLabel_28;
	private JPanel panel_13;
	private JPanel panel_95;
	private JLabel lblNewLabel_29;
	private JPanel panel_96;
	private JPanel panel_97;
	private JPanel panel_98;
	private JPanel panel_99;
	private JPanel P14img;
	private JLabel lblNewLabel_30;
	
	private JLabel imgs;
	private JPanel panel_14;
	private JPanel panel_100;
	private JPanel panel_101;
	private JPanel panel_102;
	private JPanel panel_103;
	private JPanel panel_104;
	private JPanel panel_105;
	private JPanel panel_106;
	private JPanel panel_107;
	private JPanel panel_108;
	private JPanel panel_109;
	private JPanel panel_110;
	private JPanel panel_111;
	private JPanel panel_112;
	private JPanel panel_113;
	private JPanel panel_114;
	private JPanel panel_115;
	private JPanel panel_116;
	private JPanel panel_117;
	private JPanel panel_118;
	private JPanel PCImg1;
	private JPanel PCImg2;
	private JPanel PCImg3;
	private JLabel img1;
	private JLabel imG2;
	private JLabel img3;
	private JLabel sig;
	private JLabel atras;
	private JPanel panel_119;
	private JPanel panel_120;
	private JPanel panel_121;
	private JPanel panel_122;
	private JPanel P15gif;
	private JLabel lblNewLabel_31;
	private JPanel panel_15;
	private JPanel panel_123;
	private JPanel panel_124;
	private JPanel panel_125;
	private JPanel P16gif;
	private JPanel panel_126;
	private JPanel panel_127;
	private JPanel panel_16;
	private JPanel panel_128;
	private JLabel lblNewLabel_32;
	private JPanel panel_129;
	private JPanel panel_130;
	private JPanel P16img;
	private JLabel lblNewLabel_33;
	private JPanel panel_17;
	private JPanel panel_131;
	private JPanel panel_132;
	private JPanel panel_133;
	private JPanel P18gif;
	private JLabel lblNewLabel_34;
	private JPanel panel_18;
	private JPanel panel_134;

	/**
	 * Create the panel.
	 */
	public Ferrari_Luce() {
		setPreferredSize(new Dimension(790, 19800));
		setLayout(new GridLayout(33, 0, 0, 0));
		
		panel1Luce = new JPanel();
		add(panel1Luce);
		panel1Luce.setLayout(new BorderLayout(0, 0));
		
		logoFLuce = new JPanel();
		logoFLuce.setBackground(new Color(0, 0, 0));
		logoFLuce.setPreferredSize(new Dimension(790, 50));
		panel1Luce.add(logoFLuce, BorderLayout.NORTH);
		logoFLuce.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setPreferredSize(new Dimension(250, 45));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIcon(new ImageIcon(Ferrari_Luce.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/logo_luce.jpg")));
		logoFLuce.add(lblNewLabel);
		
		PImg1 = (JPanel) ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img1.jpg", 0, 0);
		panel1Luce.add(PImg1, BorderLayout.CENTER);
		
		texto = new JPanel();
		texto.setForeground(new Color(255, 255, 255));
		texto.setBackground(new Color(0, 0, 0));
		texto.setPreferredSize(new Dimension(790, 150));
		panel1Luce.add(texto, BorderLayout.SOUTH);
		
		lblNewLabel_1 = new JLabel
				("<html><center> Un primer vistazo al interior y la interfaz del Ferrari Luce. Cada<br>\r\n"
				+ "elemento ha sido diseñado y fabricado meticulosamente para resultar<br>\r\n"
				+ "funcional, intuitivo y emocionante de conducir.</center></html>");
		lblNewLabel_1.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		lblNewLabel_1.setPreferredSize(new Dimension(400, 145));
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		texto.add(lblNewLabel_1);
		
		panel_18 = new JPanel();
		panel_18.setBackground(new Color(0, 0, 0));
		panel_18.setPreferredSize(new Dimension(20, 10));
		panel1Luce.add(panel_18, BorderLayout.WEST);
		
		panel_134 = new JPanel();
		panel_134.setPreferredSize(new Dimension(20, 10));
		panel_134.setBackground(new Color(0, 0, 0));
		panel1Luce.add(panel_134, BorderLayout.EAST);
		
		panel2 = new JPanel();
		add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		txt1 = new JPanel();
		txt1.setBackground(new Color(250, 250, 250));
		txt1.setBorder(null);
		txt1.setPreferredSize(new Dimension(790, 70));
		txt1.setFont(new Font("Host Grotesk", Font.BOLD, 15));
		panel2.add(txt1, BorderLayout.NORTH);
		
		lblNewLabel_2 = new JLabel("<html><center>\r\nENTRADA Y SALIDA\r\n</center></html>");
		lblNewLabel_2.setBackground(new Color(250, 250, 250));
		lblNewLabel_2.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 20));
		lblNewLabel_2.setPreferredSize(new Dimension(192, 65));
		txt1.add(lblNewLabel_2);
		
		txt2 = new JPanel();
		txt2.setBackground(new Color(250, 250, 250));
		FlowLayout flowLayout = (FlowLayout) txt2.getLayout();
		txt2.setPreferredSize(new Dimension(790, 100));
		panel2.add(txt2, BorderLayout.SOUTH);
		
		lblNewLabel_3 = new JLabel("<html><center>\r\nLa interfaz del Ferrari Luce se ha concebido con principios organizativos claros. Los<br>\r\ncontroles y pantallas están agrupados de forma funcional, con los comandos y la<br>\r\ninformación esenciales directamente frente al conductor.</center></html>");
		lblNewLabel_3.setBackground(new Color(250, 250, 250));
		lblNewLabel_3.setPreferredSize(new Dimension(480, 95));
		lblNewLabel_3.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		txt2.add(lblNewLabel_3);
		
		img2 = (JPanel) ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img2.jpg", 0, 0);
	    panel2.add(img2, BorderLayout.CENTER);
		
		panel3 = new JPanel();
		add(panel3);
		panel3.setLayout(new BorderLayout(0, 0));
		
		PImg3 = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img3.jpg", 0, 0);
		PImg3.setBackground(new Color(250, 250, 250));
		panel3.add(PImg3, BorderLayout.CENTER);
		PImg3.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_5 = new JLabel("\r\n                                                    Botones, diales, palancas e interruptores mecánicos de precisión\r\n\r\n");
		lblNewLabel_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setPreferredSize(new Dimension(150, 150));
		lblNewLabel_5.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		PImg3.add(lblNewLabel_5, BorderLayout.SOUTH);
		
		panel4 = new JPanel();
		add(panel4);
		panel4.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setPreferredSize(new Dimension(790, 70));
		panel4.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		lblNewLabel_4 = new JLabel("\r\n                                                INTERIOR E INTEFAZ");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 20));
		panel.add(lblNewLabel_4);
		
		lblNewLabel_6 = new JLabel("                         Miles de detalles cuidadosamente concebidos se unen para crear una experiencia de conducción única.");
		lblNewLabel_6.setPreferredSize(new Dimension(566, 10));
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		panel.add(lblNewLabel_6);
		
		PCentro = new JPanel();
		PCentro.setBackground(new Color(255, 255, 255));
		panel4.add(PCentro, BorderLayout.CENTER);
		PCentro.setLayout(new BorderLayout(0, 0));
		
		panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		panel_14.setPreferredSize(new Dimension(10, 20));
		PCentro.add(panel_14, BorderLayout.NORTH);
		
		panel_100 = new JPanel();
		panel_100.setBackground(new Color(255, 255, 255));
		panel_100.setPreferredSize(new Dimension(10, 80));
		PCentro.add(panel_100, BorderLayout.SOUTH);
		
		panel_101 = new JPanel();
		panel_101.setBackground(new Color(255, 255, 255));
		panel_101.setPreferredSize(new Dimension(20, 10));
		PCentro.add(panel_101, BorderLayout.WEST);
		
		panel_102 = new JPanel();
		panel_102.setBackground(new Color(255, 255, 255));
		panel_102.setPreferredSize(new Dimension(20, 10));
		PCentro.add(panel_102, BorderLayout.EAST);
		
		panel_103 = new JPanel();
		panel_103.setBackground(new Color(255, 255, 255));
		PCentro.add(panel_103, BorderLayout.CENTER);
		panel_103.setLayout(new GridLayout(0, 3, 0, 0));
		
		panel_104 = new JPanel();
		panel_104.setBackground(new Color(255, 255, 255));
		panel_103.add(panel_104);
		panel_104.setLayout(new BorderLayout(0, 0));
		
		panel_107 = new JPanel();
		panel_107.setBackground(new Color(255, 255, 255));
		panel_107.setPreferredSize(new Dimension(10, 100));
		panel_104.add(panel_107, BorderLayout.NORTH);
		
		panel_108 = new JPanel();
		panel_108.setBackground(new Color(255, 255, 255));
		panel_104.add(panel_108, BorderLayout.WEST);
		
		panel_109 = new JPanel();
		panel_109.setBackground(new Color(255, 255, 255));
		panel_109.setPreferredSize(new Dimension(10, 100));
		panel_104.add(panel_109, BorderLayout.SOUTH);
		panel_109.setLayout(null);
		
		atras = new JLabel("");
		atras.addMouseListener(this);
		atras.setIcon(new ImageIcon(Ferrari_Luce.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/atrasF.png")));
		atras.setBackground(new Color(255, 255, 255));
		atras.setBounds(20, 5, 30, 30);
		atras.setPreferredSize(new Dimension(30, 30));
		panel_109.add(atras);
		
		sig = new JLabel("");
		sig.addMouseListener(this);
		sig.setIcon(new ImageIcon(Ferrari_Luce.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/sigF.png")));
		sig.setBounds(60, 5, 30, 30);
		sig.setPreferredSize(new Dimension(30, 30));
		panel_109.add(sig);
		
		panel_117 = new JPanel();
		panel_117.setBackground(new Color(255, 255, 255));
		panel_104.add(panel_117, BorderLayout.EAST);
		
		PCImg1 = new JPanel();
		PCImg1.setBackground(new Color(255, 255, 255));
				
		panel_104.add(PCImg1, BorderLayout.CENTER);
		
		img1 = new JLabel("");
		img1.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img1_rend.jpg")));
		img1.setBackground(new Color(255, 255, 255));
		img1.setPreferredSize(new Dimension(230, 220));
		PCImg1.add(img1);
		
		panel_105 = new JPanel();
		panel_105.setBackground(new Color(255, 255, 255));
		panel_103.add(panel_105);
		panel_105.setLayout(new BorderLayout(0, 0));
		
		panel_110 = new JPanel();
		panel_110.setBackground(new Color(255, 255, 255));
		panel_110.setPreferredSize(new Dimension(10, 100));
		panel_105.add(panel_110, BorderLayout.NORTH);
		
		panel_111 = new JPanel();
		panel_111.setBackground(new Color(255, 255, 255));
		panel_105.add(panel_111, BorderLayout.EAST);
		
		panel_112 = new JPanel();
		panel_112.setBackground(new Color(255, 255, 255));
		panel_112.setPreferredSize(new Dimension(10, 100));
		panel_105.add(panel_112, BorderLayout.SOUTH);
		
		panel_116 = new JPanel();
		panel_116.setBackground(new Color(255, 255, 255));
		panel_105.add(panel_116, BorderLayout.WEST);
		
		PCImg2 = new JPanel();
		PCImg2.setBackground(new Color(255, 255, 255));
		panel_105.add(PCImg2, BorderLayout.CENTER);
		
		imG2 = new JLabel("");
		imG2.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img2_rend.jpg")));
		imG2.setBackground(new Color(255, 255, 255));
		imG2.setPreferredSize(new Dimension(230, 220));
		PCImg2.add(imG2);
		
		panel_106 = new JPanel();
		panel_106.setBackground(new Color(255, 255, 255));
		panel_103.add(panel_106);
		panel_106.setLayout(new BorderLayout(0, 0));
		
		panel_113 = new JPanel();
		panel_113.setBackground(new Color(255, 255, 255));
		panel_113.setPreferredSize(new Dimension(10, 100));
		panel_106.add(panel_113, BorderLayout.NORTH);
		
		panel_114 = new JPanel();
		panel_114.setBackground(new Color(255, 255, 255));
		panel_106.add(panel_114, BorderLayout.EAST);
		
		panel_115 = new JPanel();
		panel_115.setBackground(new Color(255, 255, 255));
		panel_115.setPreferredSize(new Dimension(10, 100));
		panel_106.add(panel_115, BorderLayout.SOUTH);
		
		panel_118 = new JPanel();
		panel_118.setBackground(new Color(255, 255, 255));
		panel_106.add(panel_118, BorderLayout.WEST);
		
		PCImg3 = new JPanel();
		PCImg3.setBackground(new Color(255, 255, 255));
		panel_106.add(PCImg3, BorderLayout.CENTER);
		PCImg3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		img3 = new JLabel("");
		img3.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img3_rend.jpg")));
		img3.setBackground(new Color(255, 255, 255));
		img3.setPreferredSize(new Dimension(230, 220));
		PCImg3.add(img3);
		
		panel5 = new JPanel();
		panel5.setBackground(new Color(255, 255, 255));
		add(panel5);
		panel5.setLayout(new BorderLayout(0, 0));
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setOpaque(false);
		panel_1.setPreferredSize(new Dimension(790, 80));
		panel5.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_7 = new JLabel("<html><center>\r\nVOLANTES\r\n</center></html>");
		lblNewLabel_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_7.setPreferredSize(new Dimension(370, 75));
		lblNewLabel_7.setForeground(new Color(199, 199, 199));
		lblNewLabel_7.setFont(new Font("Host Grotesk ExtraBold", Font.BOLD, 70));
		panel_1.add(lblNewLabel_7);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setPreferredSize(new Dimension(790, 50));
		panel5.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.addMouseListener(this);
		lblNewLabel_14.setIcon(new ImageIcon(Ferrari_Luce.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img_color1.png")));
		lblNewLabel_14.setPreferredSize(new Dimension(20, 20));
		lblNewLabel_14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.addMouseListener(this);
		lblNewLabel_15.setIcon(new ImageIcon(Ferrari_Luce.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img_color2.png")));
		lblNewLabel_15.setPreferredSize(new Dimension(20, 20));
		lblNewLabel_15.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.addMouseListener(this);
		lblNewLabel_16.setIcon(new ImageIcon(Ferrari_Luce.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img_color3.png")));
		lblNewLabel_16.setPreferredSize(new Dimension(20, 20));
		lblNewLabel_16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_2.add(lblNewLabel_16);
		
		PImg101112 = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img10-2.jpg", 0, 0);
		PImg101112.setBackground(new Color(255, 255, 255));
		
		panel5.add(PImg101112, BorderLayout.CENTER);
		
		imgs = new JLabel("");
		imgs.setPreferredSize(new Dimension(790, 465));
		PImg101112.add(imgs);
		
		panel6 = new JPanel();
		panel6.setBackground(new Color(0, 0, 0));
		add(panel6);
		panel6.setLayout(new BorderLayout(0, 0));
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setPreferredSize(new Dimension(790, 80));
		panel6.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));
		
		lblNewLabel_8 = new JLabel("                                  MODULOS DE CONTROL ANALÓGICOS");
		lblNewLabel_8.setBackground(new Color(255, 255, 255));
		lblNewLabel_8.setPreferredSize(new Dimension(287, 70));
		lblNewLabel_8.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 20));
		panel_3.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("                                                         Mandos esenciales accesibles con tus manos al volante");
		lblNewLabel_9.setBackground(new Color(255, 255, 255));
		lblNewLabel_9.setPreferredSize(new Dimension(433, 30));
		lblNewLabel_9.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		panel_3.add(lblNewLabel_9);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(790, 100));
		panel6.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_41 = new JPanel();
		panel_41.setBackground(new Color(0, 0, 0));
		panel_4.add(panel_41);
		panel_41.setLayout(null);
		
		lblNewLabel_11 = new JLabel("E-MANETTINO");
		lblNewLabel_11.setBounds(162, 0, 102, 14);
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		panel_41.add(lblNewLabel_11);
		
		lblNewLabel_10 = new JLabel("<html><center>El Manettino Energy gestiona la potencia y la<br>\r\n autonomía optimizando el flujo de energía del<br>\r\n sistema.</center></html>");
		lblNewLabel_10.setBounds(69, 25, 258, 51);
		lblNewLabel_10.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBackground(new Color(0, 0, 0));
		panel_41.add(lblNewLabel_10);
		
		panel_42 = new JPanel();
		panel_42.setBackground(new Color(0, 0, 0));
		panel_4.add(panel_42);
		panel_42.setLayout(null);
		
		lblNewLabel_12 = new JLabel("<html><center>Dedicado al emblemático Manettino, controla<br>\r\n múltiples dinámicas que transforman el carácter de<br>\r\n la conducción.\r\n</html></center>");
		lblNewLabel_12.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		lblNewLabel_12.setBounds(48, 26, 301, 51);
		panel_42.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("MANETTINO");
		lblNewLabel_13.setForeground(new Color(255, 255, 255));
		lblNewLabel_13.setBounds(165, 0, 86, 14);
		panel_42.add(lblNewLabel_13);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel6.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		p6img1 = new JPanel();
		p6img1.setBackground(new Color(0, 0, 0));
		panel_5.add(p6img1);
		p6img1.setLayout(new BorderLayout(0, 0));
		
		panel_33 = new JPanel();
		panel_33.setBackground(new Color(0, 0, 0));
		panel_33.setPreferredSize(new Dimension(395, 30));
		p6img1.add(panel_33, BorderLayout.NORTH);
		
		panel_34 = new JPanel();
		panel_34.setBackground(new Color(0, 0, 0));
		p6img1.add(panel_34, BorderLayout.SOUTH);
		
		panel_35 = new JPanel();
		panel_35.setBackground(new Color(0, 0, 0));
		panel_35.setPreferredSize(new Dimension(20, 10));
		p6img1.add(panel_35, BorderLayout.WEST);
		
		panel_36 = new JPanel();
		panel_36.setBackground(new Color(0, 0, 0));
		p6img1.add(panel_36, BorderLayout.EAST);
		
		imgC = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img13.jpg", 0, 0);
				
		p6img1.add(imgC, BorderLayout.CENTER);
		
		p6img2 = new JPanel();
		p6img2.setBackground(new Color(0, 0, 0));
		panel_5.add(p6img2);
		p6img2.setLayout(new BorderLayout(0, 0));
		
		panel_37 = new JPanel();
		panel_37.setBackground(new Color(0, 0, 0));
		panel_37.setPreferredSize(new Dimension(395, 30));
		p6img2.add(panel_37, BorderLayout.NORTH);
		
		panel_38 = new JPanel();
		panel_38.setBackground(new Color(0, 0, 0));
		p6img2.add(panel_38, BorderLayout.WEST);
		
		panel_39 = new JPanel();
		panel_39.setPreferredSize(new Dimension(20, 10));
		panel_39.setBackground(new Color(0, 0, 0));
		p6img2.add(panel_39, BorderLayout.EAST);
		
		panel_40 = new JPanel();
		panel_40.setBackground(new Color(0, 0, 0));
		p6img2.add(panel_40, BorderLayout.SOUTH);
		
		imgC2 = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img14.jpg", 0, 0);
		p6img2.add(imgC2, BorderLayout.CENTER);
		
		panel7 = new JPanel();
		add(panel7);
		panel7.setLayout(new BorderLayout(0, 0));
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(250, 250, 250));
		panel_6.setPreferredSize(new Dimension(10, 80));
		panel7.add(panel_6, BorderLayout.NORTH);
		
		lblNewLabel_17 = new JLabel("CONTROL MANUAL DEL PAR");
		lblNewLabel_17.setFont(new Font("Host Grotesk Medium", Font.BOLD, 20));
		lblNewLabel_17.setPreferredSize(new Dimension(280, 75));
		panel_6.add(lblNewLabel_17);
		
		panel_43 = new JPanel();
		panel_43.setBackground(new Color(250, 250, 250));
		panel_43.setPreferredSize(new Dimension(25, 10));
		panel7.add(panel_43, BorderLayout.WEST);
		
		panel_44 = new JPanel();
		panel_44.setBackground(new Color(250, 250, 250));
		panel_44.setPreferredSize(new Dimension(25, 10));
		panel7.add(panel_44, BorderLayout.EAST);
		
		panel_45 = new JPanel();
		panel_45.setBackground(new Color(250, 250, 250));
		panel_45.setPreferredSize(new Dimension(10, 120));
		panel7.add(panel_45, BorderLayout.SOUTH);
		
		lblNewLabel_18 = new JLabel("<html><center>\r\nLas levas permiten el control manual del par para una aceleración progresiva, combinada con la<br>\r\n potencia del frenado regenerativo, que ajusta el flujo de recuperación de energía.\r\n</center></html>");
		lblNewLabel_18.setBackground(new Color(255, 255, 255));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18.setPreferredSize(new Dimension(517, 115));
		panel_45.add(lblNewLabel_18);
		
		P7img = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img15.jpg", 0, 0);
		
		panel7.add(P7img, BorderLayout.CENTER);
		
		panel8 = new JPanel();
		panel8.setBackground(new Color(0, 0, 0));
		add(panel8);
		panel8.setLayout(new BorderLayout(0, 0));
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 0));
		panel_7.setPreferredSize(new Dimension(10, 100));
		panel8.add(panel_7, BorderLayout.NORTH);
		
		panel_46 = new JPanel();
		panel_46.setBackground(new Color(0, 0, 0));
		panel_46.setPreferredSize(new Dimension(20, 10));
		panel8.add(panel_46, BorderLayout.WEST);
		
		panel_47 = new JPanel();
		panel_47.setBackground(new Color(0, 0, 0));
		panel_47.setPreferredSize(new Dimension(20, 10));
		panel8.add(panel_47, BorderLayout.EAST);
		
		panel_48 = new JPanel();
		panel_48.setBackground(new Color(0, 0, 0));
		panel_48.setPreferredSize(new Dimension(10, 100));
		panel8.add(panel_48, BorderLayout.SOUTH);
		panel_48.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_56 = new JPanel();
		panel_56.setBackground(new Color(0, 0, 0));
		panel_48.add(panel_56);
		panel_56.setLayout(new BorderLayout(0, 0));
		
		panel_58 = new JPanel();
		panel_58.setBackground(new Color(0, 0, 0));
		panel_58.setPreferredSize(new Dimension(20, 10));
		panel_58.setMinimumSize(new Dimension(20, 10));
		panel_56.add(panel_58, BorderLayout.WEST);
		
		panel_59 = new JPanel();
		panel_59.setBackground(new Color(0, 0, 0));
		panel_56.add(panel_59, BorderLayout.EAST);
		
		P8txt1 = new JPanel();
		P8txt1.setBackground(new Color(0, 0, 0));
		panel_56.add(P8txt1, BorderLayout.CENTER);
		
		lblNewLabel_19 = new JLabel("<html><center>\r\nEl medidor de par situado sobre el velocímetro<br>\r\n indica el momento óptimo para que el conductor<br>\r\n aumente el nivel de par.\r\n</center></html>");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_19.setForeground(new Color(255, 255, 255));
		lblNewLabel_19.setPreferredSize(new Dimension(270, 95));
		P8txt1.add(lblNewLabel_19);
		
		panel_57 = new JPanel();
		panel_57.setBackground(new Color(0, 0, 0));
		panel_48.add(panel_57);
		panel_57.setLayout(new BorderLayout(0, 0));
		
		panel_60 = new JPanel();
		panel_60.setBackground(new Color(0, 0, 0));
		panel_57.add(panel_60, BorderLayout.WEST);
		
		panel_61 = new JPanel();
		panel_61.setBackground(new Color(0, 0, 0));
		panel_61.setPreferredSize(new Dimension(20, 10));
		panel_61.setMinimumSize(new Dimension(20, 10));
		panel_57.add(panel_61, BorderLayout.EAST);
		
		P8txt2 = new JPanel();
		P8txt2.setBackground(new Color(0, 0, 0));
		panel_57.add(P8txt2, BorderLayout.CENTER);
		
		lblNewLabel_20 = new JLabel("<html><center>\r\nEl mecanismo magnético de la palanca ofrece una<br>\r\nrespuesta clara, deliberada y satisfactoria al<br>\r\n conductor.\r\n</center></html>");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_20.setPreferredSize(new Dimension(275, 95));
		lblNewLabel_20.setForeground(new Color(255, 255, 255));
		P8txt2.add(lblNewLabel_20);
		
		panel_49 = new JPanel();
		panel_49.setBackground(new Color(0, 0, 0));
		panel8.add(panel_49, BorderLayout.CENTER);
		panel_49.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_50 = new JPanel();
		panel_50.setBackground(new Color(0, 0, 0));
		panel_49.add(panel_50);
		panel_50.setLayout(new BorderLayout(0, 0));
		
		panel_52 = new JPanel();
		panel_52.setBackground(new Color(0, 0, 0));
		panel_50.add(panel_52, BorderLayout.EAST);
		
		panel_53 = new JPanel();
		panel_53.setBackground(new Color(0, 0, 0));
		panel_50.add(panel_53, BorderLayout.SOUTH);
		
		P8img1 = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img16.jpg", 0, 0);
		P8img1.setBackground(new Color(0, 0, 0));
		
		panel_50.add(P8img1, BorderLayout.CENTER);
		
		panel_51 = new JPanel();
		panel_51.setBackground(new Color(0, 0, 0));
		panel_49.add(panel_51);
		panel_51.setLayout(new BorderLayout(0, 0));
		
		panel_54 = new JPanel();
		panel_54.setBackground(new Color(0, 0, 0));
		panel_51.add(panel_54, BorderLayout.WEST);
		
		panel_55 = new JPanel();
		panel_55.setBackground(new Color(0, 0, 0));
		panel_51.add(panel_55, BorderLayout.SOUTH);
		
		P8img2 = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img17.jpg",0 ,0);
		P8img2.setBackground(new Color(0, 0, 0));
		panel_51.add(P8img2, BorderLayout.CENTER);
		
		panel9 = new JPanel();
		panel9.setBackground(new Color(0, 0, 0));
		add(panel9);
		panel9.setLayout(new BorderLayout(0, 0));
		
		panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 0, 0));
		panel_8.setPreferredSize(new Dimension(10, 50));
		panel9.add(panel_8, BorderLayout.NORTH);
		
		panel_62 = new JPanel();
		panel_62.setBackground(new Color(0, 0, 0));
		panel_62.setPreferredSize(new Dimension(50, 10));
		panel9.add(panel_62, BorderLayout.WEST);
		
		panel_63 = new JPanel();
		panel_63.setBackground(new Color(0, 0, 0));
		panel_63.setPreferredSize(new Dimension(50, 10));
		panel9.add(panel_63, BorderLayout.EAST);
		
		panel_64 = new JPanel();
		panel_64.setBackground(new Color(0, 0, 0));
		panel_64.setPreferredSize(new Dimension(790, 150));
		panel9.add(panel_64, BorderLayout.SOUTH);
		panel_64.setLayout(null);
		
		panel_67 = new JPanel();
		panel_67.setBounds(0, 0, 790, 100);
		panel_67.setPreferredSize(new Dimension(790, 100));
		panel_67.setBackground(new Color(0, 0, 0));
		panel_64.add(panel_67);
		
		lblNewLabel_21 = new JLabel("<html><center>\r\nFabricadas con aluminio 100 % reciclado, mecanizado con precisión y acabado a mano,con<br>\r\nanodizado final, elementos de cristal y empuñadura de cuero.\r\n</center></html>");
		lblNewLabel_21.setPreferredSize(new Dimension(530, 95));
		lblNewLabel_21.setForeground(new Color(255, 255, 255));
		panel_67.add(lblNewLabel_21);
		
		panel_66 = new JPanel();
		panel_66.setBounds(0, 100, 790, 50);
		panel_66.setPreferredSize(new Dimension(790, 50));
		panel_66.setBackground(new Color(0, 0, 0));
		panel_64.add(panel_66);
		
		P9gif = ponerImg("/recursos/gifs/gifs_vehiculos/gifs_Ferrari_Luce/360_volante.gif", 0, 0);
		P9gif.setBackground(new Color(0, 0, 0));
		panel9.add(P9gif, BorderLayout.CENTER);
		
		panel10 = new JPanel();
		add(panel10);
		panel10.setLayout(null);
		
		panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 200, 0));
		panel_9.setBounds(0, 0, 829, 20);
		panel_9.setPreferredSize(new Dimension(10, 20));
		panel10.add(panel_9);
		
		panel_65 = new JPanel();
		panel_65.setBackground(new Color(255, 255, 255));
		panel_65.setBounds(0, 22, 790, 123);
		panel10.add(panel_65);
		panel_65.setLayout(null);
		
		lblNewLabel_22 = new JLabel("<html><center>\r\nCUADRO DE<br>\r\nINSTRUMENTOS\r\n</html></center>");
		lblNewLabel_22.setBackground(new Color(255, 255, 255));
		lblNewLabel_22.setBounds(199, 5, 391, 115);
		lblNewLabel_22.setForeground(new Color(186, 186, 186));
		lblNewLabel_22.setFont(new Font("Host Grotesk ExtraBold", Font.BOLD, 50));
		panel_65.add(lblNewLabel_22);
		
		P10img = new JPanel();
		P10img.setBounds(0, 144, 790, 396);
		panel10.add(P10img);
		P10img.setLayout(new BorderLayout(0, 0));
		
		panel_68 = new JPanel();
		panel_68.setBackground(new Color(255, 255, 255));
		panel_68.setPreferredSize(new Dimension(35, 10));
		P10img.add(panel_68, BorderLayout.WEST);
		
		panel_70 = new JPanel();
		panel_70.setBackground(new Color(255, 255, 255));
		panel_70.setPreferredSize(new Dimension(35, 10));
		P10img.add(panel_70, BorderLayout.EAST);
		
		img10 = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img18-2.jpg", 0, 0);
		P10img.add(img10, BorderLayout.CENTER);
		
		panel_69 = new JPanel();
		panel_69.setBackground(new Color(255, 255, 255));
		panel_69.setBounds(0, 540, 790, 60);
		panel10.add(panel_69);
		
		lblNewLabel_23 = new JLabel("<html><center>\r\nLa información esencial para el conductor se concentra en el cuadro de instrumentos, formado<br>\r\n por una pantalla multicapa que combina instrumentación digital y mecánica.\r\n</center></html>");
		lblNewLabel_23.setBackground(new Color(255, 255, 255));
		lblNewLabel_23.setPreferredSize(new Dimension(550, 45));
		panel_69.add(lblNewLabel_23);
		
		panel11 = new JPanel();
		add(panel11);
		panel11.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 0, 0));
		panel11.add(panel_10);
		panel_10.setLayout(null);
		
		panel_72 = new JPanel();
		panel_72.setBounds(0, 0, 395, 50);
		panel_72.setBackground(new Color(0, 0, 0));
		panel_72.setPreferredSize(new Dimension(10, 50));
		panel_10.add(panel_72);
		
		panel_73 = new JPanel();
		panel_73.setBounds(0, 300, 395, 300);
		panel_73.setBackground(new Color(0, 0, 0));
		panel_73.setPreferredSize(new Dimension(10, 300));
		panel_10.add(panel_73);
		panel_73.setLayout(new BorderLayout(0, 0));
		
		panel_78 = new JPanel();
		panel_78.setBackground(new Color(0, 0, 0));
		panel_78.setPreferredSize(new Dimension(10, 100));
		panel_73.add(panel_78, BorderLayout.SOUTH);
		panel_78.setLayout(null);
		
		panel_83 = new JPanel();
		panel_83.setBounds(0, 0, 395, 30);
		panel_83.setBackground(new Color(51, 51, 51));
		panel_83.setPreferredSize(new Dimension(10, 30));
		panel_78.add(panel_83);
		
		panel_80 = new JPanel();
		panel_80.setBackground(new Color(0, 0, 0));
		panel_73.add(panel_80, BorderLayout.CENTER);
		panel_80.setLayout(new BorderLayout(0, 0));
		
		panel_82 = new JPanel();
		panel_82.setBackground(new Color(0, 0, 0));
		panel_82.setPreferredSize(new Dimension(10, 50));
		panel_80.add(panel_82, BorderLayout.NORTH);
		
		panel_74 = new JPanel();
		panel_74.setBounds(0, 50, 395, 250);
		panel_74.setBackground(new Color(0, 0, 0));
		panel_10.add(panel_74);
		panel_74.setLayout(new GridLayout(2, 1, 0, 0));
		
		panel_77 = new JPanel();
		panel_77.setBackground(new Color(0, 0, 0));
		panel_74.add(panel_77);
		panel_77.setLayout(null);
		
		lblNewLabel_25 = new JLabel("<html><center>\r\nINDICADOR DE POTENCIA\r\n</center></html>");
		lblNewLabel_25.setForeground(new Color(255, 255, 255));
		lblNewLabel_25.setBounds(102, 26, 190, 130);
		lblNewLabel_25.setPreferredSize(new Dimension(190, 130));
		lblNewLabel_25.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 15));
		panel_77.add(lblNewLabel_25);
		
		panel_76 = new JPanel();
		panel_76.setBackground(new Color(0, 0, 0));
		panel_74.add(panel_76);
		panel_76.setLayout(null);
		
		lblNewLabel_24 = new JLabel("<html><center>\r\nEl indicador izquierdo está vinculado directamente<br>\r\n al modo e Manettino y muestra la potencia<br>\r\n disponible y la frenada regenerativa.\r\n</center></html>");
		lblNewLabel_24.setBounds(47, -34, 300, 118);
		lblNewLabel_24.setForeground(new Color(255, 255, 255));
		lblNewLabel_24.setPreferredSize(new Dimension(300, 118));
		panel_76.add(lblNewLabel_24);
		
		panel_71 = new JPanel();
		panel11.add(panel_71);
		panel_71.setLayout(new BorderLayout(0, 0));
		
		panel_75 = new JPanel();
		panel_75.setBackground(new Color(0, 0, 0));
		panel_75.setPreferredSize(new Dimension(10, 250));
		panel_71.add(panel_75, BorderLayout.SOUTH);
		panel_75.setLayout(new BorderLayout(0, 0));
		
		panel_79 = new JPanel();
		panel_79.setBackground(new Color(0, 0, 0));
		panel_79.setPreferredSize(new Dimension(10, 100));
		panel_75.add(panel_79, BorderLayout.SOUTH);
		panel_79.setLayout(new BorderLayout(0, 0));
		
		panel_84 = new JPanel();
		panel_84.setBackground(new Color(51, 51, 51));
		panel_84.setPreferredSize(new Dimension(10, 30));
		panel_79.add(panel_84, BorderLayout.NORTH);
		
		panel_81 = new JPanel();
		panel_81.setBackground(new Color(0, 0, 0));
		panel_75.add(panel_81, BorderLayout.CENTER);
		
		P11img = ponerImg("/recursos/gifs/gifs_vehiculos/gifs_Ferrari_Luce/indicador_potencia_gif.gif", 0, 0);
				
		P11img.setBackground(new Color(0, 0, 0));
		panel_71.add(P11img, BorderLayout.CENTER);
		
		panel12 = new JPanel();
		add(panel12);
		panel12.setLayout(new BorderLayout(0, 0));
		
		panel_11 = new JPanel();
		panel_11.setPreferredSize(new Dimension(10, 150));
		panel12.add(panel_11, BorderLayout.SOUTH);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		panel_85 = new JPanel();
		panel_85.setBackground(new Color(0, 0, 0));
		panel_85.setPreferredSize(new Dimension(10, 50));
		panel_11.add(panel_85, BorderLayout.NORTH);
		panel_85.setLayout(null);
		
		lblNewLabel_26 = new JLabel("<html><center>\r\nINDICADOR CENTRAL\r\n</center></html>");
		lblNewLabel_26.setBounds(312, 5, 165, 20);
		lblNewLabel_26.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 15));
		lblNewLabel_26.setPreferredSize(new Dimension(165, 20));
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		panel_85.add(lblNewLabel_26);
		
		panel_86 = new JPanel();
		panel_86.setBackground(new Color(0, 0, 0));
		panel_86.setPreferredSize(new Dimension(10, 100));
		panel_11.add(panel_86, BorderLayout.SOUTH);
		panel_86.setLayout(null);
		
		lblNewLabel_27 = new JLabel("<html><center>\r\nLos dos datos más importantes —la velocidad y el nivel de batería— se<br>\r\n muestran en el indicador central, que combina una aguja mecánica con un<br>\r\n indicador digital.\r\n</center></html>");
		lblNewLabel_27.setBounds(184, -18, 500, 95);
		lblNewLabel_27.setForeground(new Color(255, 255, 255));
		lblNewLabel_27.setBackground(new Color(0, 0, 0));
		lblNewLabel_27.setPreferredSize(new Dimension(500, 95));
		panel_86.add(lblNewLabel_27);
		
		P12img = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img19.jpg", 0, 0);
		P12img.setBackground(new Color(0, 0, 0));
				
		panel12.add(P12img, BorderLayout.CENTER);
		
		panel13 = new JPanel();
		panel13.setBackground(new Color(0, 0, 0));
		add(panel13);
		panel13.setLayout(new BorderLayout(0, 0));
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 0, 0));
		panel_12.setPreferredSize(new Dimension(10, 20));
		panel13.add(panel_12, BorderLayout.NORTH);
		
		panel_87 = new JPanel();
		panel_87.setBackground(new Color(0, 0, 0));
		panel_87.setPreferredSize(new Dimension(10, 150));
		panel13.add(panel_87, BorderLayout.SOUTH);
		panel_87.setLayout(new BorderLayout(0, 0));
		
		panel_89 = new JPanel();
		panel_89.setBackground(new Color(0, 0, 0));
		panel_89.setPreferredSize(new Dimension(10, 30));
		panel_87.add(panel_89, BorderLayout.SOUTH);
		panel_89.setLayout(new BorderLayout(0, 0));
		
		panel_95 = new JPanel();
		panel_95.setBackground(new Color(252, 196, 0));
		panel_95.setPreferredSize(new Dimension(10, 20));
		panel_89.add(panel_95, BorderLayout.SOUTH);
		
		panel_90 = new JPanel();
		panel_90.setBackground(new Color(0, 0, 0));
		panel_87.add(panel_90, BorderLayout.CENTER);
		
		lblNewLabel_28 = new JLabel("<html><center>\r\nUn elemento independiente y distintivo que integra tres esferas, cada una con un bisel de <br>\r\naluminio y una lente de cristal mecanizada con precisión, alojadas en una carcasa de aluminio <br>\r\nanodizado.\r\n</center></html>");
		lblNewLabel_28.setForeground(new Color(255, 255, 255));
		lblNewLabel_28.setPreferredSize(new Dimension(550, 100));
		panel_90.add(lblNewLabel_28);
		
		panel_88 = new JPanel();
		panel_88.setBackground(new Color(0, 0, 0));
		panel13.add(panel_88, BorderLayout.CENTER);
		panel_88.setLayout(new BorderLayout(0, 0));
		
		panel_91 = new JPanel();
		panel_91.setBackground(new Color(0, 0, 0));
		panel_91.setPreferredSize(new Dimension(10, 20));
		panel_88.add(panel_91, BorderLayout.NORTH);
		
		panel_92 = new JPanel();
		panel_92.setBackground(new Color(0, 0, 0));
		panel_92.setPreferredSize(new Dimension(45, 10));
		panel_88.add(panel_92, BorderLayout.EAST);
		
		panel_93 = new JPanel();
		panel_93.setBackground(new Color(0, 0, 0));
		panel_93.setPreferredSize(new Dimension(45, 10));
		panel_88.add(panel_93, BorderLayout.WEST);
		
		panel_94 = new JPanel();
		panel_94.setPreferredSize(new Dimension(10, 20));
		panel_94.setBackground(new Color(0, 0, 0));
		panel_88.add(panel_94, BorderLayout.SOUTH);
		
		P13gif = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img18.jpg", 0, 0);
					
		P13gif.setBackground(new Color(0, 0, 0));
		panel_88.add(P13gif, BorderLayout.CENTER);
		
		panel14 = new JPanel();
		add(panel14);
		panel14.setLayout(new BorderLayout(0, 0));
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 255));
		panel_13.setPreferredSize(new Dimension(10, 150));
		panel14.add(panel_13, BorderLayout.NORTH);
		
		lblNewLabel_29 = new JLabel("<html><center>\r\nCONJUNTO DE<br>\r\n DIRECCIÓN\r\n</html></center>");
		lblNewLabel_29.setBackground(new Color(255, 255, 255));
		lblNewLabel_29.setFont(new Font("Host Grotesk ExtraBold", Font.BOLD, 50));
		lblNewLabel_29.setForeground(new Color(183, 183, 183));
		panel_13.add(lblNewLabel_29);
		
		panel_96 = new JPanel();
		panel_96.setBackground(new Color(255, 255, 255));
		panel_96.setPreferredSize(new Dimension(10, 50));
		panel14.add(panel_96, BorderLayout.SOUTH);
		
		lblNewLabel_30 = new JLabel("<html><center>\r\nEl volante, las levas de control del par motor y el tablero se combinan para formar el conjunto<br>\r\n de la dirección.\r\n</center></html>");
		lblNewLabel_30.setBackground(new Color(255, 255, 255));
		panel_96.add(lblNewLabel_30);
		
		panel_97 = new JPanel();
		panel14.add(panel_97, BorderLayout.CENTER);
		panel_97.setLayout(new BorderLayout(0, 0));
		
		panel_98 = new JPanel();
		panel_98.setBackground(new Color(255, 255, 255));
		panel_98.setPreferredSize(new Dimension(35, 10));
		panel_97.add(panel_98, BorderLayout.WEST);
		
		panel_99 = new JPanel();
		panel_99.setBackground(new Color(255, 255, 255));
		panel_99.setPreferredSize(new Dimension(35, 10));
		panel_97.add(panel_99, BorderLayout.EAST);
		
		P14img = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img20.jpg",0 ,0);
				
		panel_97.add(P14img, BorderLayout.CENTER);
		
		panel15 = new JPanel();
		add(panel15);
		panel15.setLayout(new BorderLayout(0, 0));
		
		panel_119 = new JPanel();
		panel_119.setBackground(new Color(0, 0, 0));
		panel_119.setPreferredSize(new Dimension(10, 50));
		panel15.add(panel_119, BorderLayout.NORTH);
		
		panel_120 = new JPanel();
		panel_120.setBackground(new Color(0, 0, 0));
		panel_120.setPreferredSize(new Dimension(10, 150));
		panel15.add(panel_120, BorderLayout.SOUTH);
		
		lblNewLabel_31 = new JLabel("<html><center>\r\nEl tablero se desplaza con el volante, optimizando la visibilidad de los instrumentos y <br>\r\nfavoreciendo el rendimiento del conductor.\r\n</center></html>");
		lblNewLabel_31.setForeground(new Color(255, 255, 255));
		lblNewLabel_31.setBackground(new Color(0, 0, 0));
		lblNewLabel_31.setPreferredSize(new Dimension(500, 100));
		panel_120.add(lblNewLabel_31);
		
		panel_121 = new JPanel();
		panel_121.setBackground(new Color(0, 0, 0));
		panel_121.setPreferredSize(new Dimension(35, 10));
		panel15.add(panel_121, BorderLayout.WEST);
		
		panel_122 = new JPanel();
		panel_122.setBackground(new Color(0, 0, 0));
		panel_122.setPreferredSize(new Dimension(35, 10));
		panel15.add(panel_122, BorderLayout.EAST);
		
		P15gif = ponerImg("/recursos/gifs/gifs_vehiculos/gifs_Ferrari_Luce/volante_rend_gif.gif", 0, 0);
		P15gif.setBorder(null);
				
		panel15.add(P15gif, BorderLayout.CENTER);
		
		panel16 = new JPanel();
		add(panel16);
		panel16.setLayout(new BorderLayout(0, 0));
		
		panel_15 = new JPanel();
		panel_15.setBackground(new Color(0, 0, 0));
		panel_15.setPreferredSize(new Dimension(10, 30));
		panel16.add(panel_15, BorderLayout.NORTH);
		
		panel_123 = new JPanel();
		panel_123.setBackground(new Color(0, 0, 0));
		panel_123.setPreferredSize(new Dimension(35, 10));
		panel16.add(panel_123, BorderLayout.WEST);
		
		panel_124 = new JPanel();
		panel_124.setBackground(new Color(0, 0, 0));
		panel_124.setPreferredSize(new Dimension(35, 10));
		panel16.add(panel_124, BorderLayout.EAST);
		
		panel_125 = new JPanel();
		panel_125.setPreferredSize(new Dimension(10, 120));
		panel16.add(panel_125, BorderLayout.SOUTH);
		panel_125.setLayout(new BorderLayout(0, 0));
		
		panel_126 = new JPanel();
		panel_126.setBackground(new Color(252, 196, 0));
		panel_126.setPreferredSize(new Dimension(10, 20));
		panel_125.add(panel_126, BorderLayout.SOUTH);
		
		panel_127 = new JPanel();
		panel_127.setBackground(new Color(0, 0, 0));
		panel_125.add(panel_127, BorderLayout.CENTER);
		
		P16gif = ponerImg("/recursos/gifs/gifs_vehiculos/gifs_Ferrari_Luce/volante2_rend.gif", 0, 0);
				
		panel16.add(P16gif, BorderLayout.CENTER);
		
		panel17 = new JPanel();
		add(panel17);
		panel17.setLayout(new BorderLayout(0, 0));
		
		panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		panel_16.setPreferredSize(new Dimension(10, 150));
		panel17.add(panel_16, BorderLayout.NORTH);
		
		lblNewLabel_32 = new JLabel("<html><center>\r\nPANEL DE<br>\r\nCONTROL\r\n</center></html>");
		lblNewLabel_32.setFont(new Font("Host Grotesk ExtraBold", Font.BOLD, 50));
		lblNewLabel_32.setForeground(new Color(186, 186, 186));
		lblNewLabel_32.setBackground(new Color(255, 255, 255));
		panel_16.add(lblNewLabel_32);
		
		panel_128 = new JPanel();
		panel_128.setBackground(new Color(255, 255, 255));
		panel_128.setPreferredSize(new Dimension(10, 100));
		panel17.add(panel_128, BorderLayout.SOUTH);
		
		lblNewLabel_33 = new JLabel("<html><center>\r\nEl panel de control es un módulo articulado autónomo que mejora la experiencia de<br> conducción, combinando controles mecánicos con una pantalla táctil digital.\r\n</center></html>");
		lblNewLabel_33.setBackground(new Color(255, 255, 255));
		lblNewLabel_33.setPreferredSize(new Dimension(480, 50));
		panel_128.add(lblNewLabel_33);
		
		panel_129 = new JPanel();
		panel_129.setBackground(new Color(255, 255, 255));
		panel_129.setPreferredSize(new Dimension(35, 10));
		panel17.add(panel_129, BorderLayout.WEST);
		
		panel_130 = new JPanel();
		panel_130.setBackground(new Color(255, 255, 255));
		panel_130.setPreferredSize(new Dimension(35, 10));
		panel17.add(panel_130, BorderLayout.EAST);
		
		P16img = ponerImg("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img21.jpg",0 ,0);
				
		panel17.add(P16img, BorderLayout.CENTER);
		
		panel18 = new JPanel();
				
		add(panel18);
		panel18.setLayout(new BorderLayout(0, 0));
		
		panel_17 = new JPanel();
		panel_17.setBackground(new Color(0, 0, 0));
		panel_17.setPreferredSize(new Dimension(10, 150));
		panel18.add(panel_17, BorderLayout.NORTH);
		
		panel_131 = new JPanel();
		panel_131.setBackground(new Color(0, 0, 0));
		panel_131.setPreferredSize(new Dimension(35, 10));
		panel18.add(panel_131, BorderLayout.WEST);
		
		panel_132 = new JPanel();
		panel_132.setBackground(new Color(0, 0, 0));
		panel_132.setPreferredSize(new Dimension(35, 10));
		panel18.add(panel_132, BorderLayout.EAST);
		
		panel_133 = new JPanel();
		panel_133.setBackground(new Color(0, 0, 0));
		panel_133.setPreferredSize(new Dimension(10, 100));
		panel18.add(panel_133, BorderLayout.SOUTH);
		
		lblNewLabel_34 = new JLabel("<html><center>\r\nEl panel de control puede ser girado por el conductor y el copiloto mediante la manija y el<br>\r\n reposamanos.\r\n</center><html>");
		lblNewLabel_34.setPreferredSize(new Dimension(520, 50));
		lblNewLabel_34.setForeground(new Color(255, 255, 255));
		panel_133.add(lblNewLabel_34);
		
		P18gif = ponerImg("/recursos/gifs/gifs_vehiculos/gifs_Ferrari_Luce/P18.gif", 0, 0);
		P18gif.setBackground(new Color(0, 0, 0));
		panel18.add(P18gif, BorderLayout.CENTER);
		
		panel19 = new JPanel();
		add(panel19);
		
		panel_19 = new JPanel();
		add(panel_19);
		
		panel_20 = new JPanel();
		add(panel_20);
		
		panel_21 = new JPanel();
		add(panel_21);
		
		panel_22 = new JPanel();
		add(panel_22);
		
		panel_23 = new JPanel();
		add(panel_23);
		
		panel_24 = new JPanel();
		add(panel_24);
		
		panel_25 = new JPanel();
		add(panel_25);
		
		panel_26 = new JPanel();
		add(panel_26);
		
		panel_27 = new JPanel();
		add(panel_27);
		
		panel_28 = new JPanel();
		add(panel_28);
		
		panel_29 = new JPanel();
		add(panel_29);
		
		panel_30 = new JPanel();
		add(panel_30);
		
		panel_31 = new JPanel();
		add(panel_31);
		
		panel_32 = new JPanel();
		add(panel_32);

	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == sig) {
			mouseClickedSig(e);
		}
		if (e.getSource() == atras) {
			mouseClickedLblNewLabel_32(e);
		}
		if (e.getSource() == lblNewLabel_16) {
			mouseClickedLblNewLabel_16(e);
		}
		if (e.getSource() == lblNewLabel_15) {
			mouseClickedLblNewLabel_15(e);
		}
		if (e.getSource() == lblNewLabel_14) {
			mouseClickedLblNewLabel_14(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedLblNewLabel_14(MouseEvent e) {
			imgs.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img10-2_rend.jpg")));
	}
	protected void mouseClickedLblNewLabel_15(MouseEvent e) {
		imgs.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img11-2_rend.jpg")));
	}
	protected void mouseClickedLblNewLabel_16(MouseEvent e) {
		imgs.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img12-2_rend.jpg")));
	}
	protected void mouseClickedLblNewLabel_32(MouseEvent e) {
		img1.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img1_rend.jpg")));
		imG2.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img2_rend.jpg")));
		img3.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img3_rend.jpg")));
		atras.setEnabled(false);
		sig.setEnabled(true);
	}
	protected void mouseClickedSig(MouseEvent e) {
		img1.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img4_rend.jpg")));
		imG2.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img5_rend.jpg")));
		img3.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_vehiculos/imagenes_Ferrari_Luce/img6_rend.jpg")));
		sig.setEnabled(false);
		atras.setEnabled(true);
	}
	/**
	 * @wbp.factory
	*/
	private JPanel ponerImg(String nameImg, int posX, int posY) {
		return new JPanel() {
			private Image imagen = new ImageIcon(this.getClass().getResource(nameImg)).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, posX, posY, getWidth(), getHeight(), this);
			}
			
		};
		
	}
	
}
