package implement_shapes;
import class_functions.FigureAbstract;

public class Circle extends FigureAbstract {
  @Override
  public int sides() {
      return 0;
  }

  @Override
  public String shapename() {
      return "The name of the shape is Circle.";
  }
}