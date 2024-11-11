package com.javaoo.store.drivres;

import com.javaoo.store.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver_de_Inventario {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        /* OBS: Os títulos de obras abaixo são apenas para exemplificar.
           Algumas correspondem a obras reais, outras não. */

        // Criando um array de itens para armazenar o inventário
        Item[] meuInventario = new Item[50]; // Capacidade para até 50 itens

        // Definindo o formato de data para exibir as datas dos CDs e CDs clássicos
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Adicionando livros ao inventário
        meuInventario[0] = new Book("Quem manda no mundo", 21.03, 24, "Autor A", "Editora X", "Ficção");
        meuInventario[1] = new Book("O Idiota", 22.03, 24, "Autor B", "Editora Y", "Clássico");
        meuInventario[2] = new Book("Crime e Castigo", 23.03, 24, "Autor C", "Editora Z", "Romance");
        meuInventario[3] = new Book("Irmãos Karamazov", 24.03, 24, "Autor D", "Editora W", "Drama");
        meuInventario[4] = new Book("O Evangelho segundo Jesus Cristo", 25.03, 24, "Autor E", "Editora V", "Religião");

        // Criando objetos Artista e associando CDs ao inventário
        Artista artista1 = new Artista("Renato Russo");
        Date data1 = sdf.parse("27/03/2024");
        meuInventario[5] = new CD("Legião Urbana", 26.03, 24, artista1, data1);

        Artista artista2 = new Artista("Dinho");
        Date data2 = sdf.parse("29/03/2024");
        meuInventario[6] = new CD("Mamonas Assassinas", 28.03, 24, artista2, data2);

        Artista artista3 = new Artista("Schubert");
        Date data3 = sdf.parse("25/03/2024");
        meuInventario[7] = new CD("Schubert", 25.03, 24, artista3, data3);

        // Criando um CD clássico e associando performances
        String[] performances1 = {"Danie", "Natanael", "Denilson", "Josimar", "Guilherme"};
        Artista artista4 = new Artista("Joe Green");
        Date data4 = sdf.parse("01/01/2001");
        meuInventario[8] = new ClassicalCD("Romeo e Julieta", 25.03, 24, "Joe Green", performances1, "New York", data4);

        // Criando outro CD clássico
        String[] performances2 = {"Carmem", "Joana", "Anunciada", "Gal", "Julia"};
        Artista artista5 = new Artista("Vivaldi");
        Date data5 = sdf.parse("01/01/2002");
        meuInventario[9] = new ClassicalCD("As Quatro Estações", 26.03, 24, "Vivaldi", performances2, "Itália", data5);

        // Gerando o relatório do inventário
        inventario.produceReport(meuInventario);  // Método que imprime o relatório com informações sobre os itens no inventário
    }
}

