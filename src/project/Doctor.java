package project;

//医院挂号系统
//1.新增科室、删除科室
//2.输入医生、科室信息，修改对应信息
//3.设置当前医生坐诊情况，预约医生的情况
//4.展示科室全部医生信息
//5.预约医生、科室
//6.输入时间日期，搜索未来几天医生信息
//7.查询未来几天医生预约情况等

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor {
    private String doctorId;
    private String name;
    private String departmentName;
    private String gender;
    private int age;
    private String specialty;//治疗方向
    private LocalDate joinDate;//入职时间
    private ArrayList<Schedule> schedules=new
            ArrayList<Schedule>();//医生坐诊情况

    public Doctor(String doctorId, String name, String departmentName, String gender, int age, String specialty, LocalDate joinDate, ArrayList<Schedule> schedules) {
        this.doctorId = doctorId;
        this.name = name;
        this.departmentName = departmentName;
        this.gender = gender;
        this.age = age;
        this.specialty = specialty;
        this.joinDate = joinDate;
        this.schedules = schedules;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(ArrayList<Schedule> schedules) {
        this.schedules = schedules;
    }
}
