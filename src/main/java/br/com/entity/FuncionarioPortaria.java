package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCD_FUNCIONARIO_PORTARIA")
@SequenceGenerator(name = "funcionario_portaria", sequenceName = "SQ_TB_FUNCIONARIO_PORTARIA", allocationSize = 1)
public class FuncionarioPortaria {

    public FuncionarioPortaria() {
    }

    public FuncionarioPortaria(String name, LocalDate birth, Integer cpf, Integer rg, Integer digitoRg, LocalDate dateCreted) {
        this.name = name;
        this.birth = birth;
        this.cpf = cpf;
        this.rg = rg;
        this.digitoRg = digitoRg;
        this.dateCreted = dateCreted;
    }

    @Id
    @Column(name = "id_funcionario_portaria")
    @GeneratedValue(generator = "funcionario_portaria", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_funcionario", length = 100, nullable = false)
    private String name;

    @Column(name = "dt_nasc", nullable = false)
    private LocalDate birth;

    @Column(name = "nr_cpf", length = 12, nullable = false)
    private Integer cpf;

    @Column(name = "nr_rg", length = 11, nullable = false)
    private Integer rg;

    @Column(name = "nm_digito_rg", length = 1)
    private Integer digitoRg;

    @Column(name = "dt_cadastro", nullable = false)
    private LocalDate dateCreted;

}