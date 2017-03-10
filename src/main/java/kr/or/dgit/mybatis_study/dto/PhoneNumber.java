package kr.or.dgit.mybatis_study.dto;

public class PhoneNumber {
	private String contryCode;
	private String stateCode;
	private String number;
	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhoneNumber(String contryCode, String stateCode, String number) {
		super();
		this.contryCode = contryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	
	public PhoneNumber(String str){
		if(str !=null){
			String[] parts = str.split("-");
			if (parts.length > 0) this.contryCode = parts[0];
			if (parts.length > 1) this.stateCode = parts[1];
			if (parts.length > 2) this.number = parts[2];
			
		}
	}
	@Override
	public String toString() {
		return String.format("%s-%s-%s", contryCode, stateCode, number);
	}
	public String getContryCode() {
		return contryCode;
	}
	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
