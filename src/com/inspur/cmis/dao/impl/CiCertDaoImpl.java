package com.inspur.cmis.dao.impl;

import com.inspur.cmis.dao.CiCertDao;
import com.inspur.cmis.entity.CilicensecertificateEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by LiuLiHao on 2018/8/24 10:59.
 * 描述：
 * 作者： LiuLiHao
 */
@Repository("ciCertDao")
public class CiCertDaoImpl extends BaseDaoImpl<CilicensecertificateEntity> implements CiCertDao {

    @Autowired
    private SessionFactory sessionFactory;
}
