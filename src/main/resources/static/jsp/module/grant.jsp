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
	 <!--   var uesrId= ${param.userId};-->
	-->
	<script type="text/javascript">
	   
	</script>
  </head>
  <body>
  <!--<s:action name="moduleAction!findAll" namespace="/" var="a"></s:action> executeResult="true"   ignoreContextParam="flase" 
         <a href="http://localhost:8080/ssh_example/accessControlAction!findByUser?userId=${item.id }">
           <a href="http://localhost:8080/ssh_example/accessControlAction!findByUser?userId=${item.id }">功能授权9</a>
    <s:action name="accessControlAction!findByUser" namespace="/" var="b"></s:action>
    -->
   <s:param name="tag"><s:property value="model.tag"/></s:param>   
     <s:action name="moduleAction!findAll" namespace="/" var="a"></s:action>
     <table border="1">
         <tr>
             <td>模块名称</td>
             <td>模块url</td>
             <td>模块描述</td>
             <td>CREATE</td>
             <td>READ</td>
             <td>UPDATE</td>
             <td>DELETE</td>
         </tr>
         
         <s:iterator value="#a.list" var="item">
              <tr>
		             <td>${item.name }</td>
		             <td>${item.url }</td>
		             <td>${item.des }</td>
		             <td><input type="checkbox" name="" value="8"/></td>
		             <td><input type="checkbox" name="" value="4"/></td>
		             <td><input type="checkbox" name="" value="2"/></td>
		             <td><input type="checkbox" name="" value="1"/></td>
             </tr>
         </s:iterator>
     </table>      
  </body>
</html>
