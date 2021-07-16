import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria Cuenta_Secundaria = new CuentaBancaria();
		Cuenta_Secundaria.setSaldo (-1239.7f);
		CuentaBancaria cuenta_personal = new CuentaBancaria();
		cuenta_personal.setBeneficiario ("Carlos Eduardo");
		System.out.println(cuenta_personal.beneficiario);
		System.out.println("Ingresa un monto adepositar");
		Scanner leer = new Scanner(System.in);
		float deposito = leer.nextFloat();
		
		System.out.println("ingresa un monto a retirar");
		float retiro = leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
	
		System.out.println("Tu saldo actual es " + cuenta_personal.consultarSaldo());
		System.out.println(cuenta_personal.beneficiario);
		
		
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		cuenta_papa.beneficiario = "Rodolfo";
		

	}
	
	
	/*
	scaner leer =new scanner(System.im);
	int opcion = 0;
	switch(option) = 0 ;
	
	case 1:
	case 2:
	case 3:
		System
	*/
	
	
}
