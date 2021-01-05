package src;
/**
 * Luokka korttipakan k‰sittelemiseksi
 * @author heini
 * Korttipakassa on 52 korttia. Pakka-muuttujassa s‰ilytet‰‰n kortit,
 * lkm kertoo, luodaanko tyhj‰ pakka vai kaikki korttipakan kortit
 */
public class Korttipakka {
	
	private Kortti[] kortit;
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
	 * Tulostaa pakan
	 */
	public void tulosta() {
		for (int i=0; i<lkm; i++) {
			System.out.println(kortit[i].toString());
		}
		
	}

	public static void main(String[] args) {
		
		Korttipakka pakka = new Korttipakka(52);
		pakka.tulosta();
		pakka.sekoita();
		//pakka.korttienLukum‰‰r‰();
		//pakka.jaaKortti();
		//pakka.laitaKortti(1);
		
	}
	
}
