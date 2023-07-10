package MultipleInheritance;

public class MotorBike extends RegisteredVehicle{

    int jmlCC;

    public MotorBike(String tipeKendaraan, int jmlRoda, String platNomor,
                     int jmlCC) {
        super(tipeKendaraan, jmlRoda, platNomor);
        this.jmlCC = jmlCC;
    }
}
