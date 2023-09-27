package work03;

public class MyUtil {
    public static double calculateBMI(double weight, double height){
        return weight / ((height/100) * (height/100));
    }
    //parameter = weight-kg height-cm

    public static double average(int v1, int v2, int v3){
        return  (double) (v1 + v2 + v3) / 3;
    }
}
