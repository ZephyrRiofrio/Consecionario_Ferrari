package codigo.paneles.paneles_inicio_noticias;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class panel_noticia_2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel contenido;
	private JPanel articulo;
	private JPanel imagen_articulo;
	private JLabel titulo_articulo;
	private JLabel texto_articulo;
	private JLabel lblNewLabel_2;

	/**
	 * Create the panel.
	 */
	public panel_noticia_2() {
		setLayout(new BorderLayout(0, 0));
		
		contenido = new JPanel();
		add(contenido);
		contenido.setLayout(new GridLayout(1, 2, 0, 0));
		
		articulo = new JPanel();
		contenido.add(articulo);
		articulo.setLayout(null);
		
		titulo_articulo = new JLabel("<html>\r\nMEDIO MARATÓN <br>\r\nDE ITALIA 2026: <br>\r\n15.000 CORREDORES INSCRITOS <br>\r\n</html>");
		titulo_articulo.setHorizontalTextPosition(SwingConstants.CENTER);
		titulo_articulo.setToolTipText("");
		titulo_articulo.setFont(new Font("Roboto ExtraBold", Font.PLAIN, 20));
		titulo_articulo.setBounds(116, 32, 222, 108);
		articulo.add(titulo_articulo);
		
		texto_articulo = new JLabel("<html>\r\nEn un fin de semana que quedará grabado <br>\r\nen la memoria de miles de participantes <br>\r\ny espectadores, la edición 2026 del Medio <br>\r\nMaratón de Italia – Memorial Enzo Ferrari <br>\r\nha llegado a su fin. <br>\r\n</html>");
		texto_articulo.setFont(new Font("Roboto Light", Font.PLAIN, 11));
		texto_articulo.setBounds(116, 142, 222, 84);
		articulo.add(texto_articulo);
		
		imagen_articulo = new JPanel();
		contenido.add(imagen_articulo);
		imagen_articulo.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(panel_noticia_2.class.getResource("/recursos/imagenes/imagenes_inicio/noticias_carrusel_2_rend.jpg")));
		lblNewLabel_2.setBounds(74, 11, 204, 230);
		imagen_articulo.add(lblNewLabel_2);

	}

}
