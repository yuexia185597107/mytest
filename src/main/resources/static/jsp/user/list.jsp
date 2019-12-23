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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>
	 <body>
         
  <table border="1">
         <tr>
             <td>用户姓名</td>
             <td>用户年龄</td>
             <td>电话</td>
             <td>操作</td>
         </tr>
         
         <s:iterator value="list" var="item">
              <tr>
		             <td>${item.name }</td>
		             <td>${item.age}</td>
		             <td>${item.phone }</td>
		             <td>
		         <a href="jsp/role/roleGrant.jsp?userId=${item.id }">角色授权</a>
		         <a href="jsp/module/grant2.jsp?userId=${item.id }">功能授权</a>
		         <a href="http://localhost:8080/ssh_example/moduleAction!findAll?userId=${item.id }">功能授权1</a>
	 <a href="http://localhost:8080/ssh_example/accessControlAction!findByUser?userId=${item.id }">功能授权9</a>
		             </td>
             </tr>
         </s:iterator>
     </table>
  </body>
</html>
