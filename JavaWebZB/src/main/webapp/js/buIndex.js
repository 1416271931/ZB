/**
 * 
 */
$(document).ready(function(){
	var tbody0;
	$.ajax({
		url:'',
		type:'get',
		timeout:1000,
		dataType:'json',
		success:function(msg){
			console.log(msg);
			tbody0="";
			for (var i = 0; i < msg.length; i++) {
				
			}
		},
		error:function(msg){}
	});
});