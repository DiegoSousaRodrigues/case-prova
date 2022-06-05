package br.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_GCD_EMAIL")
@SequenceGenerator(name="email", sequenceName = "SQ_TB_EMAIL", allocationSize = 1)
public class Email {

    public Email(Integer id, Proprietario proprietario, String email, String status) {
        this.id = id;
        this.proprietario = proprietario;
        this.email = email;
        this.status = status;
    }

    public Email() {
    }

    @Id
    @Column(name = "id_email", length = 10)
    @GeneratedValue(generator = "email", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_proprietario", nullable = false)
    private Proprietario proprietario;

    @Column(name = "ds_email", length = 80, nullable = false)
    private String email;

    @Column(name = "st_status", length = 1, nullable = false)
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
