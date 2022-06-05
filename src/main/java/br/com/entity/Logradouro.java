package br.com.entity;


import javax.persistence.*;

@Entity
@Table(name = "T_GCD_LOGRADOURO")
@SequenceGenerator(name = "logradouro", sequenceName = "SQ_TB_LOGRADOURO", allocationSize = 1)
public class Logradouro {

    @Id
    @Column(name = "id_Logradouro")
    @GeneratedValue(generator = "logradouro", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_tp_logradouro")
    private TipoLogradouro tipoLogradouro;

    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;

    @Column(name = "cd_tp_logradouro", length = 8)
    private Integer codigoTipoLogradouro;

    @Column(name = "ds_logradouro")
    private String description;

    @Column(name = "nr_cep")
    private Integer zipCode;

}
