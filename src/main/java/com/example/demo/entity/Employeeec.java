package com.example.demo.entity;

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
@Table(name="employeeec")
@Erupt(name = "Employeeec"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Employeeec implements java.io.Serializable {
    public static String _cols = "id,eid,ecDate,ecReason,ecPoint,ecType,remark";

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
	 * 员工编号
	 */
	@EruptField(
		views = @View(title = "员工编号"),
		edit = @Edit(title = "员工编号"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer eid;

	/**
	 * 奖罚日期
	 */
	@EruptField(
		views = @View(title = "奖罚日期"),
		edit = @Edit(title = "奖罚日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date ecdate;

	/**
	 * 奖罚原因
	 */
	@EruptField(
		views = @View(title = "奖罚原因"),
		edit = @Edit(title = "奖罚原因"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String ecreason;

	/**
	 * 奖罚分
	 */
	@EruptField(
		views = @View(title = "奖罚分"),
		edit = @Edit(title = "奖罚分"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer ecpoint;

	/**
	 * 奖罚类别，0：奖，1：罚
	 */
	@EruptField(
		views = @View(title = "奖罚类别，0"),
		edit = @Edit(title = "奖罚类别，0"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer ectype;

	/**
	 * 备注
	 */
	@EruptField(
		views = @View(title = "备注"),
		edit = @Edit(title = "备注"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String remark;

}