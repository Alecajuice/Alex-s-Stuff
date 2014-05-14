

public class Main {
	
	static int longest = 0;
	static int longNum;

	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
			hSequence(num);
		}
		hSequence(longNum);
		System.out.println();
		System.out.println("There were " + longest + " numbers in this sequence. It belongs to the number " + longNum);
	}
	
	public static void hSequence(int in) {
		int count = 1;
		int num = in;
		while (num != 1) {
			if (num%2 == 0) {
				num = num / 2;
			} else {
				num = num * 3 + 1;
			}
			count++;
			if (in == longNum) {
				System.out.print(num + " ");
				if (count%10 == 0) {
					System.out.println();
				}
			}
		}
		if (count > longest) {
			longest = count;
			longNum = in;
		}
	}

}
