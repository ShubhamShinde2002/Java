// 1] WAP to take size of the array from user and also take integer element from the user
// Print the product of odd index element only

import java.io.*;
class oddproductindex{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int Mult=1;
		System.out.println("Enter the Element:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(i%2==1){
				Mult=Mult*arr[i];
			}

		}
		System.out.println("Product of odd index element is:"+ Mult);
	}
}
