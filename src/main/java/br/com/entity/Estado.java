package br.com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_GCD_ESTADO")
@SequenceGenerator(name = "estado", sequenceName = "SQ_TB_ESTADO", allocationSize = 1)
public class Estado {

    public Estado() {
    }

    public Estado(String name, String uf) {
        this.name = name;
        this.uf = uf;
    }

    @Id
    @Column(name = "id_estado", length = 10)
    @GeneratedValue(generator = "estado", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_estado", length = 80, nullable = false)
    private String name;

    @Column(name = "sg_estado", length = 2, nullable = false)
    private String uf;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Cidade> listCidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Cidade> getListCidade() {
        return listCidade;
    }

    public void setListCidade(List<Cidade> listCidade) {
        this.listCidade = listCidade;
    }
}