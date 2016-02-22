use ProyectoBD;


delimiter |
create procedure insertar_persona(in CR varchar(13),in nom varchar(25),in ape varchar(25),in fnac date, in dir varchar(35))
begin 
	insert into Persona (CI_RUC,nombres,apellidos,fechaNacimiento,direccion)values(CR,nom,ape,fnac,dir);
end
|
delimiter ;



delimiter |
create view Mostrar_Persona as
	select * from Persona;

|
delimiter ;

delimiter |
create procedure Editar_persona(in idPers int,in CR varchar(13),in nom varchar(25),in ape varchar(25),in fnac date, in dir varchar(35))
begin 
	set foreign_key_checks=0;
	update Persona set CI_RUC=CR ,nombres=nom, apellidos=ape , fechaNacimiento=fnac ,direccion=dir where idPersona=idPers;
	set foreign_key_checks=1;
end
|
delimiter ;

delimiter |
create procedure Borrar_persona(in idPers int)
begin 
	set foreign_key_checks=0;
	delete from Persona where idPersona=idPers;
	set foreign_key_checks=1;
end
|
delimiter ;