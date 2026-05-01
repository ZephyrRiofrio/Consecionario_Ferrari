package codigo.paneles;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentasVehiculos extends JPanel implements MouseListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel PC;
	private JLabel lblNewLabel;
	private JCheckBox chckbx3;
	private JTextField txtCorreoElectrnico;
	private JTextField txtNombre;
	private JTextField txtTelfono;
	private JTextField txtApellido;
	private JLabel lblNewLabel_2;
	private JComboBox cbxP;
	private JLabel lblNewLabel_3;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JLabel errorP;
	private JLabel errorN;
	private JLabel errorA;
	private JLabel errorCE;
	private JLabel lblNewLabel_8;
	private JComboBox cbxC;
	private JLabel errorCi;
	private JLabel errorT;
	private JLabel errorO;
	private JTextField txtPrecio;
	private JButton btnEnviar;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	
	String nombre, apellido, correo, telf;
	int pais, ciudad;
	private JLabel errorN2;
	private JLabel errorA2;
	private JLabel errorCE2;
	private JLabel errorT2;

	/**
	 * Create the panel.
	 */
	public VentasVehiculos() {
		setPreferredSize(new Dimension(790, 800));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 790, 100);
		panel.setPreferredSize(new Dimension(10, 100));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("<html><center>\r\nPor favor, completa este formulario para recibir información detallada. Un concesionario Ferrari se pondrá enseguida en<br> \r\ncontacto contigo.\r\n</center></html>");
		lblNewLabel.setPreferredSize(new Dimension(684, 95));
		panel.add(lblNewLabel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 600, 790, 200);
		panel_1.setPreferredSize(new Dimension(10, 200));
		add(panel_1);
		panel_1.setLayout(null);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(this);
		btnEnviar.setContentAreaFilled(false);
		btnEnviar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.setFont(new Font("Host Grotesk ExtraBold", Font.BOLD, 12));
		btnEnviar.setBounds(54, 35, 120, 50);
		panel_1.add(btnEnviar);
		
		PC = new JPanel();
		PC.setBounds(new Rectangle(0, 0, 0, 30));
		PC.setBounds(0, 100, 790, 500);
		PC.setPreferredSize(new Dimension(10, 100));
		add(PC);
		PC.setLayout(null);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.addMouseListener(this);
		txtCorreoElectrnico.setOpaque(false);
		txtCorreoElectrnico.setBackground(new Color(240, 240, 240));
		txtCorreoElectrnico.setText(" Correo electrónico");
		txtCorreoElectrnico.setForeground(new Color(140, 140, 140));
		txtCorreoElectrnico.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		txtCorreoElectrnico.setBorder(null);
		txtCorreoElectrnico.setBounds(new Rectangle(0, 0, 0, 30));
		txtCorreoElectrnico.setBounds(50, 188, 691, 30);
		PC.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.addMouseListener(this);
		txtNombre.setOpaque(false);
		txtNombre.setBackground(new Color(240, 240, 240));
		txtNombre.setForeground(new Color(140, 140, 140));
		txtNombre.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		txtNombre.setText(" Nombre");
		txtNombre.setBorder(null);
		txtNombre.setBounds(new Rectangle(0, 0, 0, 30));
		txtNombre.setBounds(50, 138, 335, 30);
		PC.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtTelfono = new JTextField();
		txtTelfono.addMouseListener(this);
		txtTelfono.setOpaque(false);
		txtTelfono.setBackground(new Color(240, 240, 240));
		txtTelfono.setText(" Teléfono");
		txtTelfono.setForeground(new Color(140, 140, 140));
		txtTelfono.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		txtTelfono.setBorder(null);
		txtTelfono.setBounds(new Rectangle(0, 0, 0, 30));
		txtTelfono.setBounds(50, 238, 691, 30);
		PC.add(txtTelfono);
		txtTelfono.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.addMouseListener(this);
		txtApellido.setOpaque(false);
		txtApellido.setBackground(new Color(240, 240, 240));
		txtApellido.setText(" Apellido");
		txtApellido.setForeground(new Color(140, 140, 140));
		txtApellido.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		txtApellido.setBorder(null);
		txtApellido.setBounds(406, 138, 335, 30);
		PC.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblNewLabel_2 = new JLabel("País");
		lblNewLabel_2.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(50, 72, 32, 16);
		PC.add(lblNewLabel_2);
		
		cbxP = new JComboBox();
		cbxP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbxP.setModel(new DefaultComboBoxModel(new String[] {"", "Perú", "Ecuador", "Colombia", "Bolivia", "Chile"}));
		cbxP.setBorder(new EmptyBorder(0, 0, 0, 0));
		cbxP.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		cbxP.setBounds(50, 88, 691, 30);
		PC.add(cbxP);
		
		lblNewLabel_3 = new JLabel("Prefiero que se contacten conmigo a través de");
		lblNewLabel_3.setForeground(new Color(140, 140, 140));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(50, 329, 224, 14);
		PC.add(lblNewLabel_3);
		
		chckbxNewCheckBox = new JCheckBox("Correo electrónico");
		chckbxNewCheckBox.setFocusPainted(false);
		chckbxNewCheckBox.setFocusable(false);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setContentAreaFilled(false);
		chckbxNewCheckBox.setForeground(new Color(140, 140, 140));
		chckbxNewCheckBox.setBounds(50, 350, 142, 23);
		PC.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Teléfono");
		chckbxNewCheckBox_1.setContentAreaFilled(false);
		chckbxNewCheckBox_1.setForeground(new Color(140, 140, 140));
		chckbxNewCheckBox_1.setBounds(194, 350, 97, 23);
		PC.add(chckbxNewCheckBox_1);
		
		errorP = new JLabel("Seleccione su País");
		errorP.setVisible(false);
		errorP.setForeground(new Color(255, 0, 0));
		errorP.setBounds(92, 73, 145, 14);
		PC.add(errorP);
		
		errorN = new JLabel("Ingrese su nombre");
		errorN.setVisible(false);
		errorN.setForeground(new Color(255, 0, 0));
		errorN.setBounds(50, 122, 142, 14);
		PC.add(errorN);
		
		errorA = new JLabel("Ingrese su Apellido");
		errorA.setVisible(false);
		errorA.setForeground(new Color(255, 0, 0));
		errorA.setBounds(406, 122, 164, 14);
		PC.add(errorA);
		
		errorCE = new JLabel("Ingrese un correo electrónico válido");
		errorCE.setVisible(false);
		errorCE.setForeground(new Color(255, 0, 0));
		errorCE.setBounds(50, 179, 241, 14);
		PC.add(errorCE);
		
		lblNewLabel_8 = new JLabel("Ciudad");
		lblNewLabel_8.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(50, 273, 45, 14);
		PC.add(lblNewLabel_8);
		
		cbxC = new JComboBox();
		cbxC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbxC.setModel(new DefaultComboBoxModel(new String[] {"", "Lima", "Quito", "Bogotá", "La paz", "Santiago"}));
		cbxC.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		cbxC.setBorder(null);
		cbxC.setBounds(50, 288, 335, 30);
		PC.add(cbxC);
		
		errorCi = new JLabel("Seleccione su ciudad");
		errorCi.setVisible(false);
		errorCi.setForeground(new Color(255, 0, 0));
		errorCi.setBounds(105, 273, 144, 14);
		PC.add(errorCi);
		
		errorT = new JLabel("Ingrese un teléfono válido");
		errorT.setVisible(false);
		errorT.setForeground(new Color(255, 0, 0));
		errorT.setBounds(50, 223, 199, 14);
		PC.add(errorT);
		
		errorO = new JLabel("Seleccione una opción");
		errorO.setVisible(false);
		errorO.setForeground(new Color(255, 0, 0));
		errorO.setBounds(55, 374, 145, 14);
		PC.add(errorO);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBorder(null);
		txtPrecio.setBounds(406, 288, 335, 30);
		PC.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		chckbx3 = new JCheckBox("\r\nME GUSTARÍA RECIBIR MÁS INFORMACIÓN SOBRE LAS OPCIONES DE FINANCIACIÓN");
		chckbx3.setContentAreaFilled(false);
		chckbx3.setBounds(50, 468, 493, 25);
		PC.add(chckbx3);
		chckbx3.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		
		separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(50, 165, 335, 2);
		PC.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(406, 165, 335, 2);
		PC.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setForeground(new Color(0, 0, 0));
		separator_2.setBounds(50, 264, 691, 2);
		PC.add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(new Color(0, 0, 0));
		separator_3.setBounds(50, 214, 691, 2);
		PC.add(separator_3);
		
		errorN2 = new JLabel("Ingrese un nombre válido");
		errorN2.setVisible(false);
		errorN2.setForeground(new Color(255, 0, 0));
		errorN2.setBounds(50, 122, 187, 14);
		PC.add(errorN2);
		
		errorA2 = new JLabel("Ingrese un apellido válido");
		errorA2.setVisible(false);
		errorA2.setForeground(new Color(255, 0, 0));
		errorA2.setBounds(406, 122, 199, 14);
		PC.add(errorA2);
		
		errorCE2 = new JLabel("Ingrese su correo electrónico");
		errorCE2.setVisible(false);
		errorCE2.setForeground(new Color(255, 0, 0));
		errorCE2.setBounds(50, 179, 224, 14);
		PC.add(errorCE2);
		
		errorT2 = new JLabel("Ingrese un número telefónico");
		errorT2.setVisible(false);
		errorT2.setForeground(new Color(255, 0, 0));
		errorT2.setBounds(50, 223, 199, 14);
		PC.add(errorT2);
		
		validacion();
		leer();
		dctos();
		proceso();
		salida();
		borrarD();

	}
	private boolean validacion() {
		if (cbxP.getSelectedIndex() == 0) {
			errorP.setVisible(true);
			return false;
		}
		if(txtNombre.getText().isEmpty() || txtNombre.getText() == "Nombre" ) {
			errorN.setVisible(true);
			return false;
		}
		if(txtApellido.getText().isEmpty() || txtApellido.getText() == "Apellido" ) {
			errorA.setVisible(true);
			return false;
		}
		if (txtTelfono.getText().length() != 9) {
		    errorT.setVisible(true);
		    return false;
		}
		if (cbxC.getSelectedIndex() == 0) {
			errorCi.setVisible(true);
			return false;
		}
		return true;
	}
	private void leer() {
		// TODO Auto-generated method stub
		
	}
	private void dctos() {
		// TODO Auto-generated method stub
		
	}
	private void proceso() {
		// TODO Auto-generated method stub
		
	}
	private void salida() {
		// TODO Auto-generated method stub
		
	}
	
	private void borrarD() {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == txtTelfono) {
			mousePressedTxtTelfono(e);
		}
		if (e.getSource() == txtCorreoElectrnico) {
			mousePressedTxtCorreoElectrnico(e);
		}
		if (e.getSource() == txtApellido) {
			mousePressedTxtApellido(e);
		}
		if (e.getSource() == txtNombre) {
			mousePressedTxtNombre(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mousePressedTxtNombre(MouseEvent e) {
		txtNombre.setText("");
		txtNombre.setForeground(Color.black);
	}
	protected void mousePressedTxtApellido(MouseEvent e) {
		txtApellido.setText("");
		txtApellido.setForeground(Color.black);
	}
	protected void mousePressedTxtCorreoElectrnico(MouseEvent e) {
		txtCorreoElectrnico.setText("");
		txtCorreoElectrnico.setForeground(Color.black);
	}
	protected void mousePressedTxtTelfono(MouseEvent e) {
		txtTelfono.setText("");
		txtTelfono.setForeground(Color.black);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnviar) {
			actionPerformedBtnEnviar(e);
		}
	}
	protected void actionPerformedBtnEnviar(ActionEvent e) {
		validacion();
	}
}
