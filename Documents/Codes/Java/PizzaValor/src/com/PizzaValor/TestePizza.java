package com.PizzaValor;

import org.junit.jupiter.api.BeforeEach;  // Importa a anotação que indica que o método deve ser executado antes de cada teste.
import org.junit.jupiter.api.Test;  // Importa a anotação para indicar que o método é um teste unitário.

import java.util.ArrayList;  // Importa a classe ArrayList para armazenar uma lista de ingredientes.
import java.util.HashMap;    // Importa a classe HashMap para armazenar a quantidade de cada ingrediente.
import java.util.List;       // Importa a interface List para utilizar listas no código.

import static org.junit.jupiter.api.Assertions.assertEquals;  // Importa o método assertEquals para validar as comparações nos testes.

public class TestePizza {

    /**
     * Este método é executado antes de cada teste, garantindo que o estado dos objetos
     * seja resetado antes de cada execução de teste.
     */
    @BeforeEach
    public void zerar() {
        // Reinicia o estado das classes Pizza e CarrinhoDeCompras para garantir que não haja interferência entre os testes.
        Pizza.zerar();
        CarrinhoDeCompras.zerar();
    }

    /**
     * Teste para verificar se o valor da pizza é calculado corretamente para uma pizza com 2 ingredientes.
     */
    @Test
    public void testeValorPizza15() {
        Pizza pizza = new Pizza();  // Cria uma nova instância de Pizza.
        pizza.adicionaIngrediente("peperoni");  // Adiciona o ingrediente "peperoni".
        pizza.adicionaIngrediente("muzzarela");  // Adiciona o ingrediente "muzzarela".
        // Verifica se o preço da pizza é igual a 15, que é o valor esperado para esses ingredientes.
        assertEquals(15, pizza.getPreco());
    }

    /**
     * Teste para verificar se o valor da pizza é calculado corretamente para uma pizza com 3 ingredientes.
     */
    @Test
    public void testeValorPizza20() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("frango");
        pizza.adicionaIngrediente("catupiry");
        pizza.adicionaIngrediente("milho");
        // Verifica se o preço da pizza é igual a 20, que é o valor esperado para esses ingredientes.
        assertEquals(20, pizza.getPreco());
    }

    /**
     * Teste para verificar se o valor da pizza é calculado corretamente para uma pizza com vários ingredientes.
     */
    @Test
    public void testeValorPizza23() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("milho");
        pizza.adicionaIngrediente("ervilha");
        pizza.adicionaIngrediente("ovo cozido");
        pizza.adicionaIngrediente("muzzarela");
        pizza.adicionaIngrediente("cebola");
        // Verifica se o preço da pizza é igual a 23, que é o valor esperado para esses ingredientes.
        assertEquals(23, pizza.getPreco());
    }

    /**
     * Teste para verificar se os ingredientes de uma pizza são armazenados corretamente em uma lista.
     */
    @Test
    public void testeIngredientesPizza() {
        List<String> ingredientes = new ArrayList<>();  // Cria uma lista para armazenar os ingredientes esperados.
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("frango");
        pizza.adicionaIngrediente("catupiry");
        pizza.adicionaIngrediente("milho");
        ingredientes.add("frango");
        ingredientes.add("catupiry");
        ingredientes.add("milho");
        // Verifica se a lista de ingredientes da pizza é igual à lista de ingredientes esperada.
        assertEquals(ingredientes, pizza.getIngredientes());
    }

    /**
     * Teste para verificar a contagem total de ingredientes de várias pizzas em um HashMap.
     */
    @Test
    public void testeIngredientesVariasPizza() {
        HashMap<String, Integer> ingredientes = new HashMap<>();  // Cria um mapa para armazenar a quantidade de cada ingrediente.
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("frango");
        pizza2.adicionaIngrediente("catupiry");
        pizza2.adicionaIngrediente("milho");

        pizza3.adicionaIngrediente("presunto");
        pizza3.adicionaIngrediente("milho");
        pizza3.adicionaIngrediente("ervilha");
        pizza3.adicionaIngrediente("ovo cozido");
        pizza3.adicionaIngrediente("muzzarela");
        pizza3.adicionaIngrediente("cebola");

        // Define os ingredientes e suas quantidades esperadas no HashMap.
        ingredientes.put("peperoni", 1);
        ingredientes.put("ovo cozido", 1);
        ingredientes.put("ervilha", 1);
        ingredientes.put("presunto", 1);
        ingredientes.put("cebola", 1);
        ingredientes.put("catupiry", 1);
        ingredientes.put("frango", 1);
        ingredientes.put("milho", 2);
        ingredientes.put("muzzarela", 2);

        // Verifica se o HashMap de ingredientes totais é igual ao esperado.
        assertEquals(ingredientes, Pizza.ingredientesTotal);
    }

    /**
     * Teste para verificar a contagem total de ingredientes de várias pizzas com alguns ingredientes repetidos.
     */
    @Test
    public void testeIngredientesVariasPizza2() {
        HashMap<String, Integer> ingredientes = new HashMap<>();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("peperoni");
        pizza2.adicionaIngrediente("muzzarela");

        // Define os ingredientes e suas quantidades esperadas no HashMap.
        ingredientes.put("peperoni", 2);
        ingredientes.put("muzzarela", 2);

        // Verifica se o HashMap de ingredientes totais é igual ao esperado.
        assertEquals(ingredientes, Pizza.ingredientesTotal);
    }

    /**
     * Teste para verificar o comportamento do carrinho de compras quando uma pizza vazia é adicionada.
     */
    @Test
    public void testePizzaVaziaCarrinho1() {
        Pizza pizza = new Pizza();
        CarrinhoDeCompras carinho = new CarrinhoDeCompras();

        carinho.adicionarPizza(pizza);
        // Verifica se o número total de pizzas no carrinho é 0, já que a pizza não tem ingredientes.
        assertEquals(0, CarrinhoDeCompras.getTotalPizzas());
    }

    /**
     * Teste para verificar o preço total do carrinho de compras quando uma pizza vazia é adicionada.
     */
    @Test
    public void testePizzaVaziaCarrinho2() {
        Pizza pizza = new Pizza();
        CarrinhoDeCompras carinho = new CarrinhoDeCompras();

        carinho.adicionarPizza(pizza);
        // Verifica se o preço total do carrinho é 0, já que a pizza não tem ingredientes.
        assertEquals(0, carinho.getPrecoTotal());
    }

    /**
     * Teste para verificar a soma do preço das pizzas no carrinho de compras.
     */
    @Test
    public void testeSomaPrecoCarrinho1() {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("frango");
        pizza2.adicionaIngrediente("catupiry");
        pizza2.adicionaIngrediente("milho");

        pizza3.adicionaIngrediente("presunto");
        pizza3.adicionaIngrediente("milho");
        pizza3.adicionaIngrediente("ervilha");
        pizza3.adicionaIngrediente("ovo cozido");
        pizza3.adicionaIngrediente("muzzarela");
        pizza3.adicionaIngrediente("cebola");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarPizza(pizza1);
        carrinho.adicionarPizza(pizza2);
        carrinho.adicionarPizza(pizza3);

        // Verifica se a soma do preço das pizzas no carrinho é 58, que é o valor esperado.
        assertEquals(58, carrinho.getPrecoTotal());
    }

    /**
     * Teste para verificar a soma do preço das pizzas no carrinho de compras com preços diferentes.
     */
    @Test
    public void testeSomaPrecoCarrinho2() {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("peperoni");
        pizza1.adicionaIngrediente("muzzarela");

        pizza2.adicionaIngrediente("frango");
        pizza2.adicionaIngrediente("catupiry");
       
    }
}