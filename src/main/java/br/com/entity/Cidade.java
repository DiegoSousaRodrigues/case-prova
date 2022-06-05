package br.com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_GCD_CIDADE")
@SequenceGenerator(name = "cidade", sequenceName = "SQ_TB_CIDADE", allocationSize = 1)
public class Cidade {

    public Cidade() {

    }

    public Cidade(Estado estado, String name) {
        this.estado = estado;
        this.name = name;
    }

    @Id
    @Column(name = "id_tp_logradouro", length = 10)
    @GeneratedValue(generator = "estado", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @Column(name = "nm_cidade", length = 120)
    private String name;

    @OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
    private List<Bairro> listBairro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bairro> getListBairro() {
        return listBairro;
    }

    public void setListBairro(List<Bairro> listBairro) {
        this.listBairro = listBairro;
    }
}
