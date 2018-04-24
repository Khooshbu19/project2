'use strict';
myApp.controller("UserController",['$rootScope','$scope','$location','$http',function($rootScope,$scope,$loaction,$http)
{
console.log("user controller loaded")
$scope.user={userId:'',u_username:'',u_password:'',u_confirmPassword:'',u_firstname:'',u_lastname:''}

$scope.addUser=function()
{	console.log($scope.user)
	console.log('Adding User Information');
$http.post('http://localhost:8086/Middleware/addUser',$scope.user)
	.then(function(response)
			{
			$location.path('/register');
			});


};	

}]);