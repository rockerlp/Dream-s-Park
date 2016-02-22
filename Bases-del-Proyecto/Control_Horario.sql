use ProyectoBD;

DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `Buscar_Evento_Cliente_Activo`(in fech date, in nom varchar(45),in ape varchar(45))
begin 
	select e.salon as salon ,e.numPersonas as numero,t.Nombre as tematica ,te.Nombre as tipo from Reservacion r, Cliente c, 
	Eventos e,Tematica t,Tipo_Evento te, Persona p where
	c.Persona_idPersona=p.idPersona and
	p.nombres=nom and p.apellidos=ape and
	r.Cliente_idCliente=c.idCliente and 
	r.Estado_Reservacion_idEstado_Reservacion=1 and 
	r.Eventos_idEventos=e.idEventos and
	e.Tematica_idTematica=t.idTematica and
	e.Tipo_Evento_idTipo_Evento=te.idTipo_Evento;
	
end$$
DELIMITER ;


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


delimiter |
create procedure insertar_Horario(in nom varchar(45),in hi time, in hf time)
begin 
	insert into Horario (Hora_Inicio, Hora_Fin,Nombre)values(hi,hf,nom);
end
|
delimiter ;

delimiter |
create view Mostrar_Horario as
	select Nombre as Nombre,Hora_Inicio as Inicio,Hora_FIn as Fin from Horario;

|
delimiter ;

delimiter |
create view Mostrar_Horario_Nombre as
	select Nombre from Horario;

|
delimiter ;

delimiter |
create procedure Mostrar_Horario_H(in nom varchar(45))
	select Hora_Inicio as Inicio,Hora_FIn as Fin from Horario where Nombre=nom;

|
delimiter ;

delimiter |
create procedure Editar_Horario(in idh int, in nom varchar(45),in hi time, in hf time)
begin 
	
	update Horario set Hora_Inicio=hi, Hora_Fin=hf,Nombre=nom where idHorario=idh;
end
|
delimiter ;

delimiter |
create procedure Borrar_Horario(in idh int)
begin 
	
	delete from Horario where idHorario=idh;
	
end
|
delimiter ;

delimiter |
create procedure Borrar_Horario_Nombre(in nom varchar(45))
begin 
	
	delete from Horario where Nombre=nom;
	
end
|
delimiter ;
