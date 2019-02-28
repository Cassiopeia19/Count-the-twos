import java.util.Random;
import java.util.TreeSet;
import java.util.*;

public class FindTwos {
	
	public static void main(String[] args) {
	
		//generates an ordered list of 23 integers between -12 and 50, & with no repeats
		TreeSet<Integer> numbers =  new TreeSet<Integer>();
		Random rand = new Random();
		while(numbers.size() < 23)
		    numbers.add(rand.nextInt(62) + (-12));
		
		System.out.println("Numbers Generated: " + numbers);
		System.out.println();
		System.out.println("After converting array to int: ");

		int[] ret = new int[numbers.size()];
	    Iterator<Integer> iterator = numbers.iterator();
	    for (int i = 0; i < ret.length; i++)
	    {
	        ret[i] = iterator.next().intValue();
	        System.out.print(ret[i] + " ");
	    }
	    int twoCount = 0;

	    for (int i = 0; i < ret.length; i++) {
	      twoCount += countTwos(ret[i]);
	    }
	    System.out.println();
	    System.out.println();
	    System.out.println("Total number of twos within this array is: " + twoCount);
	  }

	  private static int countTwos(int number) {
	    int twoCount = 0;
	    while (number > 0 || number < 0) {
	    	int lastDigit = number % 10;
	    	if (lastDigit == 2 || lastDigit == -2) {
	    		twoCount += 1;
	    	}
	    	number /= 10;
	    }

	    return twoCount;
	  }
	   
	    }

