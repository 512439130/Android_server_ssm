<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>登录</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="statics/css/bootstrap.min.css">
    <link rel="stylesheet" href="statics/css/font-awesome.min.css">
    <link rel="stylesheet" href="statics/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="statics/css/all-skins.min.css">
    <link rel="stylesheet" href="statics/css/main.css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <b>登录</b>
    </div>
    <form action="/login" method="post">
        <!-- /.login-logo -->
        <div class="login-box-body">
            <p class="login-box-msg">登录</p>
            <c:if test="${msg != null}">
                <div class="alert alert-danger alert-dismissible">
                    <h4 style="margin-bottom: 0px;"><i class="fa fa-exclamation-triangle"></i>${msg}</h4>
                </div>
            </c:if>
            <div class="form-group has-feedback">
                <input type="text" class="form-control" name="username" placeholder="账号" value="${username}">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" name="password" placeholder="密码">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>

            <div class="row">
                <!-- /.col -->
                <div class="col-xs-4">
                    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                </div>
                <div class="col-xs-4">
                    <a href="/register">去注册</a>
                </div>
                <!-- /.col -->
            </div>
            <!-- /.social-auth-links -->

        </div>
        <!-- /.login-box-body -->
    </form>
</div>
<!-- /.login-box -->
<script src="statics/libs/jquery.min.js"></script>
<script src="statics/libs/bootstrap.min.js"></script>
<script src="statics/libs/jquery.slimscroll.min.js"></script>
<script src="statics/libs/fastclick.min.js"></script>
<script src="statics/libs/app.js"></script>
</body>
</html>
