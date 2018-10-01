import java.util.Scanner;
public class while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = 1;
		while (x != 0){
			System.out.println("Enter a number:");
			int n = sc.nextInt();
			System.out.println("The square of that number is: " + (n * n));
			x = n + 0;
		}
	}

}
