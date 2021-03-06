<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/11
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="commons/inc.jsp" %>
<html>
<head>
    <title>主页</title>
    <script>
        function del() {
            return confirm("是否删除？")
        }
    </script>
</head>
<body>
<h1>主页</h1>
${sessionScope.user.username}
<p><a href="${ctx}/user/signOut">注销</a></p>
<hr>
<form action="${ctx}/book/create">
    <input type="text" name="title" placeholder="书名"><br>
    <input type="text" name="author" placeholder="作者"><br>
    <input type="date" name="date" placeholder="日期"><br>
    <input type="text" name="price" placeholder="定价"><br>
    <input type="submit" value="添加"><br>
</form>
<hr>
<form action="${ctx}/book/removeBooks" method="post">
    <table border="1">
        <tr>
            <th>序号</th>
            <th>书名</th>
            <th>作者</th>
            <th>出版时间</th>
            <th>定价</th>
            <th colspan="2">操作</th>
        </tr>
        <c:forEach var="book" items = "${sessionScope.pagination.list}" varStatus="vs">
            <tr>
                <td>${vs.count}<input type="checkbox" name="ids" value="${book.id}"></td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.date}</td>
                <td>${book.price}</td>
                <td><a href="/book/queryBookById/${book.id}">编辑</a></td>
                <td><a href="/book/remove/${book.id}" onclick="return del()">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="删除">
</form>
<c:import url="${ctx}/commons/page.jsp">
    <c:param name="path" value="book/${sessionScope.pagination.statement}"/>
</c:import>
</body>
</html>
