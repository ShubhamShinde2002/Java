//Wap to take size of array from user and also take integer element from user
//Merge two Array

import java.io.*;
class MergeArr{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array1:");
		int size1=Integer.parseInt(br.readLine());
		System.out.println("Enter the Size of Array2:");
		int size2=Integer.parseInt(br.readLine());
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		System.out.println("Enter the Array1 Element:");
		for(int i=0; i<arr1.length; i++){
			arr1[i]=Integer.parseInt(br.readLine());

		}
		System.out.println("Enter the Array2 Element:");
		for(int i=0; i<arr2.length; i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		int arr3[]=new int[size1+size2];
		for(int k=0; k<arr1.length+arr2.length;){
		for(int i=0;i<arr1.length; i++){
			arr3[k]=arr1[i];
			k++;
		}
		for(int j=0; j<arr2.length; j++){
			arr3[k]=arr2[j];
			k++;
		}

		}
		for(int i=0; i<arr1.length+arr2.length; i++){
			System.out.println(arr3[i]);
		}
	}
}
