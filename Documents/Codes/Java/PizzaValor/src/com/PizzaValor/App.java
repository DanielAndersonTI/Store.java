package com.PizzaValor;

public class App {
    public static void main(String[] args) throws Exception {
        // Criação de um novo carrinho de compras.
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        // Criação de novas pizzas.
        Pizza peperoni = new Pizza();
        Pizza frango = new Pizza();
        Pizza portuguesa = new Pizza();

        // Adicionando ingredientes às pizzas.
        peperoni.adicionaIngrediente("peperoni");  // Pizza peperoni: Adiciona peperoni.
        peperoni.adicionaIngrediente("muzzarela");  // Pizza peperoni: Adiciona muzzarela.

        frango.adicionaIngrediente("frango");  // Pizza frango: Adiciona frango.
        frango.adicionaIngrediente("catupiry");  // Pizza frango: Adiciona catupiry.
        frango.adicionaIngrediente("milho");  // Pizza frango: Adiciona milho.

        portuguesa.adicionaIngrediente("presunto");  // Pizza portuguesa: Adiciona presunto.
        portuguesa.adicionaIngrediente("milho");  // Pizza portuguesa: Adiciona milho.
        portuguesa.adicionaIngrediente("ervilha");  // Pizza portuguesa: Adiciona ervilha.
        portuguesa.adicionaIngrediente("ovo cozido");  // Pizza portuguesa: Adiciona ovo cozido.
        portuguesa.adicionaIngrediente("muzzarela");  // Pizza portuguesa: Adiciona muzzarela.

        // Adicionando pizzas ao carrinho de compras.
        carrinho.adicionarPizza(peperoni);  // Adiciona a pizza peperoni ao carrinho.
        carrinho.adicionarPizza(frango);  // Adiciona a pizza frango ao carrinho.
        carrinho.adicionarPizza(portuguesa);  // Adiciona a pizza portuguesa ao carrinho.

        // Imprime o resumo das pizzas no carrinho e o preço total.
        carrinho.imprimir();
        
        // Exibe uma linha em branco para separar as informações.
        System.out.println();
        
        // Exibe a lista total de ingredientes utilizados em todas as pizzas.
        System.out.println("Ingredientes utilizados:");
        System.out.println(Pizza.ingredientesTotal);  // Exibe a quantidade total de ingredientes utilizados nas pizzas.
    }
}
