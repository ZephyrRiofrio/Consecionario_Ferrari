package codigo.paneles;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Vehiculos extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelModelos;
	private JPanel panelAuto;
	private JPanel panelContenidoAuto;
	private JPanel panel_2;
	private JLabel lblT;
	private JLabel lblFerrariLuce;
	private JLabel lbl849Testarossa;
	private JLabel lbl849TestarossaSpider;
	private JLabel lbl296GTB;
	private JLabel lbl296GTS;
	private JLabel lblFerrari12Cilindri;
	private JLabel lblFerrari12CilindriSpider;
	private JLabel lblFerrariPurosangre;
	private JLabel lblFerrariAmalfi;
	private JLabel lblFerrariAmalfiSpider;
	private JLabel lblFerrariNombre;
	private JLabel lblFerrariImg;
	private JLabel lblDescubrirMas;
	private int indicador=0;
	private int indicadorPanel=0;
	
	public int indicadorCocheSeleccionado = 0;
	public Boolean botonPresionado = false;

	/**
	 * Create the panel.
	 */
	public Vehiculos() {
		setBackground(new Color(0, 0, 0));
		setBorder(new EmptyBorder(10, 25, 0, 0));
		setPreferredSize(new Dimension(718, 365));
		setLayout(new BorderLayout(0, 0));
		
		panelModelos = new JPanel();
		panelModelos.setVisible(false);
		panelModelos.setBackground(new Color(0, 0, 0));
		panelModelos.setBorder(new EmptyBorder(26, 15, 0, 0));
		add(panelModelos, BorderLayout.CENTER);
		panelModelos.setLayout(new BoxLayout(panelModelos, BoxLayout.Y_AXIS));
		
		lblFerrariLuce = new JLabel("Ferrari  Luce");
		lblFerrariLuce.addMouseListener(this);
		lblFerrariLuce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariLuce.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariLuce);
		
		lbl849Testarossa = new JLabel("849 Testarossa");
		lbl849Testarossa.addMouseListener(this);
		lbl849Testarossa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl849Testarossa.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl849Testarossa);
		
		lbl849TestarossaSpider = new JLabel("849 Testarossa Spider");
		lbl849TestarossaSpider.addMouseListener(this);
		lbl849TestarossaSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl849TestarossaSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl849TestarossaSpider);
		
		lbl296GTB = new JLabel("296 GTB");
		lbl296GTB.addMouseListener(this);
		lbl296GTB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		lbl296GTB.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl296GTB.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl296GTB);
		
		lbl296GTS = new JLabel("296 GTS");
		lbl296GTS.addMouseListener(this);
		lbl296GTS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lbl296GTS.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lbl296GTS.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl296GTS);
		
		lblFerrari12Cilindri = new JLabel("Ferrari 12 Cilindri");
		lblFerrari12Cilindri.addMouseListener(this);
		lblFerrari12Cilindri.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrari12Cilindri.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrari12Cilindri);
		
		lblFerrari12CilindriSpider = new JLabel("Ferrari 12 Cilindri Spider");
		lblFerrari12CilindriSpider.addMouseListener(this);
		lblFerrari12CilindriSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrari12CilindriSpider.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrari12CilindriSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrari12CilindriSpider);
		
		lblFerrariPurosangre = new JLabel("Ferrari Purosangre");
		lblFerrariPurosangre.addMouseListener(this);
		lblFerrariPurosangre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariPurosangre.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariPurosangre);
		
		lblFerrariAmalfi = new JLabel("Ferrari Amalfi");
		lblFerrariAmalfi.addMouseListener(this);
		lblFerrariAmalfi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariAmalfi.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariAmalfi);
		
		lblFerrariAmalfiSpider = new JLabel("Ferrari Amalfi Spider");
		lblFerrariAmalfiSpider.addMouseListener(this);
		lblFerrariAmalfiSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		lblFerrariAmalfiSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariAmalfiSpider);
		
		panelAuto = new JPanel();
		panelAuto.setVisible(false);
		add(panelAuto, BorderLayout.EAST);
		panelAuto.setLayout(new BorderLayout(0, 0));
		
		panelContenidoAuto = new JPanel();
		panelContenidoAuto.setPreferredSize(new Dimension(400, 410));
		panelContenidoAuto.setBackground(new Color(0, 0, 0));
		panelAuto.add(panelContenidoAuto);
		panelContenidoAuto.setLayout(null);
		
		lblDescubrirMas = new JLabel("DESCUBRIR MÁS");
		lblDescubrirMas.addMouseListener(this);
		lblDescubrirMas.setBounds(new Rectangle(5, 5, 0, 0));
		lblDescubrirMas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblDescubrirMas.setBounds(143, 297, 114, 40);
		lblDescubrirMas.setFont(new Font("Host Grotesk Medium", Font.BOLD, 11));
		lblDescubrirMas.setForeground(new Color(255, 255, 255));
		lblDescubrirMas.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), new EmptyBorder(10, 10, 10, 10)));
		panelContenidoAuto.add(lblDescubrirMas);
		
		lblFerrariNombre = new JLabel("");
		lblFerrariNombre.setBounds(108, 15, 200, 35);
		panelContenidoAuto.add(lblFerrariNombre);
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_1_rend.jpeg")));
		lblFerrariNombre.setPreferredSize(new Dimension(200, 49));
		
		lblFerrariImg = new JLabel("");
		lblFerrariImg.setBounds(0, 61, 400, 225);
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_2_rend.jpg")));
		lblFerrariImg.setPreferredSize(new Dimension(400, 225));
		panelContenidoAuto.add(lblFerrariImg);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBorder(new EmptyBorder(20, 0, 0, 0));
		add(panel_2, BorderLayout.WEST);
		
		lblT = new JLabel("Todos los modelos");
		lblT.addMouseListener(this);
		lblT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblT.setForeground(new Color(255, 255, 255));
		lblT.setFont(new Font("Host Grotesk SemiBold", Font.BOLD, 11));
		panel_2.add(lblT);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblDescubrirMas) {
			mouseClickedLblDescubrirMas(e);
		}
		if (e.getSource() == lblFerrariLuce) {
			mouseClickedLblFerrariLuce(e);
		}
		if (e.getSource() == lblFerrariAmalfi) {
			mouseClickedLblFerrariAmalfi(e);
		}
		if (e.getSource() == lblFerrari12Cilindri) {
			mouseClickedLblFerrari12Cilindri(e);
		}
		if (e.getSource() == lbl296GTS) {
			mouseClickedLbl296GTS(e);
		}
		if (e.getSource() == lbl849Testarossa) {
			mouseClickedLbl849Testarossa(e);
		}
		if (e.getSource() == lbl849TestarossaSpider) {
			mouseClickedLbl849TestarossaSpider(e);
		}
		if (e.getSource() == lblFerrariPurosangre) {
			mouseClickedLblFerrariPurosangre(e);
		}
		if (e.getSource() == lblFerrariAmalfiSpider) {
			mouseClickedLblFerrariAmalfiSpider(e);
		}
		if (e.getSource() == lblFerrari12CilindriSpider) {
			mouseClickedLblFerrari12CilindriSpider(e);
		}
		if (e.getSource() == lbl296GTB) {
			mouseClickedLbl296GTB(e);
		}
		if (e.getSource() == lblT) {
			mouseClickedLblT(e);
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
	protected void mouseClickedLblT(MouseEvent e) {
		if (indicadorPanel == 0) {
			panelModelos.setVisible(true);
			indicadorPanel = 1;
			
		}else {
			lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
			lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
			lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
			lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
			lbl849Testarossa.setForeground(new Color(162, 162, 162));
			lbl296GTS.setForeground(new Color(162, 162, 162));
			lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
			lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
			lblFerrariLuce.setForeground(new Color(162, 162, 162));
			lbl296GTB.setForeground(new Color(162, 162, 162));
			
			panelModelos.setVisible(false);
			panelAuto.setVisible(false);
			indicadorPanel = 0;
			indicador = 0;
		}
		
		}
	protected void mouseClickedLbl296GTB(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		
		lbl296GTB.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
			this.indicadorCocheSeleccionado = 4;
		} 
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_7_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_8_rend.jpg")));
		
	}
	protected void mouseClickedLblFerrari12CilindriSpider(MouseEvent e) {
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lblFerrari12CilindriSpider.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
			this.indicadorCocheSeleccionado = 7;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_13_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_14_rend.jpg")));
		
	}
	protected void mouseClickedLblFerrariAmalfiSpider(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lblFerrariAmalfiSpider.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_19_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_20_rend.jpg")));
		
	}
	protected void mouseClickedLblFerrariPurosangre(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lblFerrariPurosangre.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_15_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_16_rend.jpg")));
		
	}
	protected void mouseClickedLbl849TestarossaSpider(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lbl849TestarossaSpider.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_5_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_6_rend.jpg")));
		
	}
	protected void mouseClickedLbl849Testarossa(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lbl849Testarossa.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
			this.indicadorCocheSeleccionado = 2;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_3_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_4_rend.jpg")));
		
	}
	protected void mouseClickedLbl296GTS(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		
		lbl296GTS.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_9_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_10_rend.jpg")));
		
	}
	protected void mouseClickedLblFerrari12Cilindri(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lblFerrari12Cilindri.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
			this.indicadorCocheSeleccionado = 6;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_11_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_12_rend.jpg")));
	}
	protected void mouseClickedLblFerrariAmalfi(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lblFerrariAmalfi.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_17_rend.jpg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_18_rend.jpg")));
		
	}
	protected void mouseClickedLblFerrariLuce(MouseEvent e) {
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		
		lblFerrariLuce.setForeground(new Color(255, 255, 255));
		
		if (indicador == 0) {
			panelAuto.setVisible(true);
			indicador = 1;
			this.indicadorCocheSeleccionado = 1;
		}
		
		lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_1_rend.jpeg")));
		lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_2_rend.jpg")));
		
	}
	protected void mouseClickedLblDescubrirMas(MouseEvent e) {
		botonPresionado = true;
	}
}
