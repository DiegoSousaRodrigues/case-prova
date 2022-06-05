package br.com.entity;


import javax.persistence.*;

@Entity
@Table(name = "T_GCD_LOGRADOURO")
@SequenceGenerator(name = "logradouro", sequenceName = "SQ_TB_LOGRADOURO", allocationSize = 1)
public class Logradouro {

    @Id
    @Column(name = "id_Logradouro")
    @GeneratedValue(generator = "logradouro", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_tp_logradouro")
    private TipoLogradouro tipoLogradouro;

    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;

    @Column(name = "cd_tp_logradouro", length = 8)
    private Integer codigoTipoLogradouro;

    @Column(name = "ds_logradouro")
    private String description;

    @Column(name = "nr_cep")
    private Integer zipCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Integer getCodigoTipoLogradouro() {
        return codigoTipoLogradouro;
    }

    public void setCodigoTipoLogradouro(Integer codigoTipoLogradouro) {
        this.codigoTipoLogradouro = codigoTipoLogradouro;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
}
