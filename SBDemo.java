import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code="SBDemo" width=300 height=200>
</applet> */
public class SBDemo extends Applet implements AdjustmentListener
{
String msg = "";
Scrollbar vertSB, horzSB;
public void init()
{
vertSB = new Scrollbar(Scrollbar.VERTICAL,0, 1, 0, 300);
horzSB = new Scrollbar(Scrollbar.HORIZONTAL,0, 1, 0, 200);
add(vertSB);
add(horzSB);
vertSB.addAdjustmentListener(this);
horzSB.addAdjustmentListener(this);
}

public void adjustmentValueChanged(AdjustmentEvent ae)
{
repaint();
}
public void paint(Graphics g)
{
int v=vertSB.getValue();
int h=horzSB.getValue();
msg=”Vertical: “+v+”, Horizontal: “+h;
g.drawString(msg, 6, 160);
g.drawString("*",v,h);
}
}
