package br.com.biblioteca.model.entity;

import br.com.biblioteca.model.enums.ClassificacaoRisco;
import br.com.biblioteca.model.enums.StatusProjeto;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    private String gerenteResponsavel;

    @Temporal(TemporalType.DATE)
    private Date previsaoTermino;

    @Temporal(TemporalType.DATE)
    private Date dataRealTermino;

    private Double orcamentoTotal;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusProjeto status;

    @Enumerated(EnumType.STRING)
    private ClassificacaoRisco classificacaoRisco;

}