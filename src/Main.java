public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.calculate(85.5, 1.83);
        System.out.println(myBmi);
    }
}