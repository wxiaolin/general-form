package com.haibao.system.domain.po;

import com.haibao.business.domain.entity.StudentInfo;
import com.haibao.system.domain.entity.User;

/**
 * Created on 2018/4/5.
 *
 * @author haibao
 */
public class LoginUser {
    private User user;
    private StudentInfo studentInfo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public LoginUser() {

    }
}
