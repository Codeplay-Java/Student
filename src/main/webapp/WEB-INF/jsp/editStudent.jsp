<%--
  Created by IntelliJ IDEA.
  User: 13824
  Date: 2019/3/6
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin:0px auto; width:500px">

    <form action="updateStudent" method="post">

        name: <input name="sname" value="${s.sname}"> <br>

        <input name="sid" type="hidden" value="${s.sid}">
        <button type="submit">提交</button>

    </form>
</div>
</body>
</html>
