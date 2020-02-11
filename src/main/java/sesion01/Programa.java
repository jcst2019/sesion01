package sesion01;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	    //Para capturar los valores de la consola
		Scanner sc= new Scanner(System.in);
		
		Cuenta cuenta ;
		 System.out.println("Ingrese núemro de cuenta");
		 String numeroCuenta =sc.nextLine();
		 //sysou + crtl espacio se obtiene el system.out.print;
		 System.out.println("Ingrese el Titular de la cuenta");
		 String titular= sc.nextLine();
		 System.out.println("Desea generar un deposito inicial(y/n)?");
		 char respuesta= sc.nextLine().charAt(0);
		 if (respuesta=='y') {
			 System.out.println("Ingrese monto inicial");
			 Double montoInicial =sc.nextDouble();
			cuenta = new Cuenta(numeroCuenta,titular,montoInicial);
		}else {
			cuenta = new Cuenta(numeroCuenta,titular);
		}
		 cuenta.setNumeroCuenta(numeroCuenta);
		 System.out.println("Datos de la cuenta:");
		 System.out.println(cuenta);
		 //System.out.println(cuenta.getNumeroCuenta()+" " cuenta.setSaldo(saldo)+" "+cuenta.setTitula););
	}
}
