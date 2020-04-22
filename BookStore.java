/*Program 4 

Nama		: Fadhilah Rifqi
Stambuk		: 13020180091
Kelas		: B2 
Hari,tanggal: Selasa, 21-04-2020
*/

import java.io.*; 
import java.util.Scanner; 
 
//deklarasi class utama  
public class BookStore{ 
 
	public static void main(String[] args){  
	//deklarasi variablel 
	int menu, 
	choice=0;  
	String read; 
	BufferedWriter outs; 
	BufferedReader ins;  
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	Scanner input = new Scanner(System.in);  
	//menampilkan pilihan 
	System.out.println(" Memasukkan menu "); 
	System.out.println(" 1. Tambah buku ");  
	System.out.println(" 2. Tampil Daftar Book "); 
	System.out.print("Pilih menu: ");  
	menu = input.nextInt(); //membaca inputan 
	//pilihan menu 
	
	switch(menu){  
	//pilih 1 
	case 1:  
		while(choice != 2){ 
		try{ 
			System.out.println("");  
			System.out.println("Masukkan Data buku"); 
			System.out.print("Judul: "); 
			String title = br.readLine();  
			System.out.print("Pengarang: "); 
			String writer = br.readLine(); 
			System.out.print("Tahun: "); 
			String year = br.readLine(); 
			try{  
				outs = new BufferedWriter(new FileWriter("PenjualanBuku.txt",true));  
				outs.write("Judul " + title + " ditulis oleh " + writer + " pada tahun " + year + ".");  
				outs.newLine(); 
				outs.close(); 
			}catch(IOException e){ 
				System.out.println("Ada masalah ditemukan: " + e); 
			}  
			}catch(IOException e){ 
				System.out.println( "Ada masalah ditemukan: " + e);  
			}  
				System.out.print("Masukan buku yang lain? (1. Ya 2. Tidak) :"); 
				choice = input.nextInt();  
			} break; 
			
	//pilih 2 
	case 2: 
		System.out.println("");  
		System.out.println("Daftar Buku"); 
		try{  
			ins = new BufferedReader(new FileReader("PenjualanBuku.txt")); 
			while((read = ins.readLine()) != null){ 
				System.out.println(read); 
				read+=read+"\n";  
			} 
			ins.close();
		}catch(IOException e){ 
			System.out.println("Ada masalah ditemukan: " + e); 
		} 
	}
	}
} 

/*
output:
 Memasukkan menu
 1. Tambah buku
 2. Tampil Daftar Book
Pilih menu: 1

Jika kita memilih opsi 1
Masukkan Data buku
Judul: Awan Tinggi
Pengarang: HY
Tahun: 2012
Masukan buku yang lain? (1. Ya 2. Tidak) :2

 Memasukkan menu
 1. Tambah buku
 2. Tampil Daftar Book
Pilih menu: 2

Jika kita memilih opsi 2
Daftar Buku
Penjualan Buku:
-----------------------

Judul buku: Move on
Stock     : 8
Judul Kunci ditulis oleh FR pada tahun 2018.
Stock     : 8
Judul Mimpi ditulis oleh DH pada tahun 2015.
Stock     : 20
Judul Move On ditulis oleh Fyi pada tahun 2000.
Stock     : 12
Judul Bintang ditulis oleh FR pada tahun 2016.
Stock     : 20
Judul Awan Tinggi ditulis oleh HY pada tahun 2012.

Berikan penjelasan setiap program terutama tujuan program, 
keyword yang digunakan dari var/tipedata/kelas/method, dll 
penjelasan:
Tujuan program : untuk memudahkan dalam mendata buku bookstore, baik dari judul buku,
jumlah stonknya dan bila mana ada penambahan maga sistem akan mengimputkan sesuai dengan 
yang diinputkan oleh user.
variabel: menu, shoice, read.
Tipe data : int menu, choice=0 (sudah di beeri terlebih dahulu nilainya 0); String read; 
kelas: hanya memiliki satu saja main class yaitu BookStore dengan tipe public
yang di bisa diakses oleh semua orang.
method:
menggunakan class inputan:
BufferedWriter untuk menuliskan data ke dalam sebuah file Penjualan buku.txt, 
kemudian membacanya menggunakan class BufferedReader. dan juga menggunakan scanner untuk 
proses penginputannya yang akan nantinya dilakukan oleh user dan menggunakan objek instance
berupa input.
menggunakan exception handling try dan catch.


*/