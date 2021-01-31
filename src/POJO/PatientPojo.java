/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Ashray
 */
public class PatientPojo {
    public String p_name;
    public String f_name;
    public int age;
    public long aadhar;
    public String doc_name;

    public PatientPojo(String p_name, String f_name, int age, long aadhar, String doc_name) {
        this.p_name = p_name;
        this.f_name = f_name;
        this.age = age;
        this.aadhar = aadhar;
        this.doc_name = doc_name;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getAadhar() {
        return aadhar;
    }

    public void setAadhar(long aadhar) {
        this.aadhar = aadhar;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

        
}
