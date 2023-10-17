package testng;

public class day3 {
	
	// same class , same method name , different signature --- overloading

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition(12,4);
		addition(12,4,5);
		addition(12,4,5,5);
	}
	
	public static void addition(int x , int y) {
		System.out.println(x+y);
	}
	public static void addition(int x , int y ,int z) {
		System.out.println(x+y+z);
	}
	public static void addition(int x , int y ,int z , int a) {
		System.out.println(x+y+z+a);
	}

}
