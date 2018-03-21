<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
  <script src="${pageContext.request.contextPath}/view/user/user_error.js"   type="text/javascript"></script>
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
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">用户添加</strong> / <small>Personal information</small></div>
    </div>

    <hr/>
    
    <div class="am-g">
	<form class="am-form am-form-horizontal" action="${pageContext.request.contextPath}/user/add.action" id="registForm">
      <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-1">
          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">用户编号</label>
            <div class="am-u-sm-9">
              <input type="text" name="userId" value="${user.userId}" readonly="readonly" placeholder="编号">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">用户姓名</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="userName" name="userName" value="${user.userName}" placeholder="用户姓名">
               <small class="errorClass" id="userNameError">${errors.userName}</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-phone" class="am-u-sm-3 am-form-label">用户性别</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="userSex" name="userSex" value="${user.userSex}" placeholder="用户性别">
              <small class="errorClass" id="userSexError">${errors.userSex}</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-QQ" class="am-u-sm-3 am-form-label">用户昵称</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="userNickname" name="userNickname" value="${user.userNickname}" placeholder="用户昵称">
              <small class="errorClass" id="userNicknameError">${errors.userNickname}</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-weibo" class="am-u-sm-3 am-form-label">联系方式</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="userPhone" name="userPhone" value="${user.userPhone}" placeholder="联系方式">
              <small class="errorClass" id="userPhoneError">${errors.userPhone}</small>
            </div>
          </div>
          
          <div class="am-form-group">
            <label for="user-weibo" class="am-u-sm-3 am-form-label">qq</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="userQq" name="userQq" value="${user.userQq}" placeholder="qq">
              <small class="errorClass" id="userQqError">${errors.userQq}</small>
            </div>
          </div>
          
          <div class="am-form-group">
            <label for="user-weibo" class="am-u-sm-3 am-form-label">email</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="email" name="email" value="${user.email}" placeholder="email">
              <small class="errorClass" id="emailError">${errors.email}</small>
            </div>
          </div>
          
          <div class="am-form-group">
            <label for="user-weibo" class="am-u-sm-3 am-form-label">送货地址</label>
            <div class="am-u-sm-9">
              <input type="text" class="inputClass" id="userAddress" name="userAddress" value="${user.userAddress}" placeholder="送货地址">
              <small class="errorClass" id="userAddressError">${errors.userAddress}</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-intro" class="am-u-sm-3 am-form-label">备注信息</label>
            <div class="am-u-sm-9">
              <textarea rows="5" class="inputClass" id="userNote" name="userNote" placeholder="输入备注信息">${user.userNote}</textarea>
              <small class="errorClass" id="userNoteError">${errors.userNote}</small>
            </div>
          </div>

          <div class="am-form-group">
            <div class="am-u-sm-9 am-u-sm-push-3">
              <input type="submit" class="am-btn am-btn-primary" value="保存"/>
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
