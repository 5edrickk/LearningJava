import java.util.Scanner;

public class ConversionDegrees {
    private String type;
    private Double degrees;

    private Double convertToFahrenheit(Double degrees){
        return degrees * 9.0 / 5.0 + 32;
    }

    private Double convertToCelsius(Double degrees){
        return ((degrees - 32) / (9.0 / 5.0));
    }


    public ConversionDegrees(String type, Double degrees){
        this.type = type;
        this.degrees = degrees;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in); // To read user input
        boolean invalidResponse;
        Double degrees = null;
        String degreeType = null;

        do {
            invalidResponse = false;

            System.out.println("Enter a value of type Double:");
            degrees = userInput.nextDouble();
            userInput.nextLine();

            System.out.println("Enter the degree type (Celsius or Fahrenheit):");
            degreeType = userInput.nextLine();

            if(degrees < 0 || !(degreeType.equals("Celsius") || degreeType.equals("Fahrenheit"))){
                invalidResponse = true;
                System.out.println("Invalid response, please insert correct values");
            }

        }while(invalidResponse);

        ConversionDegrees conversion = new ConversionDegrees(degreeType, degrees);
        System.out.println("Degrees : " + conversion.degrees + " Type : " + conversion.type);

        if (conversion.type.equals("Celsius")){
            System.out.println("The value " + conversion.degrees + "°C in Fahrenheit is: " + conversion.convertToFahrenheit(conversion.degrees));
        }
        else{
            System.out.println("The value " + conversion.degrees + "°F in Celsius is: " + conversion.convertToCelsius(conversion.degrees));
        }

    }
}
