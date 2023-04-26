//WAP to find perfect no and return its index

import java.io.*;
class perfectNoIndex{
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
			int y=1;
			int sum=0;
			while(y<x){
				if(x%y==0){
					sum=sum+y;
				}
				y++;
			}
			if(sum==arr[i]){
				System.out.println("The Perfect Number"+ arr[i] + "Its Index Is" + i);
			}
		}
	}
}
