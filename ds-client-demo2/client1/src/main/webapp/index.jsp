<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>client1</title>
</head>
<body>
client1,
<%=request.getRemoteUser()%>,
<a href="http://localhost:8100/cas/logout?service=http://www.baidu.com">登出</a>
</body>
</html>
