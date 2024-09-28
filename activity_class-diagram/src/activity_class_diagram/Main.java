package activity_class_diagram;

class Main {
  public static void main(String[] args) {
    // Number 1
    System.out.println("--------------------- Number 1 ---------------------\n");

    Functions func = new Functions(5, 3);

    System.out.println("Area of 5 and 3: " + func.area(5, 3));
    System.out.println("Sum of 5 and 3: " + func.intSum);
    System.out.println("Product of 5 and 3: " + func.intProduct);

    int numToTest = 6;
    System.out.println(numToTest + " is perfect: " + func.perfectNumber(numToTest));

    int fibonacciIndex = 10;
    System.out.println("Fibonacci number at index " + fibonacciIndex + ": " + func.fibonacciRecursion(fibonacciIndex));
    
    // Number 2
    System.out.println("\n--------------------- Number 2 ---------------------\n");
    UserFunctions userFunc = new UserFunctions();
    System.out.println("Overridden area (modulus) of 5 and 3: " + userFunc.area(5, 3));

    // Number 4
    System.out.println("\n--------------------- Number 4 ---------------------\n");
    Logarithmic logExample = new Logarithmic(3);
    double answer = logExample.computeLn(logExample.getNumber());
    System.out.printf("n = %d the answer is %.2f.%n", logExample.getNumber(), answer);

    // Number 3, 5, 6
    System.out.println("\n--------------------- Number 3, 5, 6 ---------------------\n");

    System.out.println("---- Abstract Class Object ----");

    AnimalObject.animal1.animalsound("Dog");
    AnimalObject.animal1.animalskin("Dog");
    System.out.println("Age is " + AnimalObject.animal1.animalage(1));
    AnimalObject.animal1.animalfeet("Dog");

    System.out.println();

    AnimalObject.animal2.animalsound("Cat");
    AnimalObject.animal2.animalskin("Cat");
    System.out.println("Age is " + AnimalObject.animal2.animalage(1));
    AnimalObject.animal2.animalfeet("Cat");

    System.out.println();

    AnimalObject.animal3.animalsound("Bird");
    AnimalObject.animal3.animalskin("Bird");
    System.out.println("Age is " + AnimalObject.animal3.animalage(1));
    AnimalObject.animal3.animalfeet("Bird");

    System.out.println();

    AnimalObject.animal4.animalsound("Fish");
    AnimalObject.animal4.animalskin("Fish");
    System.out.println("Age is " + AnimalObject.animal4.animalage(1));
    AnimalObject.animal4.animalfeet("Fish");

    System.out.println("---- Interface Objects: ----");

    AnimalObject.animal5.animalsound("Dog");
    AnimalObject.animal5.animalskin("Dog");
    System.out.println("Age is " + AnimalObject.animal5.animalage(2));
    AnimalObject.animal5.animalfeet("Dog");

    System.out.println();

    AnimalObject.animal6.animalsound("Cat");
    AnimalObject.animal6.animalskin("Cat");
    System.out.println("Age is " + AnimalObject.animal6.animalage(2));
    AnimalObject.animal6.animalfeet("Cat");

    System.out.println();

    AnimalObject.animal7.animalsound("Bird");
    AnimalObject.animal7.animalskin("Bird");
    System.out.println("Age is " + AnimalObject.animal7.animalage(2));
    AnimalObject.animal7.animalfeet("Bird");

    System.out.println();

    AnimalObject.animal8.animalsound("Fish");
    AnimalObject.animal8.animalskin("Fish");
    System.out.println("Age is " + AnimalObject.animal8.animalage(2));
    AnimalObject.animal8.animalfeet("Fish");
  }
}
