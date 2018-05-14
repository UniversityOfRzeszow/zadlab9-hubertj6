package pl.edu.ur.oopl9;

import java.util.Random;
import java.util.Iterator;
import java.util.TreeSet;

public class Zad2 {
    
        public static void main(String[] args) {
        
        Random losuj = new Random();
        TreeSet<Integer> liczby = new TreeSet<>();
        
        for(int i = 0;i<100;i++)
        {
           liczby.add(losuj.nextInt(101));
        }
        
        Iterator iterator = liczby.iterator();
        
        while(iterator.hasNext())
       {
           System.out.println(iterator.next());
       }
       
}
} 