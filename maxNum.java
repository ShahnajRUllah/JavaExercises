//Shahnaj Ullah 
//McGill ID #261195795
//Exercise 2 submitted - September 9, 2024

/* Write a program Write a program that get the largest value 
 * from the user’s input via args[0], args[1], args[2].
 */


public class maxNum {

	public static void main(String[] args) {
		
		// declaring three user integer inputs to save
		int one = Integer.parseInt(args[0]);
		int two = Integer.parseInt(args[1]);
		int three = Integer.parseInt(args[2]);
		
		// print highest number of three inputs
		System.out.println(Math.max(Math.max(one,two),three));

	}

}
