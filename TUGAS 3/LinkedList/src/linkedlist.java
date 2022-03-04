import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("ATHIFA RIFDA ANDRA \t");
        System.out.println("2111522010 \t");
        System.out.println("LinkedList \t");
        System.out.println("===============================");

        //Variabel LinkedList
        LinkedList<String> NIM = new LinkedList<>();
        LinkedList<String> Nama = new LinkedList<>();
        LinkedList<String> Alamat = new LinkedList<>();

        NIM.add("2111522010");
        Nama.add("Athifa Rifda Andra");
        Alamat.add("Pariaman");

        System.out.println("=====Data Mahasiswa=====");
        System.out.println("NIM \t: "+NIM+ "    \t Ukuran \t:" +NIM.size());
        System.out.println("Nama\t:" +Nama+ " \t Ukuran \t:" +Nama.size());
        System.out.println("Alamat \t:" +Alamat+ "      \t Ukuran \t:" +Alamat.size());
        System.out.println("-------------------------------------------------------------------");

        //Menambahkan Data Mahasiswa

        NIM.add("2111522014");
        Nama.add("Ferry Firmansyah");
        Alamat.add("Batam");

        NIM.add("2111522016");
        Nama.add("Tajri Ramal Muzi");
        Alamat.add("Solok");

        NIM.add("2111523010");
        Nama.add("Fathya Salshabilla");
        Alamat.add("Bukittinggi");

        NIM.add("2111523014");
        Nama.add("Nursyarah Okvinda");
        Alamat.add("Damasraya");

        NIM.add("2111523016");
        Nama.add("Rayhan Hersya Pratama");
        Alamat.add("Padang");

        System.out.println("=====Data Mahasiswa Setelah Ditambahkan=====");
        System.out.println("NIM \t: "+NIM);
        System.out.println("Nama\t:" +Nama);
        System.out.println("Alamat \t:" +Alamat);
        System.out.println("-------------------------------------------------------------------");

        //Menyisipkan Data
        NIM.set(1, "2111522012");
        Nama.set(2, "Jackson Timbr");
        Alamat.set(3, "Lombok");

        NIM.set(2, "2111522014");
        Nama.set(3, "Jazmine Smitt");
        Alamat.set(4, "Bali");

        NIM.set(3, "2111523000");
        Nama.set(1, "Exel Trust");
        Alamat.set(2, "Tanggerang");

        System.out.println("=====Data Mahasiswa Setelah Disisipkan=====");
        System.out.println("NIM \t: "+NIM);
        System.out.println("Nama\t:" +Nama);
        System.out.println("Alamat \t:" +Alamat);
        System.out.println("-------------------------------------------------------------------");

        //Menghapus Data
        NIM.removeFirst();
        Nama.removeLast();
        Alamat.remove(3);

        System.out.println("=====Data Mahasiswa Setelah Dihapus=====");
        System.out.println("NIM \t: "+NIM);
        System.out.println("Nama\t:" +Nama);
        System.out.println("Alamat \t:" +Alamat);
        System.out.println("-------------------------------------------------------------------");

        //Fungsi Pop
        System.out.println("=====Fungsi Pop=====");
        System.out.println("Data Removed \t:" +NIM.pop());
        System.out.println("Data After POP \t:" +NIM);
        System.out.println("Data Removed \t:" +Nama.pop());
        System.out.println("Data After POP \t:" +Nama);
        System.out.println("Data Removed \t:" +Alamat.pop());
        System.out.println("Data After POP \t:" +Alamat);
        System.out.println("-------------------------------------------------------------------");

        //Fungsi Push
        NIM.push("2111521010");
        Nama.push("Justin Drew");
        Alamat.push("New York");

        System.out.println("=====Fungsi Push=====");
        System.out.println("Setelah Fungsi Push \t:" +NIM);
        System.out.println("Setelah Fungsi Push \t:" +Nama);
        System.out.println("Setelah Fungsi Push \t:" +Alamat);
        System.out.println("-------------------------------------------------------------------");

        //Fungsi IndexOf)
        System.out.println("=====Perintah indexOf=====");
        System.out.println("IndexOf NIM \t :" +NIM.indexOf("2111521010"));
        System.out.println("IndexOf Nama \t :" +Nama.indexOf("Jazmine Smitt"));
        System.out.println("IndexOf Alamat \t :" +Alamat.indexOf("Lombok"));
        System.out.println("-------------------------------------------------------------------");
       
        //Fungsi get()
        System.out.println("=====Fungsi Get=====");
        System.out.println("Get NIM \t:" +NIM.get(2));
        System.out.println("Get Nama \t:" +Nama.get(3));
        System.out.println("Get Alamat \t:" +Alamat.get(0));
        System.out.println("-------------------------------------------------------------------");

        //isEmpty()
        System.out.println("=====Perintah isEmpty=====");
        System.out.println("Is NIM Empty    \t:" +NIM.isEmpty());

        Nama.clear();
        System.out.println("Is Nama Empty   \t:" +Nama.isEmpty());

        System.out.println("Is Alamat Empty \t:" +Alamat.isEmpty());
    }
}
