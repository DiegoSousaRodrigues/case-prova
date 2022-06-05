package br.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_GCD_TELEFONE")
@SequenceGenerator(name = "telefone", sequenceName = "SQ_TB_TELEFONE", allocationSize = 1)
public class Telefone {

    public Telefone() {
    }

    public Telefone(Integer id, Proprietario proprietario, TipoTelefone tipoTelefone, Integer ddi, Integer ddl, Integer telefone, String status) {
        this.id = id;
        this.proprietario = proprietario;
        this.tipoTelefone = tipoTelefone;
        this.ddi = ddi;
        this.ddl = ddl;
        this.telefone = telefone;
        this.status = status;
    }

    @Id
    @Column(name = "id_telefone", length = 10)
    @GeneratedValue(generator = "telefone", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_proprietario")
    private Proprietario proprietario;

    @ManyToOne
    @JoinColumn(name = "id_tipo_fone")
    private TipoTelefone tipoTelefone;

    @Column(name = "nr_ddi", length = 3)
    private Integer ddi;

    @Column(name = "nr_ddd", length = 3, nullable = false)
    private Integer ddl;

    @Column(name = "nr_telefone", length = 9, nullable = false)
    private Integer telefone;

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

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }

    public Integer getDdl() {
        return ddl;
    }

    public void setDdl(Integer ddl) {
        this.ddl = ddl;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}