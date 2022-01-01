public class BmiService {
    public double calculate(double weight, double growth) {
        growth = growth / 100;
        double bmi = weight / (growth * growth);
        return bmi;
    }
}
