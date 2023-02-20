package com.springapi.springapi;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class StuData {
    public String getStuData(String dis){
        Gson gson = new Gson();

        Subj[] s1 =new Subj[2];
        s1[0] = new Subj("Data Science", 78);
        s1[1] = new Subj("Network Security", 82);
        Students stu1 = new Students("Koustub", 21, "Computer Science","029", "kda@gmail.com", s1);
        String student1 = gson.toJson(stu1);

        Subj[] s2 =new Subj[2];
        s2[0] = new Subj("Data Science", 75);
        s2[1] = new Subj("Network Security", 78);
        Students stu2 = new Students("Harsh", 21, "Computer Science", "054","hrk@gmail.com", s2);
        String student2 = gson.toJson(stu2);

        Subj[] s3 =new Subj[2];
        s3[0] = new Subj("Software Tools", 85);
        s3[1] = new Subj("Physics", 84);
        Students stu3 = new Students("Adnan", 21, "Information Technology", "032", "shaikh@gmail.com", s3);
        String student3 = gson.toJson(stu3);

        Subj[] s4 =new Subj[2];
        s4[0] = new Subj("Software Tools", 91);
        s4[1] = new Subj("Physics", 87);
        Students stu4 = new Students("Aaryan", 21, "Information Technology", "033", "agupta@gmail.com", s4);
        String student4 = gson.toJson(stu4);

        Stud stuall = new Stud(stu1, stu2, stu3, stu4);
        String json5 = gson.toJson(stuall);


        String student;
        String b;
        if(Objects.equals(dis, stu1.getName())){
            student =student1;
        }
        else if(Objects.equals(dis, stu2.getName())){
            student =student2;
        }
        else if(Objects.equals(dis, stu3.getName())) {
            student = student3;
        }
        else if(Objects.equals(dis, stu4.getName())){
            student = student4;
        }
        else if (Objects.equals(dis, stu1.getRollid())) {
            student =student1;
        }
        else if(Objects.equals(dis, stu2.getRollid())){
            student =student2;
        }
        else if(Objects.equals(dis, stu3.getRollid())) {
            student = student3;
        }
        else if(Objects.equals(dis, stu4.getRollid())){
            student = student4;
        }
        else if(Objects.equals(dis, "all")){
            student = json5;
        }
        else {
            student = "Not found, enter valid credentials";
        }
        return student;
    }
}
