import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botecito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botecito extends Actor
{
    /**
     * Act - do whatever the Botecito wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  Botecito(int cantidad){
         setRotation(cantidad);
        }
    
 public void act ()
{
    if(Greenfoot.isKeyDown("right")){
         setLocation(getX()+5, getY());
        }
    if(Greenfoot.isKeyDown("left")){
         setLocation(getX()-5, getY());
    }
    if(Greenfoot.isKeyDown("up")){
        setLocation(getX(), getY()-5);
    }    
    if(Greenfoot.isKeyDown("down")){
        setLocation(getX()+5, getY()+5);
    }
}
}

