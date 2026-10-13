package com.devsupeiror.worker.entities;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;




@Entity
@Table(name = "tb_worker")
public class Worker {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private WorkerLevel level;
    private Double baseSalary;


    @ManyToOne
    @JoinColumn(name = "departament_id")
    private Departament departament;

    @OneToMany(mappedBy = "worker", cascade = CascadeType.ALL, orphanRemoval = true)// 1 trabalhador tem varios contratos
    private List<HourContract> contracts = new ArrayList<>();


    public Worker(){

    }


    public Worker(String name, WorkerLevel level,  Double baseSalary, Departament departament){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addContracts(HourContract contract){
        contracts.add(contract);
        contract.setWorker(this);//aqui ele vai no contrato e faz o contrato apontar para o trabalhador
    }

    public void remove(HourContract contract){
        contracts.remove(contract);
        //para manter a coerencia quando apagamos lá, ele ainda "existe"
        contract.setWorker(null);// agora faz apontar para nulo, assim mantendo a consistência
    }





    public double income(int year, int month){
        //criar tabela date
        //setar as datas mes/ano
        double soma = baseSalary;

        for(HourContract c: contracts){
            if (c.getDate().getYear() == year && c.getDate().getMonthValue() == month){
                soma += c.totalvalue();
            }
        }

        return soma;

    }

}
