package LatihanInheritance;

public class Dosen {
    private String nik, nama;

    public Dosen(String nik, String nama){
        this.nik=nik;
        this.nama=nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view(){
        System.out.println("Dosen : NIK - "+ this.nik+ " & nama - "+ this.nama);
    }
}
