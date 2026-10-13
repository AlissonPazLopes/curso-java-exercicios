package com.devsupeiror.worker.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_hour_contract")
public class HourContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;



    public HourContract(){

    }


    public HourContract(LocalDate date, Double valuePerHour, Integer hours){

        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public double totalvalue(){
        return hours * valuePerHour;
    }


    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
