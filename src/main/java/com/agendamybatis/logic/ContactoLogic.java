/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agendamybatis.logic;

import com.agendamybatis.config.MyBatisUtil;
import com.agendamybatis.model.Contacto;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author santiago.mamani
 */
public class ContactoLogic {

    public String insert(Contacto contacto) {
        SqlSession session = new MyBatisUtil().getSqlSession();
        String res = "No insertado";
        if (session != null) {
            try {
                session.insert("Contacto.insertarContacto", contacto);
                session.commit();
                res = "Insertado";
            } finally {
                session.close();
            }
        } else {
            System.out.println("Error.. to open Session");
            res = "Error.. to open Session";
        }
        return res;
    }

}
