import java.util.ArrayList;

public class soal4 {
    public static void main(String[] args) {
        // String[] nama = {"N", "D", "R", "A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("N");
        nama.add("D");
        nama.add("R");
        nama.add("A");

        //Soal Nomor 4
        //Tentukan hasil yang didapatkan ketika melakukan perintah indexof(a), indexof(c), indexof(q)

        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));
    }
}
