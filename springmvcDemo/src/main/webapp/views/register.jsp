<%@ taglib prefix="form" 
uri="http://www.springframework.org/tags/form" %>

<%-- <form:form action="/students/signup" method="post" modelAttribute="studentModel">
Name: <form:input type="text" path="name" />
<form:errors path="name"/> <br/>
MailId: <form:input type="text" path="email"/>
<form:errors path="email"/> <br/>
Password: <form:input type="password" path="password"/>
<form:errors path="password"/> <br/>
<input type="submit" value="Register">
</form:form> --%>

<html lang="en">
<head>
  <title>Spring MVC Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron">
	<form:form action="/students/signup" method="post" modelAttribute="studentModel" role="form">
				<div class="form-group">
					 
					<label for="exampleInputtext1">
						Name:
					</label>
					<form:input type="text" class="form-control" path="name"  id="exampleInputtext1" />
				</div>
				<div class="form-group">
					 
					<label for="exampleInputemail1">
						MailId:
					</label>
					<form:input type="email" class="form-control"  path="email" id="exampleInputemail1" />
				</div>
				
				<div class="form-group">
					 
					<label for="exampleInputpassword1">
						Password:
					</label>
					<form:input type="password" class="form-control" path="password" id="exampleInputpassword1" />
				</div>
				
				<button type="submit" class="btn btn-primary">
					Submit
				</button>
			</form:form>
</div>
</body>
</html>