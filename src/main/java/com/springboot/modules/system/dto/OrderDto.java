package com.springboot.modules.system.dto;

import java.sql.Timestamp;

import com.springboot.modules.system.entity.Order;

public class OrderDto {
	private long id;
	private String reportNum;
	private String applicantName;
	private String clientName;
	private String testKind;
	private String productionUnitName;
	private String postCode;
	private String applicantAddress;
	private String contactNum;
	private String sampleName;
	private String brand;
	private String specType;
	private String sampleState;
	private int sampleCount;
	private String receivedDate;
	private String sampleIdentifier;
	private String sampleKeepCondition;
	private String sampleKeepConditionState;
	private String materialNameCount;
	private String materialNameCountState;
	private String testRequirement;
	private String testAccording;
	private String testItem;
	private String deliverMode;
	private int testReportCount;
	private String deliverDate;
	private String sampleTreatment;
	private String serviceCharge;
	private String otherAgreedInstructions;
	private String receiver;
	private String testDepartment;
	private String authorizedRepresentative;
	
	public OrderDto() {
		super();
	}

	public OrderDto(long id, String reportNum, String applicantName, String clientName, String testKind,
			String productionUnitName, String postCode, String applicantAddress, String contactNum, String sampleName,
			String brand, String specType, String sampleState, int sampleCount, String receivedDate,
			String sampleIdentifier, String sampleKeepCondition, String sampleKeepConditionState,
			String materialNameCount, String materialNameCountState, String testRequirement, String testAccording,
			String testItem, String deliverMode, int testReportCount, String deliverDate, String sampleTreatment,
			String serviceCharge, String otherAgreedInstructions, String receiver, String testDepartment,
			String authorizedRepresentative) {
		super();
		this.id = id;
		this.reportNum = reportNum;
		this.applicantName = applicantName;
		this.clientName = clientName;
		this.testKind = testKind;
		this.productionUnitName = productionUnitName;
		this.postCode = postCode;
		this.applicantAddress = applicantAddress;
		this.contactNum = contactNum;
		this.sampleName = sampleName;
		this.brand = brand;
		this.specType = specType;
		this.sampleState = sampleState;
		this.sampleCount = sampleCount;
		this.receivedDate = receivedDate;
		this.sampleIdentifier = sampleIdentifier;
		this.sampleKeepCondition = sampleKeepCondition;
		this.sampleKeepConditionState = sampleKeepConditionState;
		this.materialNameCount = materialNameCount;
		this.materialNameCountState = materialNameCountState;
		this.testRequirement = testRequirement;
		this.testAccording = testAccording;
		this.testItem = testItem;
		this.deliverMode = deliverMode;
		this.testReportCount = testReportCount;
		this.deliverDate = deliverDate;
		this.sampleTreatment = sampleTreatment;
		this.serviceCharge = serviceCharge;
		this.otherAgreedInstructions = otherAgreedInstructions;
		this.receiver = receiver;
		this.testDepartment = testDepartment;
		this.authorizedRepresentative = authorizedRepresentative;
	}
	
	public OrderDto(Order order) {
		this.id = order.getId();
		this.reportNum = order.getReportNum();
		this.applicantName = order.getApplicantName();
		this.clientName = order.getClientName();
		this.testKind = order.getTestKind();
		this.productionUnitName = order.getProductionUnitName();
		this.postCode = order.getPostCode();
		this.applicantAddress = order.getApplicantAddress();
		this.contactNum = order.getContactNum();
		this.sampleName = order.getSampleName();
		this.brand = order.getBrand();
		this.specType = order.getSpecType();
		this.sampleState = order.getSampleState();
		this.sampleCount = order.getSampleCount();
		this.receivedDate = order.getReceivedDate();
		this.sampleIdentifier = order.getSampleIdentifier();
		this.sampleKeepCondition = order.getSampleKeepCondition();
		this.sampleKeepConditionState = order.getSampleKeepConditionState();
		this.materialNameCount = order.getMaterialNameCount();
		this.materialNameCountState = order.getMaterialNameCountState();
		this.testRequirement = order.getTestRequirement();
		this.testAccording = order.getTestAccording();
		this.testItem = order.getTestItem();
		this.deliverMode = order.getDeliverMode();
		this.testReportCount = order.getTestReportCount();
		this.deliverDate = order.getDeliverDate();
		this.sampleTreatment = order.getSampleTreatment();
		this.serviceCharge = order.getServiceCharge();
		this.otherAgreedInstructions = order.getOtherAgreedInstructions();
		this.receiver = order.getReceiver();
		this.testDepartment = order.getTestDepartment();
		this.authorizedRepresentative = order.getAuthorizedRepresentative();
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
	 * @return the reportNum
	 */
	public String getReportNum() {
		return reportNum;
	}

	/**
	 * @param reportNum the reportNum to set
	 */
	public void setReportNum(String reportNum) {
		this.reportNum = reportNum;
	}

	/**
	 * @return the applicantName
	 */
	public String getApplicantName() {
		return applicantName;
	}

	/**
	 * @param applicantName the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the testKind
	 */
	public String getTestKind() {
		return testKind;
	}

	/**
	 * @param testKind the testKind to set
	 */
	public void setTestKind(String testKind) {
		this.testKind = testKind;
	}

	/**
	 * @return the productionUnitName
	 */
	public String getProductionUnitName() {
		return productionUnitName;
	}

	/**
	 * @param productionUnitName the productionUnitName to set
	 */
	public void setProductionUnitName(String productionUnitName) {
		this.productionUnitName = productionUnitName;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @return the applicantAddress
	 */
	public String getApplicantAddress() {
		return applicantAddress;
	}

	/**
	 * @param applicantAddress the applicantAddress to set
	 */
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	/**
	 * @return the contactNum
	 */
	public String getContactNum() {
		return contactNum;
	}

	/**
	 * @param contactNum the contactNum to set
	 */
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	/**
	 * @return the sampleName
	 */
	public String getSampleName() {
		return sampleName;
	}

	/**
	 * @param sampleName the sampleName to set
	 */
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the specType
	 */
	public String getSpecType() {
		return specType;
	}

	/**
	 * @param specType the specType to set
	 */
	public void setSpecType(String specType) {
		this.specType = specType;
	}

	/**
	 * @return the sampleState
	 */
	public String getSampleState() {
		return sampleState;
	}

	/**
	 * @param sampleState the sampleState to set
	 */
	public void setSampleState(String sampleState) {
		this.sampleState = sampleState;
	}

	/**
	 * @return the sampleCount
	 */
	public int getSampleCount() {
		return sampleCount;
	}

	/**
	 * @param sampleCount the sampleCount to set
	 */
	public void setSampleCount(int sampleCount) {
		this.sampleCount = sampleCount;
	}

	/**
	 * @return the receivedDate
	 */
	public String getReceivedDate() {
		return receivedDate;
	}

	/**
	 * @param receivedDate the receivedDate to set
	 */
	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}

	/**
	 * @return the sampleIdentifier
	 */
	public String getSampleIdentifier() {
		return sampleIdentifier;
	}

	/**
	 * @param sampleIdentifier the sampleIdentifier to set
	 */
	public void setSampleIdentifier(String sampleIdentifier) {
		this.sampleIdentifier = sampleIdentifier;
	}

	/**
	 * @return the sampleKeepCondition
	 */
	public String getSampleKeepCondition() {
		return sampleKeepCondition;
	}

	/**
	 * @param sampleKeepCondition the sampleKeepCondition to set
	 */
	public void setSampleKeepCondition(String sampleKeepCondition) {
		this.sampleKeepCondition = sampleKeepCondition;
	}

	/**
	 * @return the sampleKeepConditionState
	 */
	public String getSampleKeepConditionState() {
		return sampleKeepConditionState;
	}

	/**
	 * @param sampleKeepConditionState the sampleKeepConditionState to set
	 */
	public void setSampleKeepConditionState(String sampleKeepConditionState) {
		this.sampleKeepConditionState = sampleKeepConditionState;
	}

	/**
	 * @return the materialNameCount
	 */
	public String getMaterialNameCount() {
		return materialNameCount;
	}

	/**
	 * @param materialNameCount the materialNameCount to set
	 */
	public void setMaterialNameCount(String materialNameCount) {
		this.materialNameCount = materialNameCount;
	}

	/**
	 * @return the materialNameCountState
	 */
	public String getMaterialNameCountState() {
		return materialNameCountState;
	}

	/**
	 * @param materialNameCountState the materialNameCountState to set
	 */
	public void setMaterialNameCountState(String materialNameCountState) {
		this.materialNameCountState = materialNameCountState;
	}

	/**
	 * @return the testRequirement
	 */
	public String getTestRequirement() {
		return testRequirement;
	}

	/**
	 * @param testRequirement the testRequirement to set
	 */
	public void setTestRequirement(String testRequirement) {
		this.testRequirement = testRequirement;
	}

	/**
	 * @return the testAccording
	 */
	public String getTestAccording() {
		return testAccording;
	}

	/**
	 * @param testAccording the testAccording to set
	 */
	public void setTestAccording(String testAccording) {
		this.testAccording = testAccording;
	}

	/**
	 * @return the testItem
	 */
	public String getTestItem() {
		return testItem;
	}

	/**
	 * @param testItem the testItem to set
	 */
	public void setTestItem(String testItem) {
		this.testItem = testItem;
	}

	/**
	 * @return the deliverMode
	 */
	public String getDeliverMode() {
		return deliverMode;
	}

	/**
	 * @param deliverMode the deliverMode to set
	 */
	public void setDeliverMode(String deliverMode) {
		this.deliverMode = deliverMode;
	}

	/**
	 * @return the testReportCount
	 */
	public long getTestReportCount() {
		return testReportCount;
	}

	/**
	 * @param testReportCount the testReportCount to set
	 */
	public void setTestReportCount(int testReportCount) {
		this.testReportCount = testReportCount;
	}

	/**
	 * @return the deliverDate
	 */
	public String getDeliverDate() {
		return deliverDate;
	}

	/**
	 * @param deliverDate the deliverDate to set
	 */
	public void setDeliverDate(String deliverDate) {
		this.deliverDate = deliverDate;
	}

	/**
	 * @return the sampleTreatment
	 */
	public String getSampleTreatment() {
		return sampleTreatment;
	}

	/**
	 * @param sampleTreatment the sampleTreatment to set
	 */
	public void setSampleTreatment(String sampleTreatment) {
		this.sampleTreatment = sampleTreatment;
	}

	/**
	 * @return the serviceCharge
	 */
	public String getServiceCharge() {
		return serviceCharge;
	}

	/**
	 * @param serviceCharge the serviceCharge to set
	 */
	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	/**
	 * @return the otherAgreedInstructions
	 */
	public String getOtherAgreedInstructions() {
		return otherAgreedInstructions;
	}

	/**
	 * @param otherAgreedInstructions the otherAgreedInstructions to set
	 */
	public void setOtherAgreedInstructions(String otherAgreedInstructions) {
		this.otherAgreedInstructions = otherAgreedInstructions;
	}

	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the testDepartment
	 */
	public String getTestDepartment() {
		return testDepartment;
	}

	/**
	 * @param testDepartment the testDepartment to set
	 */
	public void setTestDepartment(String testDepartment) {
		this.testDepartment = testDepartment;
	}

	/**
	 * @return the authorizedRepresentative
	 */
	public String getAuthorizedRepresentative() {
		return authorizedRepresentative;
	}

	/**
	 * @param authorizedRepresentative the authorizedRepresentative to set
	 */
	public void setAuthorizedRepresentative(String authorizedRepresentative) {
		this.authorizedRepresentative = authorizedRepresentative;
	}
	
	
}
