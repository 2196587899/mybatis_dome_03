package com.edu.pojo;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class Smbms_provider {
   private BigInteger id;
   private String  proCode;
   private String  proName;
   private String  proDesc;
   private String  proContact;
   private String  proPhone;
   private String  proAddress;
   private String  proFax;
   private BigInteger  createdBy ;
   private Date creationDate;
   private Date  modifyDate;
   private BigInteger  modifyBy;

   private List<SmbmsBill> smbmsBill;

   public List<SmbmsBill> getSmbmsBill() {
      return smbmsBill;
   }

   public void setSmbmsBill(List<SmbmsBill> smbmsBill) {
      this.smbmsBill = smbmsBill;
   }

   public BigInteger getId() {
      return id;
   }

   public void setId(BigInteger id) {
      this.id = id;
   }

   public String getProCode() {
      return proCode;
   }

   public void setProCode(String proCode) {
      this.proCode = proCode;
   }

   public String getProName() {
      return proName;
   }

   public void setProName(String proName) {
      this.proName = proName;
   }

   public String getProDesc() {
      return proDesc;
   }

   public void setProDesc(String proDesc) {
      this.proDesc = proDesc;
   }

   public String getProContact() {
      return proContact;
   }

   public void setProContact(String proContact) {
      this.proContact = proContact;
   }

   public String getProPhone() {
      return proPhone;
   }

   public void setProPhone(String proPhone) {
      this.proPhone = proPhone;
   }

   public String getProAddress() {
      return proAddress;
   }

   public void setProAddress(String proAddress) {
      this.proAddress = proAddress;
   }

   public String getProFax() {
      return proFax;
   }

   public void setProFax(String proFax) {
      this.proFax = proFax;
   }

   public BigInteger getCreatedBy() {
      return createdBy;
   }

   public void setCreatedBy(BigInteger createdBy) {
      this.createdBy = createdBy;
   }

   public Date getCreationDate() {
      return creationDate;
   }

   public void setCreationDate(Date creationDate) {
      this.creationDate = creationDate;
   }

   public Date getModifyDate() {
      return modifyDate;
   }

   public void setModifyDate(Date modifyDate) {
      this.modifyDate = modifyDate;
   }

   public BigInteger getModifyBy() {
      return modifyBy;
   }

   public void setModifyBy(BigInteger modifyBy) {
      this.modifyBy = modifyBy;
   }

   @Override
   public String toString() {
      return "Smbms_provider{" +
              "id=" + id +
              ", proCode='" + proCode + '\'' +
              ", proName='" + proName + '\'' +
              ", proDesc='" + proDesc + '\'' +
              ", proContact='" + proContact + '\'' +
              ", proPhone='" + proPhone + '\'' +
              ", proAddress='" + proAddress + '\'' +
              ", proFax='" + proFax + '\'' +
              ", createdBy=" + createdBy +
              ", creationDate=" + creationDate +
              ", modifyDate=" + modifyDate +
              ", modifyBy=" + modifyBy +
              ", smbmsBill=" + smbmsBill +
              '}';
   }
}
