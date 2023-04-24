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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    private void prepare()
    {
        PlayerCar playercar = new PlayerCar();
        addObject(playercar,307,557);
    }
    public void act()
    {
        if(Greenfoot.getRandomNumber(100)<1)
        {
            addObject(new AnotherEne(),Greenfoot.getRandomNumber(200)+200,0);
        }
    
        if(Greenfoot.getRandomNumber(10)<2)
        {
            addObject(new Tree(),Greenfoot.getRandomNumber(170),0);
            addObject(new Tree(), Greenfoot.getRandomNumber(170)+400,0);
            
        }
        if(Greenfoot.getRandomNumber(10)<2)
        {
            addObject(new Tree(),Greenfoot.getRandomNumber(170),0);
            addObject(new Tree(), Greenfoot.getRandomNumber(170)+500,0);
            
        }
        if(Greenfoot.getRandomNumber(300)<1)
        {
            addObject(new Coin(), Greenfoot.getRandomNumber(200)+200,0);
        }
        
        
    }
}
