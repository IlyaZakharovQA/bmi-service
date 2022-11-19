public class BmiService {
    public double calculate(double bodyMass, double height) {
        double bmi = bodyMass / (height * height);
        return bmi;
    }
}
