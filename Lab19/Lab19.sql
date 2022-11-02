--Task One

select e.employee_name as "Employee Name" , d.department_name as "Department Name" 
from employee e inner join department d 
on e.department  = d.department_id; 

--Task Two

select * from employee e right join department d on d.department_id =e.department ;

--Task Three

select e.employee_name, l.city from employee e left join location l on e.location = l.location_id 


--Task Four
select * from employee where department =1
union
select * from employee where "location" =1;

--Task Five
select * from employee where department  =1
except 
select * from employee where "location" =1;

--Task Six
select * from employee where department  =1
intersect  
select * from employee where "location" =1;
