use ProyectoBD;


delimiter |
create procedure insertar_Cliente(in CR varchar(13),in nom varchar(25),in ape varchar(25),in fnac date, in dir varchar(35))
begin 
	set foreign_key_checks=0;
	call insertar_persona(CR,nom,ape,fnac,dir);
	insert into Cliente (Persona_idPersona)values(LAST_INSERT_ID());
	set foreign_key_checks=1;
	
end
|
delimiter ;

delimiter |
create view Mostrar_Cliente as
	select c.idCliente, p.CI_RUC,p.nombres,p.apellidos from Persona p join Cliente c on p.idPersona=c.Persona_idPersona;

|
delimiter ;

delimiter |
create view Mostrar_Cliente_NA as
	select p.nombres,p.apellidos from Persona p join Cliente c on p.idPersona=c.Persona_idPersona;

|
delimiter ;

delimiter |
create procedure Buscar_Cliente_Nombre(in nom varchar(25),in ape varchar(25))
begin 
	select c.idCliente from Cliente c, Persona p where p.nombres=nom and p.apellidos=ape and p.idPersona=c.Persona_idPersona;
end
|
delimiter ;


delimiter |
create procedure Editar_Cliente(in idPers int,in CR varchar(13),in nom varchar(25),in ape varchar(25),in fnac date, in dir varchar(35))
begin 
	call Editar_persona(idPers,CR,nom,ape,fnac,dir);
end
|
delimiter ;


delimiter |
create procedure Borrar_Cliente(in idC int)
begin 

	call Borrar_persona((select p.idPersona from Persona p join Cliente c on p.idPersona=c.Persona_idPersona where c.idCliente=idC));
	delete from Cliente where idCliente=idC;
end
|
delimiter ;