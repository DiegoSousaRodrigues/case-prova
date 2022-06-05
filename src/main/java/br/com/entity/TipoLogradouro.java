package br.com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_GCD_TIPO_LOGRADOURO")
@SequenceGenerator(name="tipo_logradouro", sequenceName = "SQ_TB_TIPO_LOGRADOURO", allocationSize = 1)
public class TipoLogradouro {

    public TipoLogradouro() {
    }

    public TipoLogradouro(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "id_tp_logradouro")
    @GeneratedValue(generator = "tipo_logradouro", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_tipo_logradouro")
    private String type;

    @OneToMany(mappedBy = "tipoLogradouro")
    private List<Logradouro> listLogradouro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Logradouro> getListLogradouro() {
        return listLogradouro;
    }

    public void setListLogradouro(List<Logradouro> listLogradouro) {
        this.listLogradouro = listLogradouro;
    }
}
