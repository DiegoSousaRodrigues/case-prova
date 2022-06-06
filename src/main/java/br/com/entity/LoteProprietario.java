package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCD_LOTE_PROPRIETARIO")
@SequenceGenerator(name = "lote_proprietario", sequenceName = "SQ_TB_LOTE_PROPRIETARIO", allocationSize = 1)
public class LoteProprietario {

    @Id
    @Column(name = "id_lote_proprietario")
    @GeneratedValue(generator = "lote_proprietario", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_condominio", nullable = false)
    private Condominio condominio;

    @ManyToOne
    @JoinColumn(name = "id_lote", nullable = false)
    private Lote lote;

    @ManyToOne
    @JoinColumn(name = "id_proprietario", nullable = false)
    private Proprietario proprietario;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDate dateCreated;

    @Column(name = "dt_termino")
    private LocalDate dateEnded;
}
