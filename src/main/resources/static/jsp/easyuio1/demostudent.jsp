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
      <link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath}/css/easyuidemo1/easyui.css">
    <link rel="stylesheet" type="text/css"  src="{pageContext.request.contextPath}/css/easyuidemo1/icon.css">
    <link rel="stylesheet" type="text/css"  src="css/easyuidemo1/icon.css">
    <link rel="stylesheet" type="text/css"  src="css/easyuidemo1/demo.css">
    <script type="text/javascript"  src="css/easyuidemo1/jquery.min.js"></script><!-- yinru jquery -->
    <script type="text/javascript"  src="css/easyuidemo1/jquery.easyui.min.js"></script></script><!-- yinru easyui -->
    <!-- yinru easyui的中文国际化js，让easyui支持中文。。url : '<%= basePath %>/getStudentList'.action, -->
    <script type="text/javascript"  src="css/easyuidemo1/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
	$(function(){
		$('#datagridId').datagrid({
			url : '<%= basePath %>/getStudentList!getStudentList',
			pagination : true,
			pageList : [10,20,30,40],
			fitColumns : false,
			columns:[[
			    {field:'name',title:'姓名',width:100,align:'center',sortable:true},
			    {field:'age',title:'年龄',width:100,align:'center'},
			    {field:'sex',title:'性别',width:100,align:'center'}
			]]
		});
	})
</script>
  </head>
  <body>
  
  
  <center>
        <table id="datagrid" title="学生信息" class="easyui-datagrid" style="width:95%;height:auto;"
            url="<%=basePath%>/getStudentList!getStudentList" fitColumns="true" toolbar="#tb"
            data-options="
                rownumbers:true,
                singleSelect:true,
                autoRowHeight:false,
                pagination:true,
                pageSize:10">
            <thead>
                <tr>
                    <th field="id" width="10" align="center">学号</th>
                    <th field="name" width="10" align="center">姓名</th>
                    <th field="age" width="10" align="center">年龄</th>
                  <!--<th field="toSchoolDate" width="10" align="center" formatter="forMatToSchoolDate">报道日期</th>  -->  
                </tr>
            </thead>
        </table>
    </center>
    <!-- 工具栏 -->
    <div id="tb" style="padding:3px;">
        <span>姓名</span>
        <input id="name" style="line-height:26px;border:1px solid #ccc">
        <span>时间</span>
        <input id="time" type="text" class="easyui-datebox" required="required">
        <a href="studentAction!getStudentList" class="easyui-linkbutton" οnclick="doSerach()">查询</a><br>
        增加：<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'"></a>
        删除：<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'"></a>
        修改：<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'"></a>
        帮助：<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-help'"></a>
    </div>	
}
  </body>
</html>
