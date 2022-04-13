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
@Table(name="employeeremove")
@Erupt(name = "Employeeremove"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Employeeremove implements java.io.Serializable {
    public static String _cols = "id,eid,afterDepId,afterJobId,removeDate,reason,remark";

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
	 * 调动后部门
	 */
	@EruptField(
		views = @View(title = "调动后部门"),
		edit = @Edit(title = "调动后部门"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer afterdepid;

	/**
	 * 调动后职位
	 */
	@EruptField(
		views = @View(title = "调动后职位"),
		edit = @Edit(title = "调动后职位"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer afterjobid;

	/**
	 * 调动日期
	 */
	@EruptField(
		views = @View(title = "调动日期"),
		edit = @Edit(title = "调动日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date removedate;

	/**
	 * 调动原因
	 */
	@EruptField(
		views = @View(title = "调动原因"),
		edit = @Edit(title = "调动原因"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String reason;

	@EruptField(
		views = @View(title = "remark"),
		edit = @Edit(title = "remark"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String remark;

}