import java.util.Scanner;

public class Echlon {

	public static void main(String[] args) {
		 int i,r,c,j,k,b,d;
    	 System.out.println("Enter r and c values");
    	 Scanner s=new Scanner(System.in);
    	 r=s.nextInt();
    	 c=s.nextInt();
    	 System.out.println("Enter elements of matrix");
    	 int a[][]=new int[r][c];
    	 for(i=0;i<r;i++)
    	 {
    		 for(j=0;j<c;j++)
    			 a[i][j]=s.nextInt();
    	 }
    	 for(k=0;k<r;k++)
    	 {
    		 for(i=k+1;i<r;i++)
    		 {
    			 d=a[i][k];
    			 b=a[k][k];
    			 for(j=0;j<c;j++)
    				 a[i][j]=a[i][j]*b-a[k][j]*d;
    		 }
    	 }
         for(i=0;i<r;i++)
         {
        	 for(j=0;j<c;j++)
               System.out.print(a[i][j]+" ");
        	 System.out.print("\n");
         }
	}

}
