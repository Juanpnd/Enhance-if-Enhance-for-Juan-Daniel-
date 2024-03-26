public class ContohIf {
    public static void main(String[] args) {
        int angka = 10;

        if (angka > 0) {
            System.out.println("Angka positif");
        } else {
            System.out.println("Angka negatif atau nol");
        }
    }
}

public class ContohTandaTanya {
    public static void main(String[] args) {
        int angka = 10;

        // Cek apakah angka lebih besar dari 0 menggunakan ekspresi ?: 
        // Jika iya, beri label "Angka positif", jika tidak, beri label "Angka negatif atau nol"
        String hasil = (angka > 0) ? "Angka positif" : "Angka negatif atau nol";

        // Tampilkan hasil pengecekan
        System.out.println(hasil);
    }
}