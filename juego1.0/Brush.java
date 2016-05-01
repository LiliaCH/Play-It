import greenfoot.*;

public class Brush extends Actor
{
    public Brush(int width, int height)
    {
        setImage(new GreenfootImage(width, height));
        getImage().setColor(java.awt.Color.GREEN);
    }

    public void act() 
    {
        PaintWorld world = (PaintWorld)getWorld();

        UserData[] users = world.getTrackedUsers();
        for (UserData user : users)
        {
            Joint rightHand = user.getJoint(Joint.RIGHT_HAND);
            getImage().fillOval(rightHand.getX(), rightHand.getY(), 20, 20);

            if (user.getJoint(Joint.LEFT_HAND).getY() < user.getJoint(Joint.HEAD).getY())
            {
                getImage().clear();
            }
        }
    }
}
