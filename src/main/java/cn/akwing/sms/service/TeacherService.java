package cn.akwing.sms.service;

import cn.akwing.sms.pojo.Teacher;

import java.util.List;

/**
 * @author c1515
 */
public interface TeacherService {

    List<Teacher> selectByCondition(Teacher teacher);

    List<Teacher> selectAll();
}