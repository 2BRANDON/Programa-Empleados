package paquete02;

import java.util.Scanner;

public class TestEmpleadoA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer =new Scanner(System.in);
		
		
				
				byte empleadoA = 2;
				byte empleadoB = 2;
				System.out.println("Empleados A");
				EmpleadoA empA[] = new EmpleadoA[empleadoA];
				
				for(int i=0; i<empleadoA; i++) {
					empA[i] = new EmpleadoA();
					System.out.println("ingresa el numero de empleado:");
					empA[i].setNum_empleado(leer.nextInt());
					System.out.println("ingresa el nombre de empleado:");
					empA[i].setNombre(leer.next());
					System.out.println("ingresa la edad de empleado:");
					empA[i].setEdad(leer.nextByte());
					System.out.println("ingresa el sueldo de empleado:");
					empA[i].setSueldo(leer.nextDouble());
					System.out.println("ingresa las horas trabajadas:");
					empA[i].setHoras_trabajadas(leer.nextInt());
				}
				
				int num=0;
				System.out.print("numero de empleado que deseas imprimir:");
				num = leer.nextInt();
				for(int i=0; i<empleadoA; i++) {
					if(num==empA[i].getNum_empleado()) {
						System.out.println(empA[i]);
					}
					
				}
				
				System.out.println("Empleados B");
				EmpleadoB empB[] = new EmpleadoB[empleadoB];
				
				for(int i=0; i<empleadoB; i++) {
					empB[i] = new EmpleadoB();
					System.out.println("ingresa el numero de empleado:");
					empB[i].setNum_empleado(leer.nextInt());
					System.out.println("ingresa el nombre de empleado:");
					empB[i].setNombre(leer.next());
					System.out.println("ingresa la edad de empleado:");
					empB[i].setEdad(leer.nextByte());
					System.out.println("ingresa el sueldo de empleado:");
					empB[i].setSueldo(leer.nextDouble());
					System.out.println("ingresa el monto vendido:");
					empB[i].setMonto_vendido(leer.nextInt());
				}
				num=0;
				System.out.print("numero de empleado que deseas imprimir:");
				num = leer.nextInt();
				for(int i=0; i<empleadoB; i++) {
					if(num==empB[i].getNum_empleado()) {
						System.out.println(empB[i]);
					}
					
				}
			

			}

		}

		



