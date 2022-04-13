INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:30:52', 'erupt', '2022-04-13 01:30:52', 'S20Oqjp7', NULL, 'Adjustsalary', NULL, NULL, '1', 'table', 'Adjustsalary', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:52', NULL, NULL, 'S03VUOuv', NULL, '新增', NULL, '10', '1', 'button', 'Adjustsalary@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:52', NULL, NULL, 'Wx26oRyN', NULL, '修改', NULL, '20', '1', 'button', 'Adjustsalary@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:52', NULL, NULL, 'aQqiP7iB', NULL, '删除', NULL, '30', '1', 'button', 'Adjustsalary@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:52', NULL, NULL, 'HshYi5qL', NULL, '导出', NULL, '40', '1', 'button', 'Adjustsalary@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:52', NULL, NULL, 'SrTPq9Lv', NULL, '导入', NULL, '50', '1', 'button', 'Adjustsalary@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:30:52', NULL, NULL, 'wiSze2jJ', NULL, '详情', NULL, '60', '1', 'button', 'Adjustsalary@VIEW_DETAIL', @parentId);
