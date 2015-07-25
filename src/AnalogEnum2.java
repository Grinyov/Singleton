/**
 * Created by green on 19.02.2015.
 *
 * Реализация перечислений
 *
 */
public class AnalogEnum2
{
    static class ColorEnum
    {
        public static final ColorEnum RED = new ColorEnum();
        public static final ColorEnum GREEN = new ColorEnum();
        public static final ColorEnum BLUE = new ColorEnum();

        private ColorEnum(){}
    }

     static class ColorRect
    {
        private int w;
        private int h;
        ColorEnum color;

        public ColorRect(int w, int h, ColorEnum color) {
            this.w = w;
            this.h = h;
            this.color = color;
        }
    }

    static class App
    {
        public static void main(String[] args)
        {
            new ColorRect(10, 20, ColorEnum.GREEN);

        }
    }

}
