insert into categories (name) values ('Whiskey');
insert into drinks (name, category_id, description) values ('Johnny Walker Red Label',1,'Much good, wow!');
insert into drinks (name, category_id, description) values ('Bobos clown  fancy whiskey',1,'For black tie events only!');
insert into drinks (name, category_id, description) values ('Marlon brandos white cat whiskey',1,'It offers a taste no one can refuse');

insert into locations (name, address) values ('Bobos whiskey tent','Bobos tent');
insert into locations (name, address) values ('Eftirpartyid','Dufnaholar 10');

insert into offers (location_id, drink_id, price, volume) values (1, 1, 2000, 200);
insert into offers (location_id, drink_id, price, volume) values (1, 2, 3000, 200);
insert into offers (location_id, drink_id, price, volume) values (2, 2, 4000, 200);
insert into offers (location_id, drink_id, price, volume) values (2, 3, 5000, 200);
