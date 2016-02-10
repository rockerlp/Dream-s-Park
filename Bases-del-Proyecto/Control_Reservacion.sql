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