<%@page import="mybatis.vo.EmpVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp.jsp</title>
</head>
<body>
	<h1>사원 목록</h1>
	<hr/>
	<ol>
<%
	Object obj = request.getAttribute("list");
	if(obj != null){
		EmpVO[] e_ar = (EmpVO[]) obj;
		
		for(EmpVO evo: e_ar){
			%>
			<li>
				<%=evo.getEmpno() %> |
				<%=evo.getEname() %> |
				<%=evo.getJob() %> |
				<%=evo.getDeptno() %>
			</li>
			<%
		}
	}
%>
	</ol>
</body>
</html>