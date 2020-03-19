import java.util.Scanner;
import java.lang.*;
class Determinant
{
	int adjoint(int a[][],int n)
	{
		int i,j,k,d,b,det;
	for(k=0;k<n;k++)
  	 {
  		 for(i=k+1;i<n;i++)
  		 {
  			 d=a[i][k];
  			 b=a[k][k];
  			 for(j=0;j<n;j++)
  				 a[i][j]=a[i][j]*b-a[k][j]*d;
  		 }
  	 }
  	 det=1;
  	 for(i=0;i<n;i++)
  		 det=det*a[i][i];
  	 return det;
     }
}	
public class Adjoint {

	public static void main(String[] args) {
   	 int p,q,x,y,i,n,j;
   	 System.out.println("Enter n value");
   	 Scanner s=new Scanner(System.in);
   	 n=s.nextInt();
   	 System.out.println("Enter elements of matrix");
   	 int a[][]=new int[n][n];
   	 int b[][]=new int[n-1][n-1];
   	 int adj[][]=new int[n-1][n-1];
   	 for(i=0;i<n;i++)
   	 {
   		 for(j=0;j<n;j++)
   			 a[i][j]=s.nextInt();
   	 }
   	 Determinant m=new Determinant();
   	 for(i=0;i<n;i++)
   	 {
   		 for(j=0;j<n;j++)
   		 {
   			 x=0;
   			 y=0;
   			 for(p=0;p<n;p++)
   			 {
   				 y=0;
   				 for(q=0;q<n;q++)
   				 {
   					 if((i!=p)&&(j!=q))
   					 {
   						 b[x][y]=a[p][q];
   					     y++;
   					 }
   				 }
   				 if(y!=0)
   					 x++;
   			 }
   			 adj[i][j]=(int) ((Math.pow(-1,i+j))*m.adjoint(b, n-1));
   		 }
   	 }
   	 for(i=0;i<n;i++)
   	 {
   		 for(j=0;j<n;j++)
   			 System.out.print(adj[j][i]+" ");
   		 System.out.print("\n");
   	 }	 
  }
}
