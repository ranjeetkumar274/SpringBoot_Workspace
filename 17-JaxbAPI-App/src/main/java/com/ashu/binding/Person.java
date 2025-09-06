package com.ashu.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	
	private Integer pid;
	private String pname;
	private String pemail;
	private Long pmobile;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public Long getPmobile() {
		return pmobile;
	}

	public void setPmobile(Long pmobile) {
		this.pmobile = pmobile;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", pmobile=" + pmobile + "]";
	}
}
