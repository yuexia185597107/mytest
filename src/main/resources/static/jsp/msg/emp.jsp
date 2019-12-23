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
          当前节点不用跳转，扣出来<a href='organizationAction!findByParent?pid="+parent.getId()+" '>
	-->

  </head>
  <body>
  1234234
    <!-- <s:action name="userAction" namespace="/" var="a"></s:action>-->
     <s:action name="empAction" namespace="/" var="a"></s:action>
     <table border="1">
         <tr>
             <td>员工姓名</td>
             <td>工作</td>
             <td>工资</td>
             <td>津贴</td>
             <td>部门编号</td>
         </tr>
         
         <s:iterator value="list" var="item">
              <tr>
		             <td>${item.ename}</td>
		             <td>${item.job}</td>
		             <td>${item.sal }</td>
		             <td>${item.comm }</td>
		             <td>${item.departmentid}</td>
		             <td>
		         <a href="jsp/role/roleGrant.jsp?userId=${item.id }">角色授权</a>
		         <a href="jsp/module/grant2.jsp?userId=${item.id }">功能授权</a>
		         <a href="http://localhost:8080/ssh_example/moduleAction!findAll?userId=${item.id }">功能授权1</a>
	 <a href="http://localhost:8080/ssh_example/accessControlAction!findByUser?userId=${item.id }">功能授权9</a>
		             </td>
             </tr>
         </s:iterator>
     </table>
     
     
   <!--  
    <form action="sendMsgZhanAction!add" method="post">
         标题：<input name="title"><br/>
         收件人列表：
         <s:iterator value="#a.list" var="item">
             <input type="checkbox" name="userIds" value="${item.id}"/>${item.name}
         </s:iterator><br/>
         内容：<textarea name="content" rows="10" cols="20"></textarea>
         <input type="submit"/>
     </form>    
     --> 
  </body>
</html>
