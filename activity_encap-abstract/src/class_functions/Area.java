package class_functions;

// Number 2 - Constructor

public class Area {
  public String strShape = "Unknown";
  public double dblArea = 0;
  public double dblRadius = 0;
  public double dblWidth = 0;
  public double dblLength = 0;

  public Area() {
    this.strShape = "Unknown";
    this.dblArea = 0;
    this.dblRadius = 0;
    this.dblWidth = 0;
    this.dblLength = 0;
  }
  // Circle with int radius
  public Area(String strShape, int intRadius) {
    this.strShape = strShape;
    this.dblRadius = intRadius;
    this.dblArea  = Math.PI * Math.pow(intRadius, 2);
  }

  //Circle with flt radius
  public Area(String strShape, float fltRadius) {
    this.strShape = strShape;
    this.dblRadius = fltRadius;
    this.dblArea  = Math.PI * Math.pow(fltRadius, 2);
  }

  // Circle with double radius
  public Area(String strShape, double dblRadius) {
    this.strShape = strShape;
    this.dblRadius = dblRadius;
    this.dblArea = Math.PI * Math.pow(dblRadius, 2);
  }

  // Rectangle

  // integer input
  public Area(String strShape, int intLength, int intWidth) {
    this.strShape = strShape;
    this.dblLength = (double) intLength;
    this.dblWidth = (double) intWidth;
    this.dblArea = this.dblLength * this.dblWidth;
  }

  // float input
  public Area(String strShape, float fltLength, int intWidth) {
    this.strShape = strShape;
    this.dblLength = fltLength;
    this.dblWidth = (double) intWidth;
    this.dblArea = this.dblLength * this.dblWidth;
  }

  public Area(String strShape, int intLength, float fltWidth) {
    this.strShape = strShape;
    this.dblLength = (double) intLength;
    this.dblWidth = fltWidth;
    this.dblArea = this.dblLength * this.dblWidth;
  }

  public Area(String strShape, float fltLength, float fltWidth) {
    this.strShape = strShape;
    this.dblLength = fltLength;
    this.dblWidth = fltWidth;
    this.dblArea = this.dblLength * this.dblWidth;
  }

  // double input
  public Area(String strShape, double dblLength, int intWidth) {
    this.strShape = strShape;
    this.dblLength = dblLength;
    this.dblWidth = (double) intWidth;
    this.dblArea = this.dblLength * this.dblWidth;
  }

  public Area(String strShape, int intLength, double dblWidth) {
    this.strShape = strShape;
    this.dblLength = (double) intLength;
    this.dblWidth = dblWidth;
    this.dblArea = this.dblLength * this.dblWidth;
  }

  public Area(String strShape, double dblLength, double dblWidth) {
    this.strShape = strShape;
    this.dblLength = dblLength;
    this.dblWidth = dblWidth;
    this.dblArea = this.dblLength * this.dblWidth;
  }
}
