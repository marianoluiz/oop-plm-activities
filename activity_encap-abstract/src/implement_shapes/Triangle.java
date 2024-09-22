package implement_shapes;
import class_functions.FigureAbstract;

// abstract subclass
public class Triangle extends FigureAbstract  {
  @Override
  public int sides() {
      return 3;
  }
  @Override
  public String shapename() {
      return "The name of the shape is Triangle.";
  }
  
}
