package com.zixel.simulacao;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class PainelSimulacao extends JPanel{
    private int x = 0;
    private int y = 0;
    private int velocidade = 10;


    @Override
    protected void paintComponent(Graphics grafico){
        super.paintComponent(grafico);
        grafico.setColor(Color.BLUE);
        grafico.fillOval(x, y, 100, 100);
    }

    public PainelSimulacao(){
        setBackground(Color.BLACK);

    }
    public void moverEsquerda(){
        if (x - velocidade >= 0){
        x -= velocidade;
        repaint();}
    }
    public void moverDireita(){
        if (x + velocidade + 100 <= getWidth()){
        x += velocidade;
        repaint();}
    }
    public void moverAcima(){
        if(y - velocidade >= 0){
        y -= velocidade;
        repaint();}
    }
    public void moverAbaixo(){
        if(y + velocidade + 100 <= getHeight()) {
            y += velocidade;
            repaint();
        }
    }
    public void definirVelocidade(int novaVelocidade){
        if(novaVelocidade != 0){
           velocidade = novaVelocidade;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }
}

