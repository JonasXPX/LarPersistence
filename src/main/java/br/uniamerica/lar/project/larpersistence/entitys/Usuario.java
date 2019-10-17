package br.uniamerica.lar.project.larpersistence.entitys;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column
    private String username;

    @Embedded
    private Base base = new Base();

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}