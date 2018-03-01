/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Background;

/**
 *
 * @author RX
 */
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.JPanel;

public class panelGradient extends JPanel {

    public panelGradient() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g;
       GradientPaint gp = new GradientPaint(0, 0, Color.BLUE, 0,
                getHeight(),
                Color.BLUE);
        Paint p = gd.getPaint();
        gd.setPaint(gp);
        gd.fillRect(0, 0, getWidth(), getHeight());
        gd.setPaint(p);
    }
}
