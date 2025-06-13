import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble(), height = input.nextDouble();
        double areaInInches = 0.5 * base * height, areaInCm = areaInInches * 6.4516;
        System.out.println("The area of triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
    }
}
