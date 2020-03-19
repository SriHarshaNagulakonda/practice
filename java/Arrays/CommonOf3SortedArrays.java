//Question18-Algorithm to find the common element in given three sorted arrays
import java.util.Arrays;
import java.util.Scanner;

public class CommonOf3SortedArrays {

	static int getElement(int a1[],int a2[],int a3[]) {
		
		//Complexity O(n^3)
		//Brute Force
		
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				for(int k=0;k<a3.length;k++) {
					if(a1[i]==a2[j]&&a1[i]==a3[k])
						return a1[i];
				}
			}
		}
		return -1;
	}
	
	//finding common elements of 2 arrays and storing them in an array
	//then finding common elements of the third array with the previous array
	
	
	static int getElement1(int a1[],int a2[],int a3[]) {
		
		//Complexity O(n^2)
		
		int temp[]=new int[a1.length+a2.length];
		int k=0;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					temp[k++]=a1[i];
				}
			}
		}
		for(int i=0;i<a3.length;i++)
		{
			for(int j=0;j<k;j++)
			{
				if(a3[i]==temp[j])
				{
					return a3[i];
				}
			}
		}
		
		return -1;
		
	}
	
	//applying binarysearch for every element in first array with second and third arrays
	
	static int getElement2(int a1[],int a2[],int a3[]) {
	
		//Complexity O(n*log(n))
		
		for(int i=0;i<a1.length;i++)
		{
			if(Arrays.binarySearch(a2,a1[i])!=-1 && Arrays.binarySearch(a3,a1[i])!=-1)
				return a1[i];
		}
		return -1;
		
	}
	
	//finding common elements between 2 arrays in O(n) as
	//if elements are equal adding them into array
	//if i<j i++, i>j j--
	//and doing same process for finding elements between the previous array and the third array
	
	
	static int getElement3(int a1[],int a2[],int a3[])
	{
		//Complexity : O(n)
		
		int temp[]=new int[a1.length+a2.length];
		int i=0,j=0,k=0;
		for(;i<a1.length && j<a2.length;)
		{
			if(a1[i]==a2[j]) {
				temp[k++]=a1[i];
				i++;j++;
			}
			else if(a1[i]<a2[j])
				i++;
			else
				j++;
		}
		for(i=0,j=0;i<a3.length && j<k;)
		{
			if(a3[i]==a2[j]) {
				return a3[i];
			}
			else if(a3[i]<temp[j])
				i++;
			else
				j++;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int a1[]=new int[n1];
		for(int i=0;i<n1;i++)
			a1[i]=s.nextInt();
		
		int n2=s.nextInt();
		int a2[]=new int[n2];
		for(int i=0;i<n2;i++)
			a2[i]=s.nextInt();
		
		int n3=s.nextInt();
		int a3[]=new int[n3];
		for(int i=0;i<n3;i++)
			a3[i]=s.nextInt();
		
		System.out.println(getElement(a1,a2,a3));	//Complexity : O(n^3)
		System.out.println(getElement1(a1,a2,a3));	//Complexity : O(n^2)
		System.out.println(getElement2(a1,a2,a3));	//Complexity : O(n*log(n))
		System.out.println(getElement3(a1,a2,a3));	//Complexity : O(n)
	}

}
