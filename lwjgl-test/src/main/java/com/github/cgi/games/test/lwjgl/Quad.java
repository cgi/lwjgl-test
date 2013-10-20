/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.cgi.games.test.lwjgl;

import org.lwjgl.opengl.GL11;

/**
 *
 * @author cgi
 */
public class Quad {
    private int x;
    private int y;
    
    private int size;
    
    public Quad(){
        this(0, 0, 100);
    }

    public Quad(int x, int y){
        this(x, y, 100);
    }
    
    public Quad(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
    };
    
    public void paint() {
	    // draw quad
	    GL11.glBegin(GL11.GL_QUADS);
	        GL11.glVertex2f(x,y);
		GL11.glVertex2f(x + size, y);
		GL11.glVertex2f(x + size , y + size);
		GL11.glVertex2f(x, y + size);
            GL11.glEnd();        
    };

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
}
