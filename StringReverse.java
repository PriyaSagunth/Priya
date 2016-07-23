import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String ori=s.next();
		String rev="";
		int len=ori.length();
		for(int i=len-1;i>=0;i--){
			rev=rev+ori.charAt(i);
		}
			System.out.println("The reversed String is : "+rev);
		
	}
}
