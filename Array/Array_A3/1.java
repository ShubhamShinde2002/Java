//WAP to count digit of element in array

import java.io.*;
class digitCount{
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
			while(x!=0){
				count++;
				x=x/10;
			}

		System.out.println(count);
		}
	}
}
