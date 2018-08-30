package com.inspur.cmis.service.impl;

import com.inspur.cmis.dao.CiCertDao;
import com.inspur.cmis.entity.CilicensecertificateEntity;
import com.inspur.cmis.service.CiCertService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by LiuLiHao on 2018/8/24 11:02.
 * 描述：
 * 作者： LiuLiHao
 */
@Service
@Transactional
public class CiCertServiceImpl extends BaseServiceImpl<CilicensecertificateEntity> implements CiCertService {

    private CiCertDao ciCertDao;

    @Resource
    public void setCiCertDao(CiCertDao ciCertDao) {
        super.setBaseDao(ciCertDao);
        this.ciCertDao = ciCertDao;
    }

}
