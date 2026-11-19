package com.zixel.simulacao;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JButton;
public class PainelSimulacao extends JPanel{
    private int x = 0;
    private int y = 0;
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
        x -= 10;
        repaint();
    }
    public void moverDireita(){
        x += 10;
        repaint();
    }
    public void moverAcima(){
        y -= 10;
        repaint();
    }
    public void moverAbaixo(){
        y += 10;
        repaint();
    }

}

