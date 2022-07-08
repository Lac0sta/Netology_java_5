public class Main {

    public static void main(String[] args) {

        BmService service = new BmService();
        int weight = 80; /* масса тела в килограммах*/
        double height = 1.82; /* рост в метрах*/
        double index = service.calculate(height, weight);

        String result = String.format("%.3f", index);
        System.out.print(result);

    }


}
