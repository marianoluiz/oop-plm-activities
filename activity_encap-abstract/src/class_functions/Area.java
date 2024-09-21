package class_functions;

// Constructor

public class Area {
  public float fltArea = 0;
  public String strShape = "Unknown";
  public float fltRadius = 0;
  public int intWidth = 0;
  public int intHeight = 0;

  public Area() {
    this.strShape = "Unknown";
    this.fltArea = 0;
    this.fltRadius = 0;
    this.intWidth = 0;
    this.intHeight = 0;
  }
  // Circle with int radius
  public Area(String strShape, int intRadius) {
    this.fltArea  = (float) (Math.PI * Math.pow(intRadius, 2));
  }

  //Circle with flt radius
  public Area(String strShape, float fltRadius) {
    this.fltArea  = (float) (Math.PI * Math.pow(fltRadius, 2));
  }

  // Circle with double radius
  public Area(String strShape, double dblRadius) {
        this.fltArea = (float) (Math.PI * Math.pow(dblRadius, 2));
  }


}
