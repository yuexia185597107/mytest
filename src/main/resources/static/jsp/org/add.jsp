<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!--  <%@ page language="java" import="com.oa.po.Organization" %>-->
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="jdk.nashorn.internal.ir.RuntimeNode.Request"%>
<%@page import="com.oracle.jrockit.jfr.RequestableEvent"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>register page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	Organization导包JSP，
    String temp="|"+parent.getName(); temp="|"+ parent.getName()+temp;
          当前节点不用跳转，扣出来<a href='organizationAction!findByParent?pid="+parent.getId()+" '>
	-->

  </head>
  <body>
     <form action="organizationAction!add" method="post">
         <input type="hidden" name="organization.parent.id" value="${param.pid}"/>
                        机构名称： <input name="organization.name"/>
                        机构地址：<input name="organization.address"/>
         <input type="submit"/>
     </form>    
      
  </body>
</html>
