//Wap to create an array of n integer elements
//where n takes from user
//print the count of even and odd number in array

import java.io.*;
class oddevencount{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the Array Element:");
		int count1=0;
		int count2=0;
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				count1++;
			}else
				count2++;

		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
