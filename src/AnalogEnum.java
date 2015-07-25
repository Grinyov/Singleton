/**
 * Created by green on 19.02.2015.
 *
 * Не очень удачная реализация перечислений
 */
public class AnalogEnum
{
    public class Color
    {
        public static final int RED = 0;
        public static final int GREEN = 1;
        public static final int BLUE = 2;

        public static final int BRIGHT = 50;
    }

     static class ColorRect
    {
        private int w;
        private int h;
        private int color;

        public ColorRect(int w, int h, int color) {
            this.w = w;
            this.h = h;
            this.color = color;
        }
    }

    static class App
    {
        public static void main(String[] args)
        {
            new ColorRect(10, 20, Color.RED);

            // Но проблема в такой реализации в том, что Color.Red - это int
            // ! поэтому никто не помешает сделать

            new ColorRect(10, Color.GREEN, 234);

            // или такое

            new ColorRect(10, Color.GREEN, Color.BLUE + Color.BRIGHT);

            // поэтому нужно делать где-то проверку или реализовать по-другому

        }
    }

}
