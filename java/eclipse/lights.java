import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Trafficlights"width=500 height=500>
</applet>
*/
public class lights extends Applet implements ItemListener
{
CheckboxGroup cbg;
Checkbox r,g1,y;
public void init()
{
cbg=new CheckboxGroup();
r=new Checkbox("Red",cbg,false);
g1=new Checkbox("green",cbg,false);
y=new Checkbox("yellow",cbg,false);
r.addItemListener(this);
g1.addItemListener(this);
y.addItemListener(this);
add(r);
add(g1);
add(y);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
if(cbg.getSelectedCheckbox()==r)
{
g.setColor(Color.red);
g.fillOval(150,125,70,70);
}
if(cbg.getSelectedCheckbox()==g1)
{
g.setColor(Color.green);
g.fillOval(150,125,70,70);
}
if(cbg.getSelectedCheckbox()==y)
{
g.setColor(Color.yellow);
g.fillOval(150,125,70,70);
}
}
}
