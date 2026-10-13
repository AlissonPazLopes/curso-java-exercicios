package com.devsupeiror.worker.config;

import com.devsupeiror.worker.entities.Departament;
import com.devsupeiror.worker.entities.HourContract;
import com.devsupeiror.worker.entities.Worker;
import com.devsupeiror.worker.entities.WorkerLevel;
import com.devsupeiror.worker.repositories.DepartamentRepository;
import com.devsupeiror.worker.repositories.WorkerRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class SeedingConfig  implements CommandLineRunner {

    @Autowired
    private DepartamentRepository departamentRepository;// composição de componentes

    @Autowired
    private WorkerRepository workerRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        Departament dept = new Departament("Disign");

        dept = departamentRepository.save(dept);

        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, dept);

        worker = workerRepository.save(worker);

        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);
        HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10);

        worker.addContracts(contract1);
        worker.addContracts(contract2);
        worker.addContracts(contract3);

    }

}
