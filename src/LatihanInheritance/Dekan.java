package LatihanInheritance;

public class Dekan extends Dosen{
    String fak;

    public Dekan(String nik, String nama, String fak){
        super(nik, nama);
        this.fak=fak;
    }

    public void viewDekan(){
        System.out.println("Dekan : Fak - "+fak +", NIK - "+ this.getNik()+ " & nama - "+ this.getNama());
    }
}
