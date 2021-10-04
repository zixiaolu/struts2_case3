<%--
  Created by IntelliJ IDEA.
  User: le
  Date: 2021/10/3
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script language = "javascript" src = "code.js"></script>
</head>
    请输入在点击获取验证码被空格分开的两个验证码
    <br/>
    <input id="Button1" onclick="createCode();" type="button" value="获取验证码" />
    <s:form action="login" method="post" name="myform">
    <s:textfield name="text1" label="前段" cssStyle="width:160px;heigh:26px;"/>
    <s:textfield name="text2" label="后段" cssStyle="width:160px;heigh:26px"/>
    <s:submit value="提交"/>
    </s:form>
</body>
</html>
