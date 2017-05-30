import java.util.Scanner;

public class MyYoutubeClass3 {
	public static void main(String args[]){
		Scanner Ramu = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter your first number: ");
		fnum = Ramu.nextDouble();
		System.out.println("Enter your second number: ");
		snum = Ramu.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
