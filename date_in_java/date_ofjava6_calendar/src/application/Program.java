package application;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	
	public static void main(String[] args) {
		
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d01 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("d01 = " + d01.toString());
		
		// Cria uma instância de Calendar
		Calendar cal = Calendar.getInstance();	
		// Define a data para o Calendar usando a data 'd01'
		cal.setTime(d01);
		// Adiciona dez dias à data
		cal.add(Calendar.DAY_OF_MONTH, 10);
		// Atualiza a data 'd' com a nova data alterada
		d01 = cal.getTime();
		
		
		// Obtém o valor dos minutos da data atual
		int minutes = cal.get(Calendar.MINUTE);
		// O mês começa do zero (janeiro é 0), por isso acrescentamos 1
		int month = cal.get(Calendar.MONTH) + 1;

		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d01 minutes = " + minutes);
		System.out.println("d01 motnh = " + month);
		
	}

}
