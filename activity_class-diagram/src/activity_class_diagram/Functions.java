package activity_class_diagram;

// Number 1
class Functions {

  public int intNumber = 0;
  int intSum = 0;
  int intProduct = 1;

  public Functions(int intNum1) {
      this.intNumber = intNum1;
  }

  public Functions(double dblNum1) {
      this.intNumber = (int) dblNum1;
  }

  public Functions(int intNum1, int intNum2) {
      this.intNumber = intNum1;
      this.intSum = intNum1 + intNum2;
      this.intProduct = intNum1 * intNum2;
  }

  public Functions(double dblNum1, double dblNum2) {
      this.intNumber = (int) dblNum1;
      this.intSum = (int) (dblNum1 + dblNum2);
      this.intProduct = (int) (dblNum1 * dblNum2);
  }
  
  public int area(int intNum1, int intNum2) {
      return intNum1 * intNum2;
  }      

  public double area(double dblNum1, double dblNum2) {
      return dblNum1 * dblNum2;
  }

  public int area(int intNum1) {
      return intNum1 * intNum1;
  }

  public boolean perfectNumber(int intNum1) {
      int sum = 0;
      for (int i = 1; i < intNum1; i++) {
          if (intNum1 % i == 0) {
              sum += i;
          }
      }
      return sum == intNum1;
  }

  public int fibonacciRecursion(int intNum1) {
      if (intNum1 <= 1) {
          return intNum1;
      }
      return fibonacciRecursion(intNum1 - 1) + fibonacciRecursion(intNum1 - 2);
  }
}
