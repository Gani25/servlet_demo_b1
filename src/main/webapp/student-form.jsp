<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr"
	crossorigin="anonymous">

</head>
<body>

	<div class="container w-50 mt-5">
	<h1>Student Form</h1>
	<form method="post" action="student">
		<div class="mb-3">
			<label for="firstname" class="form-label">First Name</label> <input
				type="text" class="form-control" id="firstname" name="firstname">
		</div>

		<div class="mb-3">
			<label for="lastname" class="form-label">Last Name</label> <input
				type="text" class="form-control" id="lastname" name="lastname">
		</div>
		<div class="mb-3">
		<label class="form-label">Gender</label>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="male" value="Male" checked> <label class="form-check-label"
					for="male"> Male</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="female" value="Female"> <label class="form-check-label"
					for="female"> Female</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="gender"
					id="other" value="Other" > <label class="form-check-label"
					for="other"> Other</label>
			</div>
			
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
		crossorigin="anonymous"></script>

</body>
</html>