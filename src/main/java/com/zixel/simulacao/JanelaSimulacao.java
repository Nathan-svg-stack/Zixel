package com.zixel.simulacao;
import javax.swing.*;
import java.awt.BorderLayout;
public class JanelaSimulacao {
    private PainelSimulacao painel;
    public JanelaSimulacao(PainelSimulacao painel){
        this.painel = painel;
    }
    public void iniciar(){
        JFrame janela = new JFrame();
    janela.setTitle("Zixel - Simulacao  2d");
    janela.setSize(800, 600);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        JButton esquerda = new JButton("esquerda");
        JButton cima = new JButton("cima");
        JButton direita = new JButton("direita");
        JButton baixo = new JButton("baixo");
        JPanel controles = new JPanel();
        controles.add(esquerda);
        controles.add(direita);
        controles.add(baixo);
        controles.add(cima);
        esquerda.addActionListener(    evento -> {
            painel.moverEsquerda();
        });
        cima.addActionListener(evento -> {
            painel.moverAcima();
        });
        direita.addActionListener(evento -> {
            painel.moverDireita();
        });
        baixo.addActionListener(evento -> {
            painel.moverAbaixo();
        });
        janela.add(controles, BorderLayout.SOUTH);
        janela.add(painel, BorderLayout.CENTER);

    janela.setVisible(true);
    }
    void definirVelocidade(int velocidadeDada){
        if(velocidadeDada != 0){
            painel.definirVelocidade(velocidadeDada);
        }
    }
    public int getVelocidade(){
        return painel.getVelocidade();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            JanelaSimulacao JanelaPainel = new JanelaSimulacao(new PainelSimulacao());
            JanelaPainel.definirVelocidade(10);
            JanelaPainel.iniciar();
            System.out.println(JanelaPainel.getVelocidade());
        });
    }
}
