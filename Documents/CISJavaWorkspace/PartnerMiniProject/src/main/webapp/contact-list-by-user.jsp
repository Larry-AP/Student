<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Address Book Lists</title>
</head>
<body>

	<form method = "post" action = "navigationAllListsServlet"> <table>
	
<c:forEach items="${requestScope.allLists}" var="currentlist"> <tr>
	<td><input type="radio" name="id" value="${currentlist.id}"></td> <td><h2>${currentlist.listName}</h2></td></tr>
	<tr><td colspan="3">Date: ${currentlist.date}</td></tr> <tr><td colspan="3">Shopper:
	${currentlist.shopper.shopperName}</td></tr>
	<c:forEach var = "listVal" items = "${currentlist.listOfItems}">
	<tr><td></td><td colspan="3"> ${listVal.species}, ${listVal.gender} , ${listVal.age}
	
		</td> </tr>
	</c:forEach>
	</c:forEach>
</table>
	<input type = "submit" value = "edit" name="doThisToList"> <input type = "submit" value = "delete" name="doThisToList"> <input type="submit" value = "add" name = "doThisToList"> </form>
	<a href="addPetsForListServlet">Create a new Pet List</a> <a href="index.html">Insert a new item</a>
</body>


</body>
</html>