public class Alumnus extends communiMember{
    String alumni, gelar, noTelp, email, pekerjaan, jurusan;
    int  thLulus;

    //mengatur member menjadi alumni
    void setAlumnus(){
        alumni=member;
        status="alumni";
        System.out.println("Sekarang "+alumni+" adalah "+status);
        System.out.println();
    }

    //memasukkan data alumni
    void addDataAlumnus(){
            System.out.println("Daftarkan data yang diminta untuk keperluan administrasi!");
            System.out.println("Nama: "+alumni);
            System.out.println();
            System.out.print("Gelar: ");
            gelar=scanner.nextLine();
            System.out.println();
            System.out.print("Jurusan: ");
            jurusan=scanner.nextLine();
            System.out.println();
            System.out.print("Tahun Kelulusan: ");
            thLulus=scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            System.out.print("Pekerjaan: ");
            pekerjaan=scanner.nextLine();
            System.out.println();
            System.out.println("_____________________________");
            System.out.println("INFORMASI KONTAK");
            System.out.print("Email: ");
            email=scanner.nextLine();
            System.out.println();
            System.out.print("Nomor Telepon Aktif: ");
            noTelp=scanner.nextLine();
            System.out.println();
            System.out.println();
            System.out.println("[Terima Kasih Sudah Mengisi Data Yang Dibutuhkan]");
            System.out.println();
    }

    //menampilkan data alumni
    void showDataAlumnus(){
        System.out.println("Nama: "+alumni);
        System.out.println("Tahun Kelulusan: "+thLulus);
        System.out.println("Gelar: "+gelar);
        System.out.println("Jurusan: "+jurusan);
        System.out.println("Pekerjaan: "+pekerjaan);
        System.out.println("______________________________");
        System.out.println("Email: "+email);
        System.out.println("Nomor Telepon Aktif: "+noTelp);
        System.out.println();
        System.out.println("Provided by UINSA");
    }

    //update data yang diinput
    void updateDataAlumnus(){
        System.out.println("Pilih informasi yang ingin diperbarui:");
        System.out.println("1. Nama");
        System.out.println("2. Tahun Kelulusan");
        System.out.println("3. Gelar");
        System.out.println("4. Jurusan");
        System.out.println("5. Pekerjaan");
        System.out.println("6. Email");
        System.out.println("7. Nomor Telepon Aktif");
        System.out.println();
        System.out.print("Jenis: ");
        int choice=scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 1:
                System.out.print("Masukkan nama baru: ");
                alumni=scanner.nextLine();
                System.out.println("Nama berhasil diperbarui!");
                break;
            case 2:
                System.out.print("Masukkan tahun kelulusan baru: ");
                thLulus=scanner.nextInt();
                System.out.println("Tahun kelulusan berhasil diperbarui!");
                break;
            case 3:
                System.out.print("Masukkan gelar baru: ");
                gelar=scanner.nextLine();
                System.out.println("Gelar berhasil diperbarui!");
                break;
            case 4:
                System.out.print("Masukkan jurusan baru: ");
                jurusan=scanner.nextLine();
                System.out.println("Jurusan berhasil diperbarui!");
                break;
            case 5:
                System.out.print("Masukkan pekerjaan baru: ");
                pekerjaan=scanner.nextLine();
                System.out.println("Pekerjaan berhasil diperbarui!");
                break;
            case 6:
                System.out.print("Masukkan email baru: ");
                email=scanner.nextLine();
                System.out.println("Kontak berhasil diperbarui!");
                break;
            case 7:
                System.out.print("Masukkan nomor telepon baru: ");
                noTelp=scanner.nextLine();
                System.out.println("Nomor telepon aktif berhasil diperbarui!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
