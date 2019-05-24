package LABORATORIOG21;

import java.util.Scanner;

public class TAREA1Y2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese una palabra a encriptar: ");
		String palabra=teclado.nextLine();
		
		//vamos a convertir la palabra a un array
		char douglas[]=palabra.toCharArray();
		
		//asignamos por cada indice una palabra distinta para el encriptado
		for(int i=0; i<douglas.length;i++) {
			douglas[i]=(char)((douglas[i]+(char)3));
}
		//asignamos y convertimos el array douglas a un string encriptado
		String encriptado=String.copyValueOf(douglas);
		System.out.println("la palabra encriptada es: ");
		System.out.println(encriptado);	
	
		//desencriptado a la palabra encriptada, con el proceso inverso
		
		
		//convertimos la palabra encriptado a un vector douglaspm 
		char douglaspm[]=encriptado.toCharArray();
		
		//devolvemos la palabra encriptada al valor inicial con el proceso inverso
		for(int i=0; i<douglaspm.length;i++) {
			douglaspm[i]=(char) ((douglaspm[i]-(char)3));
	}
	
		//asignamos y convertimos el array douglaspm a un string desencriptado
		String desencriptado=String.copyValueOf(douglaspm);
		System.out.println("la palabra desencriptada es: ");
		System.out.println(desencriptado);

	}

}
