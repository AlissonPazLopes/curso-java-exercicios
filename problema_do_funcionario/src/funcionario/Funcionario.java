package funcionario;


public class Funcionario {
    public String nome;
    public double tax;
    public double salaryBrute;


    public double calcularSalario(){
        double salario = salaryBrute-tax;
        return salario;
    }
    public double aumentoPercentual(double porcetangem){
        double salario = salaryBrute - tax;
        porcetangem = salario + (salario * (porcetangem/100));
        return porcetangem;
    }

    public String toString(){
        return nome;
    }




}
