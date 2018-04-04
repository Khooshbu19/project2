var myApp=angular.module("myApp",["ngRoute"]);
myApp.config(function($routeProvider)
		{
	$routeProvider.when("/",{templateUrl:"/index.html"})
				.when("/login",{templateur:template/login.html})
	
		});