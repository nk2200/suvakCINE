<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person Details</title>
</head>
<body>
<h1>${personDetails.name}</h1>
<img src="https://image.tmdb.org/t/p/w500${personDetails.profile_path}" alt="${personDetails.name}">
<p><strong>Known For:</strong> ${personDetails.known_for_department}</p>
<p><strong>Biography:</strong> ${personDetails.biography}</p>
<p><strong>Birthday:</strong> ${personDetails.birthday}</p>
<p><strong>Place of Birth:</strong> ${personDetails.place_of_birth}</p>
<p><strong>Popularity:</strong> ${personDetails.popularity}</p>
</body>
</html>
