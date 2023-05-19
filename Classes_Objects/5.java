class MacD{
	int item=2;
	String product="Fries";
	void menu(){
		String menu1="Veg";
		String menu2="Non-Veg";
		System.out.println(item);
		System.out.println(product);
	}
}
class User{
	public static void main(String[] args){
		MacD obj1=new MacD();
		obj1.menu();
	}
}
