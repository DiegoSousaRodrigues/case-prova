package br.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_GCD_CIDADE")
@SequenceGenerator(name = "cidade", sequenceName = "SQ_TB_CIDADE", allocationSize = 1)
public class Cidade {

    public Cidade() {

    }

    @Id
    @Column(name = "id_tp_logradouro")
    @GeneratedValue(generator = "estado", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

}
