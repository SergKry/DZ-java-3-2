public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        double weight = 98;
        double imt = service.calculate(weight,height);
        System.out.format("%.2f",imt);
    }
}