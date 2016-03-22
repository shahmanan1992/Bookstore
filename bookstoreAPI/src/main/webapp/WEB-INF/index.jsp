<%@ page isELIgnored="false" %>
<html>
<head>
<title>Library Login</title>
</head>
<body>
<h1>${headerMessage}</h1>
<h2>Login</h2>
<form method="post" action="/bookstoreAPI/book/submission.html">
<input type="email" name="id" /><br/><br/>
<input type="password" name="pwd" /><br /><br />
<input type="submit" value="Log In" />

</form>
</body>
</html>