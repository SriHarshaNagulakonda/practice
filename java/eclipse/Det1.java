import java.util.Scanner;

public class Det1 {

	public static void main(String[] args) {
		int i,n,j,k,b,d,det=1;
   	 System.out.println("Enter n value");
   	 Scanner s=new Scanner(System.in);
   	 n=s.nextInt();
   	 System.out.println("Enter elements of matrix");
   	 int a[][]=new int[n][n];
   	 for(i=0;i<n;i++)
   	 {
   		 for(j=0;j<n;j++)
   			 a[i][j]=s.nextInt();
   	 }
   	 det=a[0][0];
   	 for(k=0;k<n;k++)
   	 {
   		 for(i=k+1;i<n;i++)
   		 {
   			 d=a[i][k];
   			 b=a[k][k];
   			 //for(j=0;j<n;j++)
   				 a[i][i]=a[i][i]*b-a[k][i]*d;
   				 det=det*a[i][i];
   		 }
   	 }
   	 //det=1;
   	 //for(i=0;i<n;i++)
   		// det=det*a[i][i];
   	 System.out.println(det);


	}

}
