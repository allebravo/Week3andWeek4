
public class Week3And4Assignment {

	public static void main(String[] args) {
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int ages [] = {3, 9, 23, 64, 2, 8, 28, 93};
		
		/* a. Programmatically subtract the value of the first element in the array from the value 
		 * in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		 */
		
		int subTractLast = (ages[ages.length-1]-ages[0]);
		System.out.println("1a. "+ subTractLast);
		
		/* b.Add a new age to your array and repeat the step above to 
		 * ensure it is dynamic (works for arrays of different lengths).
		 */
		int ages2 [] = {3, 9, 23, 64, 2, 8, 28, 93, 32};
		int subTractLast2 = (ages2[ages2.length-1]-ages2[0]);
		System.out.println("1b. "+ subTractLast2);
		
		/* c.Use a loop to iterate through the array and calculate the 
		 * average age. Print the result to the console
		 */
		
		int sum = 0;
		for (int age :ages) {
			sum += age;		
		}
		System.out.println("1c. "+ (sum/ages.length));
	
		//2.Create an array of String called names that contains the 
		//following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String [] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		/*a. Use a loop to iterate through the array and calculate the average 
		 * number of letters per name. Print the result to the console.
		 */
		
		int namesSum = 0;
		for (String name :names) {
			namesSum += name.length();
		}
		System.out.println("2a. "+ namesSum/names.length);
		
		/* b. Use a loop to iterate through the array again and concatenate all the names 
		 * together, separated by spaces, and print the result to the console.
		 */
		
		String sumOfNames= "";
		for (String name: names) {
			sumOfNames += name + " ";
		}
		System.out.println("2b. " + sumOfNames);
		
		//3. How do you access the last element of any array?
	
		System.out.println("3. last element: " + names[names.length -1]);
		
		
		//4. How do you access the first element of any array?
		System.out.println("4. first element: " + names[0]);
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		//created names array and add the length of each name to the nameLengths array.
		
		int [] nameLengths = new int[names.length];
		for (int i = 0; i<names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		for ( int name : nameLengths) {
			System.out.println("5. " +name);
		}
		 
		// 6. Write a loop to iterate over the nameLengths array and 
		//calculate the sum of all the elements in the array. Print the result to the console. 
		int sumOfElements = 0;
		for (int i =0; i<nameLengths.length; i++) {
		sumOfElements = sumOfElements + nameLengths[i];
		}
		System.out.println( "6. " + sumOfElements); 
		
		

		/*7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
		 * to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
		System.out.println("7."+ multiplyString("Java", 4));
		
		/*8.Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name 
		 * should be the first and the last name as a String separated by a space).
		 */
		
		String fullName = createFullName("Alex", "Bravo");
		System.out.println("8. "+ fullName);
		
		// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		int [] sumOfArray = {10,11,12,13,14};
		System.out.println("9. "+greatherThan100(sumOfArray));
				
		
		// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double [] doubles = {45.7, 30.2, 67.3};
		System.out.println("10. " +calculateAverage(doubles));
		
		/*11. Write a method that takes two arrays of double and returns true if the average of the 
		 * elements in the first array is greater than the average of the elements in the second array.
		 */
		double [] array1 = {45.7, 30.2, 67.3}; // 47.73333
		double [] array2 = {5.7, 30.2, 67.3}; //
		System.out.println("11. "+ isDoubleGreater(array1,array2));
		
		/* 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
		 * and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
		boolean isHotOutside = false;
		double moneyInPocket = 10.50;
		
		
		System.out.println("12. " + willBuyDrink(isHotOutside,moneyInPocket));
		
		/*13.	Create a method of your own that solves a problem. 
		 * In comments, write what the method does and why you created it.
		 * 
		 * This method calculates your annual salary. I created it because I want to know how much I make annually.
		 */
		int hourlyRate = 22;
		int hoursWorked = 42;
		int numberOfWeeks = 52;
		System.out.println("13. " + "Your annual salary is "+ "$" +annualSalary(hourlyRate,hoursWorked, numberOfWeeks));
}//end of main method
	
		//7. method below
		public static String multiplyString (String string, int num) {
			String result =" ";
			for ( int i=0; i <num; i++) {
			result += string;
			}
			return result;
		}	
	
		//8. method below
		public static String createFullName(String firstName,String lastName) {
			return firstName + " " + lastName;
		}
	
		//9. method below
		public static boolean greatherThan100 (int [] array) {
			int sumOfAll = 0;
			for (int number : array) {
				sumOfAll+=number;
			}
			if ( sumOfAll > 100) {
				return true;
			}
		return false;
		}
	
		//10. method below
		public static double calculateAverage (double [] array) {
			double sum = 0;
			for (double number : array) {
				sum += number;
			}
			return sum/ array.length;
		}
		//11. method below
		public static boolean isDoubleGreater (double [] array1, double[] array2) {
			double sum1 = 0;
			double sum2 = 0;
			for (double number : array1) {
				sum1 += number/array1.length;
			}
			for (double number2 : array2)	{
				sum2 += number2/array2.length;
			}
			return sum1 > sum2;
		}

		//12. method below
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			}
			return false;
		}

		//13. method below
		public static int annualSalary(int hourlyRate, int hoursWorked, int numberOfWeeks ) {
			return hourlyRate * hoursWorked * numberOfWeeks;
		}
}// end of class
