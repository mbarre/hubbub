<html>
	<head>
		<title>Search Result</title>
		<meta name="layout" content="main"/>
	</head>
	<body>
		<h1>Results</h1>
		<p>Searched ${com.grailsinaction.User.count()} records for items matching <em>${term}</em>.
		Found <strong>${users?.size()}</strong> hits.
		</p>
		<ul>
			<g:each var="user" in="${users}">
				<li>${user.userId}</li>
			</g:each>
		</ul>
		<g:link action='advSearch'>Search Again</g:link>
	</body>
</html>