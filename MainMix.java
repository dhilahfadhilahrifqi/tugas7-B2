//abstract - interface

interface Herbifora{
 public String jenisH="Herbifora";
 public String makananH="Tumbuhan";
  public void displayMakan();
}

abstract class Hewan implements Herbifora{
	String nama;
	int jmlKaki;
	public Hewan(String nama, int jmlKaki){
	this.nama=nama;
	this.jmlKaki=jmlKaki;
}
  
  public void setNama(String nama){
  this.nama=nama;
 }
 public String getNama(){
  return nama;
 }
 public void setKaki(int jmlKaki){
  this.jmlKaki=jmlKaki;
 }
 public int getKaki(){
  return jmlKaki;
 }
 public void displayHewan(){
  System.out.println("Nama: "+getNama());
  System.out.println("Jumlah Kaki: "+getKaki());
 }
 };
 
 setelahnya di class abstract hewan di jabarkan garis besar dari hewan yaitu
 nama dan juga jumlah kaki dari hewan tersebut. dibuat methode hewan dengan parameter
 string nama dan int jmlKaki. kemudia menggunakan kata kunci this untuk
 mereferensi variabel nama dan juga jumlKaki tang ingin di akses. menggunakan pula set dan getKaki
 agar dapat di akses nama dan jumlah kaki tadi
 
class Sapi extends Hewan{
 
  public Sapi (String nama, int jmlKaki){
  super(nama, jmlKaki);
 }
  
  public void displayMakan(){
  System.out.println("Jenis: "+jenisH);
  System.out.println("Makanan: "+makananH);
 }
 
 public void displayHewan(){
  System.out.println("Nama: "+getNama());
  System.out.println("Jumlah Kaki: "+getKaki());
 }
 
}

public class MainMix {
 public static void main (String[] args){
    Sapi sapi = new Sapi("Sapi",4);
	sapi.displayHewan();
	sapi.displayMakan();
 }
}

/*
output:
Nama: Sapi
Jumlah Kaki: 4
Jenis: Herbifora
Makanan: Tumbuhan

Penjelasan:
Pada program di atas terdapat interface herbifora, kemudian ada hewan sebagai implements
dari Herbifora dan juga ada subclass Sapi dari super class nya dari abstract class hewan.
pada interface telah diidentikan memang Herbifora dengan jenis makanannya beeeupa tumbu-tumbuhan.
dan di masykkan ke dalammethode displayMakan().
setelahnya di class abstract hewan di jabarkan garis besar dari hewan yaitu
 nama dan juga jumlah kaki dari hewan tersebut. dibuat methode hewan dengan parameter
 string nama dan int jmlKaki. kemudia menggunakan kata kunci this untuk
 mereferensi variabel nama dan juga jumlKaki tang ingin di akses. menggunakan pula set dan getKaki
 agar dapat di akses nama dan jumlah kaki tadi.
 pada class Sapi yang merupakan subclass dari Hewan, di dalamnya terdapatkeyword super
 yang mengacu pada class induknya tadi. dan juga memanggil method displayMakan() dan displayHewan()
dan semua itu nantinya akan di pangill dan di tampilkan ke output di class main.
dengan dibuat terlebih dahulu contructor/object sapi agar yang ada pada class diatasnya
bissa di akses.
*/