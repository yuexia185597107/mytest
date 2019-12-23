<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body target="main">
  <table border="1">
         <tr>
             <td>角色名称</td>
             <td>角色描述url</td>
             <td>角色优先级</td>
             <td>操作</td>
         </tr>
         
         <s:iterator value="list" var="item">
              <tr>
		             <td><s:property value="#item.name"/></td>
		             <td><s:property value="#item.des"/></td>
		             <td><s:property value="#item.priority"/></td>
		             <td><a href="jsp/menu/grant.jsp?roleId=<s:property value="#item.id"/>">菜单授权</a></td>	         
             </tr>
         </s:iterator>
     </table>  
     <s:debug></s:debug>     
</body>
</html>