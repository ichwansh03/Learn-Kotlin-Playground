package MultipleInheritance;

public class Cycle extends Vehicle{

    String jenis;

    public Cycle(String tipeKendaraan, int jmlRoda, String jenis) {
        super(tipeKendaraan, jmlRoda);
        this.jenis = jenis;
    }
}
