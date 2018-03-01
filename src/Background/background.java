/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Background;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

/**
 *
 * @author FUCK_HIM
 */
public class background extends JDesktopPane{
    Image gam;
    public background(){
        setOpaque(true);
        gam=new ImageIcon(getClass().getResource("oren.jpg")).getImage();
        repaint();
    }

    public void setGambar(String temp){
        setOpaque(false);
        gam=new ImageIcon(getClass().getResource(temp)).getImage();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gg=(Graphics2D)g.create();
        gg.drawImage(gam, 0,0,getWidth(),getHeight(), null);
        gg.dispose();
    }


}
