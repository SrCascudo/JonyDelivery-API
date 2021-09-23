package com.jonydelivery.domain.application;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class DefaultModel {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "timestamp without time zone default now()")
    private Date dtcadastro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "timestamp without time zone default now()")
    private Date dtalteracao;

    @Column(columnDefinition = "integer default 1")
    private Integer registro;
}
