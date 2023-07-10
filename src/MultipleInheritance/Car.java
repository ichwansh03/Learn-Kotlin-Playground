package MultipleInheritance;

public class Car extends RegisteredVehicle{

    String merk;

    public Car(String tipeKendaraan, int jmlRoda, String platNomor,
               String merk) {
        super(tipeKendaraan, jmlRoda, platNomor);
        this.merk = merk;
    }
}
