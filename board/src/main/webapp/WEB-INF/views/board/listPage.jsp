<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<%@include file="../include/header.jsp" %>
<h1>
	게시물 목록
</h1>
<table>
	<tr>
	<th>BNO</th>
	<th>Title</th>
	<th>Writer</th>
	<th>RedDate</th>
	<th>ViewCnt</th>
	</tr>

	<c:forEach items="${list}" var="boardVO">
		<tr>
		<td>${boardVO.bno }</td>
		<td>
			<a href="/board/read?bno=${boardVO.bno }">${boardVO.title }</a>
		</td>
		<td>${boardVO.writer }</td>
		<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate }"/></td>
		<td>${boardVO.viewcnt }</td>
		</tr>
	</c:forEach>
	<div>
		<ui>
			<c:if test="${pageMaker.prev }">
				<li>
					&laquo;
				</li>
			</c:if>
		</ui>
		<c:forEach begin="${pageMaker.startPage }"
					end="${pageMaker.endPage }" var="idx">
			<li>
				<c:out value="${pageMaker.cri.page==idx?'class=active':''}"/>
					${idx }
			</li>
		</c:forEach>
		<ui>
			<c:if test="${pageMaker.next }">
				<li>
					&raquo;
				</li>
			</c:if>
		</ui>
	</div>
</table>
<%@include file="../include/footer.jsp" %>
</body>
</html>
