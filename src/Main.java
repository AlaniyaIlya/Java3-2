public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        double weight = 80;
        double growth = 1.70;


        double bodyIndex = service.calculate(growth, weight);
        System.out.println("Норма: " + bodyIndex);
    }
}