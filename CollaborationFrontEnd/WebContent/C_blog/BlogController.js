'use strict';
myApp.controller("BlogController",['$rootScope','$scope','$location','$http',function($rootScope,$scope,$location,$http)
	{
	console.log("blog controller loaded")
	
	$scope.blog={blogId:'',blogName:'',blogContent:'',likes:'',loginname:''}
	

	$scope.addBlog=function()
	{   console.log($scope.blog);
		console.log('Adding Blog Information');
		$http.post('http://localhost:8086/Middleware/addBlog',$scope.blog)
		.then(function(response)
		{			
			$location.path('/blog');
		});
	};
	
	$scope.listBlog=function($scope)
	{
		$http.get('http://localhost:8086/Middleware/showAllApprovedBlogs')
		.then(function(response)
		{
			$scope.blogdata=response.data;
		});
	}
	}]);
	