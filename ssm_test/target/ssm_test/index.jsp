<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<center>
    <a href="account/findAll">测试 springMvc</a>

    <br>
    <br>
    <br>
    <br>
    <form action="account/saveAccount">
        姓名：<input type="text" name="name"><br>
        金额：<input type="text" name="money">
        <input type="submit" value="提交">
    </form>
    <br>
    <br>
    <br>
    <br>
    <a href="account/transferMoney">转账</a>
    <br>
    <br>
    <br>
    <br>
    <a href="account/findAccount">查询账户</a>
</center>
</body>
</html>
