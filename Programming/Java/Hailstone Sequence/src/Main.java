

public class Main {

	public static void main(String[] args) {
		while (true) {
		    try {
		    	int num = 1;
			    hSequence(num);
			    num++;
		    } catch (NumberFormatException e) {
		    	System.out.println("Please enter a valid number");
		    }
		}
	}
	
	public static void hSequence(int num) {
		int count = 1;
		while (num != 1) {
			if (num%2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			count++;
			System.out.print(num + " ");
			if (count%10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("There were " + count + " numbers in this sequence.");
	}

}
