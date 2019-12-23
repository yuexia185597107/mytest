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
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">F
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
 员工不是所有。
    <!-- <s:action name="userAction" namespace="/" var="a"></s:action>   -->
    <s:action name="user1Action" namespace="/" var="a"></s:action>
     <table border="1">
         <tr>
             <td>员工ID</td>
             <td>年龄</td>
             <td>员工姓名</td>
             <td>电话</td>
             <td>密码</td>
             
         </tr>
         
         <s:iterator value="#a.list" var="item">
              <tr>
                    <td>${item.id}</td>
                    <td>${item.age}</td>
		             <td>${item.name}</td>
		             <td>${item.phone}</td>
		             <td>${item.pwd }</td>  
		             <td>
		         <a href="jsp/role/roleGrant.jsp?userId=${item.id }">角色授权</a>
		         <a href="jsp/module/grant2.jsp?userId=${item.id }">功能授权</a>
		         <a href="http://localhost:8080/ssh_example/moduleAction!findAll?userId=${item.id }">功能授权1</a>
	 <a href="http://localhost:8080/ssh_example/accessControlAction!findByUser?userId=${item.id }">功能授权9</a>
	 <form action="userActionDelect"  method="post"><span>ID：</span><input type="text" name="id" value="${item.id}"/>
	 <input type="submit"  style="height:25px;width:237px"" value="删除当前员工" />  </form>
		             </td>
             </tr>
         </s:iterator>
         <tr/>
         
  </form>
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
