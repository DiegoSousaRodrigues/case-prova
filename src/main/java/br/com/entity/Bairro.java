package br.com.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_GCD_BAIRRO")
@SequenceGenerator(name = "bairro", sequenceName = "SQ_TB_BAIRRO", allocationSize = 1)
public class Bairro {

    public Bairro() {
    }

    public Bairro(Cidade cidade, String name) {
        this.cidade = cidade;
        this.name = name;
    }

    @Id
    @Column(name = "id_bairro", length = 10)
    @GeneratedValue(generator = "bairro", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_cidade", nullable = false)
    private Cidade cidade;

    @Column(name = "nm_bairro", length = 100, nullable = false)
    private String name;

    @OneToMany(mappedBy = "bairro", cascade = CascadeType.ALL) //bidirecional
    private List<Logradouro> listLogradouros;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Logradouro> getListLogradouros() {
        return listLogradouros;
    }

    public void setListLogradouros(List<Logradouro> listLogradouros) {
        this.listLogradouros = listLogradouros;
    }
}
