-- comment out/in
DB Management
--------------------------------------
�li�kisel Veri Tabanlar�
1-Mysql
2-Postgresql
3-H2-Db
4-Mssql
5-MariaDb
6-Sybase

Client: istemci 
Server: iste�i yerine getiren

Data(Veri): i�lenmemi� bilgilere denir.


Veri: i�lenmemi� bilgiler demektir.
Veri Taban�:mant�ksal ve fiziksel veri k�melerine denir.
Veri Taban� Y�netim Sistemi: verileri saklamak, g�venli�ini sa�lamak, tekrars�z veriler olu�turmak,yede�ini almak


Veri Taban�
-------------------------------------
D�zenli veriler toplulu�udur.
Gereksiz verileri bar�nd�rmaz.
Bellek kullan�m� d�zenlidir.



�yi Bir Veritaban� nas�l olmal�d�r ?
--------------------------------------
G�venilir olmal�d�r.
G�venli bir �ekilde verilerimiz saklayabilmeliyiz.
Tekrars�z veriler olmamas� gerekir.


veri Taban� T�rleri
--------------------------------------
1-Hiyerar�k Veri taban�
2-�li�kisel Veri Tabanlar�
3-�li�kisel Olmayan Veri Tabanlar�
4-Nesnesel Veri tabanlar�

�li�kisel Veri Tabanlar�
--------------------------------------
sat�r(row) sutun(colomn)
Verileri tablolardan tutulur.
Normalization (verileri daha d�zg�n muhafaza etmek)
Sql Manipulation
Dikey �l�ekleme

RDBMS - VTYS(Veri Taban� Y�netim Sistemi)=> Mysql,Postgresql,Mssql
--------------------------------------
Veriyi muhafaza etmek
Veri B�t�nl���n� korumak
DDL
DML


VTYS(Veri Taban� Y�netim Sistemi)
--------------------------------------
Veri taban� kavram� 1980 y�llarda ortaya ��k�yor.
Veriler saklamak,g�ncellemek,y�netmek,g�venli�i sa�lamak
Veriler b�t�nl���n� korumak
Veri tekrar�nda uzak durmak

SQL:
--------------------------------------
Sql standart�m�z 1983 IBM labaraturlar�nda standartlar� belirliyorlar.
1987 ANSI SQL standartla�t�rm��lard�r.
SQL Oracle,Sybase,Mysql,Mssql
Sorgulama dilidir. Programlama dili de�ildir.
DBMS'ler bu SQL kullanarak �zerine yeni �zellikler in�a eder.
non-case-sensitive (B�y�k k���k harfe duyarl� de�ildir)
Noktal� virg�l yazal�m.
B�t�n VTYS'lerde kullan�l�r.
SEQUEL(Structed English QUery Language)
SQL (Structed Query Language) => Yap�land�r�lm�� sorgulama dilidir.
T-SQL: sql ba�da�t�r�lm�� bir kelimeldir.

SQL ALT GRUPLARI
--------------------------------------
1-) DCL (Data Control Language) : Veri Kontrol Dili =>Revoke,Grant,Deny
2-) DDL (Data Definition Language)   => Create,Alter,Drop,Truncate,Rename,Comment
3-) DML (Data Manip�lation Language) => insert,update,delete,merge
4-) DQL (Data Query Language)        => select

SQL syntax
--------------------------------------
Tek  T�rnak (single quote): ''
�ift T�rnak (double quote): ""
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
-- ;(noktal� virg�l unutma)
-- b�y�k harfle yaz�l�r
-- comment bol bol yaz�n

-- de�i�kenleri olu�tururken:
-- hepsi k���k harf
-- kelimeler ayr��t�r�rken under_score kullanal�m exam: student_name

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
-- �ift t�rnak yazma
select * from employees ;
select last_name from employees;
select last_name from employees where last_name='King'

----------------------------------------------------
-- id name surname
-- deneme

-- select
select * from deneme;

-- insert
insert into deneme (name,surname) VALUES ('ad�55','soyad�55');

-- delete
delete from deneme ;
delete from deneme where id=6;

-- update
update deneme set name='ad� 99';
update deneme set name='ad� 88' where id=7;




















