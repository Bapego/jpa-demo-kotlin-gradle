--insert into ARTISTS (kor, nev) values (23,'Béla');
--insert into ARTISTS (kor, nev) values (25,'Botond');
--insert into PRODUCTS (name, description, discount, eod, price, artist_id) values ('Alma', 'Ez egy gyönyörű alma', 20, '2017-01-01', 200000, (select id from artists where nev = 'Béla' LIMIT 1));
--insert into PRODUCTS (name, description, discount, eod, price, artist_id) values ('Körte', 'Ez egy gyönyörű körte', 20, (SELECT NOW() LIMIT 1), 200000, 2);
--insert into PRODUCTS (name, description, discount, eod, price, artist_id) values ('Banán', 'Ez egy gyönyörű banán', 20, (SELECT NOW() LIMIT 1), 200000, 2);
--insert into PRODUCTS (name, description, discount, eod, price, artist_id) values ('Nagy Banán', '*confirmed*', 20, '2019-01-01', 200000, 2);
select * from ARTISTS