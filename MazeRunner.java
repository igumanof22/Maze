import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeRunner extends Movers
{
    /**
     * Act - do whatever the MazeRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MazeRunner()
    {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act() 
    {
       slideAround();
       collectBoost();
       mazeRunnerHit();
       Check();
    }    
    public void mazeRunnerHit()
    {
        if(hitEnemy())
        {
            setLocation(40, 560);
        }
    }
    public void Check()
    {
        if(coun >= 3)
        {
            getWorld().showText("You Lose!!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(count >= 4)
        {
            getWorld().showText("You WIN!!", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
