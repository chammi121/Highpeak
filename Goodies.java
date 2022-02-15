import java.util.Arrays;
import java.util.Scanner;


public class Goodies {

	 static int minDiff(int arr[], int arrlen, int n)
	    {
	        int result = Integer.MAX_VALUE;   /*constant value storing in result*/
	        Arrays.sort(arr); /*Here we are sorting the array Elements, To make addition and subtraction operation we have to sort the array elements*/
	        for (int i=0; i<= arrlen-n;i++)   
	            result = Math.min(result, arr[i + n - 1] - arr[i]); // compares the minimum value and store the value to result
	        return result;
	    }

    static int findele(int res,int array[], int arrlen, int n)
    {
        int result = Integer.MAX_VALUE; //constant value storing in result
        for(int i=0; i<=arrlen; i++)
        {
            result = Math.min(result, array[i + n - 1] - array[i]); // compares the minimum value and store the value to result
            if (res==result)
                return i; // if res == result , then it return the index value
        }
        return 0;
    }

    public static void main(String[] args) {

        int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999}; // array elements
        String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" }; //string elements
        int arrlen = array.length; //storing array length to arrlen
        
        System.out.println("Enter the number of employees"); //displaying to output screen
        
        Scanner s = new Scanner(System.in); //Taking value from user
        int n=s.nextInt(); 
        
        int result=minDiff(array, arrlen, n); //calculating minimum difference using function statement
        
        System.out.println("Number of the employees:"+n); // printing the number of employee values
        
        int startindex=findele(result,array,arrlen,n); // calculating the index value to return the items using function
        
        System.out.println("Here the goodies that are selected for distribution are:");
        
        for(int i=startindex;i<startindex+n;i++)
            System.out.println(items[i]); // printing the string values
        
        System.out.println("\n"); //new line
        
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+result); // printing the minimum difference result
    }
}
