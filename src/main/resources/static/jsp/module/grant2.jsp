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
	      function test(cobx,mid){
	    	  if(cobx.checked){//选中
	    		  $.ajax({
	    			  cache:false,
	    			  url:'accessControlAction!grant?userId='+userId+"&moduleId="+mid+"&code="+cobx.value
	    		  });
	    	  }else{//取消
	    		  $.ajax({
	    		      url:'accessControlAction!cancel?userId='+userId+"&moduleId="+mid+"&code="+cobx.value
	    		  });
	    	  }    		  
	      }
	</script>
  </head>
  <body>
   
<!--<s:action name="userAction"  namespace="/" executeResult="flase"  ></s:action>-->
<s:action name="moduleAction" namespace="/" var="a"></s:action>
<!-- <s:action name="accessControlAction"  namespace="/" var="b" >-->
 </s:action>

 <s:debug></s:debug>   
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
         
         <s:iterator value="list" var="item">
              <tr>
		             <td>${item.name }</td>
		             <td>${item.url }</td>
		             <td>${item.des }</td>
	<s:if test="(#b.acmap[#item.id]&8)==8">
	   <td><input type="checkbox" checked="checked" name="" value="8" onclick="test(this,${item.id});" /></td>
	</s:if>	 
	<s:else>
	   <td><input type="checkbox" name="" value="8" onclick="test(this,${item.id});" /></td>
	</s:else>            
	<s:if test="(#b.acmap[#item.id]&4)==4">
	   <td><input type="checkbox" checked="checked" name="" value="4" onclick="test(this,${item.id});" /></td>
	</s:if>	             
	<s:else>
	  <td><input type="checkbox"  name="" value="4" onclick="test(this,${item.id});" /></td>
	</s:else>	
	 <s:if test="(#b.acmap[#item.id]&2)==2">
	       <td><input type="checkbox" checked="checked" name="" value="2" onclick="test(this,${item.id});" /></td>
	 </s:if>            
	 <s:else>
	      <td><input type="checkbox" name="" value="2" onclick="test(this,${item.id});" /></td>
	 </s:else>
	 <s:if test="(#b.acmap[#item.id]&1)==1">
	       <td><input type="checkbox" checked="checked" name="" value="1" onclick="test(this,${item.id});" /></td>
	 </s:if>            
	 <s:else>
	       <td><input type="checkbox" name="" value="1" onclick="test(this,${item.id});" /></td>
	 </s:else>         
             </tr>
         </s:iterator>
     </table>  
     <s:debug></s:debug>     
  </body>
</html>
