package com.PizzaValor;

import java.util.ArrayList;  // Importa a classe ArrayList para armazenar as pizzas no carrinho.
import java.util.List;       // Importa a interface List para permitir o armazenamento de várias pizzas.

public class CarrinhoDeCompras {
    private int precoTotal;  // Variável para armazenar o preço total das pizzas no carrinho.
    private List<Pizza> pizzas = new ArrayList<>();  // Lista que armazena as pizzas adicionadas ao carrinho.
    private static int totalPizzas = 0;  // Contador estático para o número total de pizzas.

    // Construtor do carrinho de compras. Inicializa o carrinho sem nenhuma pizza.
    public CarrinhoDeCompras() {
    }

    /**
     * Método para adicionar uma pizza ao carrinho.
     * Verifica se a pizza tem ingredientes antes de adicionar.
     * Se a pizza não tiver ingredientes, exibe uma mensagem de erro.
     *
     * @param pizza A pizza a ser adicionada ao carrinho.
     */
    public void adicionarPizza(Pizza pizza){
        if (pizza.getTotalIngredientes() == 0)  // Verifica se a pizza não tem ingredientes.
            System.out.println("Erro ao adicionar pizza - Não há ingredientes");  // Exibe mensagem de erro se a pizza for vazia.
        else{
            pizzas.add(pizza);  // Adiciona a pizza à lista de pizzas.
            System.out.println("Sucesso ao adicionar pizza");  // Exibe mensagem de sucesso ao adicionar a pizza.
            precoTotal += pizza.getPreco();  // Atualiza o preço total somando o preço da pizza.
            totalPizzas++;  // Incrementa o contador total de pizzas.
        }
    }

    /**
     * Método para obter o preço total das pizzas no carrinho.
     *
     * @return O preço total das pizzas.
     */
    public int getPrecoTotal(){
        return precoTotal;  // Retorna o valor total das pizzas no carrinho.
    }

    /**
     * Método para imprimir as informações do carrinho de compras.
     * Exibe as pizzas no carrinho e o valor total.
     */
    public void imprimir(){
        System.out.println();  // Linha em branco para melhorar a legibilidade da saída.
        System.out.println("Pizzas:");  // Cabeçalho para listar as pizzas.
        System.out.println("Valor total: R$" + precoTotal);  // Exibe o valor total das pizzas no carrinho.
    }

    /**
     * Método estático para obter o número total de pizzas.
     *
     * @return O total de pizzas adicionadas em todos os carrinhos.
     */
    public static int getTotalPizzas(){
        return totalPizzas;  // Retorna o número total de pizzas.
    }

    /**
     * Método estático para zerar o contador total de pizzas.
     * Utilizado para reiniciar o contador, por exemplo, após finalizar uma sessão de compras.
     */
    public static void zerar(){
        totalPizzas = 0;  // Reseta o contador de pizzas para 0.
    }
}
