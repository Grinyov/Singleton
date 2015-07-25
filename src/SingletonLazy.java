/**
 * Created by green on 19.02.2015.
 *
 * Пример ленивого синглетона
 *
 * синглетон создаётся в момент его вызова и только в одном экземпляре
 */
public class SingletonLazy {

    public static SingletonLazy instance;

    private SingletonLazy() {
    }

    // очень важно чтобы метод был syncronized,
    // это гарантирует что будет создан только в одном экземпляре

    public static synchronized SingletonLazy getInstance()
    {
        if(instance == null)
        {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

    class Demo2
    {
        public static void main(String[] args)
        {
            //Singleton ref = Singleton.instance;
        }
    }

