import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		if(num>0){
			System.out.println("positive");
		}
		else if(num<0){
			System.out.println("negative");
			}
		else if(num==0){
			System.out.println("Zero");
		}			
