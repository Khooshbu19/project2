package com.niit.CollaborationBackEnd.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="C_User")
public class User {
	
		@Id
		private String u_username;
		private String u_Password;
		private String u_confirmPassword;
		private String u_firstName;
		private String u_lastName;
		//private String u_status;
		public String getU_username() {
			return u_username;
		}
		public void setU_username(String u_username) {
			this.u_username = u_username;
		}
		public String getU_Password() {
			return u_Password;
		}
		public void setU_Password(String u_Password) {
			this.u_Password = u_Password;
		}
		public String getU_confirmPassword() {
			return u_confirmPassword;
		}
		public void setU_confirmPassword(String u_confirmPassword) {
			this.u_confirmPassword = u_confirmPassword;
		}
		public String getU_firstName() {
			return u_firstName;
		}
		public void setU_firstName(String u_firstName) {
			this.u_firstName = u_firstName;
		}
		public String getU_lastName() {
			return u_lastName;
		}
		public void setU_lastName(String u_lastName) {
			this.u_lastName = u_lastName;
		}
		/*public String getU_status() {
			return u_status;
		}
		public void setU_status(String u_status) {
			this.u_status = u_status;
		}
		*/
	
	
	}



