
public class main {

	public static void main(String[] args) {
		System.out.println(numberify("company money space"));

	}
	
	public static String numberify(String str) {
	    String num = "";
	    for (int i = 0; i < str.length(); i++) {
	        num += (str.codePointAt(i)%10);
	    }
	    return num;
	}

}
