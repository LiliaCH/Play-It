import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;
/**
 * Write a description of class PaintingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaintWorld extends KinectWorld
{
    private static final int THUMBNAIL_WIDTH = 80;
    private static final int THUMBNAIL_HEIGHT = 60;
    private GreenfootSound sonido1 = null;
    private GreenfootSound sonido2 = null;
    private long leftHandUp;
    private long rightHandUp;
    //private Label leftHandWarning;

    public PaintWorld()
    {    
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);
        
        final int width = getWidth();
        final int height = getHeight();
        sonido1 = new GreenfootSound("beethoven2.mp3");
        sonido2 = new GreenfootSound("beethoven.mp3");
        //addObject(new Brush(width, height), width/2, height/2);
        addObject(new Instructions(), width/2, height/2);
        addObject(new Thumbnail(), width - THUMBNAIL_WIDTH/2, height - THUMBNAIL_HEIGHT/2);
        
        //Label instr = new Label("Use your right hand to paint, raise left hand to clear.", 20);
        //addObject(instr, instr.getImage().getWidth() / 2, getBackground().getHeight() - (instr.getImage().getHeight() / 2));
    }
    
    public void act()
    {
        super.act();
        if (!isConnected())
            return;
        
        UserData[] us = getTrackedUsers();
        getBackground().setColor(java.awt.Color.WHITE);
        getBackground().fill();
        
        boolean anyLeftHandUp = false;
        boolean anyrightHandUp = false;
        for (UserData u: us)
        {
            //Draws their stick figure:
            u.drawStickFigure(getBackground(), 60);
            
            if(anyLeftHandUp = anyLeftHandUp || (u.getJoint(Joint.LEFT_HAND).getY() < u.getJoint(Joint.HEAD).getY()))
            {
               sonido1.play();
            }
             else
             {
                sonido1.pause();
                }
            /*if(anyrightHandUp = anyrightHandUp || (u.getJoint(Joint.RIGHT_HAND).getY() < u.getJoint(Joint.HEAD).getY()))
            {
               sonido2.play();
            }
            else
             {
                sonido2.pause();
                }*/
                if(sonido1.isPlaying()) 
                {
                   if(u.getJoint(Joint.RIGHT_HAND).getY() < 500){
                      sonido1.setVolume(10);
                    }
                      else{
                          if(u.getJoint(Joint.RIGHT_HAND).getY() < 350){
                               sonido1.setVolume(50);
                          }
                          else{
                               sonido1.setVolume(100);
                            }
                        }
                }
        }
        /*
        // This is extra code used to warn the user if any of them is keeping their
        // left hand in the air, which effectively prevents any painting because
        // the brush will be cleared every frame:        
        if (anyLeftHandUp)
        {
            if (leftHandUp == -1)
            {
                leftHandUp = System.currentTimeMillis();
            }
            else
            {
                if (System.currentTimeMillis() - leftHandUp > 5000 && leftHandWarning == null)
                {
                    leftHandWarning = new Label("Put your left hand down to stop clearing the screen.", 40);
                    addObject(leftHandWarning, getWidth() / 2, getHeight() / 2);
                }
            }
        }
        else
        {
            leftHandUp = -1;
            if (leftHandWarning != null)
            {
                removeObject(leftHandWarning);
                leftHandWarning = null;
            }
        }*/
    }
}
