//WAP to find ArmStrong no from array and return its index

import java.io.*;
class armStrongNoIndex{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter the Element in the array:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0; i<arr.length; i++){
			int x=arr[i];
			int y;
			int sum=0;
			int mult;
			while(x!=0){
				y=x%10;
				mult=y*y*y;
				x=x/10;
				sum=sum+mult;

			}
			if(sum==arr[i]){

		         System.out.println(i);
			}


			}
		}
	}

