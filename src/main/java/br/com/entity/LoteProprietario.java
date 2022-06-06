package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_LOTE_PROPRIETARIO")
@SequenceGenerator(name = "lote_proprietario", sequenceName = "SQ_TB_LOTE_PROPRIETARIO", allocationSize = 1)
public class LoteProprietario {

    public LoteProprietario() {
    }

    public LoteProprietario(Condominio condominio, Lote lote, Proprietario proprietario, LocalDate dateCreated, LocalDate dateEnded) {
        this.condominio = condominio;
        this.lote = lote;
        this.proprietario = proprietario;
        this.dateCreated = dateCreated;
        this.dateEnded = dateEnded;
    }

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

    @OneToMany(mappedBy = "loteProprietario")
    private List<MovimentacaoPortaria> listMovimentacaoPortaria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(LocalDate dateEnded) {
        this.dateEnded = dateEnded;
    }

    public List<MovimentacaoPortaria> getListMovimentacaoPortaria() {
        return listMovimentacaoPortaria;
    }

    public void setListMovimentacaoPortaria(List<MovimentacaoPortaria> listMovimentacaoPortaria) {
        this.listMovimentacaoPortaria = listMovimentacaoPortaria;
    }
}
