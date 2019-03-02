package paquete02;

import java.util.Scanner;

public class TestMenuEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner leer =new Scanner(System.in);
		
		
		int opc, acumB=0, acumA=0, eraseA,eraseB, num;
		byte empleadoA = 0, empleadoB=0;
	
		EmpleadoA empA[] = new EmpleadoA[empleadoA];
		EmpleadoB empB[] = new EmpleadoB[empleadoB];

		System.out.println("Defina el tamaño de empleados A");
		empleadoA=leer.nextByte();
		System.out.println("Defina el tamaño de empleados B");
		empleadoB=leer.nextByte();
		

		do {
			System.out.println("");
			System.out.println("Menu Empleados");
			System.out.println("Seleccione una opcion para acceder");
			System.out.println("");
			System.out.println("");
			System.out.println("1.- Agregar Empleado A");					
			System.out.println("2.- Agregar Empleado B");
			System.out.println("3.- Eliminar Empleado A");		
			System.out.println("4.- Eliminar Empleado B");		
			System.out.println("5.- Buscar Empleado A");
			System.out.println("6.- Buscar Empleado B");
			System.out.println("7.- Imprimir todos los Empleados A registrados");
			System.out.println("8.- Imprimir todos los Empleados B registrados");
			System.out.println("9.- Numero de Empleados A");
			System.out.println("10.- Numero de Empleados B");						
			System.out.println("11.- Terminar Programa");
			System.out.println("");
									
									
									
					
					
					
		opc=leer.nextInt();
		
		
		
		switch(opc) {
		
		case 1:
			
			
			if(acumA<empleadoA) {
			System.out.println("Agregar empleado A");
	
		

		empA=new EmpleadoA[empleadoA];
		for(int i=0; i<empleadoA; i++) {
		
			empA[i] = new EmpleadoA();
			System.out.print("Ingrese los datos del empleado "+(i+1));
			System.out.println("");

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
			acumA++;}
		
		}
			else  System.out.println("Registro LLeno");
			System.out.println("");
		
		
		break;
		
		
		case 2: System.out.println("Agregar empleado B");
		if(acumB<empleadoB) {
		empB=new EmpleadoB[empleadoB];
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
			acumB++;}
		}
		else System.out.println("Registro lleno");
		System.out.println("");
		break;
		
		case 3: System.out.println("Eliminar Empleado A");
		
		if(acumA>0) {
			num=0;
			System.out.print("Numero de empleado que deseas eliminar:");
			num = leer.nextInt();
			System.out.println("");
			
			for(int i=0; i<empleadoA; i++) {
				if(num==empA[i].getNum_empleado()) {
					empA[i]=null;
					acumA--;
					System.out.println("El empleado se eliminó exitosamente");
					System.out.println("");
				}
				
			}
			}else 
				System.out.print("No existen empleados para eliminar");


		break;
		
		case 4:
			if(acumB>0) {
				num=0;
				System.out.print("Numero de empleado que deseas eliminar:");
				num = leer.nextInt();
				System.out.println("");
				
				for(int i=0; i<empleadoB; i++) {
					if(num==empB[i].getNum_empleado()) {
						empB[i-1]=null;
						acumB--;
						System.out.println("El empleado se eliminó exitosamente");
						System.out.println("");
					}
					
				}
				}else 
					System.out.print("No existen empleados para eliminar");

			break;
			
		case 5:
			System.out.println("Buscar Empleado A");
		
			if(acumA>0) {
				
		num=0;
		
		System.out.print("Numero de empleado que deseas imprimir:");
		num = leer.nextInt();
		System.out.println("");
		
		for(int i=0; i<empleadoA; i++) {
			if(num==empA[i].getNum_empleado()) {
				System.out.println(empA[i]);
				System.out.println("");
				
			} 
			/*else  { 
					System.out.print("El empleado no existe");
				}*/
				
			
			}
			
		}
		else System.out.print("No existen registros");
			
		break;
		case 6:
			System.out.println("Buscar Empleado B");
			if(empleadoB>0) {
			num=0;
		System.out.print("Numero de empleado que deseas imprimir:");
		num = leer.nextInt();
		System.out.println("");

		for(int i=0; i<empleadoB; i++) {
			if(num==empB[i].getNum_empleado()) {
				System.out.println(empB[i]);
				System.out.println("");
			}
			
		}
		}
			


		break;
		
		case 7:
			System.out.println("Los empleados A registrados son:");

			for(int i=0; i<empleadoA; i++) {
				System.out.println(empA[i]);
			}
			break;
		case 8: 
			System.out.println("Los empleados B registrados son:");

			for(int i=0; i<empleadoB; i++) {
				System.out.println(empB[i]);
			}
		case 9:
			System.out.println("El numero de empleados A registrados son:");
			System.out.println(acumA);
			break;
		case 10:
			System.out.println("El numero de empleados B registrados son");
			System.out.println(acumB);
			break;
		case 11:System.out.println("El programa finalizó correctamente.");
			break;
			default: System.out.println("Ingrese un valor valido.");
		
		}
		
		
		
		}while(opc!=11);
}
}
