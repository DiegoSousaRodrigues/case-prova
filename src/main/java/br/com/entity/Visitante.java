package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCD_VISITANTE")
@SequenceGenerator(name = "visitante", sequenceName = "SQ_TB_VISITANTE", allocationSize = 1)
public class Visitante {

    @Id
    @Column(name = "id_visitante")
    @GeneratedValue(generator = "visitante", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_visitante", length = 100, nullable = false)
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
