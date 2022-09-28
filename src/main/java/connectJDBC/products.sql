create database quanlysanpham;
use quanlysanpham;
create table Product(
productID int not null auto_increment primary key,
productName varchar(200) not null,
productPrice double not null,
productAmount int not null,
productDescription text not null
);
insert into Product(productName,productPrice,productAmount,productDescription)values
("Iphone 8",88000,10,"Apple"),("Iphone 11",99000,20,"Apple");
select * from Product;