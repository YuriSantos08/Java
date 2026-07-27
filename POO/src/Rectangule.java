import java.util.Scanner;

public class Rectangule {

    double width;
    double height;

    double Area () {
        return width * height;
    }
    double Perimeter () {
        return (width *2) + (height*2);
    }

    double Diagonal () {
        return Math.sqrt(width*width+height*height);
    }

}
