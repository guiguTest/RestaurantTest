$(function() {  
    /*  
     * 1. 得到所有的错误信息，循环遍历之。调用一个方法来确定是否显示错误信息！  
     */  
    $(".errorClass").each(function() {  
        showError($(this));//遍历每个元素，使用每个元素来调用showError方法  
    });  
      
    /*  
     * 3. 输入框得到焦点隐藏错误信息  
     */  
    $(".inputClass").focus(function() {  
        var labelId = $(this).attr("id") + "Error";//通过输入框找到对应的label的id  
        $("#" + labelId).text("");//把label的内容清空！  
        showError($("#" + labelId));//隐藏没有信息的label  
    });  
      
    /*  
     * 4. 输入框失去焦点进行校验  
     */  
    $(".inputClass").blur(function() {  
        var id = $(this).attr("id");//获取当前输入框的id  
        var funName = "validate" + id.substring(0,1).toUpperCase() + id.substring(1) + "()";//得到对应的校验函数名  
        eval(funName);//执行函数调用  
    });  
      
    /*  
     * 5. 表单提交时进行校验  
     */  
    $("#registForm").submit(function() {  
        var bool = true;//表示校验通过  
        if(!validateUserName()) {  
            bool = false; 
        }  
        if(!validateUserNickname()) {  
            bool = false;
        }  
        if(!validateUserPhone()) {  
            bool = false;
        }  
        if(!validateEmail()) {  
        	bool = false;
        } 
        document.execCommand(bool);
        return bool;  
    });  
});  
  
/*  
 * 登录名校验方法  
 */  
function validateUserName() {  
    var id = "userName";  
    var value = $("#" + id).val();//获取输入框内容  
    /*  
     * 1. 非空校验  
     */  
    if(!value) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("用户姓名不能为空！");  
        showError($("#" + id + "Error"));  
        return false;  
    }  
    /*  
     * 2. 长度校验  
     */  
    if(value.length < 2 || value.length > 15) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("用户姓名必须在2 ~ 15之间！");  
        showError($("#" + id + "Error"));  
        false;  
    }  
     
    return true;  
}  
  
/*  
 * 登录密码校验方法  
 */  
function validateUserNickname() {  
    var id = "userNickname";  
    var value = $("#" + id).val();//获取输入框内容  
    /*  
     * 1. 非空校验  
     */  
    if(!value) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("昵称不能为空！");  
        showError($("#" + id + "Error"));  
        return false;  
    }  
    /*  
     * 2. 长度校验  
     */ 
    if(value.length < 2 || value.length > 15) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("长度是2-15位");  
        showError($("#" + id + "Error"));  
        return false;  
    } 
    
    return true;      
}  
function validateUserPhone() {  
	var id = "userPhone";  
	var value = $("#" + id).val();//获取输入框内容  
	/*  
	 * 1. 非空校验  
	 */  
	if(!value) {  
		/*  
		 * 获取对应的label  
		 * 添加错误信息  
		 * 显示label  
		 */  
		$("#" + id + "Error").text("联系方式不能为空！");  
		showError($("#" + id + "Error"));  
		return false;  
	}  
	/*  
	 * 2. 长度校验  
	 */ 
	if(!/^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$/.test(value)) {  
		/*  
		 * 获取对应的label  
		 * 添加错误信息  
		 * 显示label  
		 */  
		$("#" + id + "Error").text("输入的必须是可用的手机号码！");  
		showError($("#" + id + "Error"));  
		false;  
	} 
	
	return true;      
}  
function validateEmail() {  
    var id = "email";  
    var value = $("#" + id).val();//获取输入框内容  
    /*  
     * 1. 非空校验  
     */  
    if(!value) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("Email不能为空！");  
        showError($("#" + id + "Error"));  
        return false;  
    }  
    /*  
     * 2. Email格式校验  
     */  
    if(!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/.test(value)) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("错误的Email格式！");  
        showError($("#" + id + "Error"));  
        false;  
    }    
}

/*  
 * 判断当前元素是否存在内容，如果存在显示，不页面不显示！  
 */  
function showError(ele) {  
    var text = ele.text();//获取元素的内容  
    if(!text) {//如果没有内容  
        ele.css("display", "none");//隐藏元素  
    } else {//如果有内容  
        ele.css("display", "");//显示元素  
    }  
}  
  
