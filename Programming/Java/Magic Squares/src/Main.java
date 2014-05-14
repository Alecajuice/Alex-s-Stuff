import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter size of magic square (odd number):");
			Scanner sc = new Scanner(System.in);
		    String str = sc.nextLine();
		    try {
		    	int num = Integer.parseInt(str);
			    if (num % 2 != 0) {
			    	mSquare(num);
			    } else {
			    	System.out.println("Please enter an odd number");
			    }
		    } catch (NumberFormatException e) {
		    	System.out.println("Please enter a valid odd number");
		    }
		}
	}
	
	public static void mSquare(int num) {
		int[][] square = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++){
				square[i][j] = 0;
				System.out.println(i + j);
			}
		}
		System.out.println(-(num - 1));
		int k = 1;
		for (int i = 0; i > -num;) {
			for (int j = num/2; j < num;) {
				if (i == -1) {
					i = num - 1;
				}
				if (j == num) {
					j = 0;
				}
				if (square[i][j] != 0) {
					i++;
					j--;
				}
				System.out.println("i = " + (i+1));
				System.out.println("j = " + (j+1));
				square[i][j] = k;
				k++;
				System.out.println(square[i][j]);
				i--;
				j++;
			}
		}
		for (int i = 0; i > -num; i--) {
			for (int j = (num + 1)/2; j < num; j++) {
				String space = " ";
				if (square[i][j] < 10) {
					space += " ";
				}
				System.out.println(square[i][j] + space);
			}
		}
	}

}
