package paquete02;

import java.util.Scanner;

public class TesteEmpleadoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leer =new Scanner(System.in);
		
		
		
		byte empleadoA = 0;
		byte empleadoB = 0;
		int AB, num, salir;

		do {
			
			
		
		System.out.println("Selecione los empleados a registrar");
		System.out.println("1.- EmpleadosA");

		System.out.println("2.- EmpleadosB");
		AB=leer.nextInt();
		if(AB==1) {
			
		System.out.println("¿Cuantos empleados desea ingresar?");
		empleadoA=leer.nextByte();
		
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
	
		 num=0;
		System.out.print("numero de empleado que deseas imprimir:");
		num = leer.nextInt();
		for(int i=0; i<empleadoA; i++) {
			if(num==empA[i].getNum_empleado()) {
				System.out.println(empA[i]);
			}
			
		}
		}
		
		if(AB==2) {
		System.out.println("Empleados B");
		
		System.out.println("¿Cuantos empleados desea ingresar?");
		empleadoB=leer.nextByte();
		
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
		
		System.out.println("¿Si desea salir del programa presione 1?");
		salir=leer.nextByte();
	}while(salir!=1);
		System.out.println("Programa terminado");

	}
		
}