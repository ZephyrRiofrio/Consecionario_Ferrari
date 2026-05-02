package codigo.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.Timer;

import codigo.paneles.*;
import codigo.paneles.paneles_vehiculos.*;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame implements MouseListener, ActionListener {

	private static final long serialVersionUID = 1L;
	public boolean esVisible = true;
	private JPanel contentPane;
	private JPanel menu_bar;
	private JPanel menu_panel;
	private JPanel menu_barra_2;
	private JPanel menu_barra_1;
	private JToolBar barra_1;
	private JToolBar barra_2;
	private JLabel lblLogoMenu;
	private JButton btnVehiculos;
	private JButton btnNoticias;
	private JButton btnSobreNosotros;
	private JButton btnMantenimiento;
	private JPanel panelMenu_barra_1;
	private JScrollPane contenido;
	
	private boolean esAdmin = false;

	private Vehiculos panelVehiculos = new Vehiculos();
	private Inicio panelInicio = new Inicio();
	private VentasVehiculos panelVentas = new VentasVehiculos();
	private Noticias panelNoticias = new Noticias();
	private SobreNosotros panelSobreNosotros = new SobreNosotros();
	private Mantenimiento panelMantenimiento = new Mantenimiento();
	
	private Ferrari_Luce paginaFerrariLuce = new Ferrari_Luce();
	private Ferrari12Cilindri paginaFerrari12Cilindri = new Ferrari12Cilindri();
	private Ferrari12CilindriSpider paginaFerrari12CilindriSpider = new Ferrari12CilindriSpider();
	private Ferrari296GTB paginaFerrari296GTB = new Ferrari296GTB();
	private Ferrari296GTS paginaFerrari296GTS = new Ferrari296GTS();
	private Ferrari849Testarossa paginaFerrari849Testarrosa = new Ferrari849Testarossa();
	private Ferrari849TestarossaSpider paginaFerrari849TestarrosaSpider = new Ferrari849TestarossaSpider();
	private FerrariAmalfi paginaFerrariAmalfi = new FerrariAmalfi();
	private FerrariPurosangue paginaFerrariPurosangue = new FerrariPurosangue();
	
	private Acceso ventanaAcceso;
	private JLabel lblCerrarSesion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Acceso ventanaAcceso = new Acceso();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaAcceso.setVisible(true);
					ventanaAcceso.setLocationRelativeTo(null);
					menu frame = new menu(ventanaAcceso);
					frame.setLocationRelativeTo(null);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void mostrarPanel(JPanel panel) {
		panel.setSize(790, 460);
		panel.setLocation(0, 0);
		
		contenido.setViewportView(panel);
	}
	
	public void modificarEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}
	
	public void modificarVisible(boolean esVisible) {
		this.setVisible(esVisible);
	}
	
	/**
	 * Create the frame.
	 */
	public menu(Acceso acceso) {
		setPreferredSize(new Dimension(790, 500));
		this.ventanaAcceso = acceso;
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(menu.class.getResource("/recursos/imagenes/imagenes_ventana/logo.png")));
		setTitle("Ferrari");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		menu_bar = new JPanel();
		menu_bar.setBorder(new EmptyBorder(0, 0, 0, 0));
		menu_bar.setBackground(Color.BLACK);
		contentPane.add(menu_bar, BorderLayout.NORTH);
		
		menu_panel = new JPanel();
		menu_panel.setBackground(Color.BLACK);
		menu_panel.setPreferredSize(new Dimension(775, 80));
		menu_bar.add(menu_panel);
		menu_panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		menu_barra_1 = new JPanel();
		menu_barra_1.setBackground(Color.BLACK);
		menu_panel.add(menu_barra_1);
		menu_barra_1.setLayout(new BorderLayout(0, 0));
		
		panelMenu_barra_1 = new JPanel();
		panelMenu_barra_1.setBackground(Color.BLACK);
		menu_barra_1.add(panelMenu_barra_1, BorderLayout.CENTER);
		
		barra_1 = new JToolBar();
		panelMenu_barra_1.add(barra_1);
		barra_1.setBorder(new EmptyBorder(2, 0, 2, 75));
		barra_1.setFloatable(false);
		barra_1.setBackground(Color.BLACK);
		
		lblLogoMenu = new JLabel("");
		lblLogoMenu.addMouseListener(this);
		lblLogoMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogoMenu.setIcon(new ImageIcon(menu.class.getResource("/recursos/imagenes/imagenes_menu/menu_logo.jpg")));
		lblLogoMenu.setPreferredSize(new Dimension(30, 30));
		barra_1.add(lblLogoMenu);
		
		lblCerrarSesion = new JLabel("New label");
		lblCerrarSesion.addMouseListener(this);
		lblCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCerrarSesion.setIcon(new ImageIcon(menu.class.getResource("/recursos/imagenes/imagenes_menu/flecha_presentacion_2.png")));
		lblCerrarSesion.setPreferredSize(new Dimension(30, 30));
		menu_barra_1.add(lblCerrarSesion, BorderLayout.WEST);
		
		menu_barra_2 = new JPanel();
		menu_barra_2.setBackground(Color.BLACK);
		menu_panel.add(menu_barra_2);
		menu_barra_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		barra_2 = new JToolBar();
		barra_2.setBorder(new EmptyBorder(2, 0, 2, 0));
		barra_2.setBackground(Color.BLACK);
		barra_2.setFloatable(false);
		menu_barra_2.add(barra_2);
		
		btnVehiculos = new JButton("Vehículos");
		btnVehiculos.addActionListener(this);
		btnVehiculos.addMouseListener(this);
		btnVehiculos.setFocusPainted(false);
		btnVehiculos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVehiculos.setContentAreaFilled(false);
		btnVehiculos.setBackground(Color.BLACK);
		btnVehiculos.setForeground(Color.WHITE);
		btnVehiculos.setBorder(new EmptyBorder(5, 20, 5, 20));
		btnVehiculos.setFont(new Font("Ferrari Sans", Font.PLAIN, 12));
		barra_2.add(btnVehiculos);
		
		btnNoticias = new JButton("Noticias");
		btnNoticias.addActionListener(this);
		btnNoticias.setFocusPainted(false);
		btnNoticias.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNoticias.setContentAreaFilled(false);
		btnNoticias.setBackground(Color.BLACK);
		btnNoticias.setForeground(Color.WHITE);
		btnNoticias.setBorder(new EmptyBorder(5, 20, 5, 20));
		btnNoticias.setFont(new Font("Ferrari Sans", Font.PLAIN, 12));
		barra_2.add(btnNoticias);
		
		btnSobreNosotros = new JButton("Sobre nosotros");
		btnSobreNosotros.addActionListener(this);
		btnSobreNosotros.setFocusPainted(false);
		btnSobreNosotros.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobreNosotros.setContentAreaFilled(false);
		btnSobreNosotros.setBackground(Color.BLACK);
		btnSobreNosotros.setForeground(Color.WHITE);
		btnSobreNosotros.setBorder(new EmptyBorder(5, 20, 5, 20));
		btnSobreNosotros.setFont(new Font("Ferrari Sans", Font.PLAIN, 12));
		barra_2.add(btnSobreNosotros);
		
		btnMantenimiento = new JButton("Mantenimiento");
		btnMantenimiento.addActionListener(this);
		btnMantenimiento.setFocusPainted(false);
		btnMantenimiento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMantenimiento.setContentAreaFilled(false);
		btnMantenimiento.setBackground(Color.BLACK);
		btnMantenimiento.setForeground(Color.WHITE);
		btnMantenimiento.setBorder(new EmptyBorder(5, 20, 5, 20));
		btnMantenimiento.setFont(new Font("Ferrari Sans", Font.PLAIN, 12));
		
		Timer timerMantenimiento = new Timer(5, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panelMantenimiento.habilitar) {
					panelMantenimiento.modificarHabilitar(false);
					panelVehiculos.mostrarCoche(panelMantenimiento.numeroCocheSeleccionado);
				}
				
				if (panelMantenimiento.ocultar) {
					panelMantenimiento.modificarOcultar(false);
					panelVehiculos.ocultarCoche(panelMantenimiento.numeroCocheSeleccionado);
				}
				
				if (panelMantenimiento.borrar) {
					panelMantenimiento.modificarBorrar(false);
					
					switch (panelMantenimiento.numeroUsuarioSeleccionado) {
					case 1: ventanaAcceso.borrarUsuario1(); break;
					case 2: ventanaAcceso.borrarUsuario2(); break;
					}
					
					panelMantenimiento.modificarUsuarioSeleccionado(0);
				}
			}
		});
		
		Timer timerAdmin = new Timer(5, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ventanaAcceso.esAdmin) {
					barra_2.add(btnMantenimiento);
					timerMantenimiento.start();
					
					if (!(ventanaAcceso.correoUsuario1.equals(""))) {
						panelMantenimiento.mostrarUsuario1(ventanaAcceso.correoUsuario1);
					}
					
					if (!(ventanaAcceso.correoUsuario2.equals(""))) {
						panelMantenimiento.mostrarUsuario2(ventanaAcceso.correoUsuario2);
					}
				}
			}
		});
		
		timerAdmin.setRepeats(true);
		timerAdmin.start();
		
		contenido = new JScrollPane();
		contenido.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		contenido.setBorder(new EmptyBorder(0, 0, 0, 0));
		contenido.getVerticalScrollBar().setUnitIncrement(30);
		contenido.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contenido.setPreferredSize(new Dimension(810, 361));
		contentPane.add(contenido, BorderLayout.CENTER);
		
		mostrarPanel(panelInicio);
		
		Timer timerAcceso = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (ventanaAcceso.acceso) {
					modificarVisible(true);
					ventanaAcceso.setVisible(false);
				}
			}
		});
		
		timerAcceso.setRepeats(true);
		timerAcceso.start();
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblCerrarSesion) {
			mouseClickedLblCerrarSesion(e);
		}
		if (e.getSource() == btnVehiculos) {
			mouseClickedBtnVehiculos(e);
		}
		if (e.getSource() == lblLogoMenu) {
			mouseClickedLblLogoMenu(e);
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
	protected void mouseClickedLblLogoMenu(MouseEvent e) {
		mostrarPanel(panelInicio);
	}
	protected void mouseClickedBtnVehiculos(MouseEvent e) {
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSobreNosotros) {
			actionPerformedBtnSobreNosotros(e);
		}
		if (e.getSource() == btnNoticias) {
			actionPerformedBtnNoticias(e);
		}
		if (e.getSource() == btnVehiculos) {
			actionPerformedBtnVehiculos(e);
		}
		if (e.getSource() == btnMantenimiento) {
			actionPerformedBtnMantenimiento(e);
		}
	}
	protected void actionPerformedBtnVehiculos(ActionEvent e) {
		mostrarPanel(panelVehiculos);
		
		Timer timerSaber = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panelVehiculos.botonPresionado == true) {
					switch(panelVehiculos.indicadorCocheSeleccionado) {
					case 1: mostrarPanel(paginaFerrariLuce); panelVehiculos.modificarIndicador(0); break;
					case 2: mostrarPanel(paginaFerrari849Testarrosa); panelVehiculos.modificarIndicador(0); break;
					case 3: mostrarPanel(paginaFerrari849TestarrosaSpider); panelVehiculos.modificarIndicador(0); break;
					case 4: mostrarPanel(paginaFerrari296GTB); panelVehiculos.modificarIndicador(0); break;
					case 5: mostrarPanel(paginaFerrari296GTS); panelVehiculos.modificarIndicador(0); break; 
					case 6: mostrarPanel(paginaFerrari12Cilindri); panelVehiculos.modificarIndicador(0); break;
					case 7: mostrarPanel(paginaFerrari12CilindriSpider); panelVehiculos.modificarIndicador(0); break;
					case 8: mostrarPanel(paginaFerrariPurosangue); panelVehiculos.modificarIndicador(0); break;
					case 9: mostrarPanel(paginaFerrariAmalfi); panelVehiculos.modificarIndicador(0); break;
					case 10: mostrarPanel(paginaFerrari849Testarrosa); panelVehiculos.modificarIndicador(0); break;
					}
					
					panelVehiculos.botonPresionado = false;
					((Timer) e.getSource()).stop();
					
				}
			}
		});
		
		timerSaber.setRepeats(true);
		timerSaber.start();
		
		Timer timerSolicitud = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (panelVehiculos.indicadorSolicitud) {
					panelVehiculos.modificarSolicitud(false);
					mostrarPanel(panelVentas);
					((Timer) e.getSource()).stop();
				}
			}
		});
		
		timerSolicitud.setRepeats(true);
		timerSolicitud.start();
	}
	protected void actionPerformedBtnNoticias(ActionEvent e) {
		mostrarPanel(panelNoticias);
	}
	protected void actionPerformedBtnSobreNosotros(ActionEvent e) {
		mostrarPanel(panelSobreNosotros);
	}
	protected void actionPerformedBtnMantenimiento(ActionEvent e) {
		mostrarPanel(panelMantenimiento);
	}
	protected void mouseClickedLblCerrarSesion(MouseEvent e) {
		mostrarPanel(panelInicio);
		this.setVisible(false);
		ventanaAcceso.setVisible(true);
		ventanaAcceso.modificarAcceso(false);
		if (ventanaAcceso.esAdmin) {
			ventanaAcceso.modificarEsAdmin(false);
			barra_2.remove(btnMantenimiento);
		}
	}
}
