/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tri Wibowo
 */
 

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D; 

@SuppressWarnings("serial")
public class ClPanelTransparan extends JPanel
{
	private Color clr;
	
	public ClPanelTransparan()
	{
		setOpaque(false);
		clr = new Color(getBackground().getRed(), getBackground().getRed(), getBackground().getGreen(),80);
	}	
	
	public void setBackground(Color bg)
	{
		super.setBackground(bg);
		clr = new Color(getBackground().getRed(), getBackground().getRed(), getBackground().getGreen(),80);
		repaint();
	}
	
	protected void paintComponent(Graphics graph)
	{
		super.paintComponent(graph);
		Graphics2D g2d = (Graphics2D) graph.create();
		g2d.setColor(clr);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.dispose();
	}
	
}

