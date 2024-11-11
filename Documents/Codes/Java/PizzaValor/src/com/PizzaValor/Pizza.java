package com.PizzaValor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
    // Atributo para contar o número total de ingredientes na pizza.
    private int totalIngredientes = 0;
    
    // HashMap para armazenar a quantidade total de cada ingrediente utilizado em todas as pizzas.
    static HashMap<String, Integer> ingredientesTotal = new HashMap<>();
    
    // Lista para armazenar os ingredientes da pizza individualmente.
    private List<String> ingredientes = new ArrayList<>();

    // Construtor da classe Pizza.
    Pizza(){
    }

    // Método estático que contabiliza a quantidade de cada ingrediente utilizado em todas as pizzas.
    static void contabilizaIngrediente(String ingrediente){
        // Se o ingrediente já foi contabilizado, incrementa a quantidade.
        if(ingredientesTotal.containsKey(ingrediente))
            ingredientesTotal.replace(ingrediente, ingredientesTotal.get(ingrediente) + 1);
        // Se o ingrediente não foi contabilizado ainda, adiciona ao HashMap com o valor inicial 1.
        else
            ingredientesTotal.put(ingrediente, 1);
    }

    // Método que adiciona um ingrediente à pizza e atualiza a contagem total de ingredientes e a contagem geral de ingredientes.
    public void adicionaIngrediente(String ingrediente){
        totalIngredientes++;  // Incrementa o contador de ingredientes da pizza.
        ingredientes.add(ingrediente);  // Adiciona o ingrediente à lista de ingredientes.
        contabilizaIngrediente(ingrediente);  // Atualiza a quantidade do ingrediente no HashMap global.
    }

    // Método que calcula o preço da pizza com base no número de ingredientes.
    public int getPreco(){
        // Preço depende do número de ingredientes: menos de 3 custa 15, entre 3 e 5 custa 20, 6 ou mais custa 23.
        if(totalIngredientes < 3)
            return 15;
        else if(totalIngredientes < 6)
            return 20;
        else
            return 23;
    }

    // Retorna o número total de ingredientes na pizza.
    public int getTotalIngredientes(){
        return totalIngredientes;
    }

    // Retorna a lista de ingredientes da pizza.
    public List<String> getIngredentes(){
        return ingredientes;
    }

    // Método que imprime os ingredientes da pizza e o preço.
    public void imprimir() {
        // Itera sobre a lista de ingredientes e imprime.
        for (int i = 0; i < totalIngredientes;) {
            System.out.print(ingredientes.get(i));  // Imprime o ingrediente atual.
            i++;
            // Verifica se não é o último ingrediente para adicionar vírgula.
            if(i != totalIngredientes)
                System.out.print(", ");
            else
                System.out.println();  // Nova linha após o último ingrediente.
        }
        // Imprime o preço da pizza.
        System.out.println("Preço: R$" + getPreco());
    }

    // Método para limpar os dados de ingredientes totais (usado para reiniciar as contagens).
    public static void zerar(){
        ingredientesTotal.clear();  // Limpa o HashMap de ingredientes totais.
    }

    // Método para acessar o HashMap de ingredientes totais.
    public static HashMap<String, Integer> getIngredientesTotal() {
        return ingredientesTotal;
    }

    // Getters e Setters para os atributos da classe (utilizados para acessar e modificar os dados).

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setTotalIngredientes(int totalIngredientes) {
        this.totalIngredientes = totalIngredientes;
    }

    public static void setIngredientesTotal(HashMap<String, Integer> ingredientesTotal) {
        Pizza.ingredientesTotal = ingredientesTotal;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
