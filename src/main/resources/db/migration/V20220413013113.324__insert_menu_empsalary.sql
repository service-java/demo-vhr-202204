INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, 'erupt', '2022-04-13 01:31:13', 'erupt', '2022-04-13 01:31:13', 'O4G6gRdW', NULL, 'Empsalary', NULL, NULL, '1', 'table', 'Empsalary', null);

set @parentId = @@identity;

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:13', NULL, NULL, 'iKid6Jaa', NULL, '新增', NULL, '10', '1', 'button', 'Empsalary@ADD', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:13', NULL, NULL, 'VPPEofXK', NULL, '修改', NULL, '20', '1', 'button', 'Empsalary@EDIT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:13', NULL, NULL, 'bEYeHRrM', NULL, '删除', NULL, '30', '1', 'button', 'Empsalary@DELETE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:13', NULL, NULL, 'W0m9ANeY', NULL, '导出', NULL, '40', '1', 'button', 'Empsalary@EXPORT', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:13', NULL, NULL, 'ELU0I0LX', NULL, '导入', NULL, '50', '1', 'button', 'Empsalary@IMPORTABLE', @parentId);

INSERT INTO `e_upms_menu` (`id`, `create_by`, `create_time`, `update_by`, `update_time`, `code`, `icon`, `name`, `param`, `sort`, `status`, `type`, `value`, `parent_menu_id`)
VALUES (NULL, NULL, '2022-04-13 01:31:13', NULL, NULL, 'WgaHnIO6', NULL, '详情', NULL, '60', '1', 'button', 'Empsalary@VIEW_DETAIL', @parentId);
