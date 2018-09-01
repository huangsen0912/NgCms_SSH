<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/27
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>凭证添加</title>
    <%@include file="../../common/head.jsp" %>
    <script type="text/javascript">
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>
</head>
<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="javascript:;">凭证信息维护</a></li>
        <li><a href="javascript:;">添加</a></li>
    </ul>
</div>

<form action="" method="post" id="form" onsubmit="return checkForm()">
    <div class="formbody">
        <div class="formtitle"><span>凭证信息</span></div>

        <ul class="forminfo">
            <li>
                <label>客户编号</label>
                <input name="entity.custid" req="req" msg="客户编号" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>客户名称</label>
                <input name="entity.custname" req="req" msg="客户名称"  type="text" class="dfinput" value=""/>
            </li>
            <li><label>业务品种</label>
                <cite>
                    <select class="dfselect1" name="entity.bustype">
                        <option value="00" selected="selected">个人经营类贷款</option>
                        <option value="01">个人消费类贷款</option>
                        <option value="02">个人购房贷款</option>
                        <option value="03">助学贷款</option>
                        <option value="04">个人其他贷款</option>
                    </select>
                </cite>
                </li>
            <li>
                <label>合同编号</label>
                <input name="entity.contractno" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>凭证流水号</label>
                <input name="entity.certno" type="text" class="dfinput" value=""/>
            </li>

            <li>
                <label>借款金额</label>
                <input name="entity.money" req="req" msg="借款金额" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>币种</label>
                <cite>
                    <select class="select1" name="entity.currency">
                        <option value="CNY" selected>人民币</option>
                        <option value="USD">美元</option>
                        <option value="EUR">欧元</option>
                        <option value="HKD">港元</option>
                        <option value="DEM">德国马克</option>
                        <option value="AUD">澳大利亚元</option>
                        <option value="CAD">加拿大元</option>
                        <option value="SEK">瑞典克朗</option>
                        <option value="SGD">新加坡元</option>
                        <option value="NZD">新西兰元</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>起始日期</label>
                <input name="entity.startdate" id="startdate" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>到期日期</label>
                <input name="entity.enddate" id="enddate" type="text" class="dfinput" value=""/>
            </li>

            <li>
                <label>	借款利率(%)</label>
                <input name="entity.certlevel" type="text" class="dfinput"  value=""/>
            </li>
            <li>
                <label>还款方式</label>
                <cite>
                    <select class="dfselect1" name="entity.certtype">
                        <option value="00">等额本金</option>
                        <option value="01">等额本息</option>
                        <option value="01">一次性付款</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>结息方式</label>
                <cite>
                    <select class="dfselect1" >
                        <option value="00">按月</option>
                        <option value="01">按季</option>
                        <option value="01">年度结息</option>
                    </select>
                </cite>
            </li>
            <li>
                <label>资金支付方式</label><cite>
                <select class="dfselect1" >
                    <option value="00">自助支付</option>
                    <option value="01">受托支付</option>
                </select>
            </cite>
            </li>

            <li><label>详细用途</label>
                <input name="entity.usedetail" type="text" class="dfinput"  value=""/>
            </li>
            <li><label>主办客户经理 </label>
                <input name="entity.busmanager" type="text" class="dfinput"  value=""/>
            </li>
            <li><label>所属机构</label>
                <%--<input name="groupid" type="text" class="dfinput"  value="公司业务部"/>--%>
                <c:if test="${groups==null}">
                    没有任何机构信息
                </c:if>
                <c:if test="${groups!=null}">
                    <select class="dfselect" id="group" name="entity.groupid">
                        <option value="0">请选择</option>
                        <s:iterator value="#request.groups">
                            <option value="${id}">${name}</option>
                        </s:iterator>
                    </select>
                </c:if>
            </li>

            <li>&nbsp;&nbsp;
                <input id="subBtn" type="submit" class="btn" value="添加"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>

</body>
</html>

<script>
    //日期选择
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        laydate.render({
            elem: '#startDate'
        });
        laydate.render({
            elem: '#endDate'
        })
    });


    function checkForm() {
        if($("#group").val()=='0'){
            layer.msg("请选择所在机构");
            return;
        }

        //检查表单
        var flag =  formValueCheckTips('form');

        if (flag){
            var fromData = $("#form").serialize();
            //请求接口
            postRequest('/ciCertAction_ciCertAdd.action',fromData,function (json) {
                console.log(json);
                if (json.code==1){
                    layer.alert("添加成功",function () {
                        window.location.href = contractInfoUrl;
                    });
                }else {
                    layer.alert("添加失败");
                }
            });
        }
        return false;
    }

</script>