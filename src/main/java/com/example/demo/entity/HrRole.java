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
@Table(name="hr_role")
@Erupt(name = "HrRole"
	
	
	, power = @Power(export = true, importable = true)
)

@Entity
public class HrRole implements java.io.Serializable {
    public static String _cols = "id,hrid,rid";

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
		views = @View(title = "hrid"),
		edit = @Edit(title = "hrid"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer hrid;

	@EruptField(
		views = @View(title = "rid"),
		edit = @Edit(title = "rid"
				// , notNull = true
				
				, search = @Search(vague = true)
		)
	)
	private Integer rid;

}