/**
 * 
 */
package src;

/**
 * @author heini
 * Luodaan korttipakkaan kaikki kortit maittain ja arvoittain
 */
public class Kortti {
	
	private String maa;
	private int arvo;
	
	/**
	 * Alustetaan kortin tiedot
	 * @param imaa kortin maa
	 * @param iarvo kortin arvo
	 */
	public Kortti(String imaa, int iarvo) {
		this.maa = imaa;
		this.arvo = iarvo;
	}
	
	/**
	 * Palauttaa kyseisen kortin maan
	 * @return
	 */
	public String getMaa() {
		return this.maa;
	}
	
	/**
	 * Palauttaa kyseisen kortin arvon
	 * @return
	 */
	public int getArvo() {
		return this.arvo;
	}

	/**
	 * Luo korttipakan, jossa on kaikki neljä maata arvosta 1-13
	 * @example
     * <pre name="test">
     * luokortti(kortit, maat);         
     * kortit[1].getMaa() === "Pata";
     * </pre>
	 */
	public static void luoKortti() {
	
		int i = 0;
		Kortti [] kortit = new Kortti[52];
		String [] maat = {"Pata", "Hertta", "Risti", "Ruutu"};
		
		for (int j=0; j<maat.length; j++) {
			int arvo = 1;		
			
			while (!(i>kortit.length)) {
				kortit[i] = new Kortti (maat[j], arvo);
				kortit[i].Tulosta();
				i++;
				if (arvo>12)break;
				arvo++;			
				}
			}
	}
	
	/**
	 * Muuttaa Kortin merkkijonoksi
	 */
	public String toString() {
		return maa + ", " + arvo;
	}
	
	/**
	 * Tulostaa halutun kortin
	 */
	public void Tulosta() {
		System.out.println(this.toString());
		
	}

	/**
	 * @param args x
	 */
	public static void main(String[] args) {	 	
		luoKortti();
		//System.out.print(kortit[51]);

	}

}
