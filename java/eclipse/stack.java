import java.util.*;
public class stack {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        Stack index=new Stack();
        Stack value=new Stack();
        String b="";
        String a,c;
        int i,x,y;
        for(i=0;i<t;i++)
        {
            x=s.nextInt();
            if(x==1)
            {
                 a=s.next();
                b=b+a;
                index.push(x);
                value.push(a);
            }    
            else if(x==2)
            {
               y=s.nextInt();
               index.push(x);
                value.push(b.substring(0,b.length()-y));
                b=b.substring(0,b.length()-y);
            }
            else if(x==3)
            {
                y=s.nextInt();
                System.out.println(b.charAt(y-1));
            }
            else
            {
                x=(int)index.peek();
                 if(x==1)
                 {
                     c=(String)value.peek();
                     if(b.length()!=c.length())
                     b=b.substring(0,b.length()-c.length());
                     else
                         b="";
                     index.pop();
                     value.pop();
                 } 
                if(x==2)
                {
                    c=(String)value.peek();
                   //b=b.concat(c);
                    b=b+c;
                    index.pop();
                    value.pop();
                }
            }
        }
    }
}