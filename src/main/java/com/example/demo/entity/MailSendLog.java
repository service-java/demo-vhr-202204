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
@Table(name="mail_send_log")
@Erupt(name = "MailSendLog"
	
    , primaryKeyCol="msgid"
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class MailSendLog implements java.io.Serializable {
    public static String _cols = "msgId,empId,status,routeKey,exchange,count,tryTime,createTime,updateTime";

	@Id
	@GeneratedValue(generator = "generator")
	@GenericGenerator(name = "generator", strategy = "native")
	@EruptField(
		views = @View(title = "msgid"),
		edit = @Edit(title = "msgid"
				// , notNull = true
				
				
		)
	)
	private String msgid;

	@EruptField(
		views = @View(title = "empid"),
		edit = @Edit(title = "empid"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer empid;

	/**
	 * 0发送中，1发送成功，2发送失败
	 */
	@EruptField(
		views = @View(title = "0发送中，1发送成功，2发送失败"),
		edit = @Edit(title = "0发送中，1发送成功，2发送失败"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer status;

	@EruptField(
		views = @View(title = "routekey"),
		edit = @Edit(title = "routekey"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String routekey;

	@EruptField(
		views = @View(title = "exchange"),
		edit = @Edit(title = "exchange"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private String exchange;

	/**
	 * 重试次数
	 */
	@EruptField(
		views = @View(title = "重试次数"),
		edit = @Edit(title = "重试次数"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer count;

	/**
	 * 第一次重试时间
	 */
	@EruptField(
		views = @View(title = "第一次重试时间"),
		edit = @Edit(title = "第一次重试时间"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date trytime;

	@EruptField(
		views = @View(title = "createtime"),
		edit = @Edit(title = "createtime"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date createtime;

	@EruptField(
		views = @View(title = "updatetime"),
		edit = @Edit(title = "updatetime"
				// , notNull = true
				, type = EditType.DATE, dateType = @DateType(type = DateType.Type.DATE)
				, search = @Search(vague = true)
		)
	)
	private Date updatetime;

}