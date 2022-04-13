INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:09', 'erupt', '2022-04-13 01:31:09', '8diHVWzH', NULL, 'Employeetrain', NULL, NULL, '1', 'table', 'Employeetrain', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:09', NULL, NULL, 'Yg0r02VZ', NULL, '新增', NULL, '10', '1', 'button', 'Employeetrain@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:09', NULL, NULL, 'FkwHLlNs', NULL, '修改', NULL, '20', '1', 'button', 'Employeetrain@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:09', NULL, NULL, 'BezgVC8Q', NULL, '删除', NULL, '30', '1', 'button', 'Employeetrain@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:09', NULL, NULL, 'Tm5DWc1y', NULL, '导出', NULL, '40', '1', 'button', 'Employeetrain@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:09', NULL, NULL, 'yriUirpH', NULL, '导入', NULL, '50', '1', 'button', 'Employeetrain@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:09', NULL, NULL, 'B8x7rikU', NULL, '详情', NULL, '60', '1', 'button', 'Employeetrain@VIEW_DETAIL', @parentId);
