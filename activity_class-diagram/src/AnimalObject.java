
// Abstract Class Body Definition
class AnimalExtends extends AnimalAbstract {
    @Override
    void animalsound(String strKind) {
      if (strKind.equals("Dog")) {
          System.out.println("Woof Woof");
      } else if (strKind.equals("Cat")) {
          System.out.println("Meow Meow");
      } else if (strKind.equals("Bird")) {
          System.out.println("Chirp Chirp");
      } else if (strKind.equals("Fish")) {
          System.out.println("Bubble Sounds");
      } else {
          System.out.println("Cannot Distinguish");
      }
    }
  
    @Override
    void animalskin(String strKind) {
      if (strKind.equals("Dog") || strKind.equals("Cat")) {
          System.out.println("Fur");
      } else if (strKind.equals("Bird")) {
          System.out.println("Feather");
      } else if (strKind.equals("Fish")) {
          System.out.println("Scales");
      } else {
          System.out.println("Cannot Distinguish");
      }
    }
    @Override
    public int animalage(int intAge) {
        return intAge * 12;
    }
  }
  
// Interface Body Definition
class AnimalImplement implements AnimalInterface {
    @Override
    public void animalsound(String strKind) {
        if (strKind.equals("Dog")) {
            System.out.println("Woof Woof");
        } else if (strKind.equals("Cat")) {
            System.out.println("Meow Meow");
        } else if (strKind.equals("Bird")) {
            System.out.println("Chirp Chirp");
        } else if (strKind.equals("Fish")) {
            System.out.println("Bubble Sounds");
        } else {
            System.out.println("Cannot Distinguish");
        }
    }
  
    @Override
    public void animalskin(String strKind) {
      if (strKind.equals("Dog") || strKind.equals("Cat")) {
          System.out.println("Fur");
      } else if (strKind.equals("Bird")) {
          System.out.println("Feather");
      } else if (strKind.equals("Fish")) {
          System.out.println("Scales");
      } else {
          System.out.println("Cannot Distinguish");
      }
    }
  
    @Override
    public int animalage(int intAge) {
        return intAge * 12;
    }
  
    @Override
    public void animalfeet(String strKind) {
        if (strKind.equals("Dog") || strKind.equals("Cat")) {
            System.out.println("4 feet");
        } else if (strKind.equals("Bird")) {
            System.out.println("2 feet");
        } else if (strKind.equals("Fish")) {
            System.out.println("tail");
        } else {
            System.out.println("cannot distinguish");
        }
    }
  
  }
  
// Objects
public class AnimalObject {
    // 4 abstract subclass objects
    AnimalExtends animal1 = new AnimalExtends();
    AnimalExtends animal2 = new AnimalExtends();
    AnimalExtends animal3 = new AnimalExtends();
    AnimalExtends animal4 = new AnimalExtends();

    // 4 interface subclass objects
    AnimalImplement animal5 = new AnimalImplement();
    AnimalImplement animal6 = new AnimalImplement();
    AnimalImplement animal7 = new AnimalImplement();
    AnimalImplement animal8 = new AnimalImplement();
}
