/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/2/22 9:48:57                            */
/*==============================================================*/


drop table if exists data_dictorytion;

drop table if exists evaluate;

drop table if exists login;

drop table if exists menu;

drop table if exists order_;

drop table if exists order_detail;

drop table if exists staff;

drop table if exists user_;

drop table if exists user_login;

/*==============================================================*/
/* Table: data_dictorytion                                      */
/*==============================================================*/
create table data_dictorytion
(
   data_id              int not null auto_increment,
   data_note            varchar(50),
   data_detail          varchar(1000),
   note                 varchar(1000),
   primary key (data_id)
);

/*==============================================================*/
/* Table: evaluate                                              */
/*==============================================================*/
create table evaluate
(
   evaluate_id          int not null auto_increment,
   menu_id              int,
   detail_id            int,
   evaluate_name        varchar(100),
   evaluate_note        varchar(1000),
   picture              varchar(200),
   primary key (evaluate_id)
);

/*==============================================================*/
/* Table: login                                                 */
/*==============================================================*/
create table login
(
   login_id             int not null auto_increment,
   staff_id             int,
   login_username       char(10),
   login_password       char(10),
   login_note           char(10),
   primary key (login_id)
);

/*==============================================================*/
/* Table: menu                                                  */
/*==============================================================*/
create table menu
(
   menu_id              int not null auto_increment,
   staff_id             int,
   menu_name            varchar(100),
   menu_type            varchar(30),
   menu_quantity        int,
   menu_price           float,
   menu_note            varchar(1000),
   menu_picture         varchar(500),
   primary key (menu_id)
);

/*==============================================================*/
/* Table: order_                                                */
/*==============================================================*/
create table order_
(
   order_id             int not null auto_increment,
   user_id              int,
   order_details        varchar(50),
   order_state          varchar(20),
   order_evaluate       varchar(1000),
   primary key (order_id)
);

/*==============================================================*/
/* Table: order_detail                                          */
/*==============================================================*/
create table order_detail
(
   detail_id            int not null auto_increment,
   menu_id              int,
   order_id             int,
   primary key (detail_id)
);

/*==============================================================*/
/* Table: staff                                                 */
/*==============================================================*/
create table staff
(
   staff_id             int not null auto_increment,
   staff_name           varchar(30),
   staff_type           varchar(10),
   staff_sex            varchar(5),
   staff_phone          varchar(30),
   staff_moble_phone    varchar(30),
   staff_id_card        varchar(30),
   staff_date           date,
   staff_join_date      date,
   staff_authority      int,
   primary key (staff_id)
);

/*==============================================================*/
/* Table: user_                                                 */
/*==============================================================*/
create table user_
(
   user_id              int not null auto_increment,
   user_name            varchar(50),
   user_sex             varchar(5),
   user_nickname        varchar(40),
   user_phone           varchar(30),
   user_qq              varchar(20),
   email                varchar(30),
   user_address         varchar(500),
   user_note            varchar(1000),
   primary key (user_id)
);

/*==============================================================*/
/* Table: user_login                                            */
/*==============================================================*/
create table user_login
(
   login_id             int not null auto_increment,
   user_id              int,
   username             varchar(30),
   password             varchar(30),
   note                 varchar(1000),
   primary key (login_id)
);

alter table evaluate add constraint FK_Reference_7 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table evaluate add constraint FK_Reference_8 foreign key (detail_id)
      references order_detail (detail_id) on delete restrict on update restrict;

alter table login add constraint FK_Reference_2 foreign key (staff_id)
      references staff (staff_id) on delete restrict on update restrict;

alter table menu add constraint FK_Reference_1 foreign key (staff_id)
      references staff (staff_id) on delete restrict on update restrict;

alter table order_ add constraint FK_Reference_6 foreign key (user_id)
      references user_ (user_id) on delete restrict on update restrict;

alter table order_detail add constraint FK_Reference_4 foreign key (menu_id)
      references menu (menu_id) on delete restrict on update restrict;

alter table order_detail add constraint FK_Reference_9 foreign key (order_id)
      references order_ (order_id) on delete restrict on update restrict;

alter table user_login add constraint FK_Reference_3 foreign key (user_id)
      references user_ (user_id) on delete restrict on update restrict;

