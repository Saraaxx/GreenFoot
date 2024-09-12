import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Millonaire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Millonaire extends Actor
{
    /**
     * Act - do whatever the Millonaire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    
    public Millonaire(int cantRotation){
          setRotation(260);
        }
        Boolean canFire = true;
    public void act()
    {
        if(Greenfoot.isKeyDown("A")){
            setLocation(getX()-5, getY());
        }
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+5, getY());
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getY()+5, getX());
        }
        if(Greenfoot.isKeyDown("W")){
            setLocation(getY()-5, getX());
        }
        fireProjectile();
       // Add your action code here.
    }
    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            getWorld().addObject(new Proyectil(), getX(), getY()-30);
            canFire = false;
            
        } else if(!Greenfoot.isKeyDown("space")){
            canFire =true;   
        }

    }
}
