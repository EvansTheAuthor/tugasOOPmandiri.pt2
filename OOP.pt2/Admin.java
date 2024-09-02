public class Admin extends Faculty{
    private String id, departemen, email, noTelp, jabatan, alamat;
    private double gaji;

    //menambahkan data administrator
    void addDataAdmin(){
        System.out.println("Masukkan data admin!");
        System.out.println("Nama: "+admin);
        System.out.println();
        System.out.print("ID: ");
        id=scanner.nextLine();
        System.out.println();
        System.out.print("Departemen: ");
        departemen=scanner.nextLine();
        System.out.println();
        System.out.print("Email: ");
        email=scanner.nextLine();
        System.out.println();
        System.out.print("Nomor Telepon Aktif: ");
        noTelp=scanner.nextLine();
        System.out.println();
        System.out.print("Jabatan: ");
        jabatan=scanner.nextLine();
        System.out.println();
        System.out.print("Alamat: ");
        alamat=scanner.nextLine();
        System.out.println();
        System.out.print("Gaji: ");
        gaji=scanner.nextDouble();
        scanner.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("[Data admin berhasil ditambahkan!]");
        System.out.println();
    }

    //menampilkan data administrator
    void showDataAdmin(){
        System.out.println("Nama: "+dosen);
        System.out.println("ID: "+id);
        System.out.println("Departemen: "+departemen);
        System.out.println("Email: "+email);
        System.out.println("Nomor Telepon: "+noTelp);
        System.out.println("Jabatan: "+jabatan);
        System.out.println("Alamat: "+alamat);
        System.out.println("Gaji: "+gaji);
        System.out.println();
    }

    //melakukan update pada data administrator
    void updateDataAdmin(){
        System.out.println("Pilih informasi yang ingin diperbarui:");
        System.out.println("1. ID");
        System.out.println("2. Nama: ");
        System.out.println("3. Departemen: ");
        System.out.println("4. Email");
        System.out.println("5. Nomor Telepon");
        System.out.println("6. Jabatan");
        System.out.println("7. Alamat");
        System.out.println("8. Gaji");

        int choice=scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Masukkan ID baru: ");
                id=scanner.nextLine();
                System.out.println("ID berhasil diperbarui!");
                break;
            case 2:
                System.out.print("Masukkan nama baru: ");
                dosen=scanner.nextLine();
                System.out.println("Dosen berhasil diperbarui!");
                break;
            case 3:
                System.out.print("Masukkan departemen baru: ");
                departemen=scanner.nextLine();
                System.out.println("Departemen berhasil diperbarui!");
                break;
            case 4:
                System.out.print("Masukkan Email baru: ");
                email=scanner.nextLine();
                System.out.println("Email berhasil diperbarui!");
                break;
            case 5:
                System.out.print("Masukkan nomor telepon baru: ");
                noTelp=scanner.nextLine();
                System.out.println("Nomor telepon berhasil diperbarui!");
                break;
            case 6:
                System.out.print("Masukkan jabatan baru: ");
                jabatan=scanner.nextLine();
                System.out.println("Jabatan berhasil diperbarui!");
                break;
            case 7:
                System.out.print("Masukkan alamat baru: ");
                alamat=scanner.nextLine();
                System.out.println("Alamat berhasil diperbarui!");
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
