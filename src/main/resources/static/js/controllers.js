angular.module('UserForms.controllers', []).
controller('loginController', function($scope, $http) {
    $scope.login = function() {
       var email = $( "#emailField" ).val();
       var password = $( "#passwordField" ).val();
       $http({
           method: 'POST',
           url: 'http://localhost:8080/authenticate',
           data: { "email": email, "pass": password }
       }).then(function successCallback(response) {
             alert("OK");
           }, function errorCallback(response) {
             alert("NOT OK");
           });
     }
});