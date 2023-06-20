package Entidades;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancia de un empleado (que hereda de persona)
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@mail.com", "5511223344", null, null, null);
EvilFelipe.mostrarInformacion();
		
		

Persona Naruto = new Persona("Naruto", 30, "naruto@gmail.com", "5533444555");
				
				Naruto.mostrarInformacion();
				
				
				System.out.println("Impresion de Objetos");
				System.out.println(EvilFelipe);
				
				
				System.out.println(Naruto.toString());
				
	}

}
