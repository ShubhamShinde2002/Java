//WAP to find Strong no from array and return its index

import java.io.*;
class strongNoIndex{
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
			while(x!=0){
				y=x%10;
				int mult=1;
				while(y!=0){
					mult=mult*y;
					y--;
				}
				sum=sum+mult;
				x=x/10;

			}
			if(sum==arr[i]){

		         System.out.println(i);
			}


			}
		}
	}

