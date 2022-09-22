public class TestArray {
    public static void main(String[] args) {
        double sum = 0;
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (int i : numbers) {
            sum += i;
        }
        for (int i = 0; i < 10 ; i+=3) {
            System.out.println(i);
        }
        System.out.println("Sum total = " + sum);
        System.out.println("Average = " + (sum / numbers.length));
    }
}
