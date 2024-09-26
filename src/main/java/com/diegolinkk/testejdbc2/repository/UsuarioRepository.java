package com.diegolinkk.testejdbc2.repository;

import com.diegolinkk.testejdbc2.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Usuario> listarUsuarios(){
        return jdbcTemplate.query("select * from usuario",
                (rs, rowNum) ->
                        new Usuario(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("email")
                        )
        );
    }
}
