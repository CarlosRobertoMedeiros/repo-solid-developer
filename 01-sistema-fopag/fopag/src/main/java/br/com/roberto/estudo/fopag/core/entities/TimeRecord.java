package br.com.roberto.estudo.fopag.core.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Tb_TimeRecord")
public class TimeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer timeRecordId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private Timestamp checkin_date;
    private Timestamp checkout_date;

}
