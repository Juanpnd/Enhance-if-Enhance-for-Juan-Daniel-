public class ContohFor {
    public static void main(String[] args) {
        int[] angkaArray = {1, 2, 3, 4, 5};

        for (int i = 0; i < angkaArray.length; i++) {
            System.out.println("Angka: " + angkaArray[i]);
        }
    }
}

public class ContohForEach {
    public static void main(String[] args) {
        int[] angkaArray = {1, 2, 3, 4, 5};

        // Gunakan "for-each" untuk melakukan tindakan pada setiap angka dalam array secara berurutan
        // Misalnya, dalam setiap iterasi, cetak angka tersebut
        for (int angka : angkaArray) {
            // variabel "angka" akan mengambil nilai dari setiap angka dalam array "angkaArray"
            // dan setiap nilai ini akan digunakan dalam blok loop berikutnya

            System.out.println("Angka: " + angka);
            //menampilkan nilai angka ke layar
        }
    }
}