
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CiurulLuiEratostene {
	
	public static ArrayList<Integer> ciur(ArrayList<Integer> numbers) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		int k;
		
		while(numbers.size() != 0) {
			if (numbers.get(0) > 1) {
				primeNumbers.add(numbers.get(0));
				k = primeNumbers.size() - 1;
				// primeNumbers.size() - 1 is the index of the last digit added to primeNumbers
				for (int i = 0; i <= numbers.size() - 1; i++) {
					if (numbers.get(i) % primeNumbers.get(k) == 0) {
						numbers.remove(i);
						i--;
					}
				}
			} else {
				numbers.remove(0);
			}
		}
		return primeNumbers;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Upper limit:");
		int n = sc.nextInt();
		while(n < 2) {
			System.out.println("Can't be smaller than 2:");
			n = sc.nextInt();
		}
 
		ArrayList<Integer> numbers = new ArrayList<Integer>(n);
		
		for (int i = 0; i <= n; i++) {
			numbers.add(i);
		}
		
		System.out.println("Prime numbers in the interval 0-" + n + ":");
		System.out.println(ciur(numbers));
		 
		sc.close();
	}
 
}
