package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException{
		if (b==0)
			throw new IllegalArgumentException();
		return a/b;
	}
	public String reverse(String a) throws IllegalStateException{
		if (a.equals("")) {
			throw new IllegalStateException();
		}
		String s = "";
		for (int i =a.length()-1;i>=0;i++) {
			s+=a.charAt(i);
		}
		return s;
	}
}
