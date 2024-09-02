public class Employee extends communiMember{
    String karyawan, fakultas, jabatan;
    int nip;

    //mengatur member menjadi karyawan
    void setEmployee(){
        karyawan=member;
        status="karyawan";
        System.out.println("Sekarang "+karyawan+" adalah "+status);
        System.out.println();
    }

    //mengatur NIP karyawan
    void  setNIP(){
        System.out.print("Daftarkan NIP untuk "+karyawan+":");
            nip=scanner.nextInt();
            System.out.println();
            System.out.println("NIP berhasil diatur!");
            System.out.println("NIP: "+nip);
            System.out.println();
    }

    //mengatur fakultas tempat karyawan bertugas
    void setFak(){
        System.out.print("Masukkan fakultas untuk "+karyawan+":");
            fakultas=scanner.next();
            System.out.println();
            System.out.println("Fakultas berhasil diatur!");
            System.out.println("Fakultas: "+fakultas);
            System.out.println();
    }

    //mengatur penugasan jabatan pada karyawan
    void setPosition(){
        System.out.print("Masukkan jabatan yang ditugaskan untuk "+karyawan+":");
            jabatan=scanner.next();
            System.out.println();
            System.out.println("Jabatan berhasil diatur!");
            System.out.println("Jabatan: "+jabatan);
            System.out.println();
    }

    //menampilkan data karyawan
    void showdataKaryawan(){
        System.out.println("Nama: "+karyawan);
        System.out.println("NIP: "+nip);
        System.out.println("Fakultas: "+fakultas);
        System.out.println("Jabatan: "+jabatan);
        System.out.println();
        System.out.println("Provided by UINSA");
        System.out.println();
    }

    //melakukan update data karyawan
    void updateDataEmployee(){
        System.out.println("Pilih informasi yang ingin diperbarui:");
        System.out.println("1. NIP");
        System.out.println("2. Fakultas");
        System.out.println("3. Jabatan");
        System.out.println("4. Nama Karyawan");
    
        int pilihan = scanner.nextInt();
        scanner.nextLine();
    
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan NIP baru untuk "+karyawan+": ");
                nip = scanner.nextInt();
                scanner.nextLine();
                System.out.println("NIP berhasil diperbarui menjadi: "+nip);
                break;
            case 2:
                System.out.print("Masukkan fakultas baru untuk "+karyawan+": ");
                fakultas = scanner.nextLine();
                System.out.println("Fakultas berhasil diperbarui menjadi: "+fakultas);
                break;
            case 3:
                System.out.print("Masukkan jabatan baru untuk "+karyawan+": ");
                jabatan = scanner.nextLine();
                System.out.println("Jabatan berhasil diperbarui menjadi: "+jabatan);
                break;
            case 4:
                System.out.print("Masukkan nama baru untuk karyawan: ");
                karyawan = scanner.nextLine();
                System.out.println("Nama karyawan berhasil diperbarui menjadi: "+karyawan);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        System.out.println();
    }
}
