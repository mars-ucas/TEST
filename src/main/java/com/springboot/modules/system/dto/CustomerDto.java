package com.springboot.modules.system.dto;

import com.springboot.modules.system.entity.Customer;

public class CustomerDto {
	private long id;
	private String name;
	private String tel;
	private String mobileTel;
	private String unit;
	private String address;
	private String reportNums;
	
	public CustomerDto() {
		super();
	}

	public CustomerDto(long id, String name, String tel, String mobileTel, String unit, String address,
			String reportNums) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.mobileTel = mobileTel;
		this.unit = unit;
		this.address = address;
		this.reportNums = reportNums;
	}
	
	public CustomerDto(Customer customer) {
		this.id = customer.getId();
		this.name = customer.getName();
		this.tel = customer.getTel();
		this.mobileTel = customer.getMobileTel();
		this.unit = customer.getUnit();
		this.address = customer.getAddress();
		this.reportNums = customer.getReportNums();
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

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
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
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
	
}
