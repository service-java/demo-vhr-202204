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
@Table(name="menu")
@Erupt(name = "Menu"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Menu implements java.io.Serializable {
    public static String _cols = "id,url,path,component,name,iconCls,keepAlive,requireAuth,parentId,enabled";

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
		views = @View(title = "url"),
		edit = @Edit(title = "url"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String url;

	@EruptField(
		views = @View(title = "path"),
		edit = @Edit(title = "path"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String path;

	@EruptField(
		views = @View(title = "component"),
		edit = @Edit(title = "component"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String component;

	@EruptField(
		views = @View(title = "name"),
		edit = @Edit(title = "name"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String name;

	@EruptField(
		views = @View(title = "iconcls"),
		edit = @Edit(title = "iconcls"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String iconcls;

	@EruptField(
		views = @View(title = "keepalive"),
		edit = @Edit(title = "keepalive"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer keepalive;

	@EruptField(
		views = @View(title = "requireauth"),
		edit = @Edit(title = "requireauth"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer requireauth;

	@EruptField(
		views = @View(title = "parentid"),
		edit = @Edit(title = "parentid"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer parentid;

	@EruptField(
		views = @View(title = "enabled"),
		edit = @Edit(title = "enabled"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer enabled;

}