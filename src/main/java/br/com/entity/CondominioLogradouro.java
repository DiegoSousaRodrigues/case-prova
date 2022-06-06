package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCD_CONDOMINIO_LOGRADOURO")
@SequenceGenerator(name = "condominio_logradouro", sequenceName = "SQ_TB_CONDOMINIO_LOGRADOURO", allocationSize = 1)
public class CondominioLogradouro {

    public CondominioLogradouro() {
    }

    public CondominioLogradouro(Condominio condominio, Logradouro logradouro, LocalDate dateCreated, LocalDate dateEnded, Integer number, String complement, String pointReference) {
        this.condominio = condominio;
        this.logradouro = logradouro;
        this.dateCreated = dateCreated;
        this.dateEnded = dateEnded;
        this.number = number;
        this.complement = complement;
        this.pointReference = pointReference;
    }

    @Id
    @Column(name = "id_condominio_logradouro")
    @GeneratedValue(generator = "condominio_logradouro", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_condominio", nullable = false)
    private Condominio condominio;

    @ManyToOne
    @JoinColumn(name = "id_proprietario", nullable = false)
    private Logradouro logradouro;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDate dateCreated;

    @Column(name = "dt_termino")
    private LocalDate dateEnded;

    @Column(name = "nr_endereco", length = 8)
    private Integer number;

    @Column(name = "ds_complemento", length = 50)
    private String complement;

    @Column(name = "ds_ponto_referencia", length = 500)
    private String pointReference;

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

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getPointReference() {
        return pointReference;
    }

    public void setPointReference(String pointReference) {
        this.pointReference = pointReference;
    }
}
