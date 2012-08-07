<html>
<head>
	<title>Search Hubbub</title>
	<meta name="layout" content="main"/>
</head>
<body>
	<formset>
		<legend>Search for Friends</legend>
		
		<g:form action="advResults">
			<label for="name">Name</label>
			<g:textField name="fullName" />
			<label for="email">Email</label>
			<g:textField id="email" name="email"/>
			<label for="homepage">HomePage</label>
			<g:textField id="homepage" name="homepage"/>
			<label for="and">And</label>
			<g:radio id="queryType" name="queryType" value="and"/>
			<label for="or">Or</label>
			<g:radio id="queryType" name="queryType" value="or"/>
			<label for="not">Not</label>
			<g:radio id="queryType" name="queryType" value="not"/>
			
			<g:submitButton name="advSearch" value="Search"/>
			
		</g:form> 
	</formset>
</body>
</html>