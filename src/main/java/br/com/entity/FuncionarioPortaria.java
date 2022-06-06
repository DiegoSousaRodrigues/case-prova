package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_FUNCIONARIO_PORTARIA")
@SequenceGenerator(name = "funcionario_portaria", sequenceName = "SQ_TB_FUNCIONARIO_PORTARIA", allocationSize = 1)
public class FuncionarioPortaria {

    public FuncionarioPortaria() {
    }

    public FuncionarioPortaria(String name, LocalDate birth, Integer cpf, Integer rg, Integer digitoRg, LocalDate dateCreted) {
        this.name = name;
        this.birth = birth;
        this.cpf = cpf;
        this.rg = rg;
        this.digitoRg = digitoRg;
        this.dateCreted = dateCreted;
    }

    @Id
    @Column(name = "id_funcionario_portaria")
    @GeneratedValue(generator = "funcionario_portaria", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_funcionario", length = 100, nullable = false)
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

    @OneToMany(mappedBy = "funcionarioPortaria")
    private List<MovimentacaoPortaria> listMovimentacaoPortarias;

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

    public List<MovimentacaoPortaria> getListMovimentacaoPortarias() {
        return listMovimentacaoPortarias;
    }

    public void setListMovimentacaoPortarias(List<MovimentacaoPortaria> listMovimentacaoPortarias) {
        this.listMovimentacaoPortarias = listMovimentacaoPortarias;
    }
}