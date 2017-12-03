<%@ taglib uri="/struts-tags" prefix="s" %>
<center>
<h2> Search Customer </h2>
<HR>
<s:form action="searchCustomer">

<s:textfield name="name" label="UserName"></s:textfield>
<br>
<br>

<s:submit value="search" align="center"></s:submit>

</s:form>
</center>
