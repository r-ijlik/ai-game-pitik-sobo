import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class medium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class medium extends Actor
{
    /**
     * Act - do whatever the medium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseMoved(this)){
            this.setImage("images/medium-over.png");
        } else {
            this.setImage("images/medium.png");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new hint2());
        }
    }    
}
