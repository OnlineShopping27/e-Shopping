package org.cap.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAIL")
public class Login {
@Id
private int ID;
private String FIRST_NAME;
private String LAST_NAME;
private String PASSWORD;
private String email;
private int CONTACT_NUMBER;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getFIRST_NAME() {
	return FIRST_NAME;
}
public void setFIRST_NAME(String fIRST_NAME) {
	FIRST_NAME = fIRST_NAME;
}
public String getLAST_NAME() {
	return LAST_NAME;
}
public void setLAST_NAME(String lAST_NAME) {
	LAST_NAME = lAST_NAME;
}
public String getPASSWORD() {
	return PASSWORD;
}
public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getCONTACT_NUMBER() {
	return CONTACT_NUMBER;
}
public void setCONTACT_NUMBER(int cONTACT_NUMBER) {
	CONTACT_NUMBER = cONTACT_NUMBER;
}
}
