package codigo.paneles;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FlowLayout;

public class Noticias extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Noticias() {
		setPreferredSize(new Dimension(790, 4400));
		setLayout(new GridLayout(11, 1, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setPreferredSize(new Dimension(10, 115));
		panel.add(panel_10, BorderLayout.NORTH);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblnews = new JLabel("NOTICIAS");
		lblnews.setHorizontalAlignment(SwingConstants.LEFT);
		lblnews.setFont(new Font("Ferrari Sans Medium", Font.BOLD, 45));
		panel_10.add(lblnews);
		
		JPanel panel_11 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro2.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_11.setPreferredSize(new Dimension(445, 10));
		panel.add(panel_11, BorderLayout.WEST);
		
		JPanel panel_12 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro1.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_12.setPreferredSize(new Dimension(345, 10));
		panel.add(panel_12, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_1.add(panel_13, BorderLayout.NORTH);
		
		JPanel panel_14 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro3.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_14.setPreferredSize(new Dimension(395, 10));
		panel_1.add(panel_14, BorderLayout.WEST);
		
		JPanel panel_15 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro4.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_15.setPreferredSize(new Dimension(395, 10));
		panel_1.add(panel_15, BorderLayout.EAST);
		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_16 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/persona.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_2.add(panel_16, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_17 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro5.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_17.setPreferredSize(new Dimension(395, 10));
		panel_3.add(panel_17, BorderLayout.WEST);
		
		JPanel panel_18 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro6.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_18.setPreferredSize(new Dimension(395, 10));
		panel_3.add(panel_18, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_19 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro7.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_19.setPreferredSize(new Dimension(395, 10));
		panel_4.add(panel_19, BorderLayout.WEST);
		
		JPanel panel_20 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro8.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_20.setPreferredSize(new Dimension(395, 10));
		panel_4.add(panel_20, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_21 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro9.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_21.setPreferredSize(new Dimension(395, 10));
		panel_5.add(panel_21, BorderLayout.WEST);
		
		JPanel panel_22 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro10.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_22.setPreferredSize(new Dimension(395, 10));
		panel_5.add(panel_22, BorderLayout.EAST);
		
		JPanel panel_6 = new JPanel();
		add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_23 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro12.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_23.setPreferredSize(new Dimension(395, 10));
		panel_6.add(panel_23, BorderLayout.EAST);
		
		JPanel panel_24 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro11.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_24.setPreferredSize(new Dimension(395, 10));
		panel_6.add(panel_24, BorderLayout.WEST);
		
		JPanel panel_7 = new JPanel();
		add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_25 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro13.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_25.setPreferredSize(new Dimension(395, 10));
		panel_7.add(panel_25, BorderLayout.WEST);
		
		JPanel panel_26 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro14.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_26.setPreferredSize(new Dimension(395, 10));
		panel_7.add(panel_26, BorderLayout.EAST);
		
		JPanel panel_8 = new JPanel();
		add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_27 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro15.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_27.setPreferredSize(new Dimension(395, 10));
		panel_8.add(panel_27, BorderLayout.WEST);
		
		JPanel panel_28 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro16.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_28.setPreferredSize(new Dimension(395, 10));
		panel_8.add(panel_28, BorderLayout.EAST);
		
		JPanel panel_9 = new JPanel();
		add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_30 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro17.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_30.setPreferredSize(new Dimension(395, 10));
		panel_9.add(panel_30, BorderLayout.WEST);
		
		JPanel panel_31 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro18.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_31.setPreferredSize(new Dimension(395, 10));
		panel_9.add(panel_31, BorderLayout.EAST);
		
		JPanel panel_29 = new JPanel();
		add(panel_29);
		panel_29.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_32 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro19.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_32.setPreferredSize(new Dimension(395, 10));
		panel_29.add(panel_32, BorderLayout.WEST);
		
		JPanel panel_33 = new JPanel(){
private Image imagen = new ImageIcon(this.getClass().getResource("/recursos/imagenes/imagenes_noticias/carro20.jpeg")).getImage();
			
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			}
			
		};
		panel_33.setPreferredSize(new Dimension(395, 10));
		panel_29.add(panel_33, BorderLayout.EAST);

	}
}
