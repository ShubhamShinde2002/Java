//WAP to find prime no from array and return its index

import java.io.*;
class primeNoIndex{
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
			int count=0;
			int y=1;
			while(y<=x){
				if(x%y==0){
					count++;
				}
				y++;

			}
			if(count<=2){

		            System.out.println("Prime number"+arr[i]+"Found at index"+i);
			}
		}
	}
}
