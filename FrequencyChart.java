import java.util.*;

public class FrequencyChart {

	public static void main(String[] args) {
		
		System.out.println("Enter as many numbers between 1 and 100 as you wish (type number and hit enter, type 0 and hit enter when you wish to stop");
		
		int[] numbers = new int[10];
		
		boolean entering = true;
		
		Scanner scan = new Scanner(System.in);

		while (entering == true) {
			int num = scan.nextInt();
			if (num < 11 && num > 0) {
				numbers[0] = numbers[0] + 1;
			}
			else if (num < 21 && num > 10) {
				numbers[1] = numbers[1] + 1;
			}
			else if (num < 31 && num  > 20) {
				numbers[2] = numbers[2] + 1;
			}
			else if (num < 41 && num > 30) {
				numbers[3]++;
			}
			else if (num < 51 && num > 40) {
				numbers[4]++;
			}
			else if (num < 61 && num > 50) {
				numbers[5]++;
			}
			else if (num < 71 && num > 60) {
				numbers[6]++;
			}
			else if (num < 81 && num > 70) {
				numbers[7]++;
			}
			else if (num < 91 && num > 80) {
				numbers[8]++;
			}
			else if (num < 101 && num > 90) {
				numbers[9]++;
			}
			else if (num == 0) {
				entering = false;
			}
		}
		for (int i = 0; i < 10; i++) {
			String asterisks = "";
			for (int a = 0; a < numbers[i]; a++) {
				asterisks = asterisks + "*";
			}
			System.out.println("|" + (i*10+1) + " -- " + (i*10+10) + "| " + asterisks);
		}
		scan.close();	
	}
}
