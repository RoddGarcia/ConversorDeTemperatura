package conversaoTemperatura;
import java.util.Scanner;

public class converterFC {
	double celsius, fahrenheit, kelvin; 
	public static void main(String[] args) {
		Scanner medida = new Scanner(System.in);
		System.out.println("Escolha a medida da temperatura a ser transformada \n"
				+ "1) Celsius\n"
				+ "2) Fahrenheit\n"
				+ "3) Kelvin");
		int userMedida = medida.nextInt();
		System.out.print("Qual o valor da temperatura: ");
		double userTemperatura = medida.nextDouble();
		System.out.println("");
		
		switch (userMedida) {
			case 1:
				System.out.printf("Celsius: %.2f °C \n", userTemperatura);
				System.out.printf("Fahrenheit: %.2f °F \n", ( (1.8*userTemperatura)+32) );
				System.out.printf("Kelvin: %.2f °K \n", ( userTemperatura +273) );
			case 2:
				System.out.printf("Celsius: %.2f °C \n", ( (userTemperatura - 32) / 1.8) );
				System.out.printf("Fahrenheit: %.2f °F \n", userTemperatura);
				System.out.printf("Kelvin: %.2f °K \n", ( ( (userTemperatura - 32) * (5/9) ) + 273 ) );
			case 3:
				System.out.printf("Celsius: %.2f °C \n", ( userTemperatura - 273 ) );
				System.out.printf("Fahrenheit: %.2f °F \n", ( (userTemperatura - 273) * 1.8 + 32 ));
				System.out.printf("Kelvin: %.2f °K \n", userTemperatura);
		}
		
		medida.close();
		
	}
}
