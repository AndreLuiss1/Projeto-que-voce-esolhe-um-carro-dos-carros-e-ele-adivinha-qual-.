package com.mycompany.projeto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Projeto {

    public static void main(String[] args) {
        List<Carros> carros = new ArrayList<>();
        carros.add(new Carros("Relâmpago McQueen", "É vermelho e tem o número 95?"));
        carros.add(new Carros("Doc Hudson", "É um Hudson Hornet azul?"));
        carros.add(new Carros("Sally Carrera", "É uma Porsche 911 Carrera?"));
        carros.add(new Carros("Strip Weathers, também é conhecido como O Rei", " É da cor azul e com o número 43 estampado em suas portas?"));
        carros.add(new Carros("Mack", "É um caminhão vermelho?"));
        carros.add(new Carros("Chick Hicks", "É um grande adversário de Relâmpago Mcqueen nas pistas?"));
        carros.add(new Carros("Ramone", "customiza carros?"));


        JFrame frame = new JFrame("Jogo de Adivinhação de Carros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JLabel label = new JLabel("Pense em um carro do filme Carros e eu vou adivinhar qual é.");
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel();
        JButton button = new JButton("Iniciar Jogo");
        JTextArea textArea = new JTextArea(10, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);

        button.addActionListener(e -> {
            for (Carros carro : carros) {
                textArea.append("O carro que você está pensando " + carro.getPergunta() + "? (s/n)\n");
                String resposta = JOptionPane.showInputDialog("Responda com 's' para Sim e 'n' para Não.");
                if (resposta != null && !resposta.isEmpty()) {
                    char respostaChar = resposta.charAt(0);
                    if (respostaChar == 's' || respostaChar == 'S') {
                        textArea.append("Você está pensando no veiculo: " + carro.getNome() + "\n");
                        break;
                    }
                }
            }
        });

        panel.add(button);
        panel.add(scrollPane);

        frame.add(label);
        frame.add(panel);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setVisible(true);
    }
}
