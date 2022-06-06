package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_LOTE")
@SequenceGenerator(name = "lote", sequenceName = "SQ_TB_LOTE", allocationSize = 1)
public class Lote {

    public Lote() {
    }

    public Lote(Condominio condominio, LocalDate dateCreated, Integer numeroLote, Integer numeroQuadra, String descricao, String residencia, String status) {
        this.condominio = condominio;
        this.dateCreated = dateCreated;
        this.numeroLote = numeroLote;
        this.numeroQuadra = numeroQuadra;
        this.descricao = descricao;
        this.residencia = residencia;
        this.status = status;
    }

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
    private List<LoteProprietario> listLoteProprietario;

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(Integer numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Integer getNumeroQuadra() {
        return numeroQuadra;
    }

    public void setNumeroQuadra(Integer numeroQuadra) {
        this.numeroQuadra = numeroQuadra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LoteProprietario> getListLoteProprietario() {
        return listLoteProprietario;
    }

    public void setListLoteProprietario(List<LoteProprietario> listLoteProprietario) {
        this.listLoteProprietario = listLoteProprietario;
    }
}
