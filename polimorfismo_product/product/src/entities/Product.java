package entities;

// Classe mais genérica
public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        // Verifica se o preço do produto não é negativo, pois isso seria inválido
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = (price > 0.0) ? price : 0.0;
    }

    public Double getPrice() {
        return price;
    }

    // Retorna a etiqueta do produto
    public String priceTag() {
        return getName() + " $ " + String.format("%.2f", getPrice());
    }
}
