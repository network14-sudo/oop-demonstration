/**
 * Kelas utama demo relasi asosiasi
 * 
 * Dapat dilihat, objek rekeningku terhubung dengan
 * relasi <strong>dependency</strong>
 *
 * @see association_relationship.jpg for Class Diagram
 */
public class AssociationDemoApp {
	
	/**
	 * Main method (entry point function)
	 * @param args
	 */
	public static void main(String[] args) {
		// Membuat objek dari kelas Rekening
		Rekening rekeningku = new Rekening(
			new Bank("Bank Frozen"),
			"0600001119999"
		);

		// Mencetak informasi rekening
		System.out.println(rekeningku.getDetails());
	}
}