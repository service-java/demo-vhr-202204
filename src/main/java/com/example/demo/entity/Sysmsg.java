package com.example.demo.entity;

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
@Table(name="sysmsg")
@Erupt(name = "Sysmsg"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Sysmsg implements java.io.Serializable {
    public static String _cols = "id,mid,type,hrid,state";

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
	 * 消息id
	 */
	@EruptField(
		views = @View(title = "消息id"),
		edit = @Edit(title = "消息id"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer mid;

	/**
	 * 0表示群发消息
	 */
	@EruptField(
		views = @View(title = "0表示群发消息"),
		edit = @Edit(title = "0表示群发消息"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer type;

	/**
	 * 这条消息是给谁的
	 */
	@EruptField(
		views = @View(title = "这条消息是给谁的"),
		edit = @Edit(title = "这条消息是给谁的"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer hrid;

	/**
	 * 0 未读 1 已读
	 */
	@EruptField(
		views = @View(title = "0 未读 1 已读"),
		edit = @Edit(title = "0 未读 1 已读"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer state;

}