package generics;

public class Maximum {

	//calculating Maximum of Three Numbers using CompareTo method
	public static int checkMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if(y.compareTo(max) > 0) {
			max = y; // y is largest now
		}
		if(z.compareTo(max) > 0) {
			max = z; // z is largest now
		}
		return max; // returns maximum number
	}

	public static float checkMaximum(Float d, Float e, Float f) {
		Float max = d;
		if(e.compareTo(max) > 0) {
			max = e; // e is largest now
		}
		if(f.compareTo(max) > 0) {
			max = f; // f is largest
		}
		return max; // // returns maximum number
	}
	
	// Calculating maximum of 3 Strings
	public static String checkMaximum(String s1, String s2, String s3) {
		String max = s1;
		if(s2.compareTo(max) > 0) {
			max = s2; // s2 is Maximum now 
		}
		if(s3.compareTo(max) > 0) {
			max = s3; // s3 is Maximum now
		}
		return max; // returns maximum value
	}

	public static void main(String[] args) {
		int c = checkMaximum(10,23,15);
		int d = checkMaximum(12.5, 13.4, 22.0);
		String s = checkMaximum("Apple", "Peach", "Banana");
		System.out.println(c);
		System.out.println(d);
		System.out.println(s);
	}

}
