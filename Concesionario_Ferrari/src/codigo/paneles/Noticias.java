package codigo.paneles;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon; 
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;

public class Noticias extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Noticias() {
	    setPreferredSize(new Dimension(720, 2500));
	    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
	    JPanel noticia = new JPanel() {
	        private Image imagen = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_noticias/imagen_8.jpeg")).getImage();
	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            if (imagen != null) g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
	        }
	    };
        noticia.setOpaque(false);
		add(noticia);
		noticia.setLayout(null);
		
		noticia.setPreferredSize(new Dimension(720, 250));
	    noticia.setMaximumSize(new Dimension(720, 250));
	    noticia.setLayout(null);
	    add(noticia);

	    JLabel lblNewLabel = new JLabel("NOTICIAS");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
	    lblNewLabel.setForeground(Color.WHITE);
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setBounds(48, 33, 604, 111);
	    noticia.add(lblNewLabel);
		
	    JPanel panel_1 = new JPanel() {
	         private Image imagen = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_noticias/imagen_1.jpeg")).getImage();
	         @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                if (imagen != null) {
	                    g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
	                }
	            }
	        };
	        panel_1.setPreferredSize(new Dimension(720, 450));
	        panel_1.setMaximumSize(new Dimension(720, 450));
	        panel_1.setLayout(null);
	        add(panel_1);
	        
	        JLabel lblCommentsInThe = new JLabel("Comments in the run-up to the Imola 6 Hours");
	        lblCommentsInThe.setBounds(30, 376, 632, 63);
	        panel_1.add(lblCommentsInThe);
	        lblCommentsInThe.setHorizontalAlignment(SwingConstants.CENTER);
	        lblCommentsInThe.setForeground(Color.WHITE);
	        lblCommentsInThe.setFont(new Font("Tahoma", Font.PLAIN, 30));
	        
	        JLabel lblHoras_1 = new JLabel("9 HORAS ----------------- 6 HOURS OF IMOLA");
	        lblHoras_1.setHorizontalAlignment(SwingConstants.CENTER);
	        lblHoras_1.setForeground(Color.WHITE);
	        lblHoras_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblHoras_1.setBounds(35, 335, 441, 63);
	        panel_1.add(lblHoras_1);
	        noticia.setOpaque(false);
		
		
	        JPanel panel_2 = new JPanel() {
	        	private Image imgLetras = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_noticias/imagen_6.jpeg")).getImage();
	            
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                if (imgLetras != null) {
	                    g.drawImage(imgLetras, 0, 0, getWidth(), getHeight(), this);
	                }
	            }
	        };
		add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel(){
        	private Image imgLetras = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_noticias/imagen_7.jpeg")).getImage();
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (imgLetras != null) {
                    g.drawImage(imgLetras, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
		
		panel_2.add(panel);
		panel.setLayout(null);
		
		JPanel panel_8 = new JPanel(){
        	private Image imgLetras = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_noticias/imagen_2.jpeg")).getImage();
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (imgLetras != null) {
                    g.drawImage(imgLetras, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
		
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("EMOCION SOBRE RUEDAS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(29, 193, 307, 62);
		panel_8.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel() {
        	private Image imgLetras = new ImageIcon(getClass().getResource("/recursos/imagenes/imagenes_noticias/imagen_3.jpeg")).getImage();
            
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (imgLetras != null) {
                    g.drawImage(imgLetras, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
		
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblAPositivePrologue = new JLabel("A positive Prologue for the 499Ps at Imola");
		lblAPositivePrologue.setHorizontalAlignment(SwingConstants.CENTER);
		lblAPositivePrologue.setForeground(Color.WHITE);
		lblAPositivePrologue.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAPositivePrologue.setBounds(25, 220, 632, 63);
		panel_3.add(lblAPositivePrologue);
		
		JLabel lblHoras = new JLabel("14 APR ---------------------- 6 HOURS OF IMOLA");
		lblHoras.setBounds(57, 164, 441, 63);
		panel_3.add(lblHoras);
		lblHoras.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoras.setForeground(Color.WHITE);
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel panel_4 = new JPanel();
		add(panel_4);
		
		JPanel panel_5 = new JPanel();
		add(panel_5);
		
		JPanel panel_6 = new JPanel();
		add(panel_6);
		
		JPanel panel_7 = new JPanel();
		add(panel_7);

	}
}
