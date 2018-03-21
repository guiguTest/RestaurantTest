<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>字典添加</title>
  <meta name="description" content="这是一个 user 页面">
  <meta name="keywords" content="user">
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
<div class="am-cf admin-main">
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">数据资料</strong> / <small>Personal information</small></div>
    </div>

    <hr/>
    
    <div class="am-g">
	<form class="am-form am-form-horizontal" action="${pageContext.request.contextPath}/data/add.action">
      <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-1">
          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">编号</label>
            <div class="am-u-sm-9">
              <input type="text" name="dataId" value="${dataDictorytion.dataId}" readonly="readonly" placeholder="编号">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">数据名称</label>
            <div class="am-u-sm-9">
              <select name="dataNote">
              	<option value="">请选择</option>
                <option ${dataDictorytion.dataNote=='菜品类型'?'selected':''}>菜品类型</option>
                <option ${dataDictorytion.dataNote=='员工类型'?'selected':''}>员工类型</option>
                <option ${dataDictorytion.dataNote=='订单状态'?'selected':''}>订单状态</option>
              </select>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-phone" class="am-u-sm-3 am-form-label">数据详细</label>
            <div class="am-u-sm-9">
              <input type="text" name="dataDetail" value="${dataDictorytion.dataDetail}" placeholder="数据详细">
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-intro" class="am-u-sm-3 am-form-label">备注信息</label>
            <div class="am-u-sm-9">
              <textarea rows="5" name="note" placeholder="输入备注信息">${dataDictorytion.note}</textarea>
            </div>
          </div>

          <div class="am-form-group">
            <div class="am-u-sm-9 am-u-sm-push-3">
              <button type="submit" class="am-btn am-btn-primary">保存</button>
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
