INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:04', 'erupt', '2022-04-13 01:31:04', 'FvaU8yBn', NULL, 'Employeeec', NULL, NULL, '1', 'table', 'Employeeec', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:04', NULL, NULL, 'dnnzX0KS', NULL, '新增', NULL, '10', '1', 'button', 'Employeeec@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:04', NULL, NULL, 'LfNQwDP1', NULL, '修改', NULL, '20', '1', 'button', 'Employeeec@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:04', NULL, NULL, 'Jw6XZ7o9', NULL, '删除', NULL, '30', '1', 'button', 'Employeeec@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:04', NULL, NULL, 'HdKoNJHw', NULL, '导出', NULL, '40', '1', 'button', 'Employeeec@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:04', NULL, NULL, 'LqoCl7OQ', NULL, '导入', NULL, '50', '1', 'button', 'Employeeec@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:04', NULL, NULL, 'UFiqIbMO', NULL, '详情', NULL, '60', '1', 'button', 'Employeeec@VIEW_DETAIL', @parentId);
