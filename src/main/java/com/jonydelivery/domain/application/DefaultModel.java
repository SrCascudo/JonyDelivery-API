package com.jonydelivery.domain.application;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public abstract class DefaultModel {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "timestamp without time zone default now()")
    private Date dtCadastro;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "timestamp without time zone default now()")
    private Date dtAlteracao;

    @Column(columnDefinition = "integer default 1")
    private Integer registro;
}
