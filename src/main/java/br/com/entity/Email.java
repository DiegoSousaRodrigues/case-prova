package br.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "T_GCD_EMAIL")
@SequenceGenerator(name="email", sequenceName = "SQ_TB_EMAIL", allocationSize = 1)
public class Email {

    @Id
    @Column(name = "id_email")
    @GeneratedValue(generator = "email", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_proprietario", nullable = false)
    private Proprietario proprietario;

    @Column(name = "ds_email", length = 80, nullable = false)
    private String email;

    @Column(name = "st_status", length = 1, nullable = false)
    private String status;
}
