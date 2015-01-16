import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExHandledTransaction {
    
    private BufferedReader br;
    private int jmlBarang;

    public ExHandledTransaction() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Memasukkan data transaksi, [only stub] [hanya contoh]
     */
    public void entri() {
        try {
            System.out.print("Masukkan jumlah barang yang ingin Anda proses: ");
            jmlBarang = Integer.valueOf(br.readLine());

            cetakJmlBarang();
        }
        catch(IOException exception) {
            System.err.println(exception.getMessage());
        }
        catch(NumberFormatException exception) {
            System.err.println("[ERROR] Hanya angka bulat yang dibolehkan!");
            entri();  // entri ulang
        }
    }

    /**
     * Mencetak data
     */
    public void cetakJmlBarang() {
        System.out.println("\nJumlah barang: " + jmlBarang);
    }
}