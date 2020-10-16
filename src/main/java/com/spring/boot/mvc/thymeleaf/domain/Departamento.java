package com.spring.boot.mvc.thymeleaf.domain;

import javax.persistence.*;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class Departamento {

    private String nome;

    @OneToMany(mappedBy = "departamento")
    private List<Cargo> cargos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
}
