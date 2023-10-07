<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GUGUDAN JSP</title>
</head>

<body>

<%
    int num = 9;
%>
<%=num%> 단을 출력합니다.
<br><br><br>
<%
    for(int i=1;i<=9;i++)
    {
        out.println(num+"*"+i+"="+num*i+"<br>");
    }
%>

</body>
</html>