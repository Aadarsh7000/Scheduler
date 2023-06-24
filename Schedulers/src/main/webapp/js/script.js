const wrapper = document.querySelector('.wrapper');
const loginLink = document.querySelector('.login-link');
const registerLink = document.querySelector('.register-link')
const loginPopup = document.querySelector('.btnLogin');
const iconClose = document.querySelector('.icon-close');
const togglePassword=document.getElementById('togglePassword')
const password=document.querySelector('#password')
const togglePasswordRegister=document.getElementById('registerToggle')
const registerPassword=document.querySelector('#rPassword')
const loginBtn=document.querySelector("submitBtn")
const email=document.querySelector("email")



registerLink.addEventListener('click',()=>{
	wrapper.classList.add('active');
});
loginLink.addEventListener('click',()=>{
	wrapper.classList.remove('active');
});
loginPopup.addEventListener('click',()=>{
	wrapper.classList.add('active-popup');
});//
iconClose.addEventListener('click',()=>{
	wrapper.classList.remove('active-popup');
});

togglePassword.addEventListener('click',function(e) {
   const type=password.getAttribute('type')==='password' ?'text' :'password';
   password.setAttribute('type',type);
   if(type==='password'){
	this.setAttribute('name',"eye");
   }else{
	
	this.setAttribute('name',"eye-off");
   }
  
});
togglePasswordRegister.addEventListener('click',function(e){
	const type=registerPassword.getAttribute('type')==='password'?'text':'password';
	registerPassword.setAttribute('type',type);
	if(type==='password'){
		this.setAttribute('name',"eye");
	   }else{
		
		this.setAttribute('name',"eye-off");
	   }
});






