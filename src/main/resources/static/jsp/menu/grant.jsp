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
    <link rel="stylesheet" type="text/css" href="css/zTreeStyle/zTreeStyle.css">
	<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
	 $(function(){
		 $.ajax({
			 url:'menuAction!find4tree',
			 dataType:'json',
			 success:function(list){
				 var setting = {
							data: {
								simpleData: {
									enable: true
								}
							},check:{enable:true}
						};
				 $.fn.zTree.init($("#treeDiv"),setting,list);
				 var tree=$.fn.zTree.getZTreeObj("treeDiv");
				 tree.expandAll(true);
			 }
		 });
	 });
	 
	function mySubmit(){
		var tree=$.fn.zTree.getZTreeObj("treeDiv");
		var ss=tree.getCheckedNodes(true);
		for (var i = 0; i < ss.length; i++) {
			var node=ss[i];
			$("#ff").append("<input type=\"hidden\"  name=\"roleId\" value="+node.id+"/>");
		}
		$("#ff")[0].sumbit();
	}	
	</script>
  </head>
  <body>
     <div id="treeDiv" class="ztree"></div>
     <button onclick="mySubmit();">确定</button>
     <form id="ff" action="menuAction!select" method="post">
       <input type="hidden"  name="roleId" value="${param.roleId}"/>     
     </form>
     <s:debug></s:debug>     
  </body>
</html>
