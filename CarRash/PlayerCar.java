import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @Gnanith Hanny
 * @1.01.11
 */
public class PlayerCar extends Actor
{
    
    private int score = 0;
    public void act()
    {
        getWorld().showText("Score :"+score,70,30);
        addScore();
        keyControls();
        endGame();
    }
    public void keyControls()
    {
        if(Greenfoot.isKeyDown("left")){
            if(getX()>=215){
                setLocation(getX() -2,getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<=398){
                setLocation(getX() +2,getY());
            }
        }
        if(Greenfoot.isKeyDown("up")){
           
                setLocation(getX(),getY() -2);
            
        }
        if(Greenfoot.isKeyDown("down")){
        
                setLocation(getX(),getY() +2);
        }
    }
    public void endGame()
    {
        if(isTouching(AnotherEne.class))
        {
            Greenfoot.playSound("gameover.wav");
            Greenfoot.delay(100);
            getWorld().showText("Score :"+score,300,300);
            Greenfoot.setWorld(new GameOver());
            Greenfoot.stop();
        }
    }
    public void addScore()
    {
        if(isTouching(Coin.class))
        {
            score = score +20;
            Greenfoot.playSound("Coin.wav");
            removeTouching(Coin.class);
        }
    }
}
