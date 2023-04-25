//Wap to create an array of n integer elements
//where n takes from user
//find the specific element index in array

import java.io.*;
class specificEleIndex{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the Specific Element:");
		int key=Integer.parseInt(br.readLine());
		System.out.println("Enter the Array Element:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		for(int i=0; i<arr.length; i++){

			if(arr[i]==key){
				System.out.println(i);
			}
		}

		
	}
}
