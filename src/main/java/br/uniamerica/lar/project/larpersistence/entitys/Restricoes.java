package br.uniamerica.lar.project.larpersistence.entitys;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_restricoes")
public class Restricoes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(targetEntity = Usuario.class, optional = false)
    private Usuario usuario;

    @Column(length = 50)
    private RestricoesType restricao;

    @Embedded
    private Base base = new Base();

    public enum RestricoesType {
        LACTOSE,
        GLUTEN,
        CARNE,
        AÇUCAR,
        OVOS,
        SOJA,
        OUTROS
    }
}