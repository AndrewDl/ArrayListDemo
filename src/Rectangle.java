/**
 * Created by Andrew on 07/19/16.
 */
public class Rectangle {
    double length;
    double width;

    double Square (){
        double S = 0;
        S = length * width;
        return S;
    }

    double Perimeter (){
        double P = 0;
        P = (length + width) * 2;
        return P;
    }
}
