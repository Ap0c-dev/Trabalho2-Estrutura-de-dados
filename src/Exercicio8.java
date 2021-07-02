import java.util.Stack;
import Classes.Fibonacci;

public class Exercicio8 {
    public static void main(String[] args) {
        
        System.out.println("Exercício 08");

        Stack<Integer> pilha = new Stack<>();
        Fibonacci fibo = new Fibonacci();

        for (int i = 0; i < 10; i++) {
            pilha.push(fibo.fibonacci(i));
        }

        System.out.println(pilha.toString());
    }
}