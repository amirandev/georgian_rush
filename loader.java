import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class loader extends Actor
{

    /**
     * Act - do whatever the loader wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().removeObject(this);
    }
}
