/**
 * Created by green on 19.02.2015.
 *
 * ! Неправильная реализация Singleton
 *
 * double-checked locking  - don't do this
 *
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 *
 */
public class DoubleCheckedLocking
{
    public static DoubleCheckedLocking instance;


    public DoubleCheckedLocking getInstance()
    {
        if(instance == null)
        {
            synchronized(this)
            {
                if(instance == null)
                {
                    instance = new DoubleCheckedLocking();
                }
            }
        }

        return instance;
    }
}

class Demo3
{
    public static void main(String[] args)
    {
        //Singleton ref = Singleton.instance;
    }
}
