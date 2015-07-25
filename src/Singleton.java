/**
 * Created by green on 19.02.2015.
 *
 * // Примет классического синглетона
 *
 */
public class Singleton
{
    public static final Singleton instance = new Singleton();

private Singleton(){}

}

class Demo
{
    public static void main(String[] args)
    {
        Singleton ref = Singleton.instance;
    }
}