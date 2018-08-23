<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/23
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>机构添加</title>
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
        //检查完整性
        function checkGroup() {
            var code = $("#code").val();
            if (objIsNull(code)){
                layer.msg("请输入编号");
                return false;
            }
            var name = $("#name").val();
            if (objIsNull(code)){
                layer.msg("请输入名称");
                return false;
            }
            var parentid = $("#parentid").val();
            if (objIsNull(code)){
                layer.msg("请输入上级代码");
                return false;
            }
            var briefname = $("#briefname").val();
            if (objIsNull(code)){
                layer.msg("请输入简称");
                return false;
            }
            var buidDate = $("#buidDate").val();
            if (objIsNull(code)){
                layer.msg("请选择成立日期");
                return false;
            }

            return true;
        }
    </script>

</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="/groupAction_groupInfo.action">机构管理</a></li>
        <li><a href="javascript:;">添加</a></li>
    </ul>
</div>

<form action="/groupAction_groupAdd.action" method="post" onsubmit="return checkGroup();">
    <div class="formbody">
        <div class="formtitle"><span>机构基本信息</span></div>

        <ul class="forminfo">
            <li>
                <label>机构编号</label>
                <input name="group.code" id="code" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>机构名称</label>
                <input name="group.name" id="name" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>上级机构</label>
                <input name="group.parentid" id="parentid" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>机构简称</label>
                <input name="group.briefname" id="briefname" type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>成立日期</label>
                <input id="buidDate" name="group.createdtime"
                       type="text" class="dfinput" value=""/>
            </li>
            <li>
                <label>&nbsp;</label>
                <input type="submit" class="btn" value="添加"/>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <input type="reset" class="btn" value="重置"/>
            </li>
        </ul>

    </div>
</form>
</body>
</html>
<script>
    $(function () {
        //日期选择
        layui.use('laydate', function(){
            var laydate = layui.laydate;
            laydate.render({
                elem: '#buidDate'
            });
        });

    });


</script>