package implement_shapes;
import class_functions.FigureInterface;

public class Hexagon implements FigureInterface{
  @Override
  public int sides() {
    return 6;
  }

  @Override
  public String shapename() {
    return "The name of the shape is Hexagon.";
  }

  @Override
  public void description() {
    System.out.println("All figures have dimensions.");
  }
}
