package LatihanInheritance;

public class Utama {
    public static void main(String[] args){
        Dosen dosen = new Dosen("34776","Saniati");
        dosen.view();

        Dekan dek = new Dekan("121353", "Ichwan", "FTIK");
        dek.view();
    }
}
