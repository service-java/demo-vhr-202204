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
@Table(name="hr")
@Erupt(name = "Hr"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class Hr implements java.io.Serializable {
    public static String _cols = "id,name,phone,telephone,address,enabled,username,password,userface,remark";

	/**
	 * hrID
	 */
	@AutoID
	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "native")
	@EruptField(
		views = @View(title = "hrID"),
		edit = @Edit(title = "hrID"
				// , notNull = true
				
				
		)
	)
	private Integer id;

	/**
	 * 姓名
	 */
	@EruptField(
		views = @View(title = "姓名"),
		edit = @Edit(title = "姓名"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String name;

	/**
	 * 手机号码
	 */
	@EruptField(
		views = @View(title = "手机号码"),
		edit = @Edit(title = "手机号码"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String phone;

	/**
	 * 住宅电话
	 */
	@EruptField(
		views = @View(title = "住宅电话"),
		edit = @Edit(title = "住宅电话"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String telephone;

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

	@EruptField(
		views = @View(title = "enabled"),
		edit = @Edit(title = "enabled"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer enabled;

	/**
	 * 用户名
	 */
	@EruptField(
		views = @View(title = "用户名"),
		edit = @Edit(title = "用户名"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String username;

	/**
	 * 密码
	 */
	@EruptField(
		views = @View(title = "密码"),
		edit = @Edit(title = "密码"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String password;

	@EruptField(
		views = @View(title = "userface"),
		edit = @Edit(title = "userface"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String userface;

	@EruptField(
		views = @View(title = "remark"),
		edit = @Edit(title = "remark"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String remark;

}