package Arrays;

public class Runner {
    public static void main(String[] args) {
        String[] cars = {"Ferrari", "Lamborghini", "Toyota", "BMW"};

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        for ( String i : cars){
            System.out.println(i);
        }

        StringBuilder sb = new StringBuilder();

        for (String car: cars){
            sb.append(car + " ");
        }
        System.out.println(sb);
    }
}
