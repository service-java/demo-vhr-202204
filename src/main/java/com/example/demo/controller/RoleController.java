package com.example.demo.controller;


import com.example.demo.entity.Role;
import com.example.demo.mapper.RoleMapper;
import org.beetl.sql.core.page.DefaultPageRequest;
import org.beetl.sql.core.page.PageRequest;
import org.beetl.sql.core.page.PageResult;
import com.example.demo.util.PageDtoUtil;
import com.example.demo.util.ValidatorUtil;
import com.example.demo.vo.PageQueryVo;
import com.example.demo.vo.ResponseVo;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import xyz.erupt.core.annotation.EruptRecordOperate;
import xyz.erupt.core.annotation.EruptRouter;
import xyz.erupt.core.constant.EruptRestPath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(tags="Role")
@RequestMapping(EruptRestPath.ERUPT_API + "/role")
@Log
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;

    @ApiOperation("pageRole")
    @GetMapping("/pageRole")
    @ResponseBody
    // @EruptRecordOperate("登录可调用")
    @EruptRouter(verifyType = EruptRouter.VerifyType.LOGIN, authIndex = 0)
    public ResponseVo pageRole(PageQueryVo pageQueryVo) {
        ValidatorUtil.validateEntity(pageQueryVo);
        return ResponseVo.ok(roleMapper.pageRole(PageDtoUtil.convert(pageQueryVo)));
    }

}