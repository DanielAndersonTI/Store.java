package com.javaoo.store;

public class inventario {
    /**
     * Método estático que gera um relatório do inventário.
     * Ele percorre um array de itens, imprime suas informações e calcula o total de quantidade e valor.
     * @param itens O array de itens a ser processado
     */
    public static void produceReport(Item[] itens) {
        // Variáveis para armazenar o total de quantidade e valor dos itens no inventário.
        int contatotal = 0;           // Contador total de itens
        double valortotal = 0.0;      // Valor total de todos os itens no inventário
        
        // Impressão do cabeçalho do relatório com formatação
        System.out.printf("%-30s%10s%5s\n", "Titulo", "Preço", "Quantidade");
        
        // Percorre cada item do array de itens
        for(Item item : itens) {
            // Verifica se o item não é nulo antes de processá-lo
            if(item != null) {
                // Imprime as informações do item formatadas: título, preço e quantidade
                System.out.printf("%-30s%10.2f%5d\n", item.getTitulo(), item.getPreco(), item.getQuantidade());
                
                // Atualiza o total de quantidade e valor
                contatotal += item.getQuantidade(); 
                valortotal += (item.getQuantidade() * item.getPreco()); 
            }
        }
        
        // Imprime a linha de totalização, com o valor total e a quantidade total de itens no inventário
        System.out.printf("%-30s%10.2f%5d\\n", " ", valortotal, contatotal); 
    }
}

