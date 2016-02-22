use ProyectoBD;



delimiter |
create procedure insertar_Celular(in num int,in idC int, in idP int)
begin 
	set foreign_key_checks=0;
	insert into Celular (numero,Cliente_idCliente,Cliente_Persona_id)values(num,idC,idP);
	set foreign_key_checks=1;
end
|
delimiter ;



delimiter |
create view Mostrar_Celular as
	select * from Celular;

|
delimiter ;

delimiter |
create procedure Editar_Celular(in idCel int,in num int,in idC int, in idP int)
begin 
	
	update Celular set numero=num,Cliente_idCliente=idC,Cliente_Persona_id=idP where idCelular=idCel;
end
|
delimiter ;

delimiter |
create procedure Borrar_Celular(in idCel int)
begin 
	
	delete from Celular where idCelular=idCel;
	
end
|
delimiter ;