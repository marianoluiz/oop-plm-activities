package activitiesoop;

public class Functions {
   
    // BSCS 2-2 Sep. 07, 2024s
    // Camacho, Daniel Hardy C.
    // King, Mariano Luiz B.
    // Tulang, Timothy John L.
    
    
    // 1. Display the area of a given circle.
    // Ex. Enter radius = 10
        // The area is 314.16
    
    // 1A. Iterative Function
    public double itecirclearea(int intRadius){
        return Math.PI * Math.pow(intRadius, 2);
    }
    
    // 1B. Recursive Function
    public double reccirclearea(double dblRadius){
        if(dblRadius == 0)
            return 0;
        else
            return reccirclearea(dblRadius - 1) + Math.PI;
    }
    
    
    // 2. Display the sum of the below series given n as the number of terms:
    // 2 - 4 + 6 - 8 + 10 - .....
    
    // 2A. Iterative Function
    public int itesumseries(int intNum1){
        int intSum = 0;
        for(int intCounter = 1; intCounter <= intNum1; intCounter++){
            intSum += intCounter * 2;
        }
        return intSum;
    }
       
    // 2B. Recursive Function
    public int recsumseries(int intNum1){
        if (intNum1 == 0){
        return 0;
       }
        int termVal = intNum1 * 2;
    return termVal + recsumseries(intNum1 - 1);
    }
    
    // 3. Given N as an input, display the number of digits it has.
    
    // 3A. Iterative Function
    public int itecountdigit(int intNum1){
        if(intNum1 == 0)
           return 1;
 
        int intCounter = 0;
        
        while (intNum1 > 0){
            intNum1 /= 10;
            intCounter++;
        }
            return intCounter;
    }
    
    // 3B. Recursive Function 
    public int reccountdigit(int intNum1){
        if (intNum1 == 0 || intNum1 < 10)
            return 1;
    return 1 + reccountdigit(intNum1 / 10);    
    } 
    
    // 4. Given n as an input, display the reversed digits of n.
    
    // 4A. Iterative Function
        // Ex. N = 2345
            // The reversed digits of 2345 is 5432
    public int itereversedigits(int intNum){
        int intReverse = 0;
        
        while (intNum != 0){
            intReverse = (intReverse * 10) + intNum%10;
            intNum = intNum/10;
        }
        
        return intReverse;
    }
    
    // 4B. Recursive Function
    public int recreversedigits(int intNum, int intReverse){
        if (intNum == 0)
            return intReverse;
        
        intReverse = (intReverse * 10) + intNum%10;
        
        return recreversedigits(intNum/10, intReverse);
    }
    
    // 5. Given an array of characters, tell whether a search key is fond on the array.
        // Ex. array = "hello"
        // search key = "e"
        // e is found in the array 
    
    // 5A. Iterative Function
    public boolean itesearchkey(char keyToSearch, char[] arrayOfChar){
        for( char charElement : arrayOfChar){
            if( keyToSearch == charElement)
                return true;
        }
        
        return false;
    }
    
    // 5B. Recursive Function
    public boolean recsearchkey(char keyToSearch, char[] arrayOfChar, int intCounter){
        if(intCounter == arrayOfChar.length)
            return false;
        else if(arrayOfChar[intCounter] == keyToSearch)
            return true;
        else
            return recsearchkey(keyToSearch, arrayOfChar, intCounter + 1);
    }


}
    

