package activity_class_diagram;

// Number 3
abstract class AnimalAbstract {
  public int intAge = 10;
  public String strKind = null;

  public abstract void animalsound(String strKind);
  public abstract void animalskin(String strKind);

  public int animalage(int intAge) {
      return intAge * 12;
  }

  public void animalfeet(String strKind) {
      if (strKind.equals("Dog") || strKind.equals("Cat")) {
          System.out.println("4 feet");
      } else if (strKind.equals("Bird")) {
          System.out.println("2 feet");
      } else if (strKind.equals("Fish")) {
          System.out.println("Tail");
      } else {
          System.out.println("cannot distinguish");
      }
  }
}
