package br.com.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_GCD_TIPO_TELEFONE")
@SequenceGenerator(name = "TipoTelefone", sequenceName = "SQ_TB_TIPO_TELEFONE", allocationSize = 1)
public class TipoTelefone {

    public TipoTelefone() {
    }

    public TipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    @Id
    @Column(name = "id_tipo_fone", length = 10)
    @GeneratedValue(generator = "TipoTelefone", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "ds_tipo_telefone", length = 25, nullable = false)
    private String tipoTelefone;

    @OneToMany(mappedBy = "tipoTelefone")
    private List<Telefone> listTelefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public List<Telefone> getListTelefone() {
        return listTelefone;
    }

    public void setListTelefone(List<Telefone> listTelefone) {
        this.listTelefone = listTelefone;
    }
}
