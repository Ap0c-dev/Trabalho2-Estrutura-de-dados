import java.util.LinkedList;
import java.util.Queue;


public class Exercicio6 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();
        
        fila.add(1);fila.add(2); fila.add(3); fila.add(4); fila.add(5);fila.add(6); fila.add(7);

        System.out.println("Fila Sequência Correta: " + fila.toString());
        revertQueue(fila);
        System.out.println("Fila Invertida: " + fila.toString());
    }
    public static void revertQueue(Queue fila){
        Queue<Integer> filaInvertida = new LinkedList<>();         
        for (int i = fila.size(); i > 0; i--) {
            filaInvertida.add((Integer) fila.peek());
        }
    }
}