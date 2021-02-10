/*Write an applet that displays your name centered in a circle centered in the applet*/
import java.applet.Applet;
import java.awt.*;

public class Exp1 extends Applet {
    public void paint(Graphics g) {
        g.drawOval(110,80,150,150);
        g.drawString("Sree Haran",150,150);
    }
}
/*
<html>
    <applet code=Exp1 height="300" width="400">
    </applet>
</html>
*/