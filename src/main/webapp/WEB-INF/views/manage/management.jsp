<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>





<h1>List</h1>
<a id="home" href="#"> Go Home </a>
<table class="table table-hover">
	<thead>
		<tr>
			<th scope="col" class="text-center">회원 아이디</th>
			<th scope="col" class="text-center">비밀번호</th>
			<th scope="col" class="text-center">번호</th>
			<th scope="col" class="text-center">구매상품</th>
		</tr>
	</thead>
</table>


<%-- <article id="layout-container" style="margin-top: 100px">
	<tiles:insertAttribute name="conts" />
</article> --%>

	

<script>
	$(`#home`).click(function() {location.href = `${c}`})
</script>

