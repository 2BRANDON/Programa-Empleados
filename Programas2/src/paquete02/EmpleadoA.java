package paquete02;

	public class EmpleadoA extends Empleados {
		private int horas_trabajadas;

		public int getHoras_trabajadas() {
			return horas_trabajadas;
		}

		public void setHoras_trabajadas(int horas_trabajadas) {
			this.horas_trabajadas = horas_trabajadas;
		}

		@Override
		public String toString() {
			return "EmpleadoA [horas_trabajadas=" + horas_trabajadas + ", getNombre()=" + getNombre() + ", getEdad()="
					+ getEdad() + "]";
		}
		
		
		
		

	}


