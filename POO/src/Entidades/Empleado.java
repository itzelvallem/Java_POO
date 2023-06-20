package Entidades;

//Dar la instruccion de que quiero heredar
public class Empleado extends Persona {

	//1. Atributos o propiedas
	public String numEpleado;
	public String nss;
	public String puesto;
	public Empleado(String nombre, int edad, String correo, String telefono, String numEpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);
		this.numEpleado = numEpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//2. Constructos con parametros 
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String puesto)}
super(nombre, edad, correo, telefono));
this.numEmpleado = numEmpleado;
this.nss = nss;
this.puesto = puesto; 
	
	
	
	//3. Metodo para imprimirInformacion empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero Empleado: " + numEmpleado);
        System.out.println("Numero Seguro Social: " + nss);
        System.out.println("Puesto: " + puesto);
    }//cierre mostrarInformacin
	
	
	//4. toString
    //toString es un metodo en Java que proviene de la clase Objeto (el antecesor o precursos de todos los objetos que existen en Java). Este metodo ya se escribio, ya esta definido y nos permite mostrar la informacion del objeto en una cadena de texto.
    
    @Override
    public String toString() {
    	return "Empleado 
    
}

}