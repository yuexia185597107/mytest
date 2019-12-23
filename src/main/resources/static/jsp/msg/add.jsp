<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
          当前节点不用跳转，扣出来<a href='organizationAction!findByParent?pid="+parent.getId()+" '> userAction!findAll
	-->

  </head>
  <body>
     <s:action name="user1Action" namespace="/" var="a"></s:action>
     <form action="sendMsgZhanAction!add" method="post">
         标题：<input name="title"><br/>
         收件人列表：
         <s:iterator value="#a.list" var="item">
             <input type="checkbox" name="userIds" value="${item.id}"/>${item.name}
         </s:iterator><br/>
         内容：<textarea name="content" rows="10" cols="20"></textarea>
         <input type="submit"/>
     </form>    
      
  </body>
</html>
