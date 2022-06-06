package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_VISITANTE")
@SequenceGenerator(name = "visitante", sequenceName = "SQ_TB_VISITANTE", allocationSize = 1)
public class Visitante {

    public Visitante() {
    }

    public Visitante(String name, LocalDate birth, Integer cpf, Integer rg, Integer digitoRg, LocalDate dateCreted) {
        this.name = name;
        this.birth = birth;
        this.cpf = cpf;
        this.rg = rg;
        this.digitoRg = digitoRg;
        this.dateCreted = dateCreted;
    }

    @Id
    @Column(name = "id_visitante")
    @GeneratedValue(generator = "visitante", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_visitante", length = 100, nullable = false)
    private String name;

    @Column(name = "dt_nasc", nullable = false)
    private LocalDate birth;

    @Column(name = "nr_cpf", length = 12, nullable = false)
    private Integer cpf;

    @Column(name = "nr_rg", length = 11, nullable = false)
    private Integer rg;

    @Column(name = "nm_digito_rg", length = 1)
    private Integer digitoRg;

    @Column(name = "dt_cadastro", nullable = false)
    private LocalDate dateCreted;

    @OneToMany(mappedBy = "visitante")
    private List<MovimentacaoPortaria> listMovimentacaoPortaria;

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

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Integer getDigitoRg() {
        return digitoRg;
    }

    public void setDigitoRg(Integer digitoRg) {
        this.digitoRg = digitoRg;
    }

    public LocalDate getDateCreted() {
        return dateCreted;
    }

    public void setDateCreted(LocalDate dateCreted) {
        this.dateCreted = dateCreted;
    }

    public List<MovimentacaoPortaria> getListMovimentacaoPortaria() {
        return listMovimentacaoPortaria;
    }

    public void setListMovimentacaoPortaria(List<MovimentacaoPortaria> listMovimentacaoPortaria) {
        this.listMovimentacaoPortaria = listMovimentacaoPortaria;
    }
}
