import java.util.Scanner; 

	public class Week_1_Capstone {
	public static void main (String[] args) {
	// initialize a string to ask the user if they want to continue at the end. 	
	String userInput;	
	//keep the greeting outside of the do-while loop so the message doesn't keep getting displayed if the user wants to continue.
	System.out.println("Welcome to the Pig Latin Translator!");	
	//The do-while loop is here to run the program again if the user chooses so. 
	do {	
		Scanner scnr = new Scanner(System.in);

		String result;
		
	{
	System.out.println("Enter a line to be translated: ");
	// need to store the information the user is inputting.
	String input = scnr.nextLine();
	String changeCase = input;

	
	// This will take the input from the user and make it all lower case.	
	result = changeCase.toLowerCase();
	
	//We now need to see if it starts with a vowel or consonant 
	//Using an if statement we find that if the first letter is a vowel just add way to the ending
	if( result.startsWith("a") || result.startsWith("A") || result.startsWith("e") || result.startsWith("E") || result.startsWith("i") 
			|| result.startsWith("I") || result.startsWith("o") || result.startsWith("O") || result.startsWith("u") || result.startsWith("U"))

	{
		//This takes the result of the vowel statement and adds way to it. 
		System.out.println(result+ "way");
		System.out.println();
	}
	//if the statement doesn't start with a vowel, then everything else has to move before the first vowel to the end...
	//of the word. Then add "ay" to the end of the word.
	else
	{
		System.out.println(result.substring(1)+result.substring(0,1)+"ay");
		System.out.println();
	}
	}
	//next we ask the user if they want to continue or quit the program.
	System.out.println("Translate another line? (y/n) :");
	userInput = scnr.next();
	// The while is put at the end if the user wants to keep going. Any answer put in besides y or Y will terminate. 
	}while (userInput.startsWith("y") || userInput.startsWith("Y"));
	}
	}
	
	
	
			
	

	