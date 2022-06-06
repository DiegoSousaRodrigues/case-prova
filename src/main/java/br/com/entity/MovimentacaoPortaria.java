package br.com.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCD_MOVIMENTACAO_PORTARIA")
@SequenceGenerator(name = "movimentacao_portaria", sequenceName = "SQ_TB_MOVIMENTACAO_PORTARIA", allocationSize = 1)
public class MovimentacaoPortaria {

    public MovimentacaoPortaria() {
    }

    public MovimentacaoPortaria(Integer id, Portaria portaria, PassagemPortaria passagemPortaria, LoteProprietario loteProprietario, FuncionarioPortaria funcionarioPortaria, Visitante visitante, String tipoMovimentacao, LocalDate dataMovimentacao, String descricaoResumida, String imgMovimentacaoPath) {
        this.id = id;
        this.portaria = portaria;
        this.passagemPortaria = passagemPortaria;
        this.loteProprietario = loteProprietario;
        this.funcionarioPortaria = funcionarioPortaria;
        this.visitante = visitante;
        this.tipoMovimentacao = tipoMovimentacao;
        this.dataMovimentacao = dataMovimentacao;
        this.descricaoResumida = descricaoResumida;
        this.imgMovimentacaoPath = imgMovimentacaoPath;
    }

    @Id
    @Column(name = "id_movimentacao_portaria")
    @GeneratedValue(generator = "movimentacao_portaria", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_portaria")
    private Portaria portaria;

    @ManyToOne
    @JoinColumn(name = "id_passagem_portaria")
    private PassagemPortaria passagemPortaria;

    @ManyToOne
    @JoinColumn(name = "id_lote_proprietario")
    private LoteProprietario loteProprietario;

    @ManyToOne
    @JoinColumn(name = "id_funcionario_portaria")
    private FuncionarioPortaria funcionarioPortaria;

    @ManyToOne
    @JoinColumn(name = "id_visitante")
    private Visitante visitante;

    @Column(name = "tp_movimentacao", length = 1, nullable = false)
    private String tipoMovimentacao;

    @Column(name = "dt_movimentacao", nullable = false)
    private LocalDate dataMovimentacao;

    @Column(name = "ds_resumida", length = 300)
    private String descricaoResumida;

    @Column(name = "img_movimentacao")
    private String imgMovimentacaoPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Portaria getPortaria() {
        return portaria;
    }

    public void setPortaria(Portaria portaria) {
        this.portaria = portaria;
    }

    public PassagemPortaria getPassagemPortaria() {
        return passagemPortaria;
    }

    public void setPassagemPortaria(PassagemPortaria passagemPortaria) {
        this.passagemPortaria = passagemPortaria;
    }

    public LoteProprietario getLoteProprietario() {
        return loteProprietario;
    }

    public void setLoteProprietario(LoteProprietario loteProprietario) {
        this.loteProprietario = loteProprietario;
    }

    public FuncionarioPortaria getFuncionarioPortaria() {
        return funcionarioPortaria;
    }

    public void setFuncionarioPortaria(FuncionarioPortaria funcionarioPortaria) {
        this.funcionarioPortaria = funcionarioPortaria;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getDescricaoResumida() {
        return descricaoResumida;
    }

    public void setDescricaoResumida(String descricaoResumida) {
        this.descricaoResumida = descricaoResumida;
    }

    public String getImgMovimentacaoPath() {
        return imgMovimentacaoPath;
    }

    public void setImgMovimentacaoPath(String imgMovimentacaoPath) {
        this.imgMovimentacaoPath = imgMovimentacaoPath;
    }
}
