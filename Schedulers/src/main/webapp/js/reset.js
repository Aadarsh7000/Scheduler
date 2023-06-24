const reset_Email=document.querySelector('forgetPassword')
const Toast=document.querySelector('snackbar')


function onSubmit(){
const email=document.getElementById('forgetPassword').value;

var x = document.getElementById("snackbar");
x.innerText="Reset Link Sent on  Your Email "+  email + " successfully";
  x.className = "show";
  setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);


};