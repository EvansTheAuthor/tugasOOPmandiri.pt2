public class Staff extends Employee{
    String staff, posisi, departemen, id, alamat, noTelp, status;
    double gaji;

    //mengatur karyawan menjadi staff
    void setStaff(){
        staff=karyawan;
        status="administrator";
        System.out.println("Sekarang "+staff+" adalah "+status);
        System.out.println();
    }

    //menambahkan data karyawan
    void addDataStaff(){
        System.out.println("Masukkan data staf yang diminta:");
        System.out.print("Nama: "+staff);
        System.out.println();
        System.out.print("Posisi: ");
        posisi=scanner.nextLine();
        System.out.println();
        System.out.print("Departemen: ");
        departemen=scanner.nextLine();
        System.out.println();
        System.out.print("ID Staff: ");
        id=scanner.nextLine();
        System.out.println();
        System.out.print("Alamat: ");
        alamat=scanner.nextLine();
        System.out.println();
        System.out.print("Nomor Telepon Aktif: ");
        noTelp=scanner.nextLine();
        System.out.println();
        System.out.print("Status (aktif/cuti/pensiun): ");
        status=scanner.nextLine();
        System.out.println();
        System.out.print("Gaji: ");
        gaji=scanner.nextDouble();
        scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("[Data berhasil ditambahkan!]");
        System.out.println();
    }

    //menampilkan data karyawan
    void showDataStaff() {
        System.out.println("Informasi Staf:");
        System.out.println("Nama: "+staff);
        System.out.println("ID Staff: "+id);
        System.out.println("Posisi: "+posisi);
        System.out.println("Departemen: "+departemen);
        System.out.println("Alamat: "+alamat);
        System.out.println("Nomor Telepon: "+noTelp);
        System.out.println("Status: "+status);
        System.out.println("Gaji: "+gaji);
        System.out.println();
        System.out.println("Provided by UINSA");
    }

    //melakukan update pada data karyawan
    void updateDataStaff(){
        System.out.println("Pilih informasi yang ingin diperbarui:");
        System.out.println("1. Nama");
        System.out.println("2. Posisi");
        System.out.println("3. Departemen");
        System.out.println("4. ID Staff");
        System.out.println("5. Alamat");
        System.out.println("6. Nomor Telepon");
        System.out.println("7. Status");
        System.out.println("8. Gaji");
    
        int choice = scanner.nextInt();
        scanner.nextLine();
    
        switch(choice){
            case 1:
                System.out.print("Masukkan nama baru: ");
                staff=scanner.nextLine();
                System.out.println("Nama berhasil diperbarui!");
                break;
            case 2:
                System.out.print("Masukkan posisi baru: ");
                posisi=scanner.nextLine();
                System.out.println("Posisi berhasil diperbarui!");
                break;
            case 3:
                System.out.print("Masukkan departemen baru: ");
                departemen=scanner.nextLine();
                System.out.println("Departemen berhasil diperbarui!");
                break;
            case 4:
                System.out.print("Masukkan ID Staff baru: ");
                id=scanner.nextLine();
                System.out.println("ID Staff berhasil diperbarui!");
                break;
            case 5:
                System.out.print("Masukkan alamat baru: ");
                alamat=scanner.nextLine();
                System.out.println("Alamat berhasil diperbarui!");
                break;
            case 6:
                System.out.print("Masukkan nomor telepon baru: ");
                noTelp=scanner.nextLine();
                System.out.println("Nomor telepon berhasil diperbarui!");
                break;
            case 7:
                System.out.print("Masukkan status baru (aktif/cuti/pensiun): ");
                status=scanner.nextLine();
                System.out.println("Status berhasil diperbarui!");
                break;
            case 8:
                System.out.print("Masukkan gaji baru: ");
                gaji=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Gaji berhasil diperbarui!");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
        System.out.println();
    }
}
