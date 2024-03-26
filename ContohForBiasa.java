public class ContohForBiasa {
    public static void main(String[] args) {
        String kata = "Juan";

        // tidak bisa menggunakan for-each di sini karena for-each hanya cocok untuk data seperti array atau list
        // Namun, dalam contoh ini, kita mengakses karakter dalam string, bukan koleksi data yang bisa diiterasi langsung
        // Oleh karena itu, kita harus menggunakan for biasa untuk mengakses karakter berdasarkan indeks
        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            System.out.println("Karakter ke-" + (i + 1) + ": " + karakter);
        }
    }
}