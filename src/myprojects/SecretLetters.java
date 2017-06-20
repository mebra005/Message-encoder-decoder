package myprojects;

import java.util.Scanner;

public class SecretLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		char[] charArray = sentence.toCharArray();
		
		for(int i = 0; i < charArray.length; i++){
			if(charArray[i] == 'a' || charArray[i] == 'A' ){ charArray[i] = 'g';}
			else if(charArray[i] == 'a' || charArray[i] == 'A' ){ charArray[i] = 'g';}
			else if(charArray[i] == 'b' || charArray[i] == 'B' ){ charArray[i] = 'j';}
			else if(charArray[i] == 'c' || charArray[i] == 'C' ){ charArray[i] = 'n';}
			else if(charArray[i] == 'd' || charArray[i] == 'D' ){ charArray[i] = 'c';}
			else if(charArray[i] == 'e' || charArray[i] == 'E' ){ charArray[i] = 'x';}
			else if(charArray[i] == 'f' || charArray[i] == 'F' ){ charArray[i] = 'r';}
			else if(charArray[i] == 'g' || charArray[i] == 'G' ){ charArray[i] = 'f';}
			else if(charArray[i] == 'h' || charArray[i] == 'H' ){ charArray[i] = 'i';}
			else if(charArray[i] == 'i' || charArray[i] == 'I' ){ charArray[i] = 'y';}
			else if(charArray[i] == 'j' || charArray[i] == 'J' ){ charArray[i] = 'a';}
			else if(charArray[i] == 'k' || charArray[i] == 'K' ){ charArray[i] = 'o';}
			else if(charArray[i] == 'l' || charArray[i] == 'L' ){ charArray[i] = 'z';}
			else if(charArray[i] == 'm' || charArray[i] == 'M' ){ charArray[i] = 's';}
			else if(charArray[i] == 'n' || charArray[i] == 'N' ){ charArray[i] = 'w';}
			else if(charArray[i] == 'o' || charArray[i] == 'O' ){ charArray[i] = 'b';}
			else if(charArray[i] == 'p' || charArray[i] == 'P' ){ charArray[i] = 'k';}
			else if(charArray[i] == 'q' || charArray[i] == 'Q' ){ charArray[i] = 'p';}
			else if(charArray[i] == 'r' || charArray[i] == 'R' ){ charArray[i] = 'e';}
			else if(charArray[i] == 's' || charArray[i] == 'S' ){ charArray[i] = 'u';}
			else if(charArray[i] == 't' || charArray[i] == 'T' ){ charArray[i] = 'l';}
			else if(charArray[i] == 'u' || charArray[i] == 'U' ){ charArray[i] = 'v';}
			else if(charArray[i] == 'v' || charArray[i] == 'V' ){ charArray[i] = 't';}
			else if(charArray[i] == 'w' || charArray[i] == 'W' ){ charArray[i] = 'h';}
			else if(charArray[i] == 'x' || charArray[i] == 'X' ){ charArray[i] = 'q';}
			else if(charArray[i] == 'y' || charArray[i] == 'Y' ){ charArray[i] = 'm';}
			else if(charArray[i] == 'z' || charArray[i] == 'Z' ){ charArray[i] = 'd';}
			else{ charArray[i] = charArray[i];
			
		}
		}
		String decode = String.valueOf(charArray);
		System.out.println(decode);

	}

}
