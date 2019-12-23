<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body target="main">
   <dl class='bitm'>
      <dt onClick='showHide("items1_1")'> <b>报销管理</b></dt>
      <dd style="???????"  class='sitem' id='items1_1'>
         <ul class='sitemt??'>
            <li><a href='jsp/baoxiao/add.jsp' target='main'>填写报销单</a></li> 
            <li><a href='baoxiaoAction!findMyTask.action' target='main'>代办事宜</a></li> 
            <li><a href='baoxiaoAction!findMyBaoxiao.action' target='main'>我的报销单</a></li> 
            <li><a href='baoxiaoAction!findMyCandidate.action' target='main'>我的可选任务</a></li> 
         </ul>
      </dd>
   </dl>
    <dl class='bitm'>
      <dt onClick='showHide("items1_1")'> <b>服务管理</b></dt>
      <dd style="???????"  class='sitem' id='items1_1'>
         <ul class='sitemt??'>
            <li><a href='jsp/baoxiao/add.jsp' target='main'>创建服务</a></li> 
            <li><a href='baoxiaoAction!findMyTask.action' target='main'>代办事宜</a></li> 
            <li><a href='baoxiaoAction!findMyBaoxiao.action' target='main'>我的服务</a></li> 
         </ul>
      </dd>
   </dl>
</body>
</html>