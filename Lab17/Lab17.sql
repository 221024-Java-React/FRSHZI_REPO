1- select * from songs where name='Austin';

2- select artist from songs where genre = 'Country';j

3- select name from songs where genre = 'Hip Hop' and duration >3.5;

4- select * from songs where name like 'H%';

5- select * from songs where genre= 'Country' and artist like '%Allen';



1- update songs set fav= true where genre = 'Hip Hop';

2- update songs set fav = true where genre = 'Rock' and artist ='Nirvana';

3- update songs set fav=true where name in('austin','Springsteen');



1- delete from songs where fav=false;

2- delete from songs where genre= 'Country';

3- delete from songs where duration > 3.5;

4- delete from songs where artist ='Jason Derulo';