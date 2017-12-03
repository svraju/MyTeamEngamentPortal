package com.siva;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
private String name,password,email,gender,country;
private String message;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String searchCustomer(){
	int i=RegisterDao.get(this);
	if(i>0){
	return SUCCESS;
	}
	return ERROR;
}
public String insertCustomer(){
	int i=RegisterDao.save(this);
	if(i>0){
		setMessage("Customer Saved successfully....."); 
	return SUCCESS;
	}
	return ERROR;
}
public String updateCustomer(){
	int i=RegisterDao.update(this);
	if(i>0){
		setMessage("Customer Updated successfully.....");
	return SUCCESS;
	}
	return ERROR;
}
public String deleteCustomer(){
	int i=RegisterDao.delete(this);
	if(i>0){
	return SUCCESS;
	setMessage("Customer Deleted successfully.....");
	}
	return ERROR;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}

