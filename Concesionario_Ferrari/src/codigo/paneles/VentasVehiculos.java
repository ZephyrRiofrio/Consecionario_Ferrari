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
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import codigo.ventanas.Boleta;

public class VentasVehiculos extends JPanel implements MouseListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel PC;
	private JLabel lblNewLabel;
	private JCheckBox chckbx3;
	private JTextField txtCE;
	private JTextField txtNombre;
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
	private JLabel errorO;
	private JTextField txtPrecio;
	private JButton btnEnviar;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_3;
	
	String nombre, apellido, correo, telf;
	String pais, ciudad;
	private JLabel errorN2;
	private JLabel errorA2;
	private JLabel errorCE2;
	
	Boleta boleta = new Boleta();
	

	/**
	 * Create the panel.
	 */
	public VentasVehiculos() {
		boleta.setLocationRelativeTo(null);
		boleta.setAlwaysOnTop(true);
		setPreferredSize(new Dimension(790, 800));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 790, 120);
		panel.setPreferredSize(new Dimension(10, 100));
		add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("<html><center>\r\nPor favor, completa este formulario para recibir información detallada. Un concesionario Ferrari se pondrá enseguida en<br> \r\ncontacto contigo.\r\n</center></html>");
		lblNewLabel.setPreferredSize(new Dimension(684, 115));
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
		btnEnviar.setBounds(54, 0, 120, 50);
		panel_1.add(btnEnviar);
		
		PC = new JPanel();
		PC.setBounds(new Rectangle(0, 0, 0, 30));
		PC.setBounds(0, 100, 790, 500);
		PC.setPreferredSize(new Dimension(10, 100));
		add(PC);
		PC.setLayout(null);
		
		txtCE = new JTextField();
		txtCE.addMouseListener(this);
		txtCE.setOpaque(false);
		txtCE.setBackground(new Color(240, 240, 240));
		txtCE.setText("Correo electrónico");
		txtCE.setForeground(new Color(140, 140, 140));
		txtCE.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		txtCE.setBorder(null);
		txtCE.setBounds(new Rectangle(0, 0, 0, 30));
		txtCE.setBounds(55, 188, 691, 30);
		PC.add(txtCE);
		txtCE.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.addMouseListener(this);
		txtNombre.setOpaque(false);
		txtNombre.setBackground(new Color(240, 240, 240));
		txtNombre.setForeground(new Color(140, 140, 140));
		txtNombre.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		txtNombre.setText("Nombre");
		txtNombre.setBorder(null);
		txtNombre.setBounds(new Rectangle(0, 0, 0, 30));
		txtNombre.setBounds(55, 138, 335, 30);
		PC.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.addMouseListener(this);
		txtApellido.setOpaque(false);
		txtApellido.setBackground(new Color(240, 240, 240));
		txtApellido.setText("Apellido");
		txtApellido.setForeground(new Color(140, 140, 140));
		txtApellido.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		txtApellido.setBorder(null);
		txtApellido.setBounds(411, 138, 335, 30);
		PC.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblNewLabel_2 = new JLabel("País");
		lblNewLabel_2.setFont(new Font("Host Grotesk", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(50, 72, 32, 16);
		PC.add(lblNewLabel_2);
		
		cbxP = new JComboBox();
		cbxP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbxP.setModel(new DefaultComboBoxModel(new String[] {"", "Perú", "Ecuador", "Colombia", "Bolivia", "Chile"}));
		cbxP.setSelectedIndex(0);
		cbxP.setBorder(new EmptyBorder(0, 0, 0, 0));
		cbxP.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		cbxP.setBounds(50, 88, 691, 30);
		PC.add(cbxP);
		
		lblNewLabel_3 = new JLabel("Prefiero que se contacten conmigo a través de");
		lblNewLabel_3.setForeground(new Color(140, 140, 140));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(50, 285, 224, 14);
		PC.add(lblNewLabel_3);
		
		chckbxNewCheckBox = new JCheckBox("Correo electrónico");
		chckbxNewCheckBox.setFocusPainted(false);
		chckbxNewCheckBox.setFocusable(false);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setContentAreaFilled(false);
		chckbxNewCheckBox.setForeground(new Color(140, 140, 140));
		chckbxNewCheckBox.setBounds(50, 306, 142, 23);
		PC.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Teléfono");
		chckbxNewCheckBox_1.setContentAreaFilled(false);
		chckbxNewCheckBox_1.setForeground(new Color(140, 140, 140));
		chckbxNewCheckBox_1.setBounds(194, 306, 97, 23);
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
		lblNewLabel_8.setBounds(50, 229, 45, 14);
		PC.add(lblNewLabel_8);
		
		cbxC = new JComboBox();
		cbxC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cbxC.setModel(new DefaultComboBoxModel(new String[] {"", "Lima", "Quito", "Bogotá", "La paz", "Santiago"}));
		cbxC.setSelectedIndex(0);
		cbxC.setFont(new Font("Host Grotesk", Font.PLAIN, 14));
		cbxC.setBorder(null);
		cbxC.setBounds(50, 244, 335, 30);
		PC.add(cbxC);
		
		errorCi = new JLabel("Seleccione su ciudad");
		errorCi.setVisible(false);
		errorCi.setForeground(new Color(255, 0, 0));
		errorCi.setBounds(105, 229, 144, 14);
		PC.add(errorCi);
		
		errorO = new JLabel("Seleccione una opción");
		errorO.setVisible(false);
		errorO.setForeground(new Color(255, 0, 0));
		errorO.setBounds(55, 330, 145, 14);
		PC.add(errorO);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBorder(null);
		txtPrecio.setBounds(406, 288, 335, 30);
		PC.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		chckbx3 = new JCheckBox("\r\nME GUSTARÍA RECIBIR MÁS INFORMACIÓN SOBRE LAS OPCIONES DE FINANCIACIÓN");
		chckbx3.setContentAreaFilled(false);
		chckbx3.setBounds(50, 446, 493, 25);
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
	
		txtNombre.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        txtKey(e);
		    }
		});
		txtApellido.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyTyped(KeyEvent e) {
		        txtKey(e);
		    }
		});
	}
	
	private boolean txtKey(java.awt.event.KeyEvent e) {
		if (!(Character.isLetter(e.getKeyChar())) && !(e.getKeyChar() == KeyEvent.VK_SPACE)) {
			e.consume();
		}
		return true;
	}
	private boolean validacion() {
		boolean datosValidos = true;
		
		if (cbxP.getSelectedIndex() == 0) {
			errorP.setVisible(true);
			datosValidos = false;
		} else {
			errorP.setVisible(false);
		}
		
		if(txtNombre.getText().trim().length() == 0) {
			errorN.setVisible(true);
			errorN2.setVisible(false);
			datosValidos = false;
		} else if (txtNombre.getText().equals("Nombre")) {
			errorN2.setVisible(true);
			errorN.setVisible(false);
			datosValidos = false;
		}else {
			errorN.setVisible(false);
			errorN2.setVisible(false);
		}
		if(txtCE.getText().trim().length() == 0 || txtCE.getText().equals("Correo electrónico")) {
			errorCE2.setVisible(true);
			errorCE.setVisible(false);
			datosValidos = false;
		}else if (!(txtCE.getText().contains("@gmail.com"))){
			errorCE.setVisible(true);
			errorCE2.setVisible(false);
			datosValidos = false;
		}else {
			errorCE2.setVisible(false);
			errorCE.setVisible(false);
		}
		
		if(txtApellido.getText().trim().length() == 0 || txtApellido.getText().equals("Apellido")) {
			errorA.setVisible(true);
			datosValidos = false;
		} else {
			errorA.setVisible(false);
		}
		
		if (cbxC.getSelectedIndex() == 0) {
			errorCi.setVisible(true);
			datosValidos = false;
		} else {
			errorCi.setVisible(false);
		}
		return datosValidos;
	}
	
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == txtCE) {
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
		if (txtNombre.getText().equals("Nombre")) {
			txtNombre.setText("");
		}
		
		if (txtApellido.getText().isEmpty()) {
			txtApellido.setText("Apellido");
			txtApellido.setForeground(Color.gray);
		}
		if (txtCE.getText().isEmpty()) {
			txtCE.setText("Correo electrónico");
			txtCE.setForeground(Color.gray);
		}
		
		txtNombre.setForeground(Color.black);
	}
	
	protected void mousePressedTxtApellido(MouseEvent e) {
		if (txtApellido.getText().equals("Apellido")) {
			txtApellido.setText("");
		}
		
		if (txtNombre.getText().isEmpty()) {
			txtNombre.setText("Nombre");
			txtNombre.setForeground(Color.gray);
		}
		if (txtCE.getText().isEmpty()) {
			txtCE.setText("Correo electrónico");
			txtCE.setForeground(Color.gray);
		}
		txtApellido.setForeground(Color.black);
	}
	
	protected void mousePressedTxtCorreoElectrnico(MouseEvent e) {
		if (txtCE.getText().equals("Correo electrónico")) {
			txtCE.setText("");
		}
		
		if (txtNombre.getText().isEmpty()) {
			txtNombre.setText("Nombre");
			txtNombre.setForeground(Color.gray);
		}
		if (txtApellido.getText().isEmpty()) {
			txtApellido.setText("Apellido");
			txtApellido.setForeground(Color.gray);
		}
		txtCE.setForeground(Color.black);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnviar) {
			actionPerformedBtnEnviar(e);
		}
	}
	protected void actionPerformedBtnEnviar(ActionEvent e) {
		if (validacion()) {
			pais = cbxP.getSelectedItem().toString();
			nombre = txtNombre.getText();
			apellido = txtApellido.getText();
			correo = txtCE.getText();
			ciudad = cbxC.getSelectedItem().toString();
			
			cbxP.setSelectedItem(0);
			txtNombre.setText("Nombre");
			txtNombre.setForeground(Color. gray);
			txtApellido.setText("Apellido");
			txtApellido.setForeground(Color. gray);
			txtCE.setText("Correo electrónico");
			txtCE.setForeground(Color. gray);
			cbxC.setSelectedIndex(0);
			
			boleta.agregarDatos(pais, nombre + " " + apellido, correo, ciudad);
			boleta.setVisible(true);
		}
	}
}
