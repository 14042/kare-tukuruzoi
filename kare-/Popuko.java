import greenfoot.*;

/**
 * Write a description of class Popuko here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Popuko extends Actor
{
    /**
     * Act - do whatever the Popuko wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "left" )){
            setRotation(180);
            move(1);// Add your action code here.

        // Add your action code here.if( Greenfoot.isKeyDown( "right" ) ){
                if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(1);
        }


    }    
}
}
