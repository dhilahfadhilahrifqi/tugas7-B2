// Interface
interface Hewan {
  public void makanan(); // interface method (does not have a body)
  public void alatGerak(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Sapi implements Hewan {
  public void makanan() {
    // The body of animalSound() is provided here
    System.out.println("Sapi makan rumput");
  }
  public void alatGerak() {
    // The body of sleep() is provided here
    System.out.println("Sapi berjalan menggunakan 4 kaki");
  }
}

// Pig "implements" the Animal interface
class Ayam implements Hewan {
  public void makanan() {
    // The body of animalSound() is provided here
    System.out.println("Ayam pemakan segala");
  }
  public void alatGerak() {
    // The body of sleep() is provided here
    System.out.println("Ayam berjalan menggunakan 2 kaki");
  }
}

class Interface {
  public static void main(String[] args) {
    Sapi sapi = new Sapi();  // Create a Pig object
    sapi.makanan();
    sapi.alatGerak();
	Ayam ayam = new Ayam();  // Create a Pig object
    ayam.makanan();
    ayam.alatGerak();
  }
}

/*
output:
Sapi makan rumput
Sapi berjalan menggunakan 4 kaki
Ayam pemakan segala
Ayam berjalan menggunakan 2 kaki

penjelasan:
pada program di atas merupakan penerapan kelas interface yang mana kelas interface 
berbeda dengan claas abstract. di interface itu terdapat keyword implements. dan di atas
implements nya berupa Sapi() dan Ayam() merupakan implements dari class Hewan().
*/