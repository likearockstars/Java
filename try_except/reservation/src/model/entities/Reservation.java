package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	// Atributos
	private Integer numberRoom;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	// Instanciando o DateTimeFormatter com o formato brasileiro
	// Além disso, será private e statico para ser o mesmo para todos os objetos
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	// Construtor sem argumentos
	public Reservation() {
	}
	
	// Construtor com argumentos
	public Reservation(Integer numberRoom, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		
		// Verifica se a data de check-in é posterior à data de check-out (erro de sequência de datas)
		if (checkIn.isAfter(checkOut)) {
				// Exceção para argumentos inválido
				throw new DomainException("Reservation dates for update must be future");
		}
		
		
		this.numberRoom = numberRoom;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	// Configura o number room
	public void setNumberRoom(Integer numberRoom) {
		
		this.numberRoom = numberRoom;
		
	}
	
	// Obtém o number room
	public Integer getNumberRoom() {
		
		return numberRoom;
	}
	
	// Obtém a data de check in
	public LocalDate getCheckIn() {
		
		return checkIn;
	}
	
	// Obtém a data de check out
	public LocalDate getCheckOut() {
		
		return checkOut;
	}
	
	// Calcula a duração entre a data de chegada e a data de saída
	
	public int duration() {
		
		// Calcula a diferença de dias entre as duas data
		int reservedDays = (int) ChronoUnit.DAYS.between(checkIn,checkOut);
		
		return reservedDays;
	}
	
	// Atualiza as datas de check-in e check-out.
	// Usamos o throws porque não estamos tratando a exceção, e sim propagando-a, deixando que a aplicação principal
	// seja responsável por resolvê-la.

	public void updateDate(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		
		// Cria uma instância com a data atual
		LocalDate now = LocalDate.now();
		
		// Verifica se as datas informadas são do passado (erro de data)
		if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
			// Exceção personalizada
			throw new DomainException("Reservation dates for update must be future");
		}
		
		// Verifica se a data de check-in é posterior à data de check-out (erro de sequência de datas)
		if (checkIn.isAfter(checkOut)) {
			// Exceção personalizada
			throw new DomainException("Reservation dates for update must be future");
		}
		
		// Atualiza as datas de check-in e check-out com os valores fornecidos
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	
	// Imprime a instância (Reservation) em formato de string
	@Override
	public String toString() {
		
		return "Room " + getNumberRoom() 
		+ ", check-in: " + dtf.format(checkIn) +
		", check-out: " + dtf.format(checkOut) +
		", " + duration() + " nights";
		
	}

}
