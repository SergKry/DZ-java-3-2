public class BmiService {
    public double calculate(double a, double b) {
        double imt = a / (b * b);
        return imt;
    }
}
