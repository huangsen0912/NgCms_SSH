package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.ClCreditDao;
import com.inspur.cmis.entity.GcloancreditEntity;
import com.inspur.cmis.exception.SysException;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by LiuLiHao on 2018/8/24 10:59.
 * 描述：
 * 作者： LiuLiHao
 */
@Repository("clCreditDao")
public class ClCreditDaoImpl extends BaseDaoImpl<GcloancreditEntity> implements ClCreditDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void deleteAll(String deletes) {
        //使用jdbc
        sessionFactory.getCurrentSession().doWork(new Work() {
            @Override
            public void execute(Connection connection) throws SQLException {
                String sql = "UPDATE gc_loancredit SET isDelete=1 WHERE id IN ( "+deletes+" )";
                Statement st = connection.createStatement();
                int i = st.executeUpdate(sql);
                if (i<=0) throw new SysException("更新失败");
            }
        });
    }
}
