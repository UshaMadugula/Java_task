package com.Employee1;


    public class Employee1{
        private String empname;
        private int empage;
        private double empsalary;
        private int empid;

    public Employee1(String empname, int empage, double empsalary, int empid){
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
        public double getEmpsalary(){
            return empsalary;
        }
        public void setEmpsalary(double empsalary){
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


