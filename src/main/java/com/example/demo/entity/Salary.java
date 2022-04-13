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
@Table(name="salary")
@Erupt(name = "Salary"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Salary implements java.io.Serializable {
    public static String _cols = "id,basicSalary,bonus,lunchSalary,trafficSalary,allSalary,pensionBase,pensionPer,createDate,medicalBase,medicalPer,accumulationFundBase,accumulationFundPer,name";

	@AutoID
	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "native")
	@EruptField(
		views = @View(title = "id"),
		edit = @Edit(title = "id"
				// , notNull = true
				
				
		)
	)
	private Integer id;

	/**
	 * 基本工资
	 */
	@EruptField(
		views = @View(title = "基本工资"),
		edit = @Edit(title = "基本工资"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer basicsalary;

	/**
	 * 奖金
	 */
	@EruptField(
		views = @View(title = "奖金"),
		edit = @Edit(title = "奖金"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer bonus;

	/**
	 * 午餐补助
	 */
	@EruptField(
		views = @View(title = "午餐补助"),
		edit = @Edit(title = "午餐补助"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer lunchsalary;

	/**
	 * 交通补助
	 */
	@EruptField(
		views = @View(title = "交通补助"),
		edit = @Edit(title = "交通补助"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer trafficsalary;

	/**
	 * 应发工资
	 */
	@EruptField(
		views = @View(title = "应发工资"),
		edit = @Edit(title = "应发工资"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer allsalary;

	/**
	 * 养老金基数
	 */
	@EruptField(
		views = @View(title = "养老金基数"),
		edit = @Edit(title = "养老金基数"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer pensionbase;

	/**
	 * 养老金比率
	 */
	@EruptField(
		views = @View(title = "养老金比率"),
		edit = @Edit(title = "养老金比率"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private BigDecimal pensionper;

	/**
	 * 启用时间
	 */
	@EruptField(
		views = @View(title = "启用时间"),
		edit = @Edit(title = "启用时间"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date createdate;

	/**
	 * 医疗基数
	 */
	@EruptField(
		views = @View(title = "医疗基数"),
		edit = @Edit(title = "医疗基数"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer medicalbase;

	/**
	 * 医疗保险比率
	 */
	@EruptField(
		views = @View(title = "医疗保险比率"),
		edit = @Edit(title = "医疗保险比率"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private BigDecimal medicalper;

	/**
	 * 公积金基数
	 */
	@EruptField(
		views = @View(title = "公积金基数"),
		edit = @Edit(title = "公积金基数"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer accumulationfundbase;

	/**
	 * 公积金比率
	 */
	@EruptField(
		views = @View(title = "公积金比率"),
		edit = @Edit(title = "公积金比率"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private BigDecimal accumulationfundper;

	@EruptField(
		views = @View(title = "name"),
		edit = @Edit(title = "name"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String name;

}