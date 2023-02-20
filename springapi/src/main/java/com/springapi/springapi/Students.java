package com.springapi.springapi;

public class Students {
    private String name, mailid, rollid;
    private int age;
    private String branch;
    private Subj[] subjects;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch=branch;
    }
    public String getRollid()
    {
        return rollid;
    }
    public void setRollid(String rollid)
    {
        this.rollid=rollid;
    }
    public String getEmail()
    {
        return mailid;
    }
    public void setEmail(String mailid)
    {
        this.mailid=mailid;
    }
    public Subj[] getSubj()
    {
        return subjects;
    }
    public void setSubj(Subj[] subjects)
    {
        this.subjects=subjects;
    }
    public Students(String name, int age, String branch,String rollid, String mailid, Subj[] subject)
    {
        super();
        this.name=name;
        this.age=age;
        this.branch=branch;
        this.rollid=rollid;
        this.mailid=mailid;
        this.subjects=subject;
    }
}
