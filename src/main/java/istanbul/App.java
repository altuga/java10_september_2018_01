package istanbul;

/**
 * Hello Var!
 *
 */
public class App 
{
    public static void main( String... args )
    {
        var vehicle = new Car();
        vehicle.printType();
        vehicle = new Bicyle()  // compile time error
        vehicle.printType();
    }
}
