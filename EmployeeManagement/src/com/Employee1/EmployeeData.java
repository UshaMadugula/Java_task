package com.Employee1;


import java.util.List;

public class EmployeeData  {
        private String empname;
        private int empage;
        private int empsalary;
        private int empid;

    public EmployeeData(String empname, int empage, int empsalary, int empid){
        this.empname=empname;
        this.empage=empage;
        this.empsalary=empsalary;
        this.empid=empid;
    }

        public String getEmpname(){
            return empname;
        }
        public void setEmpname(String empname){
            this.empname=empname;
        }
        public int getEmpage(){
            return empage;
        }
        public void setEmpage(int age){
            this.empage=empage;

        }
        public int getEmpsalary(){
            return empsalary;
        }
        public void setEmpsalary(int empsalary){
            this.empsalary=empsalary;
        }

        public int getEmpid(){
            return empid;
        }
        public void setEmpid(int empid){
            this.empid=empid;
        }
        @Override
        public String toString(){
            return "name :"+empname+" "+"age:"+empage+" "+"salary:"+empsalary+" "+"EmpId:"+empid;
        }
    }


