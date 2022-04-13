package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;
import org.beetl.sql.annotation.entity.*;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Column;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_erupt.Power;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.DateType;
import xyz.erupt.annotation.sub_field.sub_edit.Search;
import xyz.erupt.annotation.sub_erupt.Filter;


/*
* 
* @Date 2022-04-13
*/

@DynamicUpdate
@DynamicInsert
@Getter
@Setter
// @Accessors(chain = true)
@Table(name="employee")
@Erupt(name = "Employee"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Employee implements java.io.Serializable {
    public static String _cols = "id,name,gender,birthday,idCard,wedlock,nationId,nativePlace,politicId,email,phone,address,departmentId,jobLevelId,posId,engageForm,tiptopDegree,specialty,school,beginDate,workState,workID,contractTerm,conversionTime,notWorkDate,beginContract,endContract,workAge";

	/**
	 * 员工编号
	 */
	@AutoID
	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "native")
	@EruptField(
		views = @View(title = "员工编号"),
		edit = @Edit(title = "员工编号"
				// , notNull = true
				
				
		)
	)
	private Integer id;

	/**
	 * 员工姓名
	 */
	@EruptField(
		views = @View(title = "员工姓名"),
		edit = @Edit(title = "员工姓名"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String name;

	/**
	 * 性别
	 */
	@EruptField(
		views = @View(title = "性别"),
		edit = @Edit(title = "性别"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String gender;

	/**
	 * 出生日期
	 */
	@EruptField(
		views = @View(title = "出生日期"),
		edit = @Edit(title = "出生日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date birthday;

	/**
	 * 身份证号
	 */
	@EruptField(
		views = @View(title = "身份证号"),
		edit = @Edit(title = "身份证号"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String idcard;

	/**
	 * 婚姻状况
	 */
	@EruptField(
		views = @View(title = "婚姻状况"),
		edit = @Edit(title = "婚姻状况"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String wedlock;

	/**
	 * 民族
	 */
	@EruptField(
		views = @View(title = "民族"),
		edit = @Edit(title = "民族"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer nationid;

	/**
	 * 籍贯
	 */
	@EruptField(
		views = @View(title = "籍贯"),
		edit = @Edit(title = "籍贯"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String nativeplace;

	/**
	 * 政治面貌
	 */
	@EruptField(
		views = @View(title = "政治面貌"),
		edit = @Edit(title = "政治面貌"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer politicid;

	/**
	 * 邮箱
	 */
	@EruptField(
		views = @View(title = "邮箱"),
		edit = @Edit(title = "邮箱"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String email;

	/**
	 * 电话号码
	 */
	@EruptField(
		views = @View(title = "电话号码"),
		edit = @Edit(title = "电话号码"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String phone;

	/**
	 * 联系地址
	 */
	@EruptField(
		views = @View(title = "联系地址"),
		edit = @Edit(title = "联系地址"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String address;

	/**
	 * 所属部门
	 */
	@EruptField(
		views = @View(title = "所属部门"),
		edit = @Edit(title = "所属部门"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer departmentid;

	/**
	 * 职称ID
	 */
	@EruptField(
		views = @View(title = "职称ID"),
		edit = @Edit(title = "职称ID"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer joblevelid;

	/**
	 * 职位ID
	 */
	@EruptField(
		views = @View(title = "职位ID"),
		edit = @Edit(title = "职位ID"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer posid;

	/**
	 * 聘用形式
	 */
	@EruptField(
		views = @View(title = "聘用形式"),
		edit = @Edit(title = "聘用形式"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String engageform;

	/**
	 * 最高学历
	 */
	@EruptField(
		views = @View(title = "最高学历"),
		edit = @Edit(title = "最高学历"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String tiptopdegree;

	/**
	 * 所属专业
	 */
	@EruptField(
		views = @View(title = "所属专业"),
		edit = @Edit(title = "所属专业"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String specialty;

	/**
	 * 毕业院校
	 */
	@EruptField(
		views = @View(title = "毕业院校"),
		edit = @Edit(title = "毕业院校"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String school;

	/**
	 * 入职日期
	 */
	@EruptField(
		views = @View(title = "入职日期"),
		edit = @Edit(title = "入职日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date begindate;

	/**
	 * 在职状态
	 */
	@EruptField(
		views = @View(title = "在职状态"),
		edit = @Edit(title = "在职状态"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String workstate;

	/**
	 * 工号
	 */
	@EruptField(
		views = @View(title = "工号"),
		edit = @Edit(title = "工号"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String workid;

	/**
	 * 合同期限
	 */
	@EruptField(
		views = @View(title = "合同期限"),
		edit = @Edit(title = "合同期限"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private BigDecimal contractterm;

	/**
	 * 转正日期
	 */
	@EruptField(
		views = @View(title = "转正日期"),
		edit = @Edit(title = "转正日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date conversiontime;

	/**
	 * 离职日期
	 */
	@EruptField(
		views = @View(title = "离职日期"),
		edit = @Edit(title = "离职日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date notworkdate;

	/**
	 * 合同起始日期
	 */
	@EruptField(
		views = @View(title = "合同起始日期"),
		edit = @Edit(title = "合同起始日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date begincontract;

	/**
	 * 合同终止日期
	 */
	@EruptField(
		views = @View(title = "合同终止日期"),
		edit = @Edit(title = "合同终止日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date endcontract;

	/**
	 * 工龄
	 */
	@EruptField(
		views = @View(title = "工龄"),
		edit = @Edit(title = "工龄"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer workage;

}