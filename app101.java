package week9b;

public class app101{
	String name;
	int age;
		
		public void getuser() {
			System.out.println("My name: "+name);
			System.out.println("Age: "+age);
			
		}
		
	public static void main(String[]args) {
		app101 a = new app101();
		a.name="pond";
		a.age=20;
		a.getuser();
		Google(30,30);
	}
	
	public static void Google(int cat,int dog) {
		int total;
		total = cat*dog;
		System.out.println("Total: "+total);
		
	}
	
}