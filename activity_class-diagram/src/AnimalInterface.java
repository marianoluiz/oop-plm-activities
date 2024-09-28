// Number 4

abstract class AnimalAbstract {
  int intAge = 10;
  String strKind = null;

  abstract void animalsound(String strKind);
  abstract void animalskin(String strKind);

  int animalage(int intAge) {
      return intAge * 12;
  }

  void animalfeet(String strKind) {
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

interface AnimalInterface {
  int intAge = 5;
  String strKind = null;

  void animalsound(String strKind);
  void animalskin(String strKind);
  int animalage(int intAge);
  void animalfeet(String strKind);
}