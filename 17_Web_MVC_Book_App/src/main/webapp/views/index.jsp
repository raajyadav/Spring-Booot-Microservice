<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>  Book Details </h1>

 <h2>
  <form action="book">
  
  Book Id : <input type="text" name="id">
  
  <input type="submit" value="Search">
  
  </form>
  
  </h2>
  
  
  <hr>
  
  <h3>
  Book Id : ${book.bookId} <br/>
  
  Book Name :${book.bookName} <br/>
  
  Book Price :${book.bookPrice} <br/>
  
  </h3>
  
</body>
</html>