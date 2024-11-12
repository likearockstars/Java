package entities;


import entities.interfaces.Payable;

public class Invoice implements Payable {
	
	private String partNumber;
	private String partDescription;
	private Integer quantity;
	private Double pricePerItem;
	
	// Construtor default
	public Invoice() {
	}
	
	// Construtor com quatro argumentos
	public Invoice(String partNumber, String partDescription, Integer quantity,Double pricePerItem) {
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
	}
	
	// Configura o número de peçãs
	public void setPartNumber(String partNumber) {
		
		this.partNumber = partNumber;
	}
	
	// Obtem o número de peçãs
	public String getPartNumber() {
		
		return partNumber;
	}
	
	// Configura a descrição
	public void setPartDescription(String partDescription) {
		
		this.partDescription = partDescription;
	}
	
	// Obtém a descrição
	public String getPartDescription() {
		
		return partDescription;
	}
	
	// Configura a quantidade
	public void setQuantity(Integer quantity) {
		
		this.quantity = (quantity < 0) ? 0 : quantity;
	}
	
	// Obtém a quantidade
	public Integer getQuantity() {
		
		return quantity;
	}
	
	// Configura o o preço
	public void setPricePerItem(Double pricePerItem) {
		
		this.pricePerItem = (pricePerItem < 0.0) ? 0.0 : pricePerItem;
	}
	
	// Obtém o preço
	public Double getPricePerItem() {
		
		return pricePerItem;
	}
	
	// Retorno da representação de String do objeto Invoice
	@Override
	public String toString() {
		
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f","invoice","part number",getPartNumber(),
		getPartDescription(),"quantity",getQuantity(),"price per item",getPricePerItem());
		
				
	}
	
	// Método requerido para executar o contrato com a interface Payable
	@Override
	public double getPaymentAmount() {
		
		return getQuantity() * getPaymentAmount();
	}
}
