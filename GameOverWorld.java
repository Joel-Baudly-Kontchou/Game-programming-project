import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        showText("You Lost The Game!", 260, 260);
    }
    
    public void showTextWithBigWhiteFont(String message, int x, int y){
        GreenfootImage bg = getBackground(); 
        Font font = new Font(55); 
        bg.setFont(font); 
        bg.setColor(Color.WHITE);
        bg.drawString(message,x,y);
    }
}
