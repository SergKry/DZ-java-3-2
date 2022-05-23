public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8; // добавление переменной роста
        double weight = 98; // добавление переменной веса
        double bodyMassIndex = service.calculate(weight, height);
        System.out.format("%.2f", bodyMassIndex); // вывод ответа с округлением до 2-х знаков после запятой
    }
}