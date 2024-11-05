package entities;

// Classe genérica
public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        // Verifica se o valor das horas é válido
        setHours(hours);
        // Verifica se o valor por hora é válido
        setValuePerHour(valuePerHour);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHours(Integer hours) {
        // Verifica se o valor das horas é válido
        this.hours = (hours > 0) ? hours : 0;
    }

    public Integer getHours() {
        return hours;
    }

    public void setValuePerHour(Double valuePerHour) {
        // Verifica se o valor por hora é válido
        this.valuePerHour = (valuePerHour > 0) ? valuePerHour : 0.0;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    // Retorna o pagamento do funcionário
    public Double payment() {
        return hours * valuePerHour;
    }

    // Converte o objeto para String
    @Override
    public String toString() {
        return getName() + " - $ " + String.format("%.2f", payment());
    }
}

