/*package com.practice.selenium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


*//**
 * Hello world!
 *
 *//*
public class StringManipulation 

{
	
	
	
	
//******* INT to String and vice versa**////////////////
	public static void main(String[] args) 
	    {
	        String s = "2015";
	         
	        int i = Integer.parseInt(s);
	         
	        System.out.println(i);          //Output : 2015
	        
	        int i1 = 2015;
	         
	        String s1 = Integer.toString(i1);
	         
	        System.out.println(s1);     //Output : 2015
	    }
	 
	
	
////////******************* Count duplucate characters in the string***************/////////////////
	 void Findrepeter(){
		    String s="mmababctamantlslmag";
		    int distinct = 0 ;

		    for (int i = 0; i < s.length(); i++) {

		        for (int j = 0; j < s.length(); j++) {

		            if(s.charAt(i)==s.charAt(j))
		            {
		                distinct++;

		            }
		        }   
		        System.out.println(s.charAt(i)+"--"+distinct);
		        String d=String.valueOf(s.charAt(i)).trim();
		        s=s.replaceAll(d,"");
		        distinct = 0;

		    }

		}
	
	
	
	public void countDupChars(String str){
		 
	    //Create a HashMap 
	    Map<Character, Integer> map = new HashMap<Character, Integer>(); 
	 
	    //Convert the String to char array
	    char[] chars = str.toCharArray();
	 
	    // logic: char are inserted as keys and their count
	     //as values. If map contains the char already then
	     // increase the value by 1
	     
	    for(Character ch:chars){
	      if(map.containsKey(ch)){
	         map.put(ch, map.get(ch)+1);
	      } else {
	         map.put(ch, 1);
	        }
	    }
	 
	    //Obtaining set of keys
	    Set<Character> keys = map.keySet();
	 
	    // Display count of chars if it is
	     // greater than 1. All duplicate chars would be 
	     // having value greater than 1.
	     
	    for(Character ch:keys){
	      if(map.get(ch) > 1){
	        System.out.println("Char "+ch+" "+map.get(ch));
	      }
	    }
	  }
	 
	  public static void main(String a[]){
		  StringManipulation obj = new StringManipulation();
	    System.out.println("String: BeginnersBook.com");
	    System.out.println("-------------------------");
	    obj.countDupChars("BeginnersBook.com");
	  
	    System.out.println("\nString: ChaitanyaSingh");
	    System.out.println("-------------------------");
	    obj.countDupChars("ChaitanyaSingh");
	 
	    System.out.println("\nString: #@$@!#$%!!%@");
	    System.out.println("-------------------------");
	    obj.countDupChars("#@$@!#$%!!%@");
	  }
	
//****************Remove all white spaces ********************//////////
	public static void main(String[] args)
    {
        String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
 
        //1. Using replaceAll() Method
 
        String strWithoutSpace = str.replaceAll("\\s", "");
        System.out.println("Method 1"); 
        System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
        
       public static void main(String[] args)
    {
        String str = "Core Java jsp servlets jdbc struts hibernate spring";
 
        //1. Using replaceAll() Method
 
        String strWithoutSpace = str.replaceAll(" ", "#");
        System.out.println(strWithoutSpace);
        String reverse = "";
        System.out.println("Method 1"); 
        int len=str.length();
        System.out.println(len);
        for(int i = len-1;i<=0;i--)
        
        	reverse += str.charAt(i);
        	System.out.println(reverse);
        
		
		
        	
        
    }
        //2. Without Using replaceAll() Method
 
        char[] strArray = str.toCharArray();
 
        StringBuffer sb = new StringBuffer();
 
        for (int i = 0; i < strArray.length; i++)
        {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
                sb.append(strArray[i]);
            }
        }
        System.out.println("Method 2"); 
        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }
	
//****************count the total number of occurrences of a given character in a string ********************//////////
	public static void main(String[] args)
    {
        String s = "Java is java again java again";
 
        char c = 'a';
 
        int count = s.length() - s.replace("a", "").length();
 
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
    }
	
	
//********************************Count no of words in string/sentance********************//////////
	
	public static void main(String[] args)
    {
        System.out.println("Enter the string");
 
        Scanner sc = new Scanner(System.in);
 
        String s=sc.nextLine();
 
        String[] words = s.trim().split(" ");
 
        System.out.println("Number of words in the string = "+words.length);
    }
	
	
	
//********************************STRING REVERSAL********************//////////
    public static String Reverse1(String a){
		String reverse = "";
		int len = a.length();
		System.out.println(len);
	    	for (int i = len - 1 ; i<= 0 ; i-- )
	        reverse += a.charAt(i);
	    	return reverse;
	}
	public static StringBuffer Reverse2(String a){
		StringBuffer sb = new StringBuffer(a);
		return sb.reverse();
	}
    public static void main( String[] args )
    {
    	String original;
		Scanner in = new Scanner(System.in);
                System.out.println("Enter a string to reverse: ");
                original = in.nextLine();
                System.out.println("Reverse of entered string is: "+Reverse1(original));
                System.out.println("Reverse of entered string is: "+Reverse2(original));
                in.close();
    }
	
	//******************* Reverse words in stings **********//////////////////
	public void reverseWordInMyString(String str)
	   {
		// The split() method of String class splits a string in several strings based on the
		  
		 // delimiter passed as an argument to it
		 
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			// The charAt() function returns the character
			 // at the given position in a string
			 
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
	   public static void main(String[] args) 
	   {
		   StringManipulation obj = new StringManipulation();
		obj.reverseWordInMyString("Welcome to BeginnersBook");
		obj.reverseWordInMyString("This is an easy Java Program");
	   }
}
*/