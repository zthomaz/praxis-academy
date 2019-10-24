
// mengimport scanner
import java.util.Scanner;

public class Matrik2 {

    public static void main(String[] args) {

        // deklarasi hasil, Array dan Scanner
        int[][] hasil = new int[2][2];
        int[][] matrik = new int[2][2];
        int[][] matrik2 = new int[2][2];
        Scanner baca = new Scanner(System.in);

        System.out.println("Program untuk menambahkan 2 buah Matrik");
        System.out.println("");

        // mengisi setiap matrik
        for (int i = 0; i < matrik.length; i++) {
            for (int j = 0; j < matrik.length; j++) {
                System.out.print("Silahkan Masukkan nilai Matrik Pertama " + i + " " + j + " = ");
                matrik[i][j] = baca.nextInt();
            }
        }

        for (int i = 0; i < matrik2.length; i++) {
            for (int j = 0; j < matrik2.length; j++) {
                System.out.print("Silahkan Masukkan nilai Matrik Kedua " + i + " " + j + " = ");
                matrik2[i][j] = baca.nextInt();
            }
        }

        /*
         * //menampilkan matrik for (int i=0; i<matrik.length; i++){ for (int j=0;
         * j<matrik[i].length; j++){ System.out.print(matrik[i][j]); }
         * System.out.println(""); }
         */

        System.out.println("Hasil dari penjumlahan 2 Matrik tersebut adalah ");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                hasil[i][j] = matrik[i][j] + matrik2[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println("");
        }

    }
}