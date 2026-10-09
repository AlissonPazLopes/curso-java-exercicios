package funcionarios;

public class Funcionario {
    private int id;
    private String name;
    private double salary;


    public Funcionario(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }


    public void setName(String name) {
        this.name = name;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }


    public double aumentoSalarial(double aumento){
        this.salary =( salary * aumento) / 100;
        return salary;
    }


}








/*package funcionarios;

public class Funcionario {
    private int id;
    private String name;
    private double salary;

    public Funcionario(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    // Regra de negócio encapsulada no próprio objeto
    public void aumentoSalarial(double porcentagem) {
        this.salary += (this.salary * porcentagem) / 100.0;
    }

    // Facilita o print das informações do funcionário
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}*/
