public class Main {

// part 6 - create my own enum

enum VehicleBrands {
    MERCEDES,
    AUDI,
    VAUXHALL,
    KIA,
    AIRBUS,
    BOEING

    }
//below, I am assigning variables to the type VehicleBrands
public static void main(String[] args) {
    VehicleBrands Car = VehicleBrands.KIA;
    VehicleBrands Car = VehicleBrands.AUDI;
    VehicleBrands Airplane = VehicleBrands.AIRBUS;
    VehicleBrands Airplane = VehicleBrands.BOEING;

}

public static void isCar(VehicleBrands Car) {
    if(Car = VehicleBrands.AUDI || Car == VehicleBrands.KIA) {
        System.out.println("Nice car!");
    }
    else {
        System.out.println("You better walk!");
    }
}

}
