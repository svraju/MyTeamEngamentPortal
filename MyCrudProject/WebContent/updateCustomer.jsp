<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form action="register">
<s:textfield name="name" label="UserName"> <s:property value="name"></s:property> </s:textfield>
<s:password name="password" label="Password"><s:property value="password"></s:property></s:password>
<s:textfield name="email" label="Email"><s:property value="email"></s:property></s:textfield>
<s:radio list="{'male','female'}" name="gender"><s:property value="gender"></s:property></s:radio>
<s:select cssStyle="width:155px;" list="{'india','pakistan','nepal','bhutan'}" name="country" label="Country">
<s:property value="country"></s:property>
</s:select>

<s:submit value="updateCustomer"></s:submit>
<s:submit value="deleteCustomer"></s:submit>

</s:form>