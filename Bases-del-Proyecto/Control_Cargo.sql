use ProyectoBD;


delimiter |
create procedure insertar_Reservacion(in fech date, in des varchar(45), in prec double, in idEv int,in idC int,in idEst int)
begin 
	set foreign_key_checks=0;
	insert into Reservacion (fecha,descripcion,precio,Eventos_idEventos,Cliente_idCliente,Estado_Reservacion_idEstado_Reservacion)values( fech ,  des , prec ,  idEv,idC,idEst );
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_Reservacion  as
	select * from Reservacion ;

|
delimiter ;

delimiter |
create view Mostrar_Reservacion_Cliente_EstadoAct  as
	select r.fecha,p.nombres,p.apellidos,r.descripcion,r.precio
	from Reservacion r,Cliente c,Estado_Reservacion er,Persona p
	where p.idPersona=c.Persona_idPersona and r.Cliente_idCliente=c.idCliente
    and r.Estado_Reservacion_idEstado_Reservacion=er.idEstado_Reservacion
	and er.Nombre="Activado";

|
delimiter ;

delimiter |
create view Mostrar_Reservacion_Cliente_EstadoComp  as
	select r.fecha,p.nombres,p.apellidos,
	r.descripcion,r.precio
	from Reservacion r,Cliente c,Estado_Reservacion er, Persona p
	where p.idPersona=c.Persona_idPersona and r.Cliente_idCliente=c.idCliente
    and r.Estado_Reservacion_idEstado_Reservacion=er.idEstado_Reservacion
	and er.Nombre="Completado";

|
delimiter ;

delimiter |
create view Mostrar_Reservacion_Cliente_EstadoCan  as
	select r.fecha,p.nombres,p.apellidos,r.descripcion,r.precio
	from Reservacion r,Cliente c,Estado_Reservacion er,Persona p
	where p.idPersona=c.Persona_idPersona and r.Cliente_idCliente=c.idCliente
    and r.Estado_Reservacion_idEstado_Reservacion=er.idEstado_Reservacion
	and er.Nombre="Cancelado";

|
delimiter ;

delimiter |
create procedure Editar_Reservacion (in idR int,in fech date, in des varchar(45),in prec double, in idEv int,in idC int,in idEst int)
begin 
	set foreign_key_checks=0;
	update Reservacion  set fecha=fech,descripcion=des,precio=prec,Eventos_idEventos=idEv,Cliente_idCliente=idC,Estado_Reservacion_idEstado_Reservacion=idEst where idReservacion=idR;
	set foreign_key_checks=0;
end
|
delimiter ;

delimiter |
create procedure Borrar_Reservacion (in idR int)
begin 
	
	delete from Reservacion  where idReservacion=idR;
	
end
|
delimiter ;

delimiter |
create procedure insertar_Cargo(in nom varchar(20),in des varchar(100))
begin 
	insert into Cargo (Nombre,Descripcion)values(nom,des);
end
|
delimiter ;

delimiter |
create view Mostrar_Cargo_Completo as
	select * from Cargo;

|
delimiter ;

delimiter |
create view Mostrar_Cargo as
	select Nombre,Descripcion from Cargo;

|
delimiter ;

delimiter |
create view Mostrar_Cargo_Nombres as
	select Nombre from Cargo;

|
delimiter ;

delimiter |
create procedure Mostrar_Cargo_Desc(in nom varchar(20))
begin 
	
	select descripcion from Cargo where Nombre=nom;
end
|
delimiter ;

delimiter |
create procedure Buscar_Cargo_Nombre(in nom varchar(20))
begin 
	
	select idCargo from Cargo where Nombre=nom;
end
|
delimiter ;

delimiter |
create procedure Buscar_Horario_Nombre(in nom varchar(45))
begin 
	
	select idHorario from Horario where Nombre=nom;
end
|
delimiter ;

delimiter |
create procedure Editar_Cargo(in idC int, in nom varchar(20),in des varchar(100))
begin 
	
	update Cargo set Nombre=nom,Descripcion=des where idCargo=idC;
end
|
delimiter ;

delimiter |
create procedure Borrar_Cargo(in idC int)
begin 
	
	delete from Cargo where idCargo=idC;
	
end
|
delimiter ;