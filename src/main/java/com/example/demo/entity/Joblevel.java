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
@Table(name="joblevel")
@Erupt(name = "Joblevel"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Joblevel implements java.io.Serializable {
    public static String _cols = "id,name,titleLevel,createDate,enabled";

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
	 * 职称名称
	 */
	@EruptField(
		views = @View(title = "职称名称"),
		edit = @Edit(title = "职称名称"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String name;

	@EruptField(
		views = @View(title = "titlelevel"),
		edit = @Edit(title = "titlelevel"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String titlelevel;

	@EruptField(
		views = @View(title = "createdate"),
		edit = @Edit(title = "createdate"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date createdate;

	@EruptField(
		views = @View(title = "enabled"),
		edit = @Edit(title = "enabled"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer enabled;

}