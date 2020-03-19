import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
 class Student //extends Frame implements ActionListener
{
   Student()
 {
 String msg;
 Frame f=new Frame("Student Details");
 Font font=new Font("consolas",2,20);
 f.setBounds(0,0,400,400);
 f.setLayout(null);
 f.setVisible(true);
 Label l1=new Label("name");
 l1.setBounds(10,10,50,20);
 l1.setFont(font);
 TextField t1=new TextField();
 t1.setBounds(90,10,60,20);
 t1.setFont(font);
 f.add(l1);
 f.add(t1);
 Label l2=new Label("age");
 l2.setBounds(10,50,50,20);
 l2.setFont(font);
 f.add(l2);
 TextField t2=new TextField();
 t2.setBounds(90,50,60,20);
 t2.setFont(font);
 f.add(t2);
 Label l3=new Label("address");
 l3.setBounds(10,90,50,20);
 l3.setFont(font);
 f.add(l3);
 TextArea t3=new TextArea(20,20);
 t3.setBounds(90,90,20,20);
 t3.setFont(font);
 f.add(t3);
 Label l4=new Label("sem");
 l4.setBounds(10,130,50,20);
 l4.setFont(font);
 f.add(l4);
 Choice sem=new Choice();
 sem.setBounds(90,130,50,20);
 sem.add("1");
 sem.add("2");
 sem.add("3");
 f.add(sem);
 Label l5=new Label("course");
 l5.setBounds(10,170,50,20);
 l5.setFont(font);
 f.add(l5);
 Choice course=new Choice();
 course.setBounds(90,170,50,20);
 course.add("cse");
 course.add("eee");
 course.add("ece");
 f.add(course);
 Label l6=new Label("gender");
 l6.setBounds(10,210,50,20);
 l6.setFont(font);
 f.add(l6);
 CheckboxGroup cbg=new CheckboxGroup();
 Checkbox ck1=new Checkbox("male",false,cbg);
 Checkbox ck2=new Checkbox("female",false,cbg);
 f.add(ck1);
 f.add(ck2);
 Button b1=new Button("save");
 b1.setBounds(40,250,50,20);
 f.add(b1);
 //b1.addActionListener(this);
 b1.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent ae)
{
 if(ae.getActionCommand().equals("save"))
 {
  System.out.println("student details saved");
  f.setForeground(Color.RED);
  }
 }
});
 }
/*class MywindowAdapter extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}
addWindowListener(new WindowCloser());
 public void actionPerformed(ActionEvent evt)
 {
  System.exit(0);
 }
public void paint(Graphics g)
{
 g.drawString(msg);
}*/
public static void main(String[] args)
{ 
 //Student st=
  new Student();
 //st.student();
  }
 }
