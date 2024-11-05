package entities;

// Subclasse da classe mais genérica (Product)
public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct() {
        // Utiliza o construtor sem argumentos da superclasse (Product)
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        // Utiliza o construtor com argumentos da superclasse (Product)
        super(name, price);

        // Verifica se a taxa de alfândega é um valor válido
        setCustomFee(customFee);
    }

    public void setCustomFee(Double customFee) {
        this.customFee = (customFee < 0.0) ? 0.0 : customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    // Sobrescreve o método usando o conceito de polimorfismo, permitindo que
    // a subclasse herde o comportamento e o adapte para um propósito específico.
    @Override
    public String priceTag() {
        return super.getName() + " $ " + String.format("%.2f", super.getPrice() + getCustomFee()) +
               " (Custom fee: $ " + String.format("%.2f", getCustomFee()) + ")";
    }
}


