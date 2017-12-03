<%@ page contentType = "text/html; charset = UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<html>
   <head>
      <title>customer page</title>
      <s:head />
   </head>
   
   <body>
   <center>
<h2> Customer details</h2>
<HR>

Welcome, 
<table border='2' bgcolor='cyan'>
<TR>

<TD> 
<s:property value="name"></s:property>
</TD>
</TR>

<TR>
<TD> 
<s:property value="password"></s:property>
</TD>
</TR>

<TR>
<TD> 
<s:property value="email"></s:property>
</TD>
</TR>

<TR>
<TD> 
<s:property value="gender"></s:property>
</TD>
</TR>

<TR>
<TD> 
<s:property value="country"></s:property>
</TD>
</TR>

</table>
<h3>
<s:property value="message"></s:property>
</h3>

<a href="gohome">home</a>|
   </body>
</html>