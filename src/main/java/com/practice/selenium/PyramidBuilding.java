package com.practice.selenium;

public class PyramidBuilding {

/////////////********** PYRAMID 1 **********//////////
/*	* 
	* * 
	* * * 
	* * * * 
	* * * * * 
	
*/

 /*   // Function to demonstrate printing pattern 
    public static void printStars(int n) 
    { 
        int i, j; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        { 
  
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop     
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
   } 
  
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } */

/////////////********** PYRAMID 2 **********//////////
/*	* * * * * 
	* * * * 
	* * * 
	* * 
	*                */
	
/*	public static void main(String[] args) {
        int rows = 5;

        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
	
//***************** PYRaMID 3 ******////////////////
/*
        *
      * * 
    * * * 
  * * * * 
* * * * *
 */
	
	
/*	// Function to demonstrate printing pattern 
    public static void printStars(int n) 
    { 
        int i, j; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for(j=2*(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
              
            // ending line after each row 
            System.out.println(); 
        } 
    }
    
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } */
  
//********** PYRAMID 5 *********////////////////
	/*
	  * 
     * * 
    * * * 
   * * * * 
  * * * * * 
	 
	 */
	/*public static void printTriagle(int n) 
    { 
        // outer loop to handle number of rows 
        //  n in this case 
        for (int i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=i; j<n; j++) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int k=1; k<(i*2); k++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
    } 
      
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printTriagle(n); 
    }*/
	
	
//*************PYRAMID 6 *******************/////////////////
/*
 * * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
 	
 */
	
	/* public static void main(String[] args) {
	        int rows = 5;

	        for(int i = rows; i >= 1; --i) {
	            for(int space = 1; space <= rows - i; ++space) {
	                System.out.print("  ");
	            }

	            for(int j=i; j <= 2 * i - 1; ++j) {
	                System.out.print("* ");
	            }

	            for(int j = 0; j < i - 1; ++j) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	    }*/
    
    public static void main(String[] args) {
    int rows = 5;

    for(int i = rows; i <= rows; i++) {
        

        for(int j=1; j <= 2 * i ; j++) {
            System.out.print("* ");
        }

        for(int k = i; k < i ; k++) {
            System.out.print(" ");
        }

        System.out.println();
    }
}
	
	
//********** PYRAMID 7 *****/////////////////	
	
	
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */
	
	
	
	// Function to demonstrate printing pattern 
  /*  public static void printNums(int n) 
    { 
        // initialising starting number 
        int i, j, num=1; 
          
        // outer loop to handle number of rows 
        // n in this case 
        for(i=0; i<n; i++) 
        { 
  
            // without re assigning num 
            // num = 1; 
            for(j=0; j<=i; j++) 
            { 
                // printing num with a space 
                System.out.print(num+ " "); 
                  
                // incrementing num at each column 
                num = num + 1; 
            } 
  
            // ending line after each row 
            System.out.println(); 
        } 
    } 
      
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printNums(n); 
    }*/

}