package activity_2;

public class ActivitiesOOP {

    public static void main(String[] args) {
        
        
        Functions clFunction = new Functions();
        
       System.out.printf("1A. Iterative Circle Area: %.2f\n", clFunction.itecirclearea(10));
       System.out.printf("1B. Recursive Circle Area: %.2f\n", clFunction.reccirclearea(Math.pow(10, 2)));
        
       System.out.println("2A. Iterative Sum Series: " + clFunction.itesumseries(5));
       System.out.println("2B. Recursive Sum Series: " + clFunction.recsumseries(5));
      
       System.out.println("3A. Iterative Digit Counter: " + clFunction.itecountdigit(123456789));
       System.out.println("3B. Recursive Digit Counter: " + clFunction.reccountdigit(123456));
       
       System.out.println("4A. Iterative Reverse Digits: " + clFunction.itereversedigits(2345));
       System.out.println("4B. Recursive Reverse Digits: " + clFunction.recreversedigits(6578, 0));
       
       char[] arrayOfChar = {'h', 'e', 'l', 'l', 'o'};
       char keyToSearch = 'p';
       
       System.out.print("5A. Iterative Key Searching: ");
       if(clFunction.itesearchkey(keyToSearch, arrayOfChar))
           System.out.println("`" + keyToSearch + "` is found in the array");
        else 
           System.out.println("`" + keyToSearch + "` is not found in the array");
       
       
       System.out.print("5B. Recursive Key Searching: ");
       if(clFunction.recsearchkey(keyToSearch, arrayOfChar, 0))
           System.out.println("`" + keyToSearch + "` is found in the array");
        else
           System.out.println("`" + keyToSearch + "` is not found in the array");
       
       
      
        
    }
    
}
