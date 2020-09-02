/**
 * Kelas utama demo relasi dependency
 * 
 * Dapat dilihat, objek frozenBank tidak berstatus
 * sebagai property dari kelas DependencyDemoApp.
 * Oleh karena itu, relasinya disebut relasi
 * <strong>dependency</strong>
 *
 * @see dependency_relationship.jpg for Class Diagram
 */
public class DependencyDemoApp {
	
	/**
	 * Main method (entry point function)
	 * @param args
	 */
	public static void main(String[] args) {
		// Membuat objek dari kelas Bank
		Bank frozenBank = new Bank("Bank Frozen");

		// Mencetak nama bank dari objek frozenBank
		System.out.println(frozenBank.getNama());
	}
}