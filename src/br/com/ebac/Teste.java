package br.com.ebac;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String args[]) {
        String frase = "";
        String[] array = new String[2];
        String[] masculino = new String[100];
        String[] feminino = new String[100];
        
        for(int i = 0; i < 10; i++) { 
            frase = JOptionPane.showInputDialog("Digite o nome e sexo M: masculino e F: feminino separados por ';'");
            array = frase.split(";");
            
            if (array.length >= 2) {
                String nome = array[0].trim(); 
                String sexo = array[1].trim().toLowerCase(); 
                
                if ("m".equals(sexo)) {
                    masculino[i] = nome;
                    System.out.println("Nome Masculino: " + masculino[i]);
                } else if ("f".equals(sexo)) {
                    feminino[i] = nome;
                    System.out.println("Nome Feminino: " + feminino[i]);
                } else {
                    System.out.println("Sexo inválido para o nome: " + nome);
                }
            } else {
                System.out.println("Entrada inválida: " + frase);
            }
        }
    }
}
