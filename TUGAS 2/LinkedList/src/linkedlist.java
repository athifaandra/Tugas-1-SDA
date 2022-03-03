import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");
        System.out.println("Tugas 2 LinkedList\t");
        System.out.println("2111522010 - Athifa Rifda Andra\t");
        System.out.println("--------------------------------------------------");

        LinkedList <String> saya = new LinkedList<>();

        saya.add("A");
        saya.add("T");
        saya.add("H");
        saya.add("I");
        saya.add("F");
        saya.add("A");
        saya.add(" ");
        saya.add("R");
        saya.add("I");
        saya.add("F");
        saya.add("D");
        saya.add("A");
        saya.add(" ");
        saya.add("A");
        saya.add("N");
        saya.add("D");
        saya.add("R");
        saya.add("A");
        
        System.out.println("Nama Saya       \t:" +saya);
        System.out.println("Ukuran LinkedList \t:" +saya.size());
        System.out.println("--------------------------------------------------");

        //add LinkedList
        saya.addFirst("Ir.");
        saya.addFirst("Prof");
        saya.addLast("M.A");
        saya.add("M.Com");
        saya.add("M.Ec");
        saya.add("M.T");
        saya.add("M.Stat");
        saya.add("M.S.E");

        System.out.println("Setelah Ditambahkan \t:" +saya);
        System.out.println("--------------------------------------------------");

        //set LinkedList
        saya.set(20, "M.B.A");
        saya.set(22, "M.Cs");
        saya.set(24, "M.Sc");

        System.out.println("Setelah Disisipkan \t:" +saya);
        System.out.println("--------------------------------------------------");

        //remove LinkedList
        saya.remove(19);
        saya.remove(21);
        saya.remove(23);
        System.out.println("Setelah Dihapus \t:" +saya);
        System.out.println("--------------------------------------------------");

        //Fungsi Pop
        System.out.println("Element Removed \t:" +saya.pop());
        System.out.println("Element Removed \t:" +saya.pop());
        System.out.println("LinkedList After Pop \t:" +saya);
        System.out.println("--------------------------------------------------");

        //Fungsi Push
        saya.push("University");
        saya.push("Stanford");
        System.out.println("Fungsi Push    \t:" +saya);
        System.out.println("--------------------------------------------------");

    }
}