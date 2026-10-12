package app;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.io.IOError;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main(){

        Locale.setDefault(Locale.US);

        Departament dept = new Departament("Disign");

        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, dept);
        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);
        HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10)

        worker.addContracts(contract1);
        worker.addContracts(contract2);
        worker.addContracts(contract3);


        IO.println("Nome: " + worker.getName());
        IO.println("Departamento: " + worker.getDepartament().getName());
        IO.println("Ganho para 08/2018: " + String.format("%.2f", worker.income(2018, 8)));


    }
}
