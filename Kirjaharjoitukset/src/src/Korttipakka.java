package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Luokka korttipakan k‰sittelemiseksi
 * @author heini
 * Korttipakassa on 52 korttia. Pakka-muuttujassa s‰ilytet‰‰n kortit,
 * lkm kertoo, luodaanko tyhj‰ pakka vai kaikki korttipakan kortit
 */
public class Korttipakka {
	
	public Kortti[] kortit;
	private int lkm;

	/**
	 * Rakentaja, joka alustaa korttipakan tiedot
	 * @param kortit korttien lukum‰‰r‰ pakassa
	 */
	public Korttipakka(int kortit) {
		this.lkm = kortit;
		this.kortit = new Kortti[lkm];
		this.alustaPakka(lkm);
	}
	
	
	
	/**
	 * Laitetaan kortit pakkaan
	 * @param kortit
	 * @example
	 * <pre name="test">
	 * Korttipakka pakka = new Korttipakka(52);
	 * pakka.alustaPakka(52);
	 * pakka.kortit[0].toString() === "Pata, 1" 
	 * </pre>
	 */
	public void alustaPakka(int kortit) {
		int i = 0;
		String [] maat = {"Pata", "Hertta", "Risti", "Ruutu"};
		if (this.kortit.length == 0) return;
		
		for (int j=0; j<maat.length; j++) {
			int arvo = 1;		
			
			while (!(i>this.kortit.length)) {
				this.kortit[i] = new Kortti (maat[j], arvo);
				i++;
				if (arvo>12)break;
				arvo++;			
				}
			}
	}
	
	/**
	 * Sekoittaa korttipakan kortit satunnaiseen j‰rjestykseen.
	 */
	private void sekoita() {
		
		List<Kortti> lista = Arrays.asList(kortit);
		Collections.shuffle(lista);
		lista.toArray(kortit);
	}
	
	/**
	 * Palauttaa korttien lukum‰‰r‰n
	 * @return Korttipakan korttien lukum‰‰r‰
	 */
	public int korttienLukum‰‰r‰() {
		return lkm;
	}
	
	/**
	 * Palauttaa pakan p‰‰llimm‰isen kortin
	 * @return pakan p‰‰llimm‰inen kortti
	 * @example
	 * <pre name="test">
	 * Korttipakka pakka = new Korttipakka(52);
	 * pakka.alustaPakka(52);
	 * pakka.jaaKortti().toString() === "Pata, 1";
	 * </pre>
	 */
	public Kortti jaaKortti() {
		Kortti kortti = kortit[0];
		
		for (int i=1; i<kortit.length; i++) {
			kortit[i-1] = kortit[i];
		}
		lkm--;
		return kortti;
		
	}
	
	/**
	 * Laittaa annetun kortin takaisin pakkaan 
	 * @param kortti kortti joka laitetaan pakkaan
	 * @return true, jos pakkaan mahtuu ja lis‰ys onnistuu, 
	 * false jos pakkaan ei mahdu korttia
	 * @example
	 * <pre name="test">
	 * 
	 * </pre>
	 */
	public boolean laitaKortti(Kortti kortti) {
		if (lkm>=52) return false;
		
		for (int i=kortit.length-1; i>0; i--) {
			kortit[i] = kortit[i-1];
		}
		
		kortit[0] = kortti;
		lkm++;
		return true;
		
	}

	/**
	 * Tulostaa pakan
	 */
	public void tulosta() {
		for (int i=0; i<lkm; i++) {
			System.out.println(kortit[i].toString());
		}
		
	}

	public static void main(String[] args) {
		
		Korttipakka pakka = new Korttipakka(52);
		pakka.sekoita(); 
		int korttienLkm = pakka.korttienLukum‰‰r‰(); System.out.println(korttienLkm);
		Kortti kortti = pakka.jaaKortti(); System.out.println("pakan p‰‰llimm‰inen kortti on " + kortti.toString() + " ja pakassa on " + pakka.lkm + " kpletta kortteja");
		pakka.tulosta();
		boolean onkoTaysi = pakka.laitaKortti(kortti);
		if (onkoTaysi == false) System.out.print("Pakka t‰ysi, ei voi lis‰t‰ korttia!");
		
	}
	
}
