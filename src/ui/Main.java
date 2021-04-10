package ui;

import java.time.LocalDate;
import java.util.Scanner;

import exceptions.NotTodayException;
import exceptions.TIException;
import model.Market;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int day;
		 int id;
		 String type = null;
		 int countClients = 0;
		 int option;
		 
		 Market market = new Market();
		 
		 System.out.println("Bienvenido al mini mercado Mi Barrio Te Quiere");
		 
		 day = LocalDate.now().getDayOfMonth();
			 
			do {
				
				System.out.println("¡Bienvenido al menu principal! \n"+
						"(0) Salir \n"+
						"(1) Ingresar nuevo cliente. \n"+
						"(2) Mostrar cantidad de clientes ingresados. \n");
				 option = sc.nextInt();
				 
				 switch(option){
				 	
				 	case 0: 
				 		
				 		System.out.println("Saliendo de la aplicación..."); 		
				 		
				 	break;
				 	
				 	case 1:
				 		
				 		System.out.println("Ingresa el tipo de documento: \n"+
				 		"(1) TI - Tarjeta de identidad. \n"+
				 		"(2) CC - Cédula de Ciudadanía. \n"+
				 		"(3) PP - Pasaporte. \n"+
				 		"(4) CE - Cédula de Extranjería. \n");
				 		
				 		int option1 = sc.nextInt();
				 		
				 		switch(option1) {
				 		case 1:
				 			type = "TI";
				 		break;
				 		case 2:
				 			type = "CC";
				 		break;
				 		case 3:
				 			type = "PP";
				 		break;
				 		case 4:
				 			type = "CE";
				 		break;
				 		}
				 		
				 		System.out.println("Ahora, ingrese el número del documento: \n");
				 		
				 		id = sc.nextInt();
				 		
				 		countClients = countClients+1;
				 		try {
				 		market.addDocument(type, id, day);
				 		}catch(TIException ti) {
							 System.out.println("Los menores de edad no pueden ingresar al mini mercado");
						      System.out.println("El documento denegado es "+ti.getTypeDenied());
						      ti.printStackTrace();
						 }catch(NotTodayException notToday) {
							 System.out.println("Los días pares entran quienes tengan el penúltimo digito del documento impar, y viceversa:");
						      System.out.println("El día de hoy es "+notToday.getDay()+" y el penúltimo número del documento es "+notToday.getCurrentId());
						      notToday.printStackTrace();
						 }
				 	break;
				 	
				 	case 2: 
				 		
				 		System.out.println("La cantidad de clientes que han querido ingresar al mimi mercado son: "+countClients);
				 		
				 	break;
				 }
			 }while(option!=0);
			 
			 sc.close();
		 }
		 
	}


