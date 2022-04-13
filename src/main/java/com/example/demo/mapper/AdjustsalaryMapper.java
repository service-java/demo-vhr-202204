package com.example.demo.mapper;

import com.example.demo.entity.*;

import java.util.List;

import org.beetl.sql.mapper.BaseMapper;
import org.beetl.sql.core.page.PageRequest;
import org.beetl.sql.core.page.PageResult;
import org.beetl.sql.mapper.annotation.Template;

/*
*
* @Date 2022-04-13
*/
public interface AdjustsalaryMapper extends BaseMapper<Adjustsalary> {

    PageResult<Adjustsalary> pageAdjustsalary(PageRequest pageRequest);

}