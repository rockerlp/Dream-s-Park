use ProyectoBD;


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