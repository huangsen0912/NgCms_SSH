package com.inspur.cmis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by LiuLiHao on 2018/8/28 13:21.
 * 描述： gc凭证信息
 * 需要添加一些字段使用
 * 作者： LiuLiHao
 */
@Entity
@Table(name = "Ci_LicenseCertiFicate")
public class CilicensecertificateEntity {
    @Id
    @GeneratedValue
    private String id;
    private String custid;
    private String custname;
    private String bustype;
    private String contractno;
    private String certno;
    private Double money;
    private String currency;
    //还款方式
    private String certtype;
    //利率
    private String certlevel;
    private String usedetail;
    private String busmanager;
    private Integer groupid;

    private String certname;
    private String certid;
    private String issuingagency;
    private Date startdate;
    private Date enddate;
    private String summary;
    private String operator;
    private String instcitycode;
    private Date operdatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno;
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCerttype() {
        return certtype;
    }

    public void setCerttype(String certtype) {
        this.certtype = certtype;
    }

    public String getCertlevel() {
        return certlevel;
    }

    public void setCertlevel(String certlevel) {
        this.certlevel = certlevel;
    }

    public String getUsedetail() {
        return usedetail;
    }

    public void setUsedetail(String usedetail) {
        this.usedetail = usedetail;
    }

    public String getBusmanager() {
        return busmanager;
    }

    public void setBusmanager(String busmanager) {
        this.busmanager = busmanager;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getCertname() {
        return certname;
    }

    public void setCertname(String certname) {
        this.certname = certname;
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid;
    }

    public String getIssuingagency() {
        return issuingagency;
    }

    public void setIssuingagency(String issuingagency) {
        this.issuingagency = issuingagency;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getInstcitycode() {
        return instcitycode;
    }

    public void setInstcitycode(String instcitycode) {
        this.instcitycode = instcitycode;
    }

    public Date getOperdatetime() {
        return operdatetime;
    }

    public void setOperdatetime(Date operdatetime) {
        this.operdatetime = operdatetime;
    }
}
