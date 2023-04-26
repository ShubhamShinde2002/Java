//WAP to find second max no from array 

import java.io.*;
class secMaxNo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];

		System.out.println("Enter the Element in the array:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		int store=0;
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				store=max;
				max=arr[i];
			}



			}

			System.out.println(store);
		}
	}

