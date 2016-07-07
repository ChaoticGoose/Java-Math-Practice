import java.io.*;
import java.util.Random;

class BasicMath
{
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
 	public static void main(String[] argv)
 		throws IOException
 	{
		System.out.println("Welcome to the Basic Math trainer.");
		System.out.println("This program is designed for pracitce with Addition, Subtraction, Multiplication and Division");
	
		//set up the reader object
		
		Random rand = new Random();
		//infinite loop
		while(true)
		{
			//get some random values, a pair for * and /, and a pair for + and -
			int v1 = rand.nextInt(9) +1;
			int v2 = rand.nextInt(9) +1;
			int v3 = rand.nextInt(9) +1;
			int v4 = rand.nextInt(9) +1;
			//decide which conversion to do (+,-,*,/)
			//values 0 through 5
			int conversion = rand.nextInt(4);
			
			switch (conversion){
				case 0: add(v3,v4); break;
				case 1: subtract(v3,v4); break;
				case 2: multiply(v1,v2); break;
				case 3: divide(v1,v2); break;

			}
		}
	}

	//get the user to convert a decimal to binary
 	static void add(int v1, int v2)
	{
		int solution = v1 + v2;
		System.out.println("Add the values " + v1 + " and " + v2);
		
		while(true)
		{
			try
			{
		  		int input = Integer.parseInt(reader.readLine());
		  		
		  		if(input == solution)
		  		{
		  			System.out.println("Correct");
		  		}
		  		else
		  		{
		  			System.out.println("Incorrect; Correct answer was " + solution);
		  		}
	  			return;
		  	}
		  	catch(IOException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
		  	catch(NumberFormatException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
	  	}
	}
	
		//get the user to convert a decimal to binary
 	static void subtract(int v1, int v2)
	{
		int solution = v1 + v2;
		System.out.println("Subtract " + v1 + " from " + solution);

		while(true)
		{
			try
			{
		  		int input = Integer.parseInt(reader.readLine());
		  		
		  		if(input == v2)
		  		{
		  			System.out.println("Correct");
		  		}
		  		else
		  		{
		  			System.out.println("Incorrect; Correct answer was " + v2);
		  		}
	  			return;
		  	}
		  	catch(IOException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
		  	catch(NumberFormatException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
	  	}
	}
	
		//get the user to convert a decimal to binary
 	static void multiply(int v1, int v2)
	{
		int solution = v1*v2;
		System.out.println("Multiply the values " + v1 + " and " + v2);

		while(true)
		{
			try
			{
		  		int input = Integer.parseInt(reader.readLine());
		  		
		  		if(input == solution)
		  		{
		  			System.out.println("Correct");
		  		}
		  		else
		  		{
		  			System.out.println("Incorrect; Correct answer was " + solution);
		  		}
	  			return;
		  	}
		  	catch(IOException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
		  	catch(NumberFormatException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
	  	}
	}
	
		//get the user to convert a decimal to binary
 	static void divide(int v1, int v2)
	{
		int solution = v1*v2;
		System.out.println("Divide " + solution + " by " + v1);
		
		while(true)
		{
			try
			{
		  		int input = Integer.parseInt(reader.readLine());
		  		
		  		if(input == v2)
		  		{
		  			System.out.println("Correct");
		  		}
		  		else
		  		{
		  			System.out.println("Incorrect; Correct answer was " + solution);
		  		}
	  			return;
		  	}
		  	catch(IOException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
		  	catch(NumberFormatException e)
		  	{
		  		System.out.println("Bad Input");
		  	}
	  	}
	}

}
