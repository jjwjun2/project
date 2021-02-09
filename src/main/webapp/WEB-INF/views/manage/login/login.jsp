<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>



<div class="topnav">
	<a id="home" href="#">Home</a> 
	<a id="regi" href="#">회원가입</a>
	<a id="del" href="#">삭제</a>
	
	<div class="login-container">
		<input id="userid" type="text" placeholder="Username" name="username">
		<input id="password" type="text" placeholder="Password" name="psw">
		<button id="login-btn">Login2</button>
	</div>
</div>

<script>
	$(`#home`).click(function(){location.href = `${c}`})
	$(`#regi`).click(function(){location.href = `${c}/manage/register/register`})
	$(`#login-btn`).click(function(e) {
		e.preventDefault()
		login.login(`${c}`)
	})
	$(`#regi`).click(function(e) {
		e.preventDefault()
		regi.regi(`${c}`)
	})
	/* 	$(`#login-btn`).click(login({"username":document.getElementById(username).value(), 
	 "psw":document.getElementById(psw).value()})) */
</script>