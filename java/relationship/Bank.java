/**
 * Konsep Bank
 * --
 * Setiap bank pasti memiliki nama
 */
public class Bank {
	
	private String nama;

	/**
	 * Class constructor, memaksa objek yang 
	 * dikonstruksi agar memiliki nama
	 *
	 * @param nama Nama bank
	 */
	public Bank(String nama) {
		this.nama = nama;
	}

	/**
	 * Mendapatkan nama bank dari objek
	 * @return Nama bank
	 */
	public String getNama() {
		return nama;
	}
}