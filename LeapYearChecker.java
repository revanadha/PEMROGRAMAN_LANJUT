import java.util.Scanner;
public class LeapYearChecker {
    public static boolean isLeap(int year) {
        //Logika kabisat: (Habis dibagi 4 DAN tidak habis dibagi 100) ATAU (Habis dibagi 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan tahun (misal: 2000, 2024): ");

            // Membaca input tahun dari pengguna
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();

                // Memastikan tahun adalah bilangan positif
                if (year <= 0) {
                    System.out.println("Input tidak valid. Tahun harus merupakan bilangan bulat positif.");
                } else {
                    // Memanggil fungsi untuk mengecek kabisat
                    if (isLeap(year)) {
                        System.out.println("✅ Tahun " + year + " adalah TAHUN KABISAT.");
                    } else {
                        System.out.println("❌ Tahun " + year + " BUKAN tahun kabisat.");
                    }
                }
            } else {
                System.out.println("Input tidak valid. Harap masukkan bilangan bulat untuk tahun.");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Tutup scanner untuk mencegah kebocoran sumber daya
            scanner.close();
        }
    }
}