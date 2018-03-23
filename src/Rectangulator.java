public class Rectangulator {

    public static void main(String[] args) {

        int length = Integer.parseInt(args[0]);
        int width  = Integer.parseInt(args[1]);

        Rectangle myRectangle = new Rectangle(length, width);

        StringBuilder sb = new StringBuilder();
        sb.append("*** Your Rectangle ***");
        sb.append("\n\n");
        sb.append("Length:    %d");
        sb.append("\n");
        sb.append("Width:     %d");
        sb.append("\n");
        sb.append("Area:      %d");
        sb.append("\n");
        sb.append("Perimeter: %d");
        sb.append("\n");

        System.out.println(String.format(sb.toString(),
            myRectangle.getLength(),
            myRectangle.getWidth(),
            myRectangle.getArea(),
            myRectangle.getPerimeter()));
    }

}