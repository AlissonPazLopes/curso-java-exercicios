package entities.entidades;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();// como no diagrama tem o * e ele representa varios contratos, então são varios
    // começa como lista vazia

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

//    public void setContracts(List<HourContract> contracts) {
//        this.contracts = contracts;
//    } se pararmos para olhar, o nosso set recebe uma lista e essa lista é atruibúida a nossa lista, isso quebra a pois não podemos acessar essas lista para fazer isso porque ja temos o nosso adicionar e remover pelos metodos criados.


    public void addContract(HourContract contract){
        contracts.add(contract); // como o meu contracts é uma lista eu posso adicionar um contrato a mais na lista

    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);// como o contracts é uma lista, eu posso remover o adicionar na lista
    }

    public double income(int year, int mes){
        //quanto ele ganhou vai ser a soma do salario base + os dias trabalhados por quantidade de trabalho em cada contrato e dia
        double salariobase = baseSalary;
        // vamos rodar a lista de contratos e se o contrato bate com o mes e ano, somamos ao salário

        Calendar calendar = Calendar.getInstance(); // aqui eu crio um calendario
        for(HourContract c : contracts ){
            calendar.setTime(c.getDate());
            int c_MES = 1 +  calendar.get(Calendar.MONTH);
            int c_ANO = calendar.get(Calendar.YEAR);// somo o +1 porque para o calendar, sempre começa com 0

            if(year == c_ANO && mes == c_MES){
                salariobase += c.totalValue();
            }
            // esse for acima é a mesma coisa que fazer um for e ir pegando os indices de i
        }
    return salariobase;

    }


}
