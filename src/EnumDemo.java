/**
 * Created by green on 19.02.2015.
 *
 * Реализация перечислений
 *
 */
public class EnumDemo
{
    public enum Color
    {
        RED, GREEN, BLUE;

    }

     static class ColorRect
    {
        private int w;
        private int h;
        Color color;

        public ColorRect(int w, int h, Color color) {
            this.w = w;
            this.h = h;
            this.color = color;
        }
    }

    static class App
    {
        public static void main(String[] args)
        {
            new ColorRect(10, 20, Color.GREEN);

        }
    }

}
