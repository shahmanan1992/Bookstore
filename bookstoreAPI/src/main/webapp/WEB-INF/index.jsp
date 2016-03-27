<%@ page isELIgnored="false" %>
<%-- <html>
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
</html> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Homepage</title>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<!-- <meta name="keywords" content="" />
    <meta name="description" content="" />
     -->
	<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Varela"  />
	<link rel="stylesheet" href="/bookstoreAPI/css/default.css" />
	<!-- <link rel="stylesheet" href="/bookstoreAPI/css/fonts.css" /> -->

</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="#">Wallace Library</a></h1>
		</div>
		<div id="menu">
			<ul>
				<li class="current_page_item"><a href="#" accesskey="1" title="">Homepage</a></li>
				<li><a href="#" accesskey="2" title="">Our Catalog</a></li>
				<li><a href="#" accesskey="3" title="">Use Library</a></li>
				<li><a href="#contact-us" accesskey="5" title="">Contact Us</a></li>
			</ul>
		</div>
	</div>
	</div>
	<div id="banner">
		<div class="container">
			<div class="title">
				<!--<h2>Etiam rhoncus volutpat</h2>-->
				<span class="byline">Search our books collection</span>
			</div>
			<div class="title">
			<form class="actions" action="login.html" method="post">
				<div class="form-group">
					<input type="text" name="searched_book" class="button_text" placeholder="search using books, author, articles " /><br/><br/>
				</div>
				<div class="form-group">
					<input type="submit" value="Search" class="button_search" />
				</div>

			</form>
			</div>
		</div>
	</div>
	<div id="extra" class="container">
		<div class="title">
			<h2>Use Library</h2>
			<span class="byline">Use library service to reserve a room, request, renew or borrow books</span> </div>
		<div id="three-column">
			<div class="boxA">
				<div class="box">
					<span class="fa"><img src="/bookstoreAPI/images/reserve.PNG" /></span>
					<p><a href="" class="use_library">Reserve a study room before it gets full.</a></p>
				</div>
			</div>
			<div class="boxB">
				<div class="box">
					<span class="fa"><img src="/bookstoreAPI/images/user.PNG" /></span>
					<p><a href="" class="use_library">Borrow, renew or request books from other colleges based on requirement.</a></p>
				</div>
			</div>
			<div class="boxC">
				<div class="box">
					<span class="fa"><img src="/bookstoreAPI/images/more.PNG" /></span>
					<p> <a href="" class="use_library">Some more things.</a></p>
				</div>
			</div>
		</div>

	</div>
	<div id="featured">
		<div class="container">
			<div class="title">
				<h2>About Us</h2>
				<span class="byline">Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue</span> </div>
			<p>This is <strong>PlainDisplay</strong>, a free, fully standards-compliant CSS template designed by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>. The photos in this template are from <a href="http://fotogrph.com/"> Fotogrph</a>. This free template is released under the <a href="http://templated.co/license">Creative Commons Attribution</a> license, so you're pretty much free to do whatever you want with it (even use it commercially) provided you give us credit for it. Have fun :) </p>
		</div>
		<ul class="actions">
			<li><a href="#" class="button">Etiam posuere</a></li>
		</ul>
	</div>
	<div id="page" class="container">
		<div class="title">
			<h2>Contact Us</h2>
			<!--<span class="byline">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</span> </div>-->
		<!--<p> Vivamus fermentum nibh in augue. Praesent a lacus at urna congue rutrum. Nulla enim eros nibh. Duis enim nulla, luctus eu, dapibus lacinia, venenatis id, quam. Vestibulum imperdiet, magna nec eleifend rutrum, nunc lectus vestibulum velit, euismod lacinia quam nisl id lorem. Quisque erat. Vestibulum pellentesque, justo mollis pretium suscipit, justo nulla blandit libero, in blandit augue justo quis nisl. Fusce mattis viverra elit. Fusce quis tortor.</p>-->
		<!--<ul class="actions">-->
			<!--<li><a href="#" class="button">Etiam posuere</a></li>-->
		<!--</ul>-->


			<form class="actions" id="contact-us" action="" method="post">
				<div class="form-group">
					<input type="text" class="button_text contact_border"  required="required" placeholder="Your Name" />
				</div>
				<div class="form-group">
					<input type="text" class="button_text contact_border" required="required"  placeholder="Your Email" />
				</div>
				<div class="form-group">
					<textarea name="message" required="required" class="button_text contact_border" style="min-height: 150px;" placeholder="Message"></textarea>
				</div>
				<div class="form-group">
					<input type="submit" class="button_search" value="SUBMIT REQUEST" />
				</div>

			</form>
	</div>
	</div>
</div>
	<div id="copyright" class="container">
	<p>&copy; Untitled. All rights reserved. | Photos by <a href="http://fotogrph.com/">Fotogrph</a> | Design by <a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>
</div>

</body>
</html>
