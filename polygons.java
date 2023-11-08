package calculadora_areas;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		//variables y constantes
		
		int option, aoption, boption, coption, doption, bside, cside, barea, carea, darea, bperimeter, cperimeter, dperimeter, cdivision, dheight, dbase, eoption;
		double aradio, aarea, aperimeter;
		Scanner keyboard = new Scanner(System.in);
		
		do { /** al igual que este bucle, se han utilizado varios a lo largo del código para que el usuario 1. No tenga que reiniciar el programa si quiere calcular algo más y 
		2.Por si se equivoca no hay que volver a preguntar los datos.**/  
		do {
		System.out.println("Bienvenido a la calculadora de áreas y perímetros.\nElija una de los siguientes polígonos, por favor:\n"
				+ "Opción 1: Círculo.\nOpción 2: Cuadrado.\nOpción 3: Triángulo.\nOpción 4: Rectángulo.");
		option = keyboard.nextInt();
		}while (option!=1 && option!=2 && option!=3 && option!=4);
		switch	(option) {
		
			case 1:
				// Aqui se preguntan los datos tanto del círculo como de su posterior cálculo.
				System.out.println("Has escogido el círculo, ¿Cuál es su radio?");
				aradio = keyboard.nextDouble();
				do {
				System.out.println("¿Qué quieres calcular?:\n1) Área.\n2) Perímetro\n3) Ambas.");
				aoption = keyboard.nextInt();
				}while (aoption!=1 && aoption!=2 && aoption!=3);
						/**no puedo introducir las operaciones de este programa en el apartado operaciones ya que intento
						 * utilizar las variables solamente si es necesario y necesitaría preguntar "aradio", fuera del 
						 * Switch.**/
				aarea = Math.PI*Math.pow(aradio, 2);
				aperimeter = 2*Math.PI*aradio;
					// Utilizamos un switch anidado al otro switch con el fin de reducir el código.
				switch (aoption) {
						
					case 1:
						System.out.println("El área del círculo es de: "+aarea);
						break;
								
					case 2:
						System.out.println("El perímetro del círculo es de: "+aperimeter);
						break;
								
					case 3:
						System.out.println("El área del círculo es de: "+aarea+" \ny el perímetro es de "+aperimeter);
						break;
				
					default:
						System.out.println("Respuesta incorrecta");
						break;
					}	
				break;
					
			case 2:
				System.out.println("Has escogido el cuadrado, ¿Cuál es su lado?");
				bside = keyboard.nextInt();
				do {
				System.out.println("¿Qué quieres calcular?:\n1) Área.\n2) Perímetro\n3) Ambas.");
				boption = keyboard.nextInt();
				}while (boption!=1 && boption!=2 && boption!=3);
				barea =bside*bside;
				bperimeter=bside*4;
				switch (boption) {
					case 1:
						System.out.println("El área del cuadrado es de: "+barea);
						break;
							
					case 2:
						System.out.println("El perímetro del cuadrado es de: "+bperimeter);
						break;
							
					case 3:
						System.out.println("El área del cuadrado es de: "+barea+" \ny el perímetro es de "+bperimeter);
						break;
			
					default:
						System.out.println("Respuesta incorrecta");
						break;
						}	
				break;
					
				
			case 3:
				System.out.println("Has escogido el triángulo, ¿Cuál es su lado?");
				cside = keyboard.nextInt();
				do {
				System.out.println("¿Qué quieres calcular?:\n1) Área.\n2) Perímetro\n3) Ambas.");
				coption = keyboard.nextInt();
				}while (coption!=1 && coption!=2 && coption!=3);
				//ya que damos por hecho que es equilatero, hayamos el resultado multiplicando el lado *3
				cperimeter=cside*3;
				cdivision=cperimeter/2;
				carea=(cdivision*(3*(cdivision-cside)));
				switch (coption) {
					case 1:
						System.out.println("El área del triángulo es de: "+carea);
						break;
					case 2:
						System.out.println("El perímetro del triángulo es de: "+cperimeter);
						break;
					case 3:
						System.out.println("El área del triángulo es de: "+carea+" \ny el perímetro es de "+cperimeter);
						break;
						default:
							System.out.println("Respuesta incorrecta");
							break;
						}	
				break;
				
				
			case 4:
				System.out.println("Has escogido el rectángulo, ¿Cuál es su lado base?");
				dbase = keyboard.nextInt();
				System.out.println("Has escogido el rectángulo, ¿Cuál es su lado altura?");
				dheight = keyboard.nextInt();
				do {
				System.out.println("¿Qué quieres calcular?:\n1) Área.\n2) Perímetro\n3) Ambas.");
				doption = keyboard.nextInt();
				}while (doption!=1 && doption!=2 && doption!=3);
				dperimeter=2*(dbase+dheight);
				darea=dbase*dheight;
				switch (doption) {
					case 1:
						System.out.println("El área del triángulo es de: "+darea);
						break;
					case 2:
						System.out.println("El perímetro del triángulo es de: "+dperimeter);
						break;
					case 3:
						System.out.println("El área del triángulo es de: "+darea+" \ny el perímetro es de "+dperimeter);
						break;
						default:
							System.out.println("Respuesta incorrecta");
							break;
						}	
				break;
			
			default:
				System.out.println("Respuesta incorrecta");
				break;
		}
			do {
		System.out.println("\n\n¿Quieres calcular algo más?\n1. Sí.\n2. No.");
		eoption = keyboard.nextInt();
			}while (eoption!=1);
		}while (eoption==1);
}
		
		
}


