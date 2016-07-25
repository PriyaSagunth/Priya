import java.util.Scanner;
public class Sumofnum {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many  numbers to be summed out : ");
		int n=s.nextInt();
		int sum=0;
		int []a=new int[100];
		System.out.println("enter the numbers : ");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			sum +=a[i];
		}
		System.out.println(sum);

}
}
