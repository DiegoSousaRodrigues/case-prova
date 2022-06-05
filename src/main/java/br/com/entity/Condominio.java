package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_CONDOMINIO")
@SequenceGenerator(name = "condominio", sequenceName = "SQ_TB_CONDOMINIO", allocationSize = 1)
public class Condominio {

    public Condominio() {
    }

    public Condominio(Integer cnpj, Integer socialReason, String nameFantasia, LocalDate dateFundation) {
        this.cnpj = cnpj;
        SocialReason = socialReason;
        this.nameFantasia = nameFantasia;
        this.dateFundation = dateFundation;
    }

    @Id
    @Column(name = "id_condominio")
    @GeneratedValue(generator = "condominio", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nr_cnpj", length = 14, nullable = false)
    private Integer cnpj;

    @Column(name = "ds_razao_social", length = 100, nullable = false)
    private Integer SocialReason;

    @Column(name = "nm_fantasia", length = 100)
    private String nameFantasia;

    @Column(name = "dt_funcacao", nullable = false)
    private LocalDate dateFundation;

    @OneToMany(mappedBy = "condominio")
    private List<CondominioLogradouro> listCondominioLogradouro;



}
