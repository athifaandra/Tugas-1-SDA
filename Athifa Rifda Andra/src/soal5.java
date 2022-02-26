import java.util.ArrayList;

public class soal5 {
    public static void main(String[] args) {
        // String[] nama = {"N", "D", "R", "A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("N");
        nama.add("D");
        nama.add("R");
        nama.add("A");

        System.out.println("ArrayList Sebelum Dilakukan Remove : ");
        for(String var: nama){
            System.out.println(var);
        }

        //Soal Nomor 5
        //Tentukan hasil yang didapatkan ketika melakukan perintah remove(0), remove(3), remove(2)

        //System.out.println(nama.remove(0));
        //System.out.println(nama.remove(3));
        //System.out.println(nama.remove(2));

        nama.remove(0);
        //nama.remove(3);
        //nama.remove(2);

        System.out.println("ArrayList Setelah Dilakukan Remove : ");
        for(String var2: nama){
            System.out.println(var2);
        }
    }
}
