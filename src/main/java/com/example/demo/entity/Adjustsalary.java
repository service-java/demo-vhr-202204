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
@Table(name="adjustsalary")
@Erupt(name = "Adjustsalary"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Adjustsalary implements java.io.Serializable {
    public static String _cols = "id,eid,asDate,beforeSalary,afterSalary,reason,remark";

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

	@EruptField(
		views = @View(title = "eid"),
		edit = @Edit(title = "eid"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer eid;

	/**
	 * 调薪日期
	 */
	@EruptField(
		views = @View(title = "调薪日期"),
		edit = @Edit(title = "调薪日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date asdate;

	/**
	 * 调前薪资
	 */
	@EruptField(
		views = @View(title = "调前薪资"),
		edit = @Edit(title = "调前薪资"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer beforesalary;

	/**
	 * 调后薪资
	 */
	@EruptField(
		views = @View(title = "调后薪资"),
		edit = @Edit(title = "调后薪资"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer aftersalary;

	/**
	 * 调薪原因
	 */
	@EruptField(
		views = @View(title = "调薪原因"),
		edit = @Edit(title = "调薪原因"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String reason;

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