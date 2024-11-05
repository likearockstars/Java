package entities;

// Subclasse da superclasse Employee
public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
        // Utiliza o construtor da superclasse (Employee) sem argumentos
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        // Utiliza o construtor da superclasse (Employee) com argumentos
        super(name, hours, valuePerHour);
        
        // Verifica se o valor pago pelas horas extras é válido
        setAdditionalCharge(additionalCharge);
    }

    public void setAdditionalCharge(Double additionalCharge) {
        // Verifica se o valor passado como argumento é válido antes da atribuição
        this.additionalCharge = (additionalCharge > 0) ? additionalCharge : 0.0;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public Double payment() {
        // Usa o método da superclasse (Employee) e adiciona a especialização das horas extras com acréscimo de 10%
        return super.payment() + additionalCharge * 1.1;
    }
}


