
/**
 * Write a description of class Rocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rocket
{
    public static void main(String[] args)
    {
        rocketArrow();
        rocketBox();
        System.out.println("|ROCKET|");
        System.out.println("| Time |");
        rocketBox();
        rocketArrow();
    }
    public static void rocketArrow() 
    {
        System.out.println("   /\\  ");
        System.out.println("  /  \\ ");
        System.out.println(" /    \\");
    }
    public static void rocketBox() 
    {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}

