-- comment out/in
DB Management
--------------------------------------
Ýliþkisel Veri Tabanlarý
1-Mysql
2-Postgresql
3-H2-Db
4-Mssql
5-MariaDb
6-Sybase

Client: istemci 
Server: isteði yerine getiren

Data(Veri): iþlenmemiþ bilgilere denir.


Veri: iþlenmemiþ bilgiler demektir.
Veri Tabaný:mantýksal ve fiziksel veri kümelerine denir.
Veri Tabaný Yönetim Sistemi: verileri saklamak, güvenliðini saðlamak, tekrarsýz veriler oluþturmak,yedeðini almak


Veri Tabaný
-------------------------------------
Düzenli veriler topluluðudur.
Gereksiz verileri barýndýrmaz.
Bellek kullanýmý düzenlidir.



Ýyi Bir Veritabaný nasýl olmalýdýr ?
--------------------------------------
Güvenilir olmalýdýr.
Güvenli bir þekilde verilerimiz saklayabilmeliyiz.
Tekrarsýz veriler olmamasý gerekir.


veri Tabaný Türleri
--------------------------------------
1-Hiyerarþk Veri tabaný
2-Ýliþkisel Veri Tabanlarý
3-Ýliþkisel Olmayan Veri Tabanlarý
4-Nesnesel Veri tabanlarý

Ýliþkisel Veri Tabanlarý
--------------------------------------
satýr(row) sutun(colomn)
Verileri tablolardan tutulur.
Normalization (verileri daha düzgün muhafaza etmek)
Sql Manipulation
Dikey Ölçekleme

RDBMS - VTYS(Veri Tabaný Yönetim Sistemi)=> Mysql,Postgresql,Mssql
--------------------------------------
Veriyi muhafaza etmek
Veri Bütünlüðünü korumak
DDL
DML


VTYS(Veri Tabaný Yönetim Sistemi)
--------------------------------------
Veri tabaný kavramý 1980 yýllarda ortaya çýkýyor.
Veriler saklamak,güncellemek,yönetmek,güvenliði saðlamak
Veriler bütünlüðünü korumak
Veri tekrarýnda uzak durmak

SQL:
--------------------------------------
Sql standartýmýz 1983 IBM labaraturlarýnda standartlarý belirliyorlar.
1987 ANSI SQL standartlaþtýrmýþlardýr.
SQL Oracle,Sybase,Mysql,Mssql
Sorgulama dilidir. Programlama dili deðildir.
DBMS'ler bu SQL kullanarak üzerine yeni özellikler inþa eder.
non-case-sensitive (Büyük küçük harfe duyarlý deðildir)
Noktalý virgül yazalým.
Bütün VTYS'lerde kullanýlýr.
SEQUEL(Structed English QUery Language)
SQL (Structed Query Language) => Yapýlandýrýlmýþ sorgulama dilidir.
T-SQL: sql baðdaþtýrýlmýþ bir kelimeldir.

SQL ALT GRUPLARI
--------------------------------------
1-) DCL (Data Control Language) : Veri Kontrol Dili =>Revoke,Grant,Deny
2-) DDL (Data Definition Language)   => Create,Alter,Drop,Truncate,Rename,Comment
3-) DML (Data Manipülation Language) => insert,update,delete,merge
4-) DQL (Data Query Language)        => select

SQL syntax
--------------------------------------
Tek  Týrnak (single quote): ''
Çift Týrnak (double quote): ""
backtick                  : ``

----------------------------------------------------------------------------

-- DDL (Data Definition Language)   => database-table => Create,Alter,Drop,Truncate,Rename,Comment
-- DATABASE
-- create
create DATABASE  `deneme`;
create DATABASE  deneme;
create schema deneme default character set  utf8 collate utf8_turkish_ci;

-- use
use deneme;

-- drop
drop database_name deneme;
drop table_name deneme;

-- alter
alter schema database_name default character set  utf8 collate utf8_turkish_ci;

-- truncate
truncate  table_name

-------------------------------------
-- TABLE

-- common rules
-- ;(noktalý virgül unutma)
-- büyük harfle yazýlýr
-- comment bol bol yazýn

-- deðiþkenleri oluþtururken:
-- hepsi küçük harf
-- kelimeler ayrýþtýrýrken under_score kullanalým exam: student_name

--  MYSQL
CREATE TABLE person (
`tc_kimlik_id` SMALLINT(5) NOT NULL AUTO_INCREMENT,
`student_name` VARCHAR(150) NOT NULL,
`student_surname` VARCHAR(255) NULL,
`created_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (`tc_kimlik_id`));

-- Postgresql
CREATE TABLE IF NOT EXISTS public.deneme
(
    id serial NOT NULL,
    name character varying(155),
    surname character varying(255),
    PRIMARY KEY (id)
    );
ALTER TABLE public.deneme
    OWNER to postgres;


----------------------------------------------------
-- Operators
=
<>  !=
>
>=
<
<=

-- relation 
AND :VE
OR  :VEYA

-- between like in subQuery join group by having as order by limit
-- aggregate (min-max-count-avg-sum)
-- string function (lower-upper-substring-length-replace-trim-concat)
----------------------------------------------------
-- select
-- SELECT(SUTUNLAR) FROM(TABLO ADI)  WHERE(Conditional)
-- çift týrnak yazma
select * from employees ;
select last_name from employees;
select last_name from employees where last_name='King'

----------------------------------------------------
-- id name surname
-- deneme

-- select
select * from deneme;

-- insert
insert into deneme (name,surname) VALUES ('adý55','soyadý55');

-- delete
delete from deneme ;
delete from deneme where id=6;

-- update
update deneme set name='adý 99';
update deneme set name='adý 88' where id=7;




















