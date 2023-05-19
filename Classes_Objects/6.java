class Core2Web{
	int noOfCourse=8;
	String favCourse="DSA";
	void disp(){
		System.out.println(noOfCourse);
		System.out.println(favCourse);
	}
}
class User1{
	public static void main(String[] args){
		Core2Web obj1=new Core2Web();
		obj1.disp();
	}
}
