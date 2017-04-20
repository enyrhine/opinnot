
package com.opintonaattori.tiedosto;

import com.opintonaattori.logiikka.Kurssisuoritus;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TallentajaTest {
    private File tiedosto;
    
    public TallentajaTest() {
        this.tiedosto = new File("moi");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void tiedostoonTallennusToimii() {
         File tiedosto2 = new File("moi");
         Tallentaja tallentaja = new Tallentaja(this.tiedosto);
         tallentaja.kirjoitaTiedostoon("Moi");
         
         assertEquals(3, tiedosto2.length());
         tiedosto2.delete();
     }
     
     @Test
     public void kurssisuorituksenLisaysTallentuu() {
         File teksti = new File("testi");
         Tallentaja tallentaja = new Tallentaja(teksti);
         tallentaja.lisaaKurssisuoritus(new Kurssisuoritus("Ohja", 5, 5));
         assertEquals(9, teksti.length());
         teksti.delete();
     }
}
