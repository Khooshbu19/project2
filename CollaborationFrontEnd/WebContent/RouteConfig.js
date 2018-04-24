var myApp=angular.module("myApp",["ngRoute"]);
myApp.config(
		function($routeProvider)
		{
	$routeProvider
				.when("/login",{templateUrl:"template/login.html"})
				.when("/blog",{templateUrl:"C_blog/blog.html",controller:"BlogController"})
				.when("/register",{templateUrl:"C_user/register.html",controller:"UserController"})
				.when("/login",{templateUrl:"C_user/login.html",controller:"UserController"})
		});