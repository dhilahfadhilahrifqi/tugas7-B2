// Abstract class
abstract class Hewan {
  // Abstract method (does not have a body)
  public abstract void makanan();
  // Regular method
  public void alatGerak() {
    System.out.println("Berjalan menggunakan kaki");
  }
}

// Subclass (inherit from Animal)
class Sapi extends Hewan {
  public void makanan() {
    // The body of animalSound() is provided here
    System.out.println("Sapi memakan rumput");
  }
}

class Ayam extends Hewan {
  public void makanan() {
    // The body of animalSound() is provided here
    System.out.println("Ayam pemakan segala");
  }
}

class Abstract {
  public static void main(String[] args) {
    Sapi sapi = new Sapi(); // Create a cow object
    sapi.makanan();
    sapi.alatGerak();
	Ayam ayam = new Ayam(); // Create a chiken object
    ayam.makanan();
    ayam.alatGerak();
  }
}

/*
output:
Sapi memakan rumput
Berjalan menggunakan kaki
Ayam pemakan segala
Berjalan menggunakan Kaki

penjelasan:
kelas abstrak adalah kelas yang mempunyai keyword abstract dan di dalam method 
abstract tidak ada isinya. pada program di atas terdapat class abstract Hewan dan 
di dalamnya teerdapat methode abstract makanan() yang tak memiliki body atau isinya.
clas Sapi() dan Ayam() meeeeupakan subclaas yang inheeeeit dengan class abstractHewan.

*/