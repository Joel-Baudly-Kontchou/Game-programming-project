import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int score = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Player player = new Player();
        addObject(player, 300, 350); 
        
        showText("Score: 0/10", 80, 30); 
    }
    
    public void act() {
        if (Greenfoot.getRandomNumber(50) == 0)
        {
            FallingObject object = new FallingObject();
            
            int x = Greenfoot.getRandomNumber(600); 
            addObject(object, x, 0);
        }
        if (Greenfoot.getRandomNumber(100) == 0)
        { 
            BadObject object = new BadObject(); 
            int x = Greenfoot.getRandomNumber(600);
            addObject(object, x, 0);
        }
    }
    
    public void addScore()
    {
        score++;
        
        showText("Score:" + score + "/10", 80, 30); 
        
        if (score >= 10)
        {
            showText("YOU WIN!", 300, 200);
            Greenfoot.stop();
        }
    }
    
    public void gameOver()
    {
        showText("GAME OVER!", 300, 200); 
        Greenfoot.stop();
    }
}
