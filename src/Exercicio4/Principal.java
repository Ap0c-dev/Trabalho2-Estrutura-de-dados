package Exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Principal {

    public static void main(String[] args) throws Exception {

   ArrayList<Integer> f1 = new ArrayList<>();
   ArrayList<Integer> f2 = new ArrayList<>();
    
      f1.add(1);
      f1.add(3);
      f1.add(5);
       
      f2.add(2);
      f2.add(4);
      f2.add(6);

      f1.unir(f2);

       System.out.println("Fila" + f1 );
   
      }

   public No noProximo() {
      return null;
   }
}
