package com.jonydelivery.domain.model;

import com.jonydelivery.domain.application.DefaultModel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Getter
@Setter
@Entity
public class Cliente extends DefaultModel {

    private String nome;
    private String email;
    private String telefone;

}
