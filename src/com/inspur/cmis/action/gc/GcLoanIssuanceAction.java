package com.inspur.cmis.action.gc;

import com.inspur.cmis.entity.CilicensecertificateEntity;
import com.inspur.common.action.BaseAction;
import com.inspur.common.util.HQLHelper;

/**
 * Created by LiuLiHao on 2018/8/30 10:07.
 * 描述：
 * 作者： LiuLiHao
 */
public class GcLoanIssuanceAction extends BaseAction {

    /**
     * 列表
     * @return
     */
    public String loanIssuanceInfo() {
        //分页查询
        HQLHelper hqlHelper = new HQLHelper(CilicensecertificateEntity.class);
//        int page = 1;
//        if (currentPage!=null && currentPage>0){
//            page = currentPage;
//        }
//        //设置页数
//        PaginationBean pageBean = ciCustBaseService.getPageBean(hqlHelper, page);
//        request.setAttribute("pageBean",pageBean);

        return "loanIssuanceInfo";
    }

}
