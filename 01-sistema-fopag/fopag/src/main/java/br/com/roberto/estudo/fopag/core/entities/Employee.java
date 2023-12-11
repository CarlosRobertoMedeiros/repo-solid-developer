package br.com.roberto.estudo.fopag.core.entities;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.sql.Clob;


@Entity
@Table(name = "Tb_Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employee_id;
    private String name;
    private String role;
    private BigDecimal salary;
    private String wage;
    private Clob type;
}
