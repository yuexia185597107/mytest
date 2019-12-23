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
	<s:head/>
	<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
	 var userId = ${param.userId};
	 $.ajax({
		 url:'roleAction!findByUser?userId'+userId,
		 dataType:'json',
		// console.info(list);
	     success:function(list){
	    	 $.each(list,function(){
	    		 $("#s1").append(new Option(this.name,this.id));
	    	 });	    	 
	     }	 
	 });
	 
	 $.ajax({
		 url:'roleAction!findNoByUser?userId'+userId,
		 dataType:'json',
		// console.info(list);
	     success:function(list){
	    	 $.each(list,function(){
	    		 $("#s2").append(new Option(this.name,this.id));
	    	 });	    	 
	     }	 
	 });
	 
	 function left2right(){
		 $("#s1 option:selected").appendTo("#s2").attr("selected",fasle).each(function(){
			 $.ajax({
				 url:'roleAction!delRelation?roleId='+this.value+"&userId"+userId
			 });
		 });
	 }
	 
	 function right2left(){
		 $("#s1 option:selected").appendTo("#s2").attr("selected",fasle).each(function(){
			 $.ajax({
				 url:'roleAction!addRelation?roleId='+this.value+"&userId"+userId
			 });
		 });
	 }
	</script>
  </head>
  <body>
     <select id="s1" multiple="multiple" size="10" style="width:100px;"></select>
     <button onclick="left2right();">&lt;&lt;&lt;</button>
     <button onclick="right2left();">&gt;&gt;&gt;</button>
     <select id="s2" multiple="multiple" size="10" style="width:100px;"></select>
     <s:debug></s:debug>     
  </body>
</html>
