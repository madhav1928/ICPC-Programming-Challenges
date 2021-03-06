import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Long> lookup = new ArrayList<Long>();
		long l = 0;
		lookup.add(l);
		long increase = 1;
		while(l < Integer.MAX_VALUE) {
			l += increase;
			lookup.add(l);
			l += increase;
			lookup.add(l);
			increase ++;
		}
		Scanner sc = new Scanner(System.in);
		int rounds = sc.nextInt();
		for (int i = 0; i < rounds; i++) {
			int bottom = sc.nextInt();
			int top = sc.nextInt();
			int diff = top - bottom;
			int looper = 0;
			while(lookup.get(looper) < diff) {
				looper++;
			}
			System.out.println(looper);
		}
	}
}

