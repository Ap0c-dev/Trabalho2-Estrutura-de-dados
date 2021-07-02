import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import Classes.Produto;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Queue<Produto> filaComPrioridade = new PriorityQueue<Produto>(new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return Float.valueOf(p2.getPreco()).compareTo(p1.getPreco());
            }
        });

        List<Produto> produtos = new ArrayList<>();

        Produto prdt1 = new Produto(1, "Monitor", 1280, 89);
        Produto prdt2 = new Produto(2, "Placa de Video", 4280, 29);
        Produto prdt3 = new Produto(3, "Processador", 1400, 50);
        Produto prdt4 = new Produto(4, "SSD", 550, 30);
        Produto prdt5 = new Produto(4, "Memoria RAM", 280, 71);
        Produto prdt6 = new Produto(4, "Cooler", 128, 60);

        produtos.add(prdt1);
        produtos.add(prdt2);
        produtos.add(prdt3);
        produtos.add(prdt4);
        produtos.add(prdt5);
        produtos.add(prdt6);

    
        for (int i = 0; i < produtos.size() ; i++) {            
            filaComPrioridade.offer(produtos.get(i));
        }

        System.out.println("Fila de chegada: ");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
        }

        System.out.println("Fila ordenada por preço: ");
        while (!filaComPrioridade.isEmpty()) {
            System.out.println(filaComPrioridade.poll());
        }
    }
    
}