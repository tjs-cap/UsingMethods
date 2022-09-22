public class MessingWithMethods {
    public static void main(String[] args) {
        double length = 5;
        double volume = cubeVolume(length);
        System.out.println(volume);
    }

    public static double cubeVolume(double craig){
        return (craig * craig * craig);
    }
}
