package com.Projeto.Springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private Integer Id;
    private String Usuario;
    private String Senha;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DtCadastro;
    @ManyToOne
    private TipoAcesso TipoAcesso;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public Date getDtCadastro() {
        return DtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        DtCadastro = dtCadastro;
    }

    public com.Projeto.Springboot.model.TipoAcesso getTipoAcesso() {
        return TipoAcesso;
    }

    public void setTipoAcesso(com.Projeto.Springboot.model.TipoAcesso tipoAcesso) {
        TipoAcesso = tipoAcesso;
    }
}
