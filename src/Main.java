//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //polymorphism = greek word for poly-"many", morph-"form"
        //The ability of an object to identify as more than one type
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

       Vehicle[] racers = {car, bicycle, boat};

//       car.go();
//       bicycle.go();
//       boat.go();

        for (Vehicle x : racers){
            x.go();
        }


    }
}