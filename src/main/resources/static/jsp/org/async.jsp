<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!--<%@ page language="java" import="com.oa.po.Organization" %>-->
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
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/zTreeStyle/zTreeStyle.css">
	<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="jquery.ztree.all.min.js"></script>
	<script type="text/javascript" src="jquery.ztree.core.min.js"></script>
	<!-- {name:"父节点1",isParent:true}这一句话可以让我们显示有加号；
	虽然是父节点也有子节点，没有加号，直接就是一个节点，这个节点触发不了展开的事件，发送请求的事件，必须加上这句话enable。
	     回忆一下，1父节点缩起来有个加号，并且它前面的样式是文件夹的样式，
	            2如果当前节点是叶子 /下面没有孩子，文件图标，展开的时候没有加号-没加没减，
	            3自动展开的代码先注释掉，先不让它初始化，先看一下它运行过程，熟悉一下原理，毕竟是别人封装好的文件，
	            -->
    <script type="text/javascript">
      $(function(){
    	  var setting={
    			  async:{
    				  enable:true,
    				  url:"organizationAction!findJsonByParent?pid=1"
    				  
    			  }
    	  };
    	  var data=[
    	            {name:"父节点1",id:1,isParent:true}
    	            ];
    	  $.fn.zTree.init($("#treeDiv"),setting,data);
    	  //var tree= $.fn.zTree.getZTreeObj("treeDiv");
    	//  tree.expandAll(true);
      });
    </script>
  </head>
  <body>
      <div id="treeDiv" class="ztree"> </div>
  </body>
</html>
