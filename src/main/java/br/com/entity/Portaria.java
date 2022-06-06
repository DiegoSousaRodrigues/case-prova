package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_PORTARIA")
@SequenceGenerator(name = "portaria", sequenceName = "SQ_TB_PORTARIA", allocationSize = 1)
public class Portaria {

    public Portaria() {
    }

    public Portaria(Condominio condominio, Integer numeroPortaria, String nomePortaria, String status, LocalDate dateCreated, LocalDate dateEnded) {
        this.condominio = condominio;
        this.numeroPortaria = numeroPortaria;
        this.nomePortaria = nomePortaria;
        this.status = status;
        this.dateCreated = dateCreated;
        this.dateEnded = dateEnded;
    }

    @Id
    @Column(name = "id_portaria")
    @GeneratedValue(generator = "portaria", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_condominio")
    private Condominio condominio;

    @Column(name = "nr_portaria", length = 8)
    private Integer numeroPortaria;

    @Column(name = "nm_portaria", length = 90)
    private String nomePortaria;

    @Column(name = "st_status", length = 1, nullable = false)
    private String status;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDate dateCreated;

    @Column(name = "dt_termino")
    private LocalDate dateEnded;

    @OneToMany(mappedBy = "portaria")
    private List<PassagemPortaria> listPassagemPortaria;

    @OneToMany(mappedBy = "portaria")
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

    public Integer getNumeroPortaria() {
        return numeroPortaria;
    }

    public void setNumeroPortaria(Integer numeroPortaria) {
        this.numeroPortaria = numeroPortaria;
    }

    public String getNomePortaria() {
        return nomePortaria;
    }

    public void setNomePortaria(String nomePortaria) {
        this.nomePortaria = nomePortaria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public List<PassagemPortaria> getListPassagemPortaria() {
        return listPassagemPortaria;
    }

    public void setListPassagemPortaria(List<PassagemPortaria> listPassagemPortaria) {
        this.listPassagemPortaria = listPassagemPortaria;
    }

    public List<MovimentacaoPortaria> getListMovimentacaoPortaria() {
        return listMovimentacaoPortaria;
    }

    public void setListMovimentacaoPortaria(List<MovimentacaoPortaria> listMovimentacaoPortaria) {
        this.listMovimentacaoPortaria = listMovimentacaoPortaria;
    }
}
