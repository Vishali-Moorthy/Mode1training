package com.hcl.obj;

public class Agent {
	
	public StringBuilder show(String agentId,String fullName,int maritalStatus,String zipcode) {
		StringBuilder sbError = new StringBuilder();
		boolean isValid=true;
		if(agentId.charAt(0)!='A') {
			sbError.append("AgentId needs to starts with 'A'" +"\r\n");
			isValid=false;
		}
		if(fullName.indexOf(' ')==-1) {
			sbError.append("Fullname must contains space" +"\r\n");
			isValid=false;
		}
		if(!(fullName.length()<=20)) {
			sbError.append("Fullname cannot cross 20characters" +"\r\n");
			isValid=false;
		}
		if(!(maritalStatus==0||maritalStatus==1)) {
			sbError.append("maritalstatus needs to either 0 or 1" +"\r\n");
			isValid=false;
		}
		if(!(zipcode.length()==6)) {
			sbError.append("Zipcode contains only 6 characters" +"\r\n");
			isValid=false;
		}
		if(isValid==true) {
			sbError.append("AgentId: " +agentId +"\r\n");
			sbError.append("FullName: " +fullName +"\r\n");
			sbError.append("MaritalStatus: " +maritalStatus +"\r\n");
			sbError.append("zipcode: " +zipcode +"\r\n");
		}
		return sbError;
	}
	public static void main(String[] args) {
		String agentId;
		String fullName;
		int maritalStatus;
		String zipcode;
		agentId = "A120";
		fullName = "Visha D";
		maritalStatus = 1;
		zipcode = "641845";
		StringBuilder sbRes=new Agent().show(agentId, fullName, maritalStatus, zipcode);
		System.out.println(sbRes);
		
		
	}

}
