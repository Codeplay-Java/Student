<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width: 100%;margin: auto;text-align: center">
    <table style="margin: auto">
        <tr align="center">
            <td>#</td>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>电话</td>
            <td>生日</td>
            <td>爱好</td>
            <td>简介</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${page.list}" var="stu">

            <tr>
                <td>${start}</td>
                <td>${stu.sid }</td>
                <td>${stu.sname }</td>
                <td>${stu.ssex }</td>
                <td>${stu.sphone }</td>
                <td>${stu.sbirthday }</td>
                <td>${stu.hobby }</td>
                <td>${stu.info }</td>
                <td><a href="editStudent?sid=${stu.sid}">编辑</a> <a href="deleteStudent?sid=${stu.sid}">删除</a></td>
            </tr>
        </c:forEach>
    </table>

    <br>
    <div >
        <a href="?start=1">[首  页]</a>
        <a href="?start=${page.pageNum-1}">[上一页]</a>
        <a href="?start=${page.pageNum+1}">[下一页]</a>
        <a href="?start=${page.pages}">[末  页]</a>
    </div>
    <br>
    <form action="addStudent" method="post">

        name: <input name="sname"> <br>
        <button type="submit">提交</button>
    </form>
</div>


