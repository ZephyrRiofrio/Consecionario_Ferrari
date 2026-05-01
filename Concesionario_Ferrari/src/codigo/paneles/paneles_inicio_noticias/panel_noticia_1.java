package codigo.paneles.paneles_inicio_noticias;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class panel_noticia_1 extends JPanel {

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
	public panel_noticia_1() {
		setSize(new Dimension(790, 252));
		setLayout(new BorderLayout(0, 0));
		
		contenido = new JPanel();
		add(contenido);
		contenido.setLayout(new GridLayout(1, 2, 0, 0));
		
		articulo = new JPanel();
		contenido.add(articulo);
		articulo.setLayout(null);
		
		titulo_articulo = new JLabel("<html>\r\nFERRARI Y <br>\r\nFRECCE TRICOLORI, <br>\r\nDOS REFERENTES ITALIANOS, <br>\r\nPROTAGONIZAN UN EVENTO ESPECIAL<br>\r\n</html>");
		titulo_articulo.setHorizontalTextPosition(SwingConstants.CENTER);
		titulo_articulo.setToolTipText("");
		titulo_articulo.setFont(new Font("Roboto ExtraBold", Font.PLAIN, 20));
		titulo_articulo.setBounds(64, 11, 282, 129);
		articulo.add(titulo_articulo);
		
		texto_articulo = new JLabel("<html>Dos referentes italianos, Ferrari — representado <br>\r\npor los vigentes campeones del mundo del FIA WEC — <br>\r\ny el equipo acrobático nacional Frecce Tricolori, <br>\r\nse reunieron en una jornada dedicada a destacar el 499P, <br>\r\nque competirá en la temporada 2026, y el avión MB-339 <br>\r\nPan de la Fuerza Aérea Italiana. <br></html>");
		texto_articulo.setFont(new Font("Roboto Light", Font.PLAIN, 11));
		texto_articulo.setBounds(64, 142, 282, 84);
		articulo.add(texto_articulo);
		
		imagen_articulo = new JPanel();
		contenido.add(imagen_articulo);
		imagen_articulo.setLayout(null);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(panel_noticia_1.class.getResource("/recursos/imagenes/imagenes_inicio/noticias_carrusel_1_rend.jpg")));
		lblNewLabel_2.setBounds(103, 10, 204, 230);
		imagen_articulo.add(lblNewLabel_2);

	}

}
