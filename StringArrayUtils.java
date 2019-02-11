import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.*; 
import java.util.Iterator;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {   

        return array[0];

    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int n = array.length;
        return array[n-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int n = array.length;
        return array[n-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean b=false;
        for(int i=0; i<array.length;i++)
        {if(array[i].equals(value))
                b = true;
        }
        return b;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int length = array.length;
        String[] reversedArray = new String[length];
        for (int currentIndex = length-1; currentIndex>=0; currentIndex--)
        {   int b = length-1;
            reversedArray[b-currentIndex] = array[currentIndex];
        }
        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int length = array.length;
        boolean b = false;
        String[] reversedArray = new String[length];
        for (int currentIndex = length-1; currentIndex>=0; currentIndex--)
        {   int c = length-1;
            reversedArray[c-currentIndex] = array[currentIndex];
        }
        
       for(int j = 0; j<length; j++)
       {if(reversedArray[j].equals(array[j]))
        
        b = true;
        else
        {b= false;}}
        return b;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean b= false;  
        
        String str = Arrays.toString(array);
        if(str.matches(".*[a-zA-Z]+.*"))
        {b=true;}
        else if (str.contains("[a-zA-Z]+"))
        {b=true;}
        return b;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int n = array.length;
        int numberOfOccurences = 0;
        for(int i=0; i<n;i++)
 
            {
           if(array[i].equalsIgnoreCase(value))
           {numberOfOccurences =numberOfOccurences+1;
            
            }
        }
        return numberOfOccurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
         List<String> list = new ArrayList<String>(Arrays.asList(array));
         list.remove(valueToRemove);
         array = list.toArray(new String[0]); 
         return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List list = new ArrayList();
         list = Arrays.asList(array);
         List  newArray = new ArrayList();
         newArray.add(list.get(0));
        
        for(int i=1;i<list.size();i++)
        {if(list.get(i-1)!=list.get(i)){
            newArray.add(list.get(i));
        }
    }
        String[] str=(String[])newArray.toArray(new String[newArray.size()]);
       return str;   
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
     
        String str = array[0];
        List<String> myList = new ArrayList<String>();
        for(int i=1;i<array.length;i++)
        {
            if (array[i]==array[i-1]){
            str = str+array[i];
        }
        else{
        myList.add(str);
        str=array[i];}
    }
    myList.add(str);
    String[] newArray = myList.toArray(new String[myList.size()]);
    return newArray;
}
}
