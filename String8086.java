
public class String8086 
{
	private String stringToChar; //variable stringToChar is a string
	private char[] charArray; //variable charrArray is an array 
  public String8086 (String hello)
  {
	  this.stringToChar = hello; //stringToChar is now the string hello in the String8086 parameter
	  this.charArray = new char[64]; //the charArray is established to have 64 buckets or bits
  }
  
  public void stringToCharArray() //stringToCharArray function puts the string into the array
  {
	  int i = 0; 
	  while (stringToChar.charAt(i) != '$') //while the string in String8086 is at the first bucket or bucket
		  //zero and is not equal to the dollar sign
	  {
		  charArray[i] = stringToChar.charAt(i); //put what is in the string starting at the first bucket or 
		  //bucket zero into the charArray
		  i++; //go to the next bucket while it is not the dollar sign
	  }
	  charArray[i] = stringToChar.charAt(i); //now put what ever is left in the string into the array
		  
  }
  public void printCharArray() //print what is in the array to the screen, character by character
  {
	  int i = 0;
	  while(charArray[i] != '$') //while the array is at the first bucket or at zero but does not equal the
		  //dollar sign
	  {
		  System.out.println(charArray[i]); //print out what is in the first bucket
		  i++; //print out the characters in the following buckets while it is not the dollar sign
	  }
  }
}
