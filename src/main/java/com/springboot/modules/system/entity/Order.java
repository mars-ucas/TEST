package com.springboot.modules.system.entity;

import org.springframework.util.StringUtils;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Table(name = "sys_order")
public class Order {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  @NotBlank(message = "报告编号不为空")
  private String reportNum;
  
  @NotBlank(message = "委托单位不为空")
  private String applicantName;
  
  @NotBlank(message = "委托人不为空")
  private String clientName;
  
  @NotBlank(message = "检测类别不为空")
  private String testKind;
  
  @NotBlank(message = "生产单位名称不为空")
  private String productionUnitName;
  
  @NotBlank(message = "邮编不为空")
  private String postCode;
  
  @NotBlank(message = "委托单位地址不为空")
  private String applicantAddress;
  
  @NotBlank(message = "联系电话不为空")
  private String contactNum;
  
  @NotBlank(message = "样品名称不为空")
  private String sampleName;
  
  @NotBlank(message = "商标不为空")
  private String brand;
  
  @NotBlank(message = "规格型号不为空")
  private String specType;
  
  @NotBlank(message = "样品状态不为空")
  private String sampleState;
  
  @NotNull(message = "样品数量不为空")
  private int sampleCount;
  
  @NotNull(message = "接样日期不为空")
  private String receivedDate;
  
  @NotBlank(message = "样品编号不为空")
  private String sampleIdentifier;
  
  @NotBlank(message = "样品保存条件不为空")
  private String sampleKeepCondition;
  private String sampleKeepConditionState;
  
  @NotBlank(message = "资料名称及数量不为空")
  private String materialNameCount;
  private String materialNameCountState;
  
  @NotBlank(message = "检测要求不为空")
  private String testRequirement;
  
  @NotBlank(message = "检测依据不为空")
  private String testAccording;
  
  @NotBlank(message = "检测项目不为空")
  private String testItem;
  
  @NotBlank(message = "交付方式不为空")
  private String deliverMode;
  
  @NotNull(message = "检测报告份数不为空")
  private int testReportCount;
  
  @NotNull(message = "协议交付日期不为空")
  private String deliverDate;
  
  @NotBlank(message = "样品处理不为空")
  private String sampleTreatment;
  
  @NotBlank(message = "服务费不为空")
  private String serviceCharge;
  
  @NotBlank(message = "其他约定说明不为空")
  private String otherAgreedInstructions;
  
  @NotBlank(message = "受理人签章不为空")
  private String receiver;
  
  @NotBlank(message = "检测部签章不为空")
  private String testDepartment;
  
  @NotBlank(message = "委托方授权代表签章不为空")
  private String authorizedRepresentative;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getReportNum() {
    return reportNum;
  }

  public void setReportNum(String reportNum) {
    this.reportNum = reportNum;
  }


  public String getApplicantName() {
    return applicantName;
  }

  public void setApplicantName(String applicantName) {
    this.applicantName = applicantName;
  }


  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public String getTestKind() {
    return testKind;
  }

  public void setTestKind(String testKind) {
    this.testKind = testKind;
  }


  public String getProductionUnitName() {
    return productionUnitName;
  }

  public void setProductionUnitName(String productionUnitName) {
    this.productionUnitName = productionUnitName;
  }


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public String getApplicantAddress() {
    return applicantAddress;
  }

  public void setApplicantAddress(String applicantAddress) {
    this.applicantAddress = applicantAddress;
  }


  public String getContactNum() {
    return contactNum;
  }

  public void setContactNum(String contactNum) {
    this.contactNum = contactNum;
  }


  public String getSampleName() {
    return sampleName;
  }

  public void setSampleName(String sampleName) {
    this.sampleName = sampleName;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public String getSpecType() {
    return specType;
  }

  public void setSpecType(String specType) {
    this.specType = specType;
  }


  public String getSampleState() {
    return sampleState;
  }

  public void setSampleState(String sampleState) {
    this.sampleState = sampleState;
  }


  public int getSampleCount() {
    return sampleCount;
  }

  public void setSampleCount(int sampleCount) {
    this.sampleCount = sampleCount;
  }


  public String getReceivedDate() {
    return receivedDate;
  }

  public void setReceivedDate(String receivedDate) {
    this.receivedDate = receivedDate;
  }


  public String getSampleIdentifier() {
    return sampleIdentifier;
  }

  public void setSampleIdentifier(String sampleIdentifier) {
    this.sampleIdentifier = sampleIdentifier;
  }


  public String getSampleKeepCondition() {
    return sampleKeepCondition;
  }

  public void setSampleKeepCondition(String sampleKeepCondition) {
    this.sampleKeepCondition = sampleKeepCondition;
  }


  public String getSampleKeepConditionState() {
    return sampleKeepConditionState;
  }

  public void setSampleKeepConditionState(String sampleKeepConditionState) {
    this.sampleKeepConditionState = sampleKeepConditionState;
  }


  public String getMaterialNameCount() {
    return materialNameCount;
  }

  public void setMaterialNameCount(String materialNameCount) {
    this.materialNameCount = materialNameCount;
  }


  public String getMaterialNameCountState() {
    return materialNameCountState;
  }

  public void setMaterialNameCountState(String materialNameCountState) {
    this.materialNameCountState = materialNameCountState;
  }


  public String getTestRequirement() {
    return testRequirement;
  }

  public void setTestRequirement(String testRequirement) {
    this.testRequirement = testRequirement;
  }


  public String getTestAccording() {
    return testAccording;
  }

  public void setTestAccording(String testAccording) {
    this.testAccording = testAccording;
  }


  public String getTestItem() {
    return testItem;
  }

  public void setTestItem(String testItem) {
    this.testItem = testItem;
  }


  public String getDeliverMode() {
    return deliverMode;
  }

  public void setDeliverMode(String deliverMode) {
    this.deliverMode = deliverMode;
  }


  public int getTestReportCount() {
    return testReportCount;
  }

  public void setTestReportCount(int testReportCount) {
    this.testReportCount = testReportCount;
  }


  public String getDeliverDate() {
    return deliverDate;
  }

  public void setDeliverDate(String deliverDate) {
    this.deliverDate = deliverDate;
  }


  public String getSampleTreatment() {
    return sampleTreatment;
  }

  public void setSampleTreatment(String sampleTreatment) {
    this.sampleTreatment = sampleTreatment;
  }


  public String getServiceCharge() {
    return serviceCharge;
  }

  public void setServiceCharge(String serviceCharge) {
    this.serviceCharge = serviceCharge;
  }


  public String getOtherAgreedInstructions() {
    return otherAgreedInstructions;
  }

  public void setOtherAgreedInstructions(String otherAgreedInstructions) {
    this.otherAgreedInstructions = otherAgreedInstructions;
  }


  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public String getTestDepartment() {
    return testDepartment;
  }

  public void setTestDepartment(String testDepartment) {
    this.testDepartment = testDepartment;
  }


  public String getAuthorizedRepresentative() {
    return authorizedRepresentative;
  }

  public void setAuthorizedRepresentative(String authorizedRepresentative) {
    this.authorizedRepresentative = authorizedRepresentative;
  }

}
