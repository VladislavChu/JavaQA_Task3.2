public class BmiService {
    public double calculate(double weightValue, double heightValue) {
        double result = weightValue / (heightValue * heightValue);
        return result;
    }
}
