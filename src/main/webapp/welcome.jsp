

<!DOCTYPE html>

<!-- [END_EXCLUDE] -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en" ng-app="tkmcApp">
<head>
  <link href='//fonts.googleapis.com/css?family=Marmelad' rel='stylesheet' type='text/css'>
  <title>Hello App Engine Flexible</title>
        <script src="libs/angular.min.js"></script>
        <script src="libs/angular-route.min.js"></script>
        <script src="js/angular-animate.min.js"></script>
        <script src="js/angular-touch.min.js"></script>
        <script src="js/angular-sanitize.js"></script>
        <script src="js/ui-bootstrap-tpls-2.5.0.min.js"></script>
        <script src="js/angular-busy.min.js"></script>
        <script src="module/app.module.js"></script>
        <script src="controllers/app.controllers.js"></script>
        <script src="directives/app.directives.js"></script>
        <script src="js/jquery.min.js"></script>
        
</head>
<body>
    <h1>Hello App Engine -- Flexible!</h1>

  <p>This is </p>
  <table>
    <tr>
      <td colspan="2" style="font-weight:bold;">Welcome ${username}</td>
    </tr>
    <tr>
      <td><a href='/hello'>The servlet</a></td>
    </tr>
  </table>

</body>
</html> 