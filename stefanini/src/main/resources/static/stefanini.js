/**
 * Created by Paulo on 27/04/2019.
 */
var stefanini = angular.module('stefanini',['ui.bootstrap', 'ngResource', 'ngRoute', 'ngCookies', 'ui.router', 'angularModalService',
	'ngAnimate', 'ngProgress', 'ngFileUpload']);

stefanini.config(['$stateProvider', '$urlRouterProvider', '$routeProvider', function($stateProvider, $urlRouterProvider, $routeProvider) {
	 
	$stateProvider.state('/', {
	   url: '/',
	   templateUrl : 'pages/heroi/poderes.html',
	   controller : 'cadastraPoderController',
	}).state('group', {
	   url: '/group',
	   templateUrl : 'pages/face-group/list-face-group.html',
	   controller : 'listFaceGroupLargeController',
	});
	
   $urlRouterProvider.otherwise('/');
}]);