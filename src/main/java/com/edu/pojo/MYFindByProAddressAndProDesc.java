package com.edu.pojo;

public class MYFindByProAddressAndProDesc {
   private String proName;
   private String proDesc ;

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

    @Override
    public String toString() {
        return "MYFindByProAddressAndProDesc{" +
                "proName='" + proName + '\'' +
                ", proDescprivate='" + proDesc + '\'' +
                '}';
    }
}