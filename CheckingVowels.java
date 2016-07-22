# Priya
import java.util.Scanner;
public class CheckingVowels {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character: ");
        String str=s.nextLine();
        char []vow=str.toCharArray();
        for(char c:vow)
        switch(c){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':System.out.println("Vowel");
        	     break;
        default:System.out.println("Constant");
        	
      }
	}


}
