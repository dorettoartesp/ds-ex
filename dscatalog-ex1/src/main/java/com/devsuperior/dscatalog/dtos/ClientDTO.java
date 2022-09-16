package com.devsuperior.dscatalog.dtos;

import java.io.Serializable;
import java.time.Instant;

import org.apache.commons.lang3.builder.EqualsBuilder;

import com.devsuperior.dscatalog.entities.Client;

public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String cpf;

    private Double income;

    private Instant birthDate;

    private Integer children;

    public ClientDTO(){
    }

    public ClientDTO(Long id, String name, String cpf, Double income, Instant birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        this(
            client.getId(), 
            client.getName(), 
            client.getCpf(), 
            client.getIncome(), 
            client.getBirthDate(), 
            client.getChildren());
    }

    public static final class Builder {

        private Long id = null;
        private String name;
        private String cpf;
        private Double income;
        private Instant birthDate;
        private Integer children;
        
        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCPF(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder withIncome(Double income) {
            this.income = income;
            return this;
        }

        public Builder withBirthDate(Instant birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder withchildren(Integer children) {
            this.children = children;
            return this;
        }

        public ClientDTO build() {
            return new ClientDTO(id, name, cpf, income, birthDate, children);
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "ClientDTO [birthDate=" + birthDate + ", children=" + children + ", cpf=" + cpf + ", id=" + id
                + ", income=" + income + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
    
}
