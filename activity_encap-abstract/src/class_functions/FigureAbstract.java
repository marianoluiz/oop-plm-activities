package class_functions;

// Number 3 - Abstraction
public abstract class FigureAbstract {
  public abstract int sides();
  public abstract String shapename();

  public void description() {
    System.out.println("All figures have dimension");
  }
}