<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>饿不了点餐--用户管理</title>
  <meta name="description" content="这是一个 table 页面">
  <meta name="keywords" content="table">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <%@ include file="/view/public/common.jspf"%>
</head>
<body>
<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->


  <!-- sidebar end -->

  <!-- content start -->
  <form action="${pageContext.request.contextPath}/userLogin/list.action" method="post" class="form-horizontal">
  <div class="admin-content">

    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">饿不了点餐--注册用户列表</strong> / <small>Table</small></div>
    </div>
    <div class="am-g">
      <div class="am-u-md-6 am-cf">
        <div class="am-fl am-cf">
          <div class="am-btn-toolbar am-fl">
            <div class="am-btn-group am-btn-group-xs">
             <a class="am-btn am-btn-default" href="${pageContext.request.contextPath }/view/userLogin/userLogin_add.jsp"><span class="am-icon-plus"></span> 新增</a>
            </div>

            
          </div>
        </div>
      </div>
      <div class="am-u-md-3 am-cf">
        <div class="am-fr">
          <div class="am-input-group am-input-group-sm">
            <input type="text" class="am-form-field" name="user.userName">
                <span class="am-input-group-btn">
                  <button class="am-btn am-btn-default" type="submit" >搜索</button>
                </span>
          </div>
        </div>
      </div>
    </div>

    <div class="am-g">
      <div class="am-u-sm-12">
        <form class="am-form">
          <display:table class="am-table am-table-striped am-table-hover table-main" name="list" pagesize="10" requestURI="${pageContext.request.contextPath }/userLogin/list.action">
          	<display:column property="loginId" title="编号"></display:column>
          	<display:column property="username" title="用户账号" href="${pageContext.request.contextPath }/userLogin/show.action" paramId="loginId" paramProperty="loginId"></display:column>
          	<display:column paramId="loginId" paramProperty="loginId"  title="操作" value="修改" href="${pageContext.request.contextPath }/userLogin/load.action"  class="btn am-btn-default am-btn-xs am-text-secondary"></display:column>
          	<display:column paramId="loginId" href="${pageContext.request.contextPath }/userLogin/delete.action" paramProperty="loginId" value="删除" class="delete btn am-btn-default am-btn-xs am-text-danger"></display:column>
          </display:table>
          <div class="am-cf">
</div>
          <hr />
        </form>
      </div>

    </div>
  </div>
  </form>
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
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/amazeui.min.js"></script>
<!--<![endif]-->
<script src="assets/js/app.js"></script>
</body>
</html>
