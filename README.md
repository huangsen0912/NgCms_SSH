### 山东农村信用社信贷管理

项目使用SSH搭建,数据库使用MySql,开发工具使用IDEA

<br>
项目导入后，修改 conf下的db.properties的数据库连接账号密码。
<br>

账户：root 密码：你的密码
<br>

由于是ssh项目启动后会自动创建表，初始的管理员账号，需要到数据库手动添加，否则会登录不上。
<br>

数据库名称 popular_bank_dev

* 效果图：
<br>
 ![登录页1](https://raw.githubusercontent.com/wanhao838088/NgCms_SSH/master/pngs/login_1.png)
 <br>
 ![组管理页1](https://raw.githubusercontent.com/wanhao838088/NgCms_SSH/master/pngs/group_add.png)
 <br>
 ![用户管理页1](https://raw.githubusercontent.com/wanhao838088/NgCms_SSH/master/pngs/user_mana.png)

### 已经实现的模块有:

1.系统管理---->后台用户的增删改查 修改密码 用户禁用 用户删除

2.系统管理---->机构管理部分的增删改查 禁用启用

3.系统管理---->参数管理的增删改查

4.客户信息管理--->对公客户的添加修改等功能 

5.授信管理--->授信申请的添加和修改和查找等功能

6.合同放款--->合同签订,贷款发放列表和凭证信息的添加
