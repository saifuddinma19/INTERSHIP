public class Rectangle {
 
   public static void main(String[] strings) {

        final double width = 5.6;
        final double length = 8.5;

        double perimeter = 2*(length + width);
		
        double area = width * length;			
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", length, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, length, area);
    }
}
