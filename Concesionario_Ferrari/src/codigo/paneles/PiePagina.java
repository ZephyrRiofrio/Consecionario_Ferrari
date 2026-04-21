package codigo.paneles;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class PiePagina extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel primera_fila;
	private JPanel segunda_fila;
	private JPanel tercera_fila;
	private JPanel panel;
	private JSeparator separator;
	private JLabel lblCopyright;

	/**
	 * Create the panel.
	 */
	public PiePagina() {
		setPreferredSize(new Dimension(720, 100));
		setBackground(new Color(0, 0, 0));
		setLayout(new GridLayout(3, 1, 0, 0));
		
		primera_fila = new JPanel();
		primera_fila.setBackground(new Color(0, 0, 0));
		add(primera_fila);
		
		segunda_fila = new JPanel();
		segunda_fila.setBorder(new EmptyBorder(15, 15, 0, 15));
		segunda_fila.setBackground(new Color(0, 0, 0));
		add(segunda_fila);
		segunda_fila.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		segunda_fila.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		separator = new JSeparator();
		panel.add(separator);
		
		tercera_fila = new JPanel();
		tercera_fila.setBorder(new EmptyBorder(0, 15, 0, 0));
		FlowLayout flowLayout = (FlowLayout) tercera_fila.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		tercera_fila.setBackground(new Color(0, 0, 0));
		add(tercera_fila);
		
		lblCopyright = new JLabel("Copyright 2026 - Todos los derechos reservados");
		lblCopyright.setForeground(new Color(255, 255, 255));
		tercera_fila.add(lblCopyright);

	}

}
