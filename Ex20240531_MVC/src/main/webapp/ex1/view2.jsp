<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view2</title>
</head>
<body>
	<h1>페이지 2</h1>

	<%
		// request에 v1이라는 이름으로 저장된 값을 출력한다.
		Object obj = request.getAttribute("v1");
		//얻어낸 값이 null이 아니면
		if(obj != null){
			String msg = (String) obj;
			%>
			<h2><%=msg %></h2> 
			<%
		} else{
			%>
			<h2>없습니다.</h2> 
			<%
		}
	 %>

</body>
</html>