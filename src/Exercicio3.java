import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {

        System.out.println("Exercício 3");

        ArrayList<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(2);
        listaInteiros.add(5);
        listaInteiros.add(9);
        listaInteiros.add(2);
        listaInteiros.add(9);
        listaInteiros.add(4);
        listaInteiros.add(3);
                
        System.out.println("Lista Completa: " + listaInteiros.toString());
        System.out.println("Lista sem repetição: " + removerElementosRepetidos(listaInteiros));
    }

    public static Set<Integer> removerElementosRepetidos(ArrayList<Integer> listaInteiros){
        Set<Integer> listaNaoRepetida = new LinkedHashSet<>(listaInteiros);
        return listaNaoRepetida;
    }
}