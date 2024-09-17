SELECT * FROM public.course
ORDER BY id ASC 

insert into course(id, name)
values(1, 'HCS');

insert into course(id, name)
values(2, 'HCC');

insert into course(id, name)
values(3, 'HAI');


CREATE OR REPLACE FUNCTION total_courses()
RETURNS integer AS $totalnoofcourses$
DECLARE
    totalnoofcourses integer;
BEGIN
    SELECT count(*) INTO totalnoofcourses FROM course;
    RETURN totalnoofcourses;
END;
$totalnoofcourses$ LANGUAGE plpgsql;


