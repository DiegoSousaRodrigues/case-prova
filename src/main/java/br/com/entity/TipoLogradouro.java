package br.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_GCD_TIPO_LOGRADOURO")
@SequenceGenerator(name="logradouro", sequenceName = "SQ_TB_LOGRADOURO", allocationSize = 1)
public class TipoLogradouro {

    public TipoLogradouro() {
    }

    public TipoLogradouro(Integer id) {
        this.id = id;
    }

    @Id
    @Column(name = "id_tp_logradouro")
    @GeneratedValue(generator = "estado", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "nm_tipo_logradouro")
    private String type;

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
}
