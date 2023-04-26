//WAP to find Palindrome no from array and return its index

import java.io.*;
class palindromeNoIndex{
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
			int store;
			int rev=0;
			while(x!=0){
				store=x%10;
				rev=rev*10+store;
				x=x/10;


			}
			if(rev==arr[i]){

		            System.out.println(i);
			}
		}
	}
}
