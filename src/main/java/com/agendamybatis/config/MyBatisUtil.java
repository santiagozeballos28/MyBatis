package com.agendamybatis.config;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author santiago.mamani
 */
public class MyBatisUtil {

    private String resource = "com/agendamybatis/config/mybatis-config.xml";
    private SqlSession sqlSession = null;

    public SqlSession getSqlSession() {
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            sqlSession = sqlMapper.openSession();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sqlSession;
    }
}
