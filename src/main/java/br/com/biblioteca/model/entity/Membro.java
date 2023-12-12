package br.com.biblioteca.model.entity;

import br.com.biblioteca.model.enums.Atribuicao;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Atribuicao atribuicao;

}
