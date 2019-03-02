package paquete02;


	public class EmpleadoB extends Empleados {
		private double monto_vendido;

		public double getMonto_vendido() {
			return monto_vendido;
		}

		public void setMonto_vendido(double monto_vendido) {
			this.monto_vendido = monto_vendido;
		}
		
			@Override
			public String toString() {
				return "EmpleadoB [monto_vendido="+ monto_vendido + ", getNombre()=" + getNombre() + ", getEdad()="
			+ getEdad()+"]";
						
			}


}
