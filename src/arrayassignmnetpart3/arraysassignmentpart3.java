/**
 * 
 */
package arrayassignmnetpart3;

import java.util.Scanner;

/**
 * @author a.middlestead
 *
 */
public class arraysassignmentpart3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		 int[] myArray = new int[5];
		 int max;
		 
		 for(int i = 0; i < myArray.length; i++){
			 System.out.println("please enter a value");
			 myArray[i] = userInput.nextInt();
		 }
		 
		 max = myArray[0];
		 
		 for(int i = 1; i < myArray.length; i++){
			 if(myArray [i]> max){
				 max = myArray[i];
			 }
		 }
		 
		 System.out.println("the max is "+ max);
		 
		userInput.close();
	}

}
