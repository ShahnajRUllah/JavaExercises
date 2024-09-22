//Shahnaj Ullah 
//McGill ID #261195795
//Assignment 1 submitted - September 22, 2024

/* Program development (Calorie Calculator)
 * One way to measure the amount of energy expended during an exercise workout is to use metabolic 
 *	equivalents (MET). Here are some METS per minute for various activities: 
 *		- Running 6 MPH: 10 METS (define a constant called “RUNNING6MPH_METS” in your program)
 *	 	- Basketball: 8 METS (define a constant called “BASKETBALL_METS” in your program)
 *		- Sleeping: 1 METS (define a constant called “SLEEPING_METS” in your program)
 * 
 * The number of calories burned per minute may be estimated using the formula: 
 * 				Calories/ Minute = 0.0175 × METS × Weight in kilograms 
 * 
 * Write a Java program, named CCCS300A1, that prints a “Welcome to the calorie calculator!”
 * message, calculates and outputs the total number of calories burned (in two decimal digits by 
 * truncating) by three individuals, each of whom is performing an exercise activity. The details of input 
 * arguments to the program are the following: 
 * 		1st input argument is an integer value that represents the weight in pounds of a person who is 
 * 		running 6 MPH for 30 minutes every day. 
 * 
 * 		2nd input argument is an integer value that represents the weight in pounds of a person who is 
 * 		playing basketball for 60 minutes every day. 
 * 
 * 		3rd input argument is an integer value that represents the weight in pounds of a person who is 
 * 		sleeping for 6 hours every day. 
 * 
 * Note: 1 kilogram = 2.2 pounds. 1 hour = 60 minutes. 
 * 
 * Hint: To truncate in two decimal digits, just multiply with 100, type cast to convert to int type, then divide by 100.0. 
 */


public class CCCS300A1 {

	public static void main(String[] args) {

			// Print welcome message
			System.out.println("Welcome to the calorie calculator!");
			
			// retrieve 3 persons weights in pounds; 
			int personRunningWt = Integer.parseInt(args[0]); // running activity person weight
			int personBasketballWt = Integer.parseInt(args[1]); // basketball activity person weight
			int personSleepWt = Integer.parseInt(args[2]); // sleeping activity person weight
			
			// Convert persons weight in pounds to kilogram
			double poundDivisor = 2.2;
			double runner = personRunningWt/poundDivisor;
			double basketballPlayer = personBasketballWt/poundDivisor;
			double sleeper = personSleepWt/poundDivisor;
			
			// Initialize METS/min values for the 3 activities; running, basketball, sleep
			int RUNNING6MPH_METS = 10;  //burn 10 METS/min for running
			int BASKETBALL_METS = 8; //burn 8 METS/min for playing basktball 
			int SLEEPING_METS = 1; //burn 1 METS/min for sleeping
			
			// Define calories burned per minute for each activity - calories burned per minute = 0.0175 * METS * Weight in Kg;
			double calorieMultiplier = 0.0175;
			double minuteCalRunner = calorieMultiplier * RUNNING6MPH_METS * runner;
			double minuteCalBallPlayer = calorieMultiplier * BASKETBALL_METS * basketballPlayer;
			double minuteCalSleeper = calorieMultiplier * SLEEPING_METS * sleeper;
			
			// Compute number of calories burned by each person to two decimal places
			// Runner's calorie burned;  running 6 MPH for 30 minutes daily = calories burned per minute * 30 minutes 
			double runnerCalories = ((int)(100 * minuteCalRunner * 30)) / 100.00;
			
			// Person two play basketball for 60 minutes daily = calories burned per minute * 60 minutes 
			double ballPlayerCalories = ((int)(100 * minuteCalBallPlayer * 60)) / 100.00;
			
			// Person three sleeps 6 hours daily (60 minutes x 6 hrs = 360 minutes) = calories burned per minute * 360 minutes 
			double sleeperCalories = ((int)(100 * minuteCalSleeper * 360)) / 100.00;
			
			System.out.println("A " + personRunningWt + "LB person burned an estimated " + runnerCalories + " calories by Running");
			System.out.println("A " + personBasketballWt + "LB person burned an estimated " + ballPlayerCalories + " calories by playing Basketball");
			System.out.println("A " + personSleepWt + "LB person burned an estimated " + sleeperCalories + " calories by Sleeping");
			
	}

}
