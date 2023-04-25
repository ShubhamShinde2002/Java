//Wap to take size of array from user and also take integer element from user
//addition ofdigit is even

import java.io.*;
class digitAddEven{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		System.out.println("Enter the Array Element:");
		for(int i=0; i<arr.length; i++){
			arr[i]=Integer.parseInt(br.readLine());

		}
		for(int i=0; i<arr.length; i++){
			int x=arr[i];
			int y;
			int sum=0;
			while(x!=0){
				y=x%10;
				sum=sum+y;
				x=x/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}
		}
	}
}
