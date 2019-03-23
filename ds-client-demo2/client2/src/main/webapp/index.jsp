<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>client2</title>
</head>
<body>
client2,
<%=request.getRemoteUser()%>,
<a href="http://101.132.71.154:8100/cas/logout?service=http://www.baidu.com">登出</a>
</body>
</html>
