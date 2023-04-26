//WAP to find second min no from array 

import java.io.*;
class secMinNo{
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
		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				store=min;
				min=arr[i];
			}



			}

			System.out.println(store);
		}
	}

