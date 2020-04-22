/*Program 3

Nama		: Fadhilah Rifqi
Stambuk		: 13020180091
Kelas		: B2 
Hari,tanggal: Rabu, 21-04-2020
*/

public class TestMobil {
	
	public static void main(String[] args){
		Mobill mobil = new Mobill(){
			public void injakPedalGas(){
				System.out.println("Mobil berjalan...");
			}

			@Override
			public int berukuran(int ukuran) {
				// TODO Auto-generated method
				return ukuran*10;
			}

			@Override
			public int berkekuatan(int kekuatan) {
				// TODO Auto-generated method
				 return kekuatan*10;
			}
		};
		
		Kijang kijang = new Kijang();
		BMW bmw = new BMW();
		mobil.injakPedalGas();
		
		System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(100)+ "\nBerukuran : " + mobil.berukuran(100)); 
		
		mobil = kijang;
		mobil.injakPedalGas();
		System.out.println("Kekuatan Kijang: "+ mobil.berkekuatan(150)+"\nBerukuran : "+ mobil.berukuran(100));
		
		mobil = bmw;
		mobil.injakPedalGas();
		System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(150)+"\nBerukuran : " + mobil.berukuran(100));
	}
}

/*
output:
Mobil berjalan...
Kekuatan BMW: 1000
Berukuran : 1000
Mobil Melaju dengan kecepatan 100 Km/jam...
Kekuatan Kijang: 150
Berukuran : 100
Mobil Melaju dengan kecepatan 100 Km/jam...
Kekuatan BMW: 150
Berukuran : 100

penjelasan
*/