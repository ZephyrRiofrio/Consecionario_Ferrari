package codigo.paneles;

import codigo.ventanas.menu;

import java.util.ArrayList;
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
import java.awt.event.MouseAdapter;

public class Vehiculos extends JPanel implements MouseListener {

	private static final long serialVersionUID = 1L;
	public menu ventanaMenu;
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
	private ArrayList<JLabel> labelsCoches = new ArrayList<>();
	public int indicador=0;
	private int indicadorPanel=0;
	
	public int indicadorCocheSeleccionado = 0;
	private JLabel lblSolicitud;

	public void modificarIndicador(int indicador) {
		this.indicador = indicador;
	}
	
	public void ocultarCoche(int numeroCoche) {
		switch(numeroCoche) {
		case 1: lblFerrariLuce.setEnabled(false); break;
		case 2: lbl849Testarossa.setEnabled(false); break;
		case 3: lbl849TestarossaSpider.setEnabled(false); break;
		case 4: lbl296GTB.setEnabled(false); break;
		case 5: lbl296GTS.setEnabled(false); break;
		case 6: lblFerrari12Cilindri.setEnabled(false); break;
		case 7: lblFerrari12CilindriSpider.setEnabled(false); break;
		case 8: lblFerrariPurosangre.setEnabled(false); break;
		case 9: lblFerrariAmalfi.setEnabled(false); break;
		}
	}
	
	public void mostrarCoche(int numeroCoche) {
		switch(numeroCoche) {
		case 1: lblFerrariLuce.setEnabled(true); break;
		case 2: lbl849Testarossa.setEnabled(true); break;
		case 3: lbl849TestarossaSpider.setEnabled(true); break;
		case 4: lbl296GTB.setEnabled(true); break;
		case 5: lbl296GTS.setEnabled(true); break;
		case 6: lblFerrari12Cilindri.setEnabled(true); break;
		case 7: lblFerrari12CilindriSpider.setEnabled(true); break;
		case 8: lblFerrariPurosangre.setEnabled(true); break;
		case 9: lblFerrariAmalfi.setEnabled(true); break;
		}
	}
	
	private void ocultarLabelsNoClick(ArrayList<JLabel> labels, String textoLabelSeleccionado) {
		for (JLabel label : labels) {
			if (label.getText() == textoLabelSeleccionado) {
				label.setForeground(new Color(255, 255, 255));
				
				if (indicador == 0) {
					panelAuto.setVisible(true);
					indicador = 1;
				}
				
				switch (textoLabelSeleccionado) {
				case "Ferrari Luce":
					this.indicadorCocheSeleccionado = 1;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_1_rend.jpeg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_2_rend.jpg")));
					break;
					
				case "849 Testarossa":
					this.indicadorCocheSeleccionado = 2;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_3_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_4_rend.jpg")));
					break;
					
				case "849 Testarossa Spider":
					this.indicadorCocheSeleccionado = 3;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_5_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_6_rend.jpg")));
					break;
					
				case "296 GTB":
					this.indicadorCocheSeleccionado = 4;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_7_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_8_rend.jpg")));
					break;
					
				case "296 GTS":
					this.indicadorCocheSeleccionado = 5;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_9_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_10_rend.jpg")));
					break;
					
				case "Ferrari 12 Cilindri":
					this.indicadorCocheSeleccionado = 6;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_11_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_12_rend.jpg")));
					break;
					
				case "Ferrari 12 Cilindri Spider":
					this.indicadorCocheSeleccionado = 7;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_13_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_14_rend.jpg")));
					break;
					
				case "Ferrari Purosangre":
					this.indicadorCocheSeleccionado = 8;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_15_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_16_rend.jpg")));
					break;
					
				case "Ferrari Amalfi":
					this.indicadorCocheSeleccionado = 9;
					lblFerrariNombre.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_17_rend.jpg")));
					lblFerrariImg.setIcon(new ImageIcon(Vehiculos.class.getResource("/recursos/imagenes/imagenes_vehiculos/imagen_18_rend.jpg")));
					break;
				}
			}
			
			else {
				label.setForeground(new Color(162, 162, 162));
			}
		}
		
	}
	
	private void propiedadClick(ArrayList<JLabel> labels) {
		for (int i = 0; i < labels.size(); i++) {
			JLabel labelIterador = labels.get(i);
			
			labelIterador.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if (labelIterador.isEnabled()) {
						ocultarLabelsNoClick(labels, labelIterador.getText());
					}
				}
			});
		}
	}
	
	/**
	 * Create the panel.
	 */
	public Vehiculos(menu ventanaMenu) {
		this.ventanaMenu = ventanaMenu;
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
		
		lblFerrariLuce = new JLabel("Ferrari Luce");
		lblFerrariLuce.addMouseListener(this);
		lblFerrariLuce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariLuce.setForeground(new Color(162, 162, 162));
		lblFerrariLuce.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lblFerrariLuce.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariLuce);
		labelsCoches.add(lblFerrariLuce);
		
		lbl849Testarossa = new JLabel("849 Testarossa");
		lbl849Testarossa.addMouseListener(this);
		lbl849Testarossa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl849Testarossa.setForeground(new Color(162, 162, 162));
		lbl849Testarossa.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lbl849Testarossa.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl849Testarossa);
		labelsCoches.add(lbl849Testarossa);
		
		lbl849TestarossaSpider = new JLabel("849 Testarossa Spider");
		lbl849TestarossaSpider.addMouseListener(this);
		lbl849TestarossaSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl849TestarossaSpider.setForeground(new Color(162, 162, 162));
		lbl849TestarossaSpider.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lbl849TestarossaSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl849TestarossaSpider);
		labelsCoches.add(lbl849TestarossaSpider);
		
		lbl296GTB = new JLabel("296 GTB");
		lbl296GTB.addMouseListener(this);
		lbl296GTB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl296GTB.setForeground(new Color(162, 162, 162));
		lbl296GTB.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lbl296GTB.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl296GTB);
		labelsCoches.add(lbl296GTB);
		
		lbl296GTS = new JLabel("296 GTS");
		lbl296GTS.addMouseListener(this);
		lbl296GTS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl296GTS.setForeground(new Color(162, 162, 162));
		lbl296GTS.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lbl296GTS.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lbl296GTS);
		labelsCoches.add(lbl296GTS);
		
		lblFerrari12Cilindri = new JLabel("Ferrari 12 Cilindri");
		lblFerrari12Cilindri.addMouseListener(this);
		lblFerrari12Cilindri.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrari12Cilindri.setForeground(new Color(162, 162, 162));
		lblFerrari12Cilindri.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lblFerrari12Cilindri.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrari12Cilindri);
		labelsCoches.add(lblFerrari12Cilindri);
		
		lblFerrari12CilindriSpider = new JLabel("Ferrari 12 Cilindri Spider");
		lblFerrari12CilindriSpider.addMouseListener(this);
		lblFerrari12CilindriSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrari12CilindriSpider.setForeground(new Color(162, 162, 162));
		lblFerrari12CilindriSpider.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lblFerrari12CilindriSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrari12CilindriSpider);
		labelsCoches.add(lblFerrari12CilindriSpider);
		
		lblFerrariPurosangre = new JLabel("Ferrari Purosangre");
		lblFerrariPurosangre.addMouseListener(this);
		lblFerrariPurosangre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariPurosangre.setForeground(new Color(162, 162, 162));
		lblFerrariPurosangre.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lblFerrariPurosangre.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariPurosangre);
		labelsCoches.add(lblFerrariPurosangre);
		
		lblFerrariAmalfi = new JLabel("Ferrari Amalfi");
		lblFerrariAmalfi.addMouseListener(this);
		lblFerrariAmalfi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariAmalfi.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfi.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lblFerrariAmalfi.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariAmalfi);
		labelsCoches.add(lblFerrariAmalfi);
		
		lblFerrariAmalfiSpider = new JLabel("Ferrari Amalfi Spider");
		lblFerrariAmalfiSpider.setFocusable(false);
		lblFerrariAmalfiSpider.setEnabled(false);
		lblFerrariAmalfiSpider.setVisible(false);
		lblFerrariAmalfiSpider.addMouseListener(this);
		lblFerrariAmalfiSpider.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFerrariAmalfiSpider.setForeground(new Color(162, 162, 162));
		lblFerrariAmalfiSpider.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		lblFerrariAmalfiSpider.setBorder(new EmptyBorder(0, 0, 10, 0));
		panelModelos.add(lblFerrariAmalfiSpider);
		
		propiedadClick(labelsCoches);
		
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
		lblDescubrirMas.setBounds(60, 296, 146, 49);
		lblDescubrirMas.setFont(new Font("Ferrari Sans", Font.BOLD, 11));
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
		
		lblSolicitud = new JLabel("<html>\r\nSOLICITAR\r\n</html>");
		lblSolicitud.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventanaMenu.mostrarPanel(ventanaMenu.getPanelSolicitud());
			}
		});
		lblSolicitud.setForeground(Color.WHITE);
		lblSolicitud.setFont(new Font("Ferrari Sans", Font.BOLD, 11));
		lblSolicitud.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSolicitud.setBounds(new Rectangle(5, 5, 0, 0));
		lblSolicitud.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255)), new EmptyBorder(10, 32, 10, 10)));
		lblSolicitud.setBounds(224, 296, 146, 49);
		panelContenidoAuto.add(lblSolicitud);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBorder(new EmptyBorder(20, 0, 0, 0));
		add(panel_2, BorderLayout.WEST);
		
		lblT = new JLabel("Todos los modelos");
		lblT.addMouseListener(this);
		lblT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblT.setForeground(new Color(255, 255, 255));
		lblT.setFont(new Font("Ferrari Sans", Font.BOLD, 9));
		panel_2.add(lblT);
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblDescubrirMas) {
			mouseClickedLblDescubrirMas(e);
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
	
	protected void mouseClickedLblDescubrirMas(MouseEvent e) {
		switch(this.indicadorCocheSeleccionado) {
		case 1: ventanaMenu.mostrarPanel(ventanaMenu.getFerrariLuce()); modificarIndicador(0); break;
		case 2: ventanaMenu.mostrarPanel(ventanaMenu.getFerrari849Testarossa()); modificarIndicador(0); break;
		case 3: ventanaMenu.mostrarPanel(ventanaMenu.getFerrari849TestarossaSpider()); modificarIndicador(0); break;
		case 4: ventanaMenu.mostrarPanel(ventanaMenu.getFerrari296GTB()); modificarIndicador(0); break;
		case 5: ventanaMenu.mostrarPanel(ventanaMenu.getFerrari296GTS()); modificarIndicador(0); break;
		case 6: ventanaMenu.mostrarPanel(ventanaMenu.getFerrari12Cilindri()); modificarIndicador(0); break;
		case 7: ventanaMenu.mostrarPanel(ventanaMenu.getFerrari12CilindriSpider()); modificarIndicador(0); break;
		case 8: ventanaMenu.mostrarPanel(ventanaMenu.getFerrariPurosangue()); modificarIndicador(0); break;
		case 9: ventanaMenu.mostrarPanel(ventanaMenu.getFerrariAmalfi()); modificarIndicador(0); break;
		// case 10 es el de Ferrari Amalfi Spider, que todavía no tiene el diseño de su panel.
		}
	}
}
