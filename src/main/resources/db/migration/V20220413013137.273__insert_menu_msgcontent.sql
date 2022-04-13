INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:37', 'erupt', '2022-04-13 01:31:37', 'EOhEh5wQ', NULL, 'Msgcontent', NULL, NULL, '1', 'table', 'Msgcontent', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:37', NULL, NULL, 'DKqnFLGF', NULL, '新增', NULL, '10', '1', 'button', 'Msgcontent@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:37', NULL, NULL, 'qaqfR8px', NULL, '修改', NULL, '20', '1', 'button', 'Msgcontent@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:37', NULL, NULL, 'kN0Hiiwf', NULL, '删除', NULL, '30', '1', 'button', 'Msgcontent@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:37', NULL, NULL, 'qYdVsr96', NULL, '导出', NULL, '40', '1', 'button', 'Msgcontent@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:37', NULL, NULL, 'IzRmEnRw', NULL, '导入', NULL, '50', '1', 'button', 'Msgcontent@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:37', NULL, NULL, 'hkgafnMt', NULL, '详情', NULL, '60', '1', 'button', 'Msgcontent@VIEW_DETAIL', @parentId);
