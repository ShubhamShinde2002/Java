// WAP to print the sum of even no and mult of odd no

class oddMultEvenSum{
	public static void main(String[] args){
		int x=10;
		int sum=0;
		int mult=1;
		while(x!=0){
			if(x%2==1){
				mult=mult*x;
			}else{
				sum=sum+x;
			}
			x--;
		}
		System.out.println(sum);
		System.out.println(mult);
	}
}
