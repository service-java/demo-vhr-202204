INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:18', 'erupt', '2022-04-13 01:31:18', 'cWcSCC4T', NULL, 'HrRole', NULL, NULL, '1', 'table', 'HrRole', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:18', NULL, NULL, 'mSJevNzJ', NULL, '新增', NULL, '10', '1', 'button', 'HrRole@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:18', NULL, NULL, 'piRk6EVy', NULL, '修改', NULL, '20', '1', 'button', 'HrRole@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:18', NULL, NULL, 'T34lCexK', NULL, '删除', NULL, '30', '1', 'button', 'HrRole@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:18', NULL, NULL, 'Vlo84KNU', NULL, '导出', NULL, '40', '1', 'button', 'HrRole@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:18', NULL, NULL, '6JlEyVHT', NULL, '导入', NULL, '50', '1', 'button', 'HrRole@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:18', NULL, NULL, 'WUMy15To', NULL, '详情', NULL, '60', '1', 'button', 'HrRole@VIEW_DETAIL', @parentId);
