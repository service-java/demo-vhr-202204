INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:39', 'erupt', '2022-04-13 01:31:39', 'pYNqOVYl', NULL, 'Nation', NULL, NULL, '1', 'table', 'Nation', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:39', NULL, NULL, 'TsmaocA7', NULL, '新增', NULL, '10', '1', 'button', 'Nation@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:39', NULL, NULL, 'GDSl5YzX', NULL, '修改', NULL, '20', '1', 'button', 'Nation@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:39', NULL, NULL, 'wo0IPdf5', NULL, '删除', NULL, '30', '1', 'button', 'Nation@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:39', NULL, NULL, 'lRx7FnPC', NULL, '导出', NULL, '40', '1', 'button', 'Nation@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:39', NULL, NULL, '74U9VIPH', NULL, '导入', NULL, '50', '1', 'button', 'Nation@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:39', NULL, NULL, 'tfLDbPKQ', NULL, '详情', NULL, '60', '1', 'button', 'Nation@VIEW_DETAIL', @parentId);
