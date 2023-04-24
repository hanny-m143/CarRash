import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends parent
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Speed = 3;
    public void act()
    {
        Coin coin = new Coin();
        Actor i = getOneIntersectingObject(Coin.class);
        move(Speed);
        checkDouble(i);
        end();
    }
}
