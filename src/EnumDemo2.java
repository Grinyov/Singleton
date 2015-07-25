/**
 * Created by green on 19.02.2015.
 *
 * Реализация перечислений
 *
 */
public class EnumDemo2
{

    public enum Planet
    {
        MARS(200), VENUS(1500), EARTH(700);

        private double mass;

        Planet(double mass)
        {
            this.mass = mass;
        }

        public double getMass() {
            return mass;
        }
    }


    static class App
    {
        public static void main(String[] args)
        {
            Planet mars = Planet.MARS;
            System.out.println("Масса Марса равна " + mars.getMass());

            java.lang.Enum e = Planet.EARTH;

        }
    }

}
