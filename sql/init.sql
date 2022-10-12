-- auto-generated definition
create table table_attribute
(
    id varchar(24) not null comment '主键'
        primary key,
    table_code varchar(24) null comment '表类型',
    name       varchar(24) null comment '名字',
    url        varchar(64) null comment '查询地址',
    url_type   varchar(12) null comment '请求类型',
    stripe     tinyint(1) null comment '是否携带斑马纹',
    border     tinyint(1) null comment '是否携带边框',
    height     varchar(24) null comment '高度'
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
    comment '表属性';


-- auto-generated definition
create table table_dynamic
(
    id varchar(24) not null comment '主键'
        primary key,
    table_code  varchar(24) null comment '表id',
    name        varchar(24) null comment '表格名称',
    value       varchar(24) null comment '表格值',
    disabled    tinyint(1) null comment '表格状态',
    width       double null comment '宽度',
    fixed       varchar(24) null comment '固定列',
    parent_id   int null comment '父级id',
    type        varchar(24) null comment 'input select date time等',
    type_type   varchar(24) null comment '类型的类型',
    select_url  varchar(64) null comment '下拉框的请求地址 暂只支持get请求',
    align       varchar(12) null comment '对齐方式',
    sortable    tinyint(1) null comment '是否以该行进行排序',
    filters     varchar(240) null comment 'filters 是一个数组 如果为select 会获取select_url的值',
    show_search tinyint(1) default 0 null comment '是否需要进行查询',
    placeholder varchar(24) null comment '提示语句',
    sort        int null comment '排序'
) ENGINE= InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
    comment '行属性';


