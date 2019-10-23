<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
 <div style="margin:10px">
 		<h2>${STATUS_MESSAGE}</h2>
        <h2>Login Page:</h2>
        
        <form method="post" action="doLogin" >

            User Name : <input type="text" id="userName" name="userName"/><br/>

            Password : <input type="password" id="password" name="password"/><br/>

            <input type="submit" value="Login" />

        </form>
    </div>
</body>
</html>