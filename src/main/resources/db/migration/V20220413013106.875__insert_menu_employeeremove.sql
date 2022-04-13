INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:06', 'erupt', '2022-04-13 01:31:06', 'uEDqEJp3', NULL, 'Employeeremove', NULL, NULL, '1', 'table', 'Employeeremove', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:06', NULL, NULL, 'TtI246pG', NULL, '新增', NULL, '10', '1', 'button', 'Employeeremove@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:06', NULL, NULL, 'OteaZlJ0', NULL, '修改', NULL, '20', '1', 'button', 'Employeeremove@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:06', NULL, NULL, 'QuB9XZxb', NULL, '删除', NULL, '30', '1', 'button', 'Employeeremove@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:06', NULL, NULL, '7cAPu2r1', NULL, '导出', NULL, '40', '1', 'button', 'Employeeremove@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:06', NULL, NULL, 'QuYUvFRB', NULL, '导入', NULL, '50', '1', 'button', 'Employeeremove@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:06', NULL, NULL, 'woZmu04H', NULL, '详情', NULL, '60', '1', 'button', 'Employeeremove@VIEW_DETAIL', @parentId);
