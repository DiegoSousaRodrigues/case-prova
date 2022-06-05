package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCD_LOGRADOURO_PROPRIETARIO")
@SequenceGenerator(name = "logradouro_proprietario", sequenceName = "SQ_TB_T_GCD_LOGRADOURO_PROPRIETARIO", allocationSize = 1)
public class LogradouroProprietario {

    public LogradouroProprietario() {
    }

    public LogradouroProprietario(Logradouro logradouro, Proprietario proprietario, LocalDate dateCreated, LocalDate dateEnded, Integer numero, String description, String referencePoint) {
        this.logradouro = logradouro;
        this.proprietario = proprietario;
        this.dateCreated = dateCreated;
        this.dateEnded = dateEnded;
        this.numero = numero;
        this.description = description;
        this.referencePoint = referencePoint;
    }

    @Id
    @Column(name = "id_logradouro_proprietario")
    @GeneratedValue(generator = "logradouro_proprietario", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_Logradouro", nullable = false)
    private Logradouro logradouro;

    @ManyToOne
    @JoinColumn(name = "id_proprietario", nullable = false)
    private Proprietario proprietario;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDate dateCreated;

    @Column(name = "dt_termino")
    private LocalDate dateEnded;

    @Column(name = "nr_endereco", length = 8)
    private Integer numero;

    @Column(name = "ds_complemento", length = 50)
    private String description;

    @Column(name = "ds_ponto_referencia", length = 500)
    private String referencePoint;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferencePoint() {
        return referencePoint;
    }

    public void setReferencePoint(String referencePoint) {
        this.referencePoint = referencePoint;
    }
}
