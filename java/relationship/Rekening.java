/**
 * Konsep Rekening
 * --
 * Setiap rekening pasti berasosiasi dengan bank
 * tertentu. Oleh karena itu, relasi yang cocok
 * adalah <strong>asosiasi</strong>. Atau, jika ingin
 * lebih spesifik, bisa menggunakan relasi asosiasi
 * berjenis <strong>komposisi</strong>
 */
public class Rekening {
	
	private Bank bank;
	private String nomor;

	/**
	 * Class constructor, memaksa objek yang 
	 * dikonstruksi agar memiliki informasi bank dan
	 * nomor rekening
	 *
	 * @param bank Bank yang berasosiasi
	 * @param nomor Nomor rekening
	 */
	public Rekening(Bank bank, String nomor) {
		this.bank = bank;
		this.nomor = nomor;
	}

	/**
	 * Mendapatkan informasi terkait rekening
	 *
	 * @return Informasi rekening (bank + norek)
	 */
	public String getDetails() {
		return "Bank    : " + bank.getNama() + "\n" +
		       "No.Rek. : " + nomor + "\n";
	}
}