package week4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Test (10009)");
		System.out.println(name.substring(name.indexOf("(")+1, name.indexOf(")")));
	}
}
