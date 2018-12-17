package com.springboot.modules.system.query;

import com.springboot.modules.system.entity.Customer;
import com.springboot.utils.BaseQuery;

public class CustomerQuery extends BaseQuery<Customer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	/**
	 * 客户名称
	 */
	private String name;
	/**
	 * 客户联系方式，座机
	 */
	private String tel;

	/**
	 * 客户联系方式，移动电话
	 */
	private String mobileTel;

	/**
	 * 客户单位
	 */
	private String address;
	
	/**
	 * 报告编号
	 */
	private String reportNums;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * @return the mobileTel
	 */
	public String getMobileTel() {
		return mobileTel;
	}

	/**
	 * @param mobileTel the mobileTel to set
	 */
	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the reportNums
	 */
	public String getReportNums() {
		return reportNums;
	}

	/**
	 * @param reportNums the reportNums to set
	 */
	public void setReportNums(String reportNums) {
		this.reportNums = reportNums;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
