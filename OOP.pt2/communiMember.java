import java.util.Scanner;

public class communiMember {
    String member, nama, asal, status;
    Scanner scanner=new Scanner(System.in);

    //memasukkan data member
    void addMember(){
        System.out.print("Masukkan nama Anda: ");
        nama=scanner.nextLine();
        System.out.println();
        System.out.print("Masukkan asal Anda: ");
        asal=scanner.nextLine();
        System.out.println();
        System.out.print("Masukkan status Anda (mahasiswa, karyawan, atau alumni): ");
        status=scanner.nextLine();
        System.out.println();
    }

    //perkenalan diri
    void introMember(){
        System.out.println("Halo, nama saya "+nama+". Saya "+status+" di sini");
        System.out.println("saya berasal dari "+asal);
        System.out.println();
    }

    //mengatur individu menjadi anggota komunitas
    void setMember(){
        member=nama;
        System.out.println("[Sekarang "+member+" adalah anggota komunitas!]");
        System.out.println();
    }
}
