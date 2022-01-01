public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 78;
        double growth = 183;
        double bmi = service.calculate(weight , growth);
        System.out.printf("Ваш индекс массы тела равен %.1f %n", bmi);
    }
}