public class Dosen extends Faculty{
    String posisi, jurusan, gelar, id, email, alamat, noTelp, matkul;
    double gaji;

    //menambahkan data dosen
    void addDataDosen(){
        System.out.println("Masukkan data dosen!");
        System.out.print("Nama: "+dosen);
        System.out.println();
        System.out.print("ID: ");
        id=scanner.nextLine();
        System.out.println();
        System.out.print("Jurusan: ");
        jurusan=scanner.nextLine();
        System.out.println();
        System.out.print("Email: ");
        email=scanner.nextLine();
        System.out.println();
        System.out.print("Nomor Telepon Aktif: ");
        noTelp=scanner.nextLine();
        System.out.println();
        System.out.print("Gelar: ");
        gelar=scanner.nextLine();
        System.out.println();
        System.out.print("Mata Kuliah Yang Diampu: ");
        matkul=scanner.nextLine();
        System.out.println();
        System.out.print("Gaji: ");
        gaji=scanner.nextDouble();
        scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("[Data dosen berhasil ditambahkan!]");
        System.out.println();
    }

    //menampilkan data dosen
    void showDataDosen(){
        System.out.println("Nama: "+dosen);
        System.out.println("ID: "+id);
        System.out.println("Jurusan: "+jurusan);
        System.out.println("Gelar: "+gelar);
        System.out.println("Mata Kuliah Yang Diampu: "+matkul);
        System.out.println("Gaji: "+gaji);
        System.out.println("__________________________");
        System.out.println("INFO KONTAK");
        System.out.println("__________________________");
        System.out.println("Email: "+email);
        System.out.println("Nomor Telepon Aktif: "+noTelp);
        System.out.println();
        System.out.println("Provided by UINSA");
    }

    //melakukan update pada data dosen
    void updateDataDosen(){
        System.out.println("Pilih informasi yang ingin diperbarui:");
        System.out.println("1. Nama");
        System.out.println("2. ID");
        System.out.println("3. Jurusan");
        System.out.println("4. Email");
        System.out.println("5. Nomor Telepon");
        System.out.println("6. Gelar");
        System.out.println("7. Mata Kuliah");
        System.out.println("8. Gaji");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice){
            case 1:
                System.out.print("Masukkan nama baru: ");
                dosen=scanner.nextLine();
                System.out.println("Nama berhasil diperbarui!");
                break;
            case 2:
                System.out.print("Masukkan ID baru: ");
                id=scanner.nextLine();
                System.out.println("ID berhasil diperbarui!");
                break;
            case 3:
                System.out.print("Masukkan jurusan baru: ");
                jurusan=scanner.nextLine();
                System.out.println("Jurusan berhasil diperbarui!");
                break;
            case 4:
                System.out.print("Masukkan email baru: ");
                email=scanner.nextLine();
                System.out.println("Email berhasil diperbarui!");
                break;
            case 5:
                System.out.print("Masukkan nomor telepon baru: ");
                noTelp=scanner.nextLine();
                System.out.println("Nomor telepon berhasil diperbarui!");
                break;
            case 6:
                System.out.print("Masukkan gelar baru: ");
                gelar=scanner.nextLine();
                System.out.println("Gelar berhasil diperbarui!");
                break;
            case 7:
                System.out.print("Masukkan mata kuliah baru: ");
                matkul=scanner.nextLine();
                System.out.println("Mata kuliah berhasil diperbarui!");
                break;
            case 8:
                System.out.print("Masukkan gaji baru: ");
                gaji=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Gaji berhasil diperbarui!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
        System.out.println();
    }
}
