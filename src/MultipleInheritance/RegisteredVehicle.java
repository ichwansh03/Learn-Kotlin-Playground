package MultipleInheritance;

public class RegisteredVehicle extends Vehicle{

    String platNomor;

    public RegisteredVehicle(String tipeKendaraan, int jmlRoda,
                             String platNomor) {
        super(tipeKendaraan, jmlRoda);
        this.platNomor = platNomor;
    }
}
