package com.github.cgi.games.test.lwjgl;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

/**
 * Hello world!
 *
 */
public class App 
{
    public void start() {
        
        // Создаем массив 
        Quad[] qArray = new Quad[2];
        
        qArray[0] = new Quad(100,100, 200);
        
        qArray[1] = new Quad(400,100, 200);
        
        try {
	    Display.setDisplayMode(new DisplayMode(800,600));
	    Display.create();
	} catch (LWJGLException e) {
	    e.printStackTrace();
	    System.exit(0);
	}
 
	// init OpenGL
	GL11.glMatrixMode(GL11.GL_PROJECTION);
	GL11.glLoadIdentity();
	GL11.glOrtho(0, 800, 0, 600, 1, -1);
	GL11.glMatrixMode(GL11.GL_MODELVIEW);
 
	while (!Display.isCloseRequested()) {
	    // Clear the screen and depth buffer
	    GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);	
		
	    // set the color of the quad (R,G,B,A)
	    GL11.glColor3f(0.5f,0.5f,1.0f);
            
            for(Quad q: qArray){
                q.paint();
            }
 
	    Display.update();
	}
 
	Display.destroy();
    }
    
    
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println( "Hello World!" );
        app.start();
        System.out.println( "The end!" );
    }
}
