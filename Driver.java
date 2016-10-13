
public class Driver 
{
	public static void main(String[] args)
	{ 
		String helloWorld = "Hello World$"; //the string that will go through the called functions
		String8086 string = new String8086(helloWorld); //Constructor with the string that will be printed 
		//in the parameters that were required in the String8086 class function
		string.stringToCharArray(); //calling the stringToCharArray for the string 
		string.printCharArray(); //calling the print function for the string
	}
}
	//Class String 8086
	//implemented as a char array
	//constructor can take in a String, but must convert/sore as $ terminated char array
	//maximum String size is 64 chars, so all String8086's should have 64 character char[]
	//implement a print method that displays the contents of your String8086 one character at a time until the end not showing $
	//You MAY NOT store the length of the String8086

