package src;

import java.awt.*;
import javax.swing.*;

/**
 * Kirjan esimerkki flowlayoutista, miten nappulat asettuu
 * tähän layouttiin
 * @author heini
 *
 */
@SuppressWarnings("serial")
public class Flowlayout extends JFrame {
	
	JPanel panel = new JPanel();
	FlowLayout layout = new FlowLayout();
	JLabel label = new JLabel("0");
	JButton j = new JButton("nappi");
	JButton x = new JButton("nappi2");
	JButton a = new JButton("nappi2");
	JButton b = new JButton("nappi jossa tekstiä");
	JButton c = new JButton("nappi 3");
	JButton d = new JButton("nappi 5");

	public Flowlayout() {
		getContentPane().setLayout(layout);
		layout.setAlignment(FlowLayout.LEADING);
		layout.setHgap(10);
		panel.setLayout(layout);
		getContentPane().add(label);
		j.setSize(j.getMinimumSize());
		getContentPane().add(j);
		getContentPane().add(x);
		getContentPane().add(a);
		getContentPane().add(b);
		getContentPane().add(c);
		getContentPane().add(d);
		
	}
	
	public static void main(String [] args) {
		Flowlayout ikkuna = new Flowlayout();
		ikkuna.setSize(200,200);
		ikkuna.setVisible(true);
	}

}
