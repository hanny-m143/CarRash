import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends parent
{
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Speed = 3;
    public void act()
    {
        Tree tree = new Tree();
        Actor i = getOneIntersectingObject(Tree.class);
        move(Speed);
        checkDouble(i);
        end();
    }
}
