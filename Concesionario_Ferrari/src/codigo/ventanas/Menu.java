package codigo.ventanas;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import codigo.paneles.*;

public class Menu extends JFrame implements MouseListener, ActionListener {

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

	private Vehiculos panelVehiculos = new Vehiculos(this);
	private Mantenimiento panelMantenimiento = new Mantenimiento(this);
	
	public Acceso ventanaAcceso = new Acceso(this);
	private JLabel lblCerrarSesion;
	
	public JToolBar getBarra_2() {
		return this.barra_2;
	}
	
	public JButton getBtnMantenimiento() {
		return this.btnMantenimiento;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setLocationRelativeTo(null);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void mostrarPanel(JPanel panel) {
		panel.setSize(790, 460);
		panel.setLocation(0, 0);
		
		contenido.setViewportView(panel);
	}
	
	public void modificarVisible(boolean esVisible) {
		this.setVisible(esVisible);
	}
	
	public Vehiculos getPanelVehiculos() {
		return this.panelVehiculos;
	}
	
	public Mantenimiento getPanelMantenimiento() {
		return this.panelMantenimiento;
	}
	
	public Acceso getVentanaAcceso() {
		return this.ventanaAcceso;
	}
	
	/**
	 * Create the frame.
	 */
	public Menu() {
		setPreferredSize(new Dimension(790, 500));
		ventanaAcceso.setVisible(true);
		ventanaAcceso.setLocationRelativeTo(null);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/recursos/imagenes/imagenes_ventana/logo.png")));
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
		panelMenu_barra_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelMenu_barra_1.setBackground(Color.BLACK);
		menu_barra_1.add(panelMenu_barra_1, BorderLayout.CENTER);
		panelMenu_barra_1.setLayout(null);
		
		barra_1 = new JToolBar();
		barra_1.setBounds(320, 5, 105, 34);
		panelMenu_barra_1.add(barra_1);
		barra_1.setBorder(new EmptyBorder(2, 0, 2, 75));
		barra_1.setFloatable(false);
		barra_1.setBackground(Color.BLACK);
		
		lblLogoMenu = new JLabel("");
		lblLogoMenu.addMouseListener(this);
		lblLogoMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogoMenu.setIcon(new ImageIcon(Menu.class.getResource("/recursos/imagenes/imagenes_menu/menu_logo.jpg")));
		lblLogoMenu.setPreferredSize(new Dimension(30, 30));
		barra_1.add(lblLogoMenu);
		
		lblCerrarSesion = new JLabel("New label");
		lblCerrarSesion.addMouseListener(this);
		lblCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCerrarSesion.setIcon(new ImageIcon(Menu.class.getResource("/recursos/imagenes/imagenes_menu/flecha_presentacion_2.png")));
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
		
		contenido = new JScrollPane();
		contenido.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		contenido.setBorder(new EmptyBorder(0, 0, 0, 0));
		contenido.getVerticalScrollBar().setUnitIncrement(30);
		contenido.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contenido.setPreferredSize(new Dimension(810, 361));
		contentPane.add(contenido, BorderLayout.CENTER);
		
		mostrarPanel(new Inicio());
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
		mostrarPanel(new Inicio());
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
	}
	protected void actionPerformedBtnNoticias(ActionEvent e) {
		mostrarPanel(new Noticias());
	}
	protected void actionPerformedBtnSobreNosotros(ActionEvent e) {
		mostrarPanel(new SobreNosotros());
	}
	protected void actionPerformedBtnMantenimiento(ActionEvent e) {
		mostrarPanel(panelMantenimiento);
	}
	protected void mouseClickedLblCerrarSesion(MouseEvent e) {
		mostrarPanel(new Inicio());
		this.setVisible(false);
		ventanaAcceso.setVisible(true);
		if (ventanaAcceso.esAdmin) {
			ventanaAcceso.modificarEsAdmin(false);
			barra_2.remove(btnMantenimiento);
		}
	}
}
