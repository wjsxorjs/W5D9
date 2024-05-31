<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 1</title>
</head>
<body>
	<h2>${msg }</h2>
	
	<button onclick="goNext()">다음</button>
	

    <script>
        // let goNext = function(){
        // function goNext(){
        let goNext = () => {
        	
            location.href="Controller3?type=date"; // forward가 아닌 redirect로 페이지 이동
            
        }

    </script>
</body>
</html>