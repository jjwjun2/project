<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>


<h1>Main page</h1>
<button id="login">로그인</button>
<button id="manage">회원관리</button>
<button id="register">회원가입</button>


<jsp:include page="./head.jsp"/>
<script>
	$(`#login`).click(function() {location.href = `${c}/manage/login/login`})
	$(`#manage`).click(function() {location.href = `${c}/manage/management/management`})
	$(`#register`).click(function(){location.href=`${c}/manage/register/register`})
</script>