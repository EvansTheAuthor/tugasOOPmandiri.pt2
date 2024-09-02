public class Faculty extends Employee{
    String admin, dosen;
    
    //mengatur karyawan menjadi administrator
    void setAdmin(){
        admin=karyawan;
        status="administrator";
        System.out.println("Sekarang "+admin+" adalah "+status);
        System.out.println();
    }

    //mengatur karyawan menjadi dosen
    void setDosen(){
        dosen=karyawan;
        status="dosen";
        System.out.println("Sekarang "+dosen+" adalah "+status);
        System.out.println();
    }
}
