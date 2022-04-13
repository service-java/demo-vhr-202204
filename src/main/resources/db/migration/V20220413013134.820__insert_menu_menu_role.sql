INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:34', 'erupt', '2022-04-13 01:31:34', 'vPpeVN5y', NULL, 'MenuRole', NULL, NULL, '1', 'table', 'MenuRole', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:34', NULL, NULL, 'YPmH5gZB', NULL, '新增', NULL, '10', '1', 'button', 'MenuRole@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:34', NULL, NULL, 'F82OvMhA', NULL, '修改', NULL, '20', '1', 'button', 'MenuRole@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:34', NULL, NULL, '62ELvWvz', NULL, '删除', NULL, '30', '1', 'button', 'MenuRole@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:34', NULL, NULL, 'LoSDv291', NULL, '导出', NULL, '40', '1', 'button', 'MenuRole@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:34', NULL, NULL, 'O1XcRHUb', NULL, '导入', NULL, '50', '1', 'button', 'MenuRole@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:34', NULL, NULL, 'ftE9Ndyj', NULL, '详情', NULL, '60', '1', 'button', 'MenuRole@VIEW_DETAIL', @parentId);
