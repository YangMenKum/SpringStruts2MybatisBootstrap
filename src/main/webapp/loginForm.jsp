<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix ="s" uri ="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title><s:text name = "loginPage"/></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    <!-- /login后需要跟东西  /login 是namescape-->
    <s:form action = "/login/login">
    	<s:textfield name = "username" key = "user"/>
    	<s:textfield name = "password" key = "pass"/>
    	<s:submit  key = "login"/>
    </s:form>
  </body>
</html>
