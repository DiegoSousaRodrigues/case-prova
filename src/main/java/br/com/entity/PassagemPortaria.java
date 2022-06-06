package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_PASSAGEM_PORTARIA")
@SequenceGenerator(name = "passagem_portaria", sequenceName = "SQ_TB_PASSAGEM_PORTARIA", allocationSize = 1)
public class PassagemPortaria {

    public PassagemPortaria() {
    }

    public PassagemPortaria(Integer id, Integer numeroPortaria, String nomePortaria, String status, LocalDate dateCreated, LocalDate dateEnded) {
        this.id = id;
        this.numeroPortaria = numeroPortaria;
        this.nomePortaria = nomePortaria;
        this.status = status;
        this.dateCreated = dateCreated;
        this.dateEnded = dateEnded;
    }

    @ManyToOne
    @JoinColumn(name = "id_portaria")
    private Portaria portaria;

    @Id
    @Column(name = "id_passagem_portaria")
    @GeneratedValue(generator = "passagem_portaria", strategy = GenerationType.SEQUENCE)
    private Integer id;

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

    @OneToMany(mappedBy = "passagemPortaria")
    private List<MovimentacaoPortaria> listMovimentacaoPortaria;

    public Portaria getPortaria() {
        return portaria;
    }

    public void setPortaria(Portaria portaria) {
        this.portaria = portaria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<MovimentacaoPortaria> getListMovimentacaoPortaria() {
        return listMovimentacaoPortaria;
    }

    public void setListMovimentacaoPortaria(List<MovimentacaoPortaria> listMovimentacaoPortaria) {
        this.listMovimentacaoPortaria = listMovimentacaoPortaria;
    }
}
