public class Student extends communiMember{
    String mahasiswa, fakultas;
    int nim;

    //mengatur member menjadi mahasiswa
    void setMhs(){
        mahasiswa=member;
        status="mahasiswa";
        System.out.println("Sekarang "+mahasiswa+" adalah "+status);
        System.out.println();
    }

    //mengatur NIM untuk mahasiswa
    void setNIM(){
            System.out.print("Masukkan NIM untuk "+mahasiswa+":");
            nim=scanner.nextInt();
            System.out.println();
            System.out.println("NIM berhasil diatur!");
            System.out.println("NIM: "+nim);
            System.out.println();
    }

    //mengatur fakultas untuk mahasiswa
    void setFak(){
            System.out.print("Masukkan fakultas untuk "+mahasiswa+":");
            fakultas=scanner.next();
            System.out.println();
            System.out.println("Fakultas berhasil diatur!");
            System.out.println("Fakultas: "+fakultas);
            System.out.println();
        
        
    }

    //menampilkan data mahasiswa
    void dataMhs(){
            System.out.println("Nama: "+mahasiswa);
            System.out.println("NIM: "+nim);
            System.out.println("Fakultas: "+fakultas);
            System.out.println();
            System.out.println("Provided by UINSA");
            System.out.println();
    }

    void updateDataMhs() {
    System.out.println("Pilih informasi yang ingin diperbarui:");
    System.out.println("1. NIM");
    System.out.println("2. Fakultas");
    System.out.println("3. Nama Mahasiswa");

    int pilihan = scanner.nextInt();
    scanner.nextLine();
    switch (pilihan) {
        case 1:
            System.out.print("Masukkan NIM baru untuk "+mahasiswa+": ");
            nim=scanner.nextInt();
            scanner.nextLine();
            System.out.println("NIM berhasil diperbarui menjadi: "+nim);
            break;
        case 2:
            System.out.print("Masukkan fakultas baru untuk "+mahasiswa+": ");
            fakultas=scanner.nextLine();
            System.out.println("Fakultas berhasil diperbarui menjadi: "+fakultas);
            break;
        case 3:
            System.out.print("Masukkan nama baru untuk mahasiswa: ");
            mahasiswa=scanner.nextLine();
            System.out.println("Nama mahasiswa berhasil diperbarui menjadi: "+mahasiswa);
            break;
        default:
            System.out.println("Pilihan tidak valid!");
            break;
    }
    System.out.println();
}
}
