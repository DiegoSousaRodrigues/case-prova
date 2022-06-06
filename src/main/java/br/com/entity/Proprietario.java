package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "T_GCD_PROPRIETARIO")
@SequenceGenerator(name="proprietario", sequenceName = "SQ_TB_proprietario", allocationSize = 1)
public class Proprietario {

    public Proprietario() {
    }

    public Proprietario(String name, String nickname, LocalDate birth, Integer cpf, Integer rg, String digitRg, String gender, LocalDate dateCreated) {
        this.name = name;
        this.nickname = nickname;
        this.birth = birth;
        this.cpf = cpf;
        this.rg = rg;
        this.digitRg = digitRg;
        this.gender = gender;
        this.dateCreated = dateCreated;
    }

    @Id
    @Column(name = "id_proprietario", length = 10)
    @GeneratedValue(generator = "proprietario", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_proprietario", length = 100, nullable = false)
    private String name;

    @Column(name = "nm_apelido", length = 50)
    private String nickname;

    @Column(name = "dt_nasc", nullable = false)
    private LocalDate birth;

    @Column(name = "nr_cpf", length = 12)
    private Integer cpf;

    @Column(name = "nr_rg", length = 11)
    private Integer rg;

    @Column(name = "nm_digito_rg", length = 1)
    private String digitRg;

    @Column(name = "st_genero_biologico", length = 1)
    private String gender;

    @Column(name = "st_proprietario", length = 1)
    private String status;

    @Column(name = "dt_cadastro", nullable = false)
    private LocalDate dateCreated;

    @OneToMany(mappedBy = "proprietario")
    private List<Email> listEmail;

    @OneToMany(mappedBy = "proprietario")
    private List<Telefone> listTelefone;

    @OneToMany(mappedBy = "proprietario")
    private List<Imagem> listImagem;

    @OneToMany(mappedBy = "proprietario")
    private List<LogradouroProprietario> listLogradouroProprietario;

    @OneToMany(mappedBy = "proprietario")
    private List<LoteProprietario> listLoteProprietario;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public String getDigitRg() {
        return digitRg;
    }

    public void setDigitRg(String digitRg) {
        this.digitRg = digitRg;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<Email> getListEmail() {
        return listEmail;
    }

    public void setListEmail(List<Email> listEmail) {
        this.listEmail = listEmail;
    }

    public List<Telefone> getListTelefone() {
        return listTelefone;
    }

    public void setListTelefone(List<Telefone> listTelefone) {
        this.listTelefone = listTelefone;
    }

    public List<Imagem> getListImagem() {
        return listImagem;
    }

    public void setListImagem(List<Imagem> listImagem) {
        this.listImagem = listImagem;
    }

    public List<LogradouroProprietario> getListLogradouroProprietario() {
        return listLogradouroProprietario;
    }

    public void setListLogradouroProprietario(List<LogradouroProprietario> listLogradouroProprietario) {
        this.listLogradouroProprietario = listLogradouroProprietario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<LoteProprietario> getListLoteProprietario() {
        return listLoteProprietario;
    }

    public void setListLoteProprietario(List<LoteProprietario> listLoteProprietario) {
        this.listLoteProprietario = listLoteProprietario;
    }
}
