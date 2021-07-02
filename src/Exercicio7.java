import java.util.Stack;

public class Exercicio7 {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();

        pilha.add(1);
        pilha.add(2);
        pilha.add(3);
        pilha.add(4);
        pilha.add(5);
        pilha.add(6);
        pilha.add(7);
        pilha.add(8);
        pilha.add(9);
        pilha.add(10);
        pilha.add(11);
        pilha.add(12);
        pilha.add(13);
        pilha.add(14);
        pilha.add(15);
        pilha.add(16);
        pilha.add(17);
        pilha.add(18);

        System.out.print("Binário: ");
        for (int i = 0; i < pilha.size(); i++) {
            String bin = Integer.toBinaryString(pilha.get(i));
            System.out.print(bin + ", " );
        }

        System.out.print("\nOctal: ");
        for (int i = 0; i < pilha.size(); i++) {
            String oct = Integer.toOctalString(pilha.get(i));
            System.out.print(oct + ", ");
        }
        
        System.out.print("\nHexadecimal: ");
        for (int i = 0; i < pilha.size(); i++) {
            String hex = Integer.toHexString(pilha.get(i));
            System.out.print(hex + ", ");
        }
    }
}