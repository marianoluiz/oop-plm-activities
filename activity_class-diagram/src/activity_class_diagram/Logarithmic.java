package activity_class_diagram;

//Number 4
class Logarithmic {

  private int intNum1 = 0;

  public Logarithmic() {
  }

  public Logarithmic(int intNum) {
      this.intNum1 = intNum;
  }

  public int getNumber() {
      return intNum1;
  }

  public void setNumber(int intNum) {
      this.intNum1 = intNum;
  }

  public double computeLn(int intNum) {
      double result = 0;
      for (int i = 1; i <= intNum; i++) {
          result += Math.log(i);
      }
      return result;
  }
}