package com.inspur.cmis.action.ci;

import com.inspur.cmis.entity.CilicensecertificateEntity;
import com.inspur.cmis.entity.GroupEntity;
import com.inspur.cmis.service.CiCertService;
import com.inspur.cmis.service.GroupService;
import com.inspur.common.action.BaseAction;
import com.inspur.common.entity.JsonResult;
import com.inspur.common.util.GsonUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by LiuLiHao on 2018/8/30 9:57.
 * 描述： gc凭证信息
 * 作者： LiuLiHao
 */
public class CiCertAction extends BaseAction {
    @Autowired
    private CiCertService ciCertService;

    @Autowired
    private GroupService groupService;

    /**
     * 添加页面
     *
     * @return
     */
    public String ciCertAddHtml() {
        //查询所有机构
        List<GroupEntity> list = groupService.findAllUseable();
        request.setAttribute("groups",list);
        return "ciCertAddHtml";
    }

    /**
     * 添加
     *
     * @return
     */
    public String ciCertAdd() {
        JsonResult jsonResult = new JsonResult(0, "添加失败");
        ciCertService.add(entity);
        jsonResult = new JsonResult(1, "添加成功");
        result = GsonUtils.toJson(jsonResult);
        return "ciCertAdd";
    }

    //页数
    private Integer currentPage;
    ///////////ajax返回数据使用/////////////
    private String result;

    private CilicensecertificateEntity entity;

    public CilicensecertificateEntity getEntity() {
        return entity;
    }

    public void setEntity(CilicensecertificateEntity entity) {
        this.entity = entity;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
