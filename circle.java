import java.util.Scanner;
//use to increase the decimal places
import java.text.DecimalFormat;

class circle {
    public static void main(String[] args) {
        Scanner maths = new Scanner(System.in);

        System.out.println("Enter radius of the circle : ");
        int radiusCircle = maths.nextInt();

        maths.close();
        System.out.println("Area of The Circle (Befor Formatted) : " + Math.PI * radiusCircle * radiusCircle);


        DecimalFormat number = new DecimalFormat("###.##");
        String formatted = number.format(Math.PI * radiusCircle * radiusCircle);
        System.out.println("Area of The Circle (Formatted): " + formatted);

        System.out.println("Perimeter of the Circle (Befor Formatted): " + 2 * Math.PI * radiusCircle);
        String perimeter = number.format(2 * Math.PI * radiusCircle);

        System.out.println("Perimeter of The Circle (Formatted) : " + perimeter);


    }    

}

// Java program to print the area and perimeter of a circle. Take the radius of the circle from the keyboard.(Hint : Perimeter by 2r and Area by r2. Take the value of  by Math.PISystem.out.println(Math.PI); // will prints 3.141592653… )