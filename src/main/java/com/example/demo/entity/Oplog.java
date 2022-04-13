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
@Table(name="oplog")
@Erupt(name = "Oplog"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Oplog implements java.io.Serializable {
    public static String _cols = "id,addDate,operate,hrid";

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
	 * 添加日期
	 */
	@EruptField(
		views = @View(title = "添加日期"),
		edit = @Edit(title = "添加日期"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date adddate;

	/**
	 * 操作内容
	 */
	@EruptField(
		views = @View(title = "操作内容"),
		edit = @Edit(title = "操作内容"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String operate;

	/**
	 * 操作员ID
	 */
	@EruptField(
		views = @View(title = "操作员ID"),
		edit = @Edit(title = "操作员ID"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer hrid;

}