<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 3</title>
</head>
<body>
	<h2>${test }</h2>
	
	<button onclick="goNext()">이전</button>
	

    <script>
        // let goNext = function(){
        // function goNext(){
        let goNext = () => {
        	
            location.href="Controller3?type=hungry"; // forward가 아닌 redirect로 페이지 이동
            
        }

    </script>
</body>
</html>