import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Classes.Produto;

public class Exercicio1 {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        Produto prdt1 = new Produto(1, "Monitor", 1280, 89);
        Produto prdt2 = new Produto(2, "Placa de Video", 4280, 29);
        Produto prdt3 = new Produto(3, "Processador", 1400, 50);
        Produto prdt4 = new Produto(4, "SSD", 550, 30);
        Produto prdt5 = new Produto(4, "Memoria RAM", 280, 71);

        produtos.add(prdt1);
        produtos.add(prdt2);
        produtos.add(prdt3);
        produtos.add(prdt4);
        produtos.add(prdt5);

        System.out.println("O produto de menor valor é: " + menorPreco(produtos));
    }

    public static Float menorPreco(List<Produto> list) {        
        Float valor;
        Float menorValor;
        List<Float> valorMenor = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            valor = list.get(i).getPreco();
            valorMenor.add(valor);
        }
        menorValor = Collections.min(valorMenor);
        return menorValor;
    }

}