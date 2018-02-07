/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agendamybatis.mappers;

import com.agendamybatis.model.Contacto;
import java.util.List;

/**
 *
 * @author santiago.mamani
 */
public interface ContactoMapper {
    void insertarContacto(Contacto contacto);
    List<Contacto> getContactos();
}
