import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnotherEne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnotherEne extends parent
{
    /**
     * Act - do whatever the AnotherEne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Speed = 3;
    
    public void act()
    {
        AnotherEne anotherene = new AnotherEne();
        Actor i = getOneIntersectingObject(AnotherEne.class);
        move(Speed);
        checkDouble(i);
        end();
        setRotation(90);
    }
       
}
