import java.util.Stack;

public class Exercicio9 {
    public static void main(String[] args) {

        System.out.println("Exercício 07");

        Stack<Integer> pilha = new Stack<>();

        pilha.add(1);
        pilha.add(2);
        pilha.add(3);
        pilha.add(4);
        pilha.add(5);

        System.out.println("Pilha normal: " + pilha.toString());
        inverterPilha(pilha);
        System.out.println("Pilha invertida: " + pilha.toString());
        
    }

    public static Stack<Integer> inverterPilha(Stack<Integer> pilha){
        
        Stack<Integer> pilhaInvertida = new Stack<>();

        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilhaInvertida.add(pilha.get(i));
        }
        pilha.clear();
        for (int i = 0; i < pilhaInvertida.size(); i++) {
            pilha.add(pilhaInvertida.get(i));
        }
        return pilha;
    }

}