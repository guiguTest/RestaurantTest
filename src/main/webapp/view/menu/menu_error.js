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
        if(!validateMenuName()) {  
            bool = false;  
        }  
        if(!validateMenuPrice()) {  
            bool = false;  
        }  
        if(!validateMenuQuantity()) {  
            bool = false;  
        }  
        document.execCommand(bool);
        return bool;  
    });  
});  
  
/*  
 * 登录名校验方法  
 */  
function validateMenuName() {  
    var id = "menuName";  
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
        $("#" + id + "Error").text("菜品名称不能为空！");  
        showError($("#" + id + "Error"));  
        return false;  
    }  
    /*  
     * 2. 长度校验  
     */  
    if(value.length < 3 || value.length > 20) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("菜品名称必须在1 ~ 20之间！");  
        showError($("#" + id + "Error"));  
        false;  
    }  
     
    return true;  
}  
  
/*  
 * 登录密码校验方法  
 */  
function validateMenuPrice() {  
    var id = "menuPrice";  
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
        $("#" + id + "Error").text("价格不能为空！");  
        showError($("#" + id + "Error"));  
        return false;  
    }  
    /*  
     * 2. 长度校验  
     */ 
    if(!/^([0-9])+(\.)?([0-9]{0,2})/.test(value)) {  
        /*  
         * 获取对应的label  
         * 添加错误信息  
         * 显示label  
         */  
        $("#" + id + "Error").text("输入的必须是合法数字");  
        showError($("#" + id + "Error"));  
        false;  
    } 
    
    return true;      
}  
function validateMenuQuantity() {  
	var id = "menuQuantity";  
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
		$("#" + id + "Error").text("库存不能为空！");  
		showError($("#" + id + "Error"));  
		return false;  
	}  
	/*  
	 * 2. 长度校验  
	 */ 
	if(!/^([0-9])+/.test(value)) {  
		/*  
		 * 获取对应的label  
		 * 添加错误信息  
		 * 显示label  
		 */  
		$("#" + id + "Error").text("输入的必须是合法数字");  
		showError($("#" + id + "Error"));  
		false;  
	} 
	
	return true;      
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
  
