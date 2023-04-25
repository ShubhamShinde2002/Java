//Wap to create an array of n integer elements
//where n takes from user
//print the sum of even and odd number in array

import java.io.*;
class oddevensum{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the Array Element:");
		int sum1=0;
		int sum2=0;
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				sum1=sum1+arr[i];
			}else
				sum2=sum2+arr[i];

		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
