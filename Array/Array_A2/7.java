//Wap to take size of array from user and also take integer element from user
//Find the Common element from the array

import java.io.*;
class CommonEle{
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
		for(int i=0;i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i]==arr2[j]){
					System.out.println("Common Element is"+ arr1[i]);
				}
			}
		}
	}
}
