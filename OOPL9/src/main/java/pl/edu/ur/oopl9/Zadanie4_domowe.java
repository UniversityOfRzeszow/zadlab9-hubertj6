
package pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Scanner;

public class Zadanie4_domowe {
    
    public static void main(String args[])
    {
        Scanner odczyt = new Scanner(System.in);
        String slowo;
        
        HashMap<String, String> slownik = new HashMap<>();
        slownik.put("informacja","information");
        slownik.put("tablica","board");
        slownik.put("dom","home");
        slownik.put("pies","dog");
        slownik.put("piosenkarz","singer");
        slownik.put("zegar","clock");
        slownik.put("park","park");
        slownik.put("zatajac","withhold");
        slownik.put("chwytac","seize");
        slownik.put("farma","farm");
        slownik.put("promiec","radius");
        slownik.put("stlumic","stifle");
        slownik.put("naduzywac","abuse");
        slownik.put("pogoda","weather");
        slownik.put("pogoda","weather");
        slownik.put("drzwi","door");
        slownik.put("zab","teeth");
        slownik.put("pies","dog");
        slownik.put("kot","cat");
        slownik.put("auto","car");
        
        while(true)
        {
            slowo = odczyt.next();
            if(slowo.equals("koniec!"))
                break;
          
                System.out.println(slownik.get(slowo));
            
        }
        
    }
    
    
    
}