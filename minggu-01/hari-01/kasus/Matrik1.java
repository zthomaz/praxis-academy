public class Matrik1 {

    public static void main(String[] args) {
        // membuat variabel untuk hasil
        int hasil;

        // deklarasi dan mengisi nilai matrik pertama
        int matrik1[][] = new int[2][2];
        matrik1[0][0] = 1;
        matrik1[0][1] = 2;
        matrik1[1][0] = 3;
        matrik1[1][1] = 4;

        //deklarasi dan mengisi matrik kedua
        int matrik2[][] = new int[2][2];
        matrik2[0][0] = 5;
        matrik2[0][1] = 6;
        matrik2[1][0] = 7;
        matrik2[1][1] = 8;

        System.out.println("Hasil dari penjumlahan Matrik adalah ");
        for (int i=0; i<matrik1.length; i++){
            for (int j=0; j<matrik1.length; j++){
                hasil = matrik1[i][j] + matrik2[i][j];
                System.out.print(hasil+" ");
            }
            System.out.println("");
        }
    }    
}
