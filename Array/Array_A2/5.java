//Wap to take size of array from user and also take integer element from user
//Find the Minimum element from the array

import java.io.*;
class MinEle{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the Array Element:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
