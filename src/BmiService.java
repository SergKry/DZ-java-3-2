public class BmiService {
    public double calculate(double weight, double height) {
        double heightSquared = Math.pow(height, 2); // возведение роста в степень x2
        double formulaBodyMassIndex = weight / heightSquared; // формула Индекса Массы Тела
        return formulaBodyMassIndex; // передача результата формулы
    }
}
