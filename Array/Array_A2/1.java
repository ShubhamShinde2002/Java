//Wap to create an array of n integer elements
//where n takes from user
//print the sum of all element

import java.io.*;
class sum{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the Array Element:");
		int sum=0;
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

			sum=sum+arr[i];

		}
		System.out.println(sum);
	}
}
