// Clock.java
 
import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;
 
/**
* Une horloge en Java
*
* @author Sébastien Combéfis
* @version 2006-10-18
*/
public class MyClock extends Applet
{
    public void init()
    {
        new Timer().schedule (new TimerTask()
        {
            public void run()
            {
                repaint();
            }
        }, 1000, 1000);
    }
 
    public void paint (Graphics g)
    {
        g.setColor (Color.BLACK);
        g.fillRect (0, 0, getWidth(), getHeight());
 
        g.setColor (Color.WHITE);
 
        Date now = new Date();
        DateFormat df = DateFormat.getTimeInstance();
        g.drawString (df.format (now), 20, 15);
    }
}