import java.util.Scanner;

public class WebProfilKleo {
    static boolean isDarkMode = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilMenu();
            System.out.print("\nPilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> tampilHome();
                case 2 -> tampilAbout();
                case 3 -> tampilProject();
                case 4 -> tampilContact();
                case 5 -> toggleDarkMode();
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }

    public static void tampilMenu() {
        System.out.println(wrap("\n=== Web Profil & Portofolio - Kleo Aprian Permana ===", true));
        System.out.println(wrap("1. Home", false));
        System.out.println(wrap("2. About Me", false));
        System.out.println(wrap("3. Projects", false));
        System.out.println(wrap("4. Contact", false));
        System.out.println(wrap("5. Toggle Dark/Light Mode", false));
        System.out.println(wrap("0. Keluar", false));
    }

    public static void tampilHome() {
        System.out.println(wrap("\n--- Home ---", true));
        System.out.println(wrap("Halo, saya Kleo Aprian Permana.", false));
        System.out.println(wrap("Saya mahasiswa Informatika di Institut Teknologi Nasional Bandung yang hobi bermain game dan mendengarkan musik.", false));
        System.out.println(wrap("[Ilustrasi: Foto diri profesional atau avatar digital Kleo]", false));
        System.out.println(wrap("Pilih menu berikut untuk mengenal saya lebih jauh:", false));
        System.out.println(wrap(" - 2. About Me", false));
        System.out.println(wrap(" - 3. Projects", false));
        System.out.println(wrap(" - 4. Contact", false));
    }

    public static void tampilAbout() {
        System.out.println(wrap("\n--- About Me ---", true));
        System.out.println(wrap("Nama saya Kleo Aprian Permana. Saya lahir pada 20 April 2001 dan tinggal di Bandung Barat.", false));
        System.out.println(wrap("Saya saat ini sedang berkuliah di Institut Teknologi Nasional Bandung jurusan Informatika.", false));

        tampilPendidikan();

        System.out.println(wrap("\nHobi:", true));
        System.out.println(wrap("- Bermain game", false));
        System.out.println(wrap("- Mendengarkan musik", false));

        System.out.println(wrap("\nSkills:", true));
        System.out.println(wrap("- HTML", false));
        System.out.println(wrap("- CSS", false));
        System.out.println(wrap("- Java", false));
        System.out.println(wrap("- Bootstrap (dasar)", false));

        System.out.println(wrap("\nTools & Frameworks:", true));
        System.out.println(wrap("- Visual Studio Code (VSCode)", false));
        System.out.println(wrap("- NetBeans", false));
    }

    public static void tampilPendidikan() {
        System.out.println(wrap("\nPendidikan:", true));
        String[] pendidikan = {
            "SDN 2 Cimareme (2007 - 2013)",
            "SMPN 1 Padalarang (2013 - 2016)",
            "SMKN 11 Bandung - Rekayasa Perangkat Lunak (2016 - 2019)",
            "Institut Teknologi Nasional Bandung - Informatika (2019 - sekarang)"
        };
        for (String jenjang : pendidikan) {
            System.out.println(wrap("- " + jenjang, false));
        }
    }

    public static void tampilProject() {
        System.out.println(wrap("\n--- Projects ---", true));
        System.out.println(wrap("1. Website Portofolio", false));
        System.out.println(wrap("   Waktu: 2024", false));
        System.out.println(wrap("   Deskripsi: Website untuk menampilkan profil dan portofolio.", false));
        System.out.println(wrap("   Teknologi: HTML, CSS, JavaScript", false));
        System.out.println(wrap("   Screenshot: [Gambar Website]", false));
    }

    public static void tampilContact() {
        System.out.println(wrap("\n--- Contact ---", true));
        System.out.println(wrap("Email   : kleo@example.com", false));
        System.out.println(wrap("No. HP  : 0812-3456-7890", false));
        System.out.println(wrap("LinkedIn: linkedin.com/in/kleoaprian", false));
        System.out.println(wrap("Instagram: @kleoaprian", false));
    }

    public static void toggleDarkMode() {
        isDarkMode = !isDarkMode;
        String mode = isDarkMode ? "Dark Mode" : "Light Mode";
        System.out.println(wrap("Mode tampilan diubah ke: " + mode, true));
    }

    public static String wrap(String text, boolean isTitle) {
        if (isDarkMode) {
            return isTitle ? "[## " + text + " ##]" : "[Dark] " + text;
        } else {
            return isTitle ? "*** " + text + " ***" : text;
        }
    }
} 
