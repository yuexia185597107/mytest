<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    
    
      <link rel="stylesheet" type="text/css"  src="css/easyuidemo1/easyui.css">
    <link rel="stylesheet" type="text/css"  src="css/easyuidemo1/icon.css">
    <link rel="stylesheet" type="text/css"  src="css/easyuidemo1/demo.css">
    <script type="text/javascript"  src="css/easyuidemo1/jquery.min.js"></script>
    <script type="text/javascript"  src="css/easyuidemo1/jquery.easyui.min.js"></script>
  </head>
  <body>
  
       <h2>Basic DataGrid</h2>
    <p>The DataGrid is created from markup, no JavaScript code needed.</p>
    <div style="margin:20px 0;"></div>
    
    <table class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
            data-options="singleSelect:true,collapsible:true,url:'user1Action!findAll',method:'get'">
        <thead>
            <tr>
                <th data-options="field:'itemid',width:80">Item ID</th>
                <th data-options="field:'productid',width:100">Product</th>
                <th data-options="field:'listprice',width:80,align:'right'">List Price</th>
                <th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
                <th data-options="field:'attr1',width:250">Attribute</th>
                <th data-options="field:'status',width:60,align:'center'">Status</th>
            </tr>
        </thead>
    </table>
  </body>
</html>
