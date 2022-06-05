package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCD_IMAGEM")
@SequenceGenerator(name = "imagem", sequenceName = "SQ_TB_IMAGEM", allocationSize = 1)
public class Imagem {

    public Imagem() {
    }

    public Imagem(Proprietario proprietario, String image, LocalDate dateCreated, LocalDate dateFinish) {
        this.proprietario = proprietario;
        this.image = image;
        this.dateCreated = dateCreated;
        this.dateFinish = dateFinish;
    }

    @ManyToOne
    @JoinColumn(name = "id_proprietario", nullable = false)
    private Proprietario proprietario;

    @Id
    @Column(name = "id_imagem", length = 5)
    @GeneratedValue(generator = "imagem", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "img_proprietario", nullable = false)
    private String image;

    @Column(name = "dt_inicio", nullable = false)
    private LocalDate dateCreated;

    @Column(name = "dt_termino")
    private LocalDate dateFinish;

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        this.dateFinish = dateFinish;
    }
}
