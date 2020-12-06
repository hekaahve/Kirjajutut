package src;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Java-kirjan lintubongariesimerkki s.365
 * Laskee t‰ss‰ tapauksessa kissoja ja koiria
 * @author heini A
 *
 */
@SuppressWarnings("serial")
public class Bongari extends JFrame{

	JLabel jLabel = new JLabel("0");
	JLabel kissa = new JLabel("0");
	JButton jButton = new JButton("koira");
	JButton j = new JButton("kissa");
	
	/*
	 * Luodaan bongari, jolla voi laskea asioita, kuten kissoja ja koiria.
	 * ja luodaan myˆs painikkeet lakureille
	 */
	public Bongari() {
		// m‰‰r‰t‰‰n asettelija
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(jLabel);//nimiˆ
		getContentPane().add(kissa);//nimiˆ
		getContentPane().add(jButton);//painike
		getContentPane().add(j);
		//rek. tapahtumankuuntelija
		addWindowListener(new Lopeta());
		
		/*
		 * painikkeille luodaan tapahtumakuuntelijat, joille vied‰‰n parametreina kyseinen
		 * nappi ja haluttu label, jonka arvo muuttuu painiketta painaessa
		 */		
		jButton.addActionListener(new BongariJButtonActionAdapter(this, jLabel));
		j.addActionListener(new BongariJButtonActionAdapter(this, kissa));
		}
	/**
	 * Lis‰‰ bongarin kentt‰‰ yhdell‰
	 * @param e painikkeen painamistapahtuma
	 * @param kentta haluttu kentt‰, jonka arvoa lis‰t‰‰n yhdell‰
	 * 
	 */
	void jButtonActionPerformed(ActionEvent e, JLabel kentta) {
		int lkm = Integer.parseInt(kentta.getText());
		kentta.setText(String.valueOf(lkm+1));
		
	}
	
	/**
	 * Tapahtumakuuntelijaluokka joka toteuttaa painikkeen painamiseen
	 * liittyv‰n Actionlistener-liittym‰n. 
	 * Atribuutteina ikkuna, jossa tapahtuman aiheuttava komponentti sijaitsee
	 * sek‰ ikkunan haluttu label-kentt‰, jonka arvoa muutetaan.
	 * 
	 */
	class BongariJButtonActionAdapter implements ActionListener{
		Bongari kohde;
		JLabel kentta;
		
		BongariJButtonActionAdapter(Bongari kohde, JLabel k){
			this.kohde = kohde;
			this.kentta = k;
		}
		
		/*
		 * tapahtumakuuntelija kutsuu metodia, joka lis‰‰
		 * halutun kent‰n arvoa yhdell‰
		 */
		public void actionPerformed(ActionEvent e) {
			kohde.jButtonActionPerformed(e, kentta);
		}
		
		
	}
	
	public static void main(String[] args) {
		//SwingApuri.n‰yt‰(new Bongari());
		Bongari bongari = new Bongari();
		bongari.setSize(200,300);
		
		bongari.setVisible(true);
		
	}

	/**
	 * Lopettaa ohjelman suorituksen
	 */
	class Lopeta extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);//lopettaa ohjelman suorituksen
		}
	}
}
