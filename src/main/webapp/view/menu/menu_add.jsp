<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>菜品添加</title>
  <meta name="description" content="这是一个 user 页面">
  <meta name="keywords" content="user">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <%@ include file="/view/public/common.jspf"%>
  <script src="${pageContext.request.contextPath}/view/menu/menu_error.js"   type="text/javascript"></script>
</head>
<body>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->
<div class="am-cf admin-main">
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">菜品资料</strong> / <small>Personal information</small></div>
    </div>

    <hr/>
    
    <div class="am-g">
	<form class="am-form am-form-horizontal" action="${pageContext.request.contextPath}/menu/add.action" id="registForm">
      <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
        <div class="am-panel am-panel-default">
          <div class="am-panel-bd">
            <div class="am-g">
              <div class="am-u-md-4">
                <img class="am-img-circle am-img-thumbnail" src="http://amui.qiniudn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" alt=""/>
              </div>
              <div class="am-u-md-8">
                <p>你可以使用<a href="#">gravatar.com</a>提供的图片或者使用本地上传图片。 </p>
                <!-- <form class="am-form"> -->
                  <div class="am-form-group">
                    <input type="file" name="menuPrice" value="${menu.menuPrice}">
                    <p class="am-form-help">请选择要上传的文件...</p>
                    <button type="button" class="am-btn am-btn-primary am-btn-xs">保存</button>
                  </div>
                <!-- </form> -->
              </div>
            </div>
          </div>
        </div>

      </div>
      <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">菜品编号</label>
            <div class="am-u-sm-9">
              <input type="text" name="menuId" value="${menu.menuId}" readonly="readonly" placeholder="编号">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">菜品名称</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="menuName" name="menuName" value="${menu.menuName}" placeholder="菜品名称">
               <small class="errorClass" id="menuNameError">${errors.menuName}</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-phone" class="am-u-sm-3 am-form-label">菜品单价</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="menuPrice" name="menuPrice" value="${menu.menuPrice}" placeholder="单价">
              <small class="errorClass" id="menuPriceError">${errors.menuPrice}</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-QQ" class="am-u-sm-3 am-form-label">剩余库存</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="menuQuantity" name="menuQuantity" value="${menu.menuQuantity}" placeholder="输入剩余库存">
              <small class="errorClass" id="menuQuantityError">${errors.menuQuantity}</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-weibo" class="am-u-sm-3 am-form-label">菜品类型</label>
            <div class="am-u-sm-9">
              <select class="form-control input-sm" name="menuType" >
                		<option >请选择菜品类型</option>
                	<c:forEach items="${dataList}" var="data">
                		<option value="${data.dataDetail}"  ${data.dataDetail==menu.menuType?'selected':'' }>${data.dataDetail}</option>
                	</c:forEach>
              </select>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-intro" class="am-u-sm-3 am-form-label">备注信息</label>
            <div class="am-u-sm-9">
              <textarea rows="5" name="menuNote" placeholder="输入备注信息">${menu.menuNote}</textarea>
            </div>
          </div>

          <div class="am-form-group">
            <div class="am-u-sm-9 am-u-sm-push-3">
              <input type="submit" class="am-btn am-btn-primary" id="registForm" value="保存"></input>
            </div>
          </div>
      </div>
    </form>
    </div>
  </div>
  <!-- content end -->

</div>
<footer>
  <hr>
  <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/polyfill/rem.min.js"></script>
<script src="assets/js/polyfill/respond.min.js"></script>
<script src="assets/js/amazeui.legacy.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
</body>
</html>
