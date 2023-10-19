package com.mycompany.jogo_de_adivinhacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo_de_adivinhacao {
    
    public static void main(String[] args) {
        List<Carros> carros = new ArrayList<>();
        carros.add(new Carros("Relâmpago McQueen", "É vermelho e tem o número 95?"));
        carros.add(new Carros("Doc Hudson", "É um Hudson Hornet azul?"));
        carros.add(new Carros("Sally Carrera", "É uma Porsche 911 Carrera?"));
        carros.add(new Carros("Strip Weathers, também é conhecido como O Rei", " É da cor azul e com o número 43 estampado em suas portas?"));
        carros.add(new Carros("Mack", "É um caminhão vermelho?"));
        carros.add(new Carros("Chick Hicks"," É um grande adversário de Relâmpago Mcqueen nas pistas?"));
        carros.add(new Carros("Ramone", "customiza carros?"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo de Adivinhação de Carros!");
        System.out.println("Pense em um carro do filme Carros e eu vou adivinhar qual é.");
        System.out.println("Responda com 's' para Sim e 'n' para Não.");

        for (Carros carro : carros) {
            System.out.println("O carro que você está pensando " + carro.getPergunta() + "? (s/n)");
            char resposta = scanner.next().charAt(0);

            if (resposta == 's' || resposta == 'S') {
                System.out.println("Você está pensando no carro: " + carro.getNome());
                break;
            }
        }
  
    }
    
}
