/*
 * Notas para trabajar con POO en JAVA
 * 
 * Establecemos los pasos para trabajar con nuestras clases, definiendo el siguiente orden:
 * 
 *  - Primero nuestras propiedades o atributos usando variables de JAVA
 *  
 *  - Definimos un constructor con parametros (este constructor se define en la clase). Tambien tenemos un constructor llamado "constructor por defecto", que se define en la instancia de la clase. El inconveniente que tenemos es que solo podemos usar uno de los dos.
 *  
 *  - Por ultimo, definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones vacias, funciones que retornar un tipo de valor).
 *  
 *  
 *  
 *  Notas adicionales
 *  
 *  Sobrecarga de metodos.
 *  
 *  La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (Persona) e ir variando sus parametros. Con esto evitamos usar "Persona1", "Persona2", etc. para utilizar el mismo metodo.
 *  
 *  Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.  
 *  
 * 
 * Herencia en la POO
 * Nos permite heredar atributos y metodos con la finalidad de reutilizar codigo y generar una relacion entre clases superiores (padres) y las subclases (hijos).
 * 
 * Superclase (clase superior) es la clase de quien vamos a heredar (persona)
 * subclase (clase hijo) es donde vamos a poner lo que heredamos (empleado)
 * 
 * 
 *Para heredar, usamos una palabra reservada llamada extends. Esta palabra se coloca al lado del nombre de mi clase (Empleado), y despues definimos el lugar de donde nos vamos a traer las cosas que queremos heredar (Persona).ΩΩ
 * 
 */


package entidades;

//Primero tengo que dar la instruccion de que quiero heredar
public class Empleado extends Persona{

    //1. Atributos o propiedades
    public String numEmpleado;
    public String nss;
    public String puesto;
    
    
    //2. Constructores (toma los parametros de la clase super, y los parametros de la subclase
    public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss, String puesto) {
        super(nombre, edad, correo, telefono); //con la palabra super, evitamos repetir los .this
        this.numEmpleado = numEmpleado; //solo defino los .this que me hacen falta
        this.nss = nss;
        this.puesto = puesto;
    }


    //Herencia de constructor sobrecargado
    public Empleado(String nombre, String correo, String telefono, String numEmpleado, String nss, String puesto) {
        super(nombre, correo, telefono);
        this.numEmpleado = numEmpleado;
        this.nss = nss;
        this.puesto = puesto;
    }
    
    
    //3. Metodos
        public void mostrarInformacion() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Correo: " + correo);
            System.out.println("Telefono: " + telefono);
            System.out.println("Numero Empleado: " + numEmpleado);
            System.out.println("Numero de Seguridad Social: " + nss);
            System.out.println("Puesto: " + puesto);
        }//cierre mostrarInformacin


        
    
    
    
    //4. toString
        //toString es un metodo en Java que proviene de la clase Objeto (el antecesor o precursor de todos los objetos que existen en Java). Este metodo ya se escribio, ya esta definido y nos permite mostrar la informacion del objeto en una cadena de texto. 
        
        @Override
        public String toString() {
            return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
        }
}