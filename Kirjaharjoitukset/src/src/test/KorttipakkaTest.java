package src.test;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
import src.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2021.01.05 17:00:36 // Generated by ComTest
 *
 */
@SuppressWarnings("all")
public class KorttipakkaTest {



  // Generated by ComTest BEGIN
  /** testAlustaPakka34 */
  @Test
  public void testAlustaPakka34() {    // Korttipakka: 34
    Korttipakka pakka = new Korttipakka(52); 
    pakka.alustaPakka(52); 
    assertEquals("From: Korttipakka line: 37", "Pata, 1", pakka.kortit[0].toString());
  } // Generated by ComTest END


  // Generated by ComTest BEGIN
  /** testJaaKortti79 */
  @Test
  public void testJaaKortti79() {    // Korttipakka: 79
    Korttipakka pakka = new Korttipakka(52); 
    pakka.alustaPakka(52); 
    assertEquals("From: Korttipakka line: 82", "Pata, 1", pakka.jaaKortti().toString()); 
  } // Generated by ComTest END
}