package com.springboot.modules.system.dto;

import java.sql.Timestamp;

import com.springboot.modules.system.entity.Order;

public class CustomerDto {
	private long id;
	private String name;
	private String tel;
	private String mobileTel;
	private String unit;
	private String address;
	private String reportIds;
	
	public CustomerDto() {
		super();
	}

	public CustomerDto(long id, String name, String tel, String mobileTel, String unit, String address,
			String reportIds) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.mobileTel = mobileTel;
		this.unit = unit;
		this.address = address;
		this.reportIds = reportIds;
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
	 * @return the reportIds
	 */
	public String getReportIds() {
		return reportIds;
	}

	/**
	 * @param reportIds the reportIds to set
	 */
	public void setReportIds(String reportIds) {
		this.reportIds = reportIds;
	}
	
}
