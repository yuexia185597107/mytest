<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body >
  <form action="serverMsgAction!add"  method="post">
         <span>服务标题：</span><input type="title" /><br><br>
         <span>服务内容：</span><textarea name="content" rows="10" cols="20"></textarea>   
                                        处理者：<select name="user1">
                           <s:iterator value="list" var="item">
                               <option value="${item.id }">${item.name}</option>
                           </s:iterator>             
                      </select>                     
         <input type="submit"  style="height:25px;width:237px" />
  </form>
    
</body>
</html>