package oct28;

public class Child {
	
	public static void add()
	{
		int a=2,b=5;
		int c= a+b;
		System.out.println(c);
		
	}
 
	

	public static void main(String[] args) {
		Parent.launchUrl("http://primusbank.qedgetech.com/");
		Parent.login("Admin", "Admin");
		Child.add();
		

	}

}
