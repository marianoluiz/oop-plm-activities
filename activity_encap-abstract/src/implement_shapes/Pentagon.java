package implement_shapes;
import class_functions.FigureInterface;

// interface subclass
public class Pentagon implements FigureInterface {
  @Override
  public int sides() {
      return 5;
  }

  @Override
  public String shapename() {
      return "The name of the shape is Pentagon.";
  }

  @Override
  public void description() {
    System.out.println("All figures have dimensions.");
  }
}