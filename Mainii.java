//inheritance-interface

interface Hewan {
	public void nama();
	int jmlKaki();
}

interface Jenis{
	String jns();
}

interface JenisHewan extends Hewan, Jenis{}

class Data implements JenisHewan{

	@Override
	public void nama() {
		System.out.println("Nama hewan adalah sapi");
		
	}

	@Override
	public int jmlKaki() {
		return 4;
	}
	
	@Override
	public String jns() {
		return "Herbifora";
	}	
}

public class Mainii{
	
	public static void main (String[] args) {
		Data data = new Data();
		
		data.nama();
		data.jmlKaki();
		data.jns();
		
		System.out.println("Jumlah Kaki Sapi = " + data.jmlKaki());
		System.out.println("Sapi merupaka hewan = " + data.jns());
	}
}

/*output:
Nama hewan adalah sapi
Jumlah Kaki Sapi = 4
Sapi merupaka hewan = Herbifora

program di atas terdapat interface hewan dan jenis kemudian memiliki kelaas turunan
JenisHewan dari interface Hewan dan Jenis. class data merupakan implements dari
interface JenisHewan yang isinya berupa methode overring dari nama, jmlkaki, dan jenis.
*/
