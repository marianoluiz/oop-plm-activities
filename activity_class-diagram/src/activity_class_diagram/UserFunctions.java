package activity_class_diagram;

// Number 2
class UserFunctions extends Functions {
    
  public UserFunctions() {
      super(0, 0); 
  }

  @Override
  public int area(int intNum1, int intNum2) {
      return intNum1 % intNum2;
  }
}