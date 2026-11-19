import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWonWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWonWorld extends World
{
    /**
     * Constructor for objects of class GameWonWorld.
     * 
     */
    public GameWonWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        showText("You Won The Game!", 260, 260);
    }
    
    public void showTextWithBigBlackFont(String message, int x, int y){
        GreenfootImage bg = getBackground(); 
        Font font = new Font(55); 
        bg.setFont(font);
        bg.setColor(Color.BLACK); 
        bg.drawString(message,x,y);
    }
}
