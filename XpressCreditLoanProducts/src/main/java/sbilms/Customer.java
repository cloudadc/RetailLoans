package sbilms;
import java.util.ArrayList;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class Customer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Age")
   private java.lang.Integer age;

   @org.kie.api.definition.type.Label("ApplicableXpressCreditProductsList")
   private java.util.List<sbilms.XPressProduct> applicableXpressCreditProductsList;

   @org.kie.api.definition.type.Label("Nature of Employment")
   private java.lang.String natureOfEmployment;

   @org.kie.api.definition.type.Label("Employer Organization Type")
   private java.lang.String employerOrgType;

   @org.kie.api.definition.type.Label("Length of Service in Organization")
   private Double lenthOfServiceinYears;

   @org.kie.api.definition.type.Label("length Of Service Remaining In Years")
   private Integer lengthOfServiceRemainingInYears;

   @org.kie.api.definition.type.Label("Designation")
   private java.lang.String designation;

   @org.kie.api.definition.type.Label("Approver Of Employer")
   private java.lang.String approverOfEmployer;

   @org.kie.api.definition.type.Label("Name Of Employer to be Validate")
   private java.lang.Boolean nameOfEmployerToValidate;

   @org.kie.api.definition.type.Label("Facility Type Of Loan")
   private java.lang.String facilityTypeOfLOan;

   @org.kie.api.definition.type.Label("HouseOwnership")
   private java.lang.String houseOwnership;

   @org.kie.api.definition.type.Label("Education Qualification")
   private java.lang.String educationQualification;

   @org.kie.api.definition.type.Label("OccupationType")
   private java.lang.String occupationType;

   @org.kie.api.definition.type.Label("FinancialInfo")
   private sbilms.FinancialInfo financialInfo;

   @org.kie.api.definition.type.Label("defenseForceType")
   private java.lang.String defenseForceType;

   @org.kie.api.definition.type.Label("BusinessExceptionList")
   private java.util.List<sbilms.BuisnessExceptions> businessExceptionList;

   @org.kie.api.definition.type.Label("retirementAge")
   private java.lang.Integer retirementAge;

   @org.kie.api.definition.type.Label("contractPeriod")
   private java.lang.Integer contractPeriod;

   @org.kie.api.definition.type.Label("typeOfLoanFacility")
   private java.lang.String typeOfLoanFacility;

   @org.kie.api.definition.type.Label(value = "Organization type")
   private java.lang.String organizationType;

   public Customer()
   {
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.util.List<sbilms.XPressProduct> getApplicableXpressCreditProductsList()
   {
      return this.applicableXpressCreditProductsList;
   }

   public void setApplicableXpressCreditProductsList(
         java.util.List<sbilms.XPressProduct> applicableXpressCreditProductsList)
   {
      this.applicableXpressCreditProductsList = applicableXpressCreditProductsList;
   }

   public java.lang.String getNatureOfEmployment()
   {
      return this.natureOfEmployment;
   }

   public void setNatureOfEmployment(java.lang.String natureOfEmployment)
   {
      this.natureOfEmployment = natureOfEmployment;
   }

   public java.lang.String getEmployerOrgType()
   {
      return this.employerOrgType;
   }

   public void setEmployerOrgType(java.lang.String employerOrgType)
   {
      this.employerOrgType = employerOrgType;
   }

   public java.lang.String getDesignation()
   {
      return this.designation;
   }

   public void setDesignation(java.lang.String designation)
   {
      this.designation = designation;
   }

   public java.lang.String getApproverOfEmployer()
   {
      return this.approverOfEmployer;
   }

   public void setApproverOfEmployer(java.lang.String approverOfEmployer)
   {
      this.approverOfEmployer = approverOfEmployer;
   }

   public java.lang.Boolean getNameOfEmployerToValidate()
   {
      return this.nameOfEmployerToValidate;
   }

   public void setNameOfEmployerToValidate(
         java.lang.Boolean nameOfEmployerToValidate)
   {
      this.nameOfEmployerToValidate = nameOfEmployerToValidate;
   }

   public java.lang.String getFacilityTypeOfLOan()
   {
      return this.facilityTypeOfLOan;
   }

   public void setFacilityTypeOfLOan(java.lang.String facilityTypeOfLOan)
   {
      this.facilityTypeOfLOan = facilityTypeOfLOan;
   }

   public java.lang.String getHouseOwnership()
   {
      return this.houseOwnership;
   }

   public void setHouseOwnership(java.lang.String houseOwnership)
   {
      this.houseOwnership = houseOwnership;
   }

   public java.lang.String getEducationQualification()
   {
      return this.educationQualification;
   }

   public void setEducationQualification(java.lang.String educationQualification)
   {
      this.educationQualification = educationQualification;
   }

   public java.lang.String getOccupationType()
   {
      return this.occupationType;
   }

   public void setOccupationType(java.lang.String occupationType)
   {
      this.occupationType = occupationType;
   }

   public sbilms.FinancialInfo getFinancialInfo()
   {
      return this.financialInfo;
   }

   public void setFinancialInfo(sbilms.FinancialInfo financialInfo)
   {
      this.financialInfo = financialInfo;
   }

   public java.lang.String getDefenseForceType()
   {
      return this.defenseForceType;
   }

   public void setDefenseForceType(java.lang.String defenseForceType)
   {
      this.defenseForceType = defenseForceType;
   }

   public java.lang.Integer getLengthOfServiceRemainingInYears()
   {
      return this.lengthOfServiceRemainingInYears;
   }

   public void setLengthOfServiceRemainingInYears(
         java.lang.Integer lengthOfServiceRemainingInYears)
   {
      this.lengthOfServiceRemainingInYears = lengthOfServiceRemainingInYears;
   }

   public java.util.List<sbilms.BuisnessExceptions> getBusinessExceptionList()
   {
      return this.businessExceptionList;
   }

   public void setBusinessExceptionList(
         java.util.List<sbilms.BuisnessExceptions> businessExceptionList)
   {
      this.businessExceptionList = businessExceptionList;
   }

   public java.lang.Integer getRetirementAge()
   {
      return this.retirementAge;
   }

   public void setRetirementAge(java.lang.Integer retirementAge)
   {
      this.retirementAge = retirementAge;
   }

   public java.lang.Integer getContractPeriod()
   {
      return this.contractPeriod;
   }

   public void setContractPeriod(java.lang.Integer contractPeriod)
   {
      this.contractPeriod = contractPeriod;
   }

   public java.lang.Double getLenthOfServiceinYears()
   {
      return this.lenthOfServiceinYears;
   }

   public void setLenthOfServiceinYears(java.lang.Double lenthOfServiceinYears)
   {
      this.lenthOfServiceinYears = lenthOfServiceinYears;
   }

   public java.lang.String getTypeOfLoanFacility()
   {
      return this.typeOfLoanFacility;
   }

   public void setTypeOfLoanFacility(java.lang.String typeOfLoanFacility)
   {
      this.typeOfLoanFacility = typeOfLoanFacility;
   }

   public java.lang.String getOrganizationType()
   {
      return this.organizationType;
   }

   public void setOrganizationType(java.lang.String organizationType)
   {
      this.organizationType = organizationType;
   }

   public Customer(
         java.lang.Integer age,
         java.util.List<sbilms.XPressProduct> applicableXpressCreditProductsList,
         java.lang.String natureOfEmployment, java.lang.String employerOrgType,
         java.lang.Double lenthOfServiceinYears,
         java.lang.Integer lengthOfServiceRemainingInYears,
         java.lang.String designation, java.lang.String approverOfEmployer,
         java.lang.Boolean nameOfEmployerToValidate,
         java.lang.String facilityTypeOfLOan, java.lang.String houseOwnership,
         java.lang.String educationQualification,
         java.lang.String occupationType, sbilms.FinancialInfo financialInfo,
         java.lang.String defenseForceType,
         java.util.List<sbilms.BuisnessExceptions> businessExceptionList,
         java.lang.Integer retirementAge, java.lang.Integer contractPeriod,
         java.lang.String typeOfLoanFacility, java.lang.String organizationType)
   {
      this.age = age;
      this.applicableXpressCreditProductsList = applicableXpressCreditProductsList;
      this.natureOfEmployment = natureOfEmployment;
      this.employerOrgType = employerOrgType;
      this.lenthOfServiceinYears = lenthOfServiceinYears;
      this.lengthOfServiceRemainingInYears = lengthOfServiceRemainingInYears;
      this.designation = designation;
      this.approverOfEmployer = approverOfEmployer;
      this.nameOfEmployerToValidate = nameOfEmployerToValidate;
      this.facilityTypeOfLOan = facilityTypeOfLOan;
      this.houseOwnership = houseOwnership;
      this.educationQualification = educationQualification;
      this.occupationType = occupationType;
      this.financialInfo = financialInfo;
      this.defenseForceType = defenseForceType;
      this.businessExceptionList = businessExceptionList;
      this.retirementAge = retirementAge;
      this.contractPeriod = contractPeriod;
      this.typeOfLoanFacility = typeOfLoanFacility;
      this.organizationType = organizationType;
   }

}