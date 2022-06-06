package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_LOTE")
@SequenceGenerator(name = "lote", sequenceName = "SQ_TB_LOTE", allocationSize = 1)
public class Lote {

    @ManyToOne
    @JoinColumn(name = "id_condominio")
    private Condominio condominio;

    @Id
    @Column(name = "id_lote")
    @GeneratedValue(generator = "lote", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDate dateCreated;

    @Column(name = "nr_lote", length = 6)
    private Integer numeroLote;

    @Column(name = "nr_quadra", length = 6)
    private Integer numeroQuadra;

    @Column(name = "ds_logradouro_condominio", length = 70)
    private String descricao;

    @Column(name = "nr_residencia", length = 15)
    private String residencia;

    @Column(name = "st_lote", length = 25)
    private String status;

    @OneToMany(mappedBy = "lote")
    List<LoteProprietario> listLoteProprietario;
}
