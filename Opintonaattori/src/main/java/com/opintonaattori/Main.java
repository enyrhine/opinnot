
package com.opintonaattori;

import com.opintonaattori.kayttoliittyma.Kayttoliittyma;
import com.opintonaattori.tiedosto.Tallentaja;
import java.io.IOException;
import javax.swing.SwingUtilities;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Kayttaja elsa = new Kayttaja("Elsa");
        Tallentaja elsanTallentaja = new Tallentaja(elsa.getTiedosto());
        elsanTallentaja.lisaaKurssisuoritus("Ohja", 5, 5);
        System.out.println(elsa.getTiedosto().length());
        elsanTallentaja.lisaaKurssisuoritus("Ohpe", 5, 5);
        
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma(elsa.getTiedosto(), elsa);
        SwingUtilities.invokeLater(kayttoliittyma);
    }
   
    
}
