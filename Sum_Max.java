import java.util.Scanner;

public class scan {

	public static void main(String[] args)
	{
		System.out.print("입력할 정수의 개수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++)
		{