// 1] WAP to take size of the array from user and also take integer element from the user
// Print the sum of odd element only

import java.io.*;
class oddsum{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int sum=0;
		System.out.println("Enter the Element:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==1){
				sum=sum+arr[i];
			}

		}
		System.out.println("Sum of odd element is:"+ sum);
	}
}
