package application;

import java.util.Arrays;
public class Program {
	
	public static int globaLVaLue = 3;
	
	public static void main(String[] args) {
		
	    int[] vect = new int[] { 3, 4, 5 };
	    changeOddVaLues(vect);
	    System.out.println(Arrays.toString(vect));
	}

		public static void changeOddVaLues(int[] numbers) {
		     for (int i = 0; i < numbers.length; i++) {
		          if (numbers[i] % 2 != 0) {
		        	  numbers[i] += globaLVaLue;
		          }
		     }
       } 
}