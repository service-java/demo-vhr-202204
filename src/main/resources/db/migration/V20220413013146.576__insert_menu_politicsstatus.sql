INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:46', 'erupt', '2022-04-13 01:31:46', 'OGRn8FY6', NULL, 'Politicsstatus', NULL, NULL, '1', 'table', 'Politicsstatus', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:46', NULL, NULL, 'pij7UgKz', NULL, '新增', NULL, '10', '1', 'button', 'Politicsstatus@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:46', NULL, NULL, 'Vagk4dOZ', NULL, '修改', NULL, '20', '1', 'button', 'Politicsstatus@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:46', NULL, NULL, 'jnoNkgYN', NULL, '删除', NULL, '30', '1', 'button', 'Politicsstatus@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:46', NULL, NULL, 'd2wokNqr', NULL, '导出', NULL, '40', '1', 'button', 'Politicsstatus@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:46', NULL, NULL, 'q2jvluNZ', NULL, '导入', NULL, '50', '1', 'button', 'Politicsstatus@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:46', NULL, NULL, 'l9cL3Hck', NULL, '详情', NULL, '60', '1', 'button', 'Politicsstatus@VIEW_DETAIL', @parentId);
