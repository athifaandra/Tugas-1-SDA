import java.util.ArrayList;

public class soal6 {
    public static void main(String[] args) {
        // String[] nama = {"N", "D", "R", "A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("N");
        nama.add("D");
        nama.add("R");
        nama.add("A");

        //Soal Nomor 4
        //Tentukan hasil yang didapatkan ketika melakukan perintah :
        //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)

        nama.add(0,"e");
        System.out.println("Setelah ditambahkan string e = " +nama);

        nama.add(2,"f");
        System.out.println("Setelah ditambahkan string f = " +nama);

        nama.add(3,"g");
        System.out.println("Setelah ditambahkan string g = " +nama);

        nama.add(4,"h");
        System.out.println("Setelah ditambahkan string h = " +nama);

        nama.add(6,"h");
        System.out.println("Setelah ditambahkan string h = " +nama);

        nama.add(-3,"j");
        System.out.println("Setelah ditambahkan string j = " +nama);
    }
}
