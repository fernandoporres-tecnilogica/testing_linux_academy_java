public class Rectangulator {

    public static void main (String[] args) {

        int length = Integer.parseInt(arg[0]);
        int width  = Integer.parseInt(arg[1]);

        Rectangle myRectangle = new Rectangle(int length, int width);

        String output = String.format("*** Your Rectangle ***\n
            \n
            Length:    %d\n
            Width:     %d\n
            Area:      %d\n
            Perimeter: %d\n",
            myRectangle.getLength(),
            myRectangle.getWidth(),
            myRectangle.getArea(),
            myRectangle.getPerimeter();

        System.out.println(output);
    }

}