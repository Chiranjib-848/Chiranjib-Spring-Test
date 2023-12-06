$(function() {
	//console.log("success");
	//alert("Success");
	
	
	$("#ajaxbutton").click(function(){
		//var contextpath = "${pageContext.request.contextPath}";
		alert("test1");
		ajaxDemoStringify();
		alert("test2");
	});
	
	function ajaxDemo(){
		$.post(
				contextpath+"/ajaxSubmit",
				{
					name:"test",
					age:"20"
				},
				function(data){
					alert("Success 1");
				}
				);
	}
	
	
	function ajaxDemoStringify(){
	var data = { "description": "string", "id": 10, "username": "barubanget"}
	alert("Ajax Demo Stringify");
    $.ajax({
        data: JSON.stringify(data),
        dataType: 'json',
        url : contextpath+"/ajaxSubmit",
        type : 'post',
        success : function(data) {
            console.log("success post!");
            alert("Success 2");
        },
        error : function(e) {
            console.log("error: " + e);
        }
    });     
	}
	
});