import java.util.*;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Buat petani
        Petani petani = new Petani("Ridho", "1234");

        System.out.println("=== Sistem Irigasi Otomatis ===");

        // Pengulangan login
        boolean berhasilLogin = false;
        while (!berhasilLogin) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (petani.login(username, password)) {
                System.out.println("Login berhasil!");
                berhasilLogin = true;
            } else {
                System.out.println("Login gagal! Username atau password salah. Coba lagi.\n");
            }
        }

        // Tampilkan menu setelah login berhasil
        tampilkanMenu();
    }

    private static void tampilkanMenu() {
        while (true) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Pilih Jenis Irigasi");
            System.out.println("2. Atur Jadwal Irigasi");
            System.out.println("3. Pantau Data Sensor");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1:
                    pilihJenisIrigasi();
                    break;
                case 2:
                    aturJadwalIrigasi();
                    break;
                case 3:
                    pantauDataSensor();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void pilihJenisIrigasi() {
        System.out.print("Masukkan jenis tanaman (buah/padi): ");
        String jenisTanaman = scanner.nextLine();
        try {
            SistemIrigasi irigasi = IrigasiFactory.buatIrigasi(jenisTanaman);
            System.out.println(irigasi.irigasi());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void aturJadwalIrigasi() {
        SistemPenjadwalan sistemPenjadwalan = new SistemPenjadwalan();
        System.out.print("Masukkan musim (hujan/kering): ");
        String musim = scanner.nextLine();

        if (musim.equalsIgnoreCase("hujan")) {
            sistemPenjadwalan.setStrategi(new JadwalMusimHujan());
        } else if (musim.equalsIgnoreCase("kering")) {
            sistemPenjadwalan.setStrategi(new JadwalMusimKering());
        } else {
            System.out.println("Musim tidak valid.");
            return;
        }

        System.out.println("Jadwal irigasi: " + sistemPenjadwalan.aturJadwal());
    }

    private static void pantauDataSensor() {
        KompositSensor kompositSensor = new KompositSensor();
        kompositSensor.tambahSensor(new SensorIndividu("Lahan 1", 45));
        kompositSensor.tambahSensor(new SensorIndividu("Lahan 2", 50));
        kompositSensor.tambahSensor(new SensorIndividu("Lahan 3", 30));

        System.out.println("Data Sensor:");
        System.out.println(kompositSensor.bacaData());
    }
}
