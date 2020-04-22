/*Program 4 

Nama		: Fadhilah Rifqi
Stambuk		: 13020180091
Kelas		: B2 
Hari,tanggal: Rabu, 21-04-2020
*/
 
 public abstract class Mobill implements PropertiInM{ 
	abstract public void injakPedalGas(); 
	
		public void injakRem(){  
			System.out.println("Mobil berhenti!");  
			} 
		}

	class Kijang extends Mobill{ 
		public void injakPedalGas(){ 
			System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");  
		} 
	 
		//@Override 
		public int berukuran(int ukuran) {  
		// TODO Auto-generated method stub 
			return ukuran;  
		} 
		 
		//@Override 
		public int berkekuatan(int kekuatan) {  
		// TODO Auto-generated method stub 
			return kekuatan;  
		} 
	} 


	class BMW extends Mobill {  
		public void injakPedalGas(){ 
			System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");  
		} 
	 
			//@Override  
			public int berukuran(int ukuran) {  
			// TODO Auto-generated method stub 
				return ukuran;  
			} 
			 
			//@Override 
			public int berkekuatan(int kekuatan) {   
			// TODO Auto-generated method stub 
				return kekuatan;  
			} 
	}		