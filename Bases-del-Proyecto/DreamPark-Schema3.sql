SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `ProyectoBD` ;
CREATE SCHEMA IF NOT EXISTS `ProyectoBD` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `ProyectoBD` ;

-- -----------------------------------------------------
-- Table `ProyectoBD`.`Persona`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Persona` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Persona` (
  `idPersona` INT NOT NULL AUTO_INCREMENT,
  `CI_RUC` VARCHAR(13) NOT NULL,
  `nombres` VARCHAR(25) NOT NULL,
  `apellidos` VARCHAR(25) NOT NULL,
  `fechaNacimiento` DATE NOT NULL,
  `direccion` VARCHAR(30) NOT NULL,
  UNIQUE INDEX `cedula_UNIQUE` (`CI_RUC` ASC),
  PRIMARY KEY (`idPersona`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Tematica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Tematica` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Tematica` (
  `idTematica` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(20) NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idTematica`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Tipo_Evento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Tipo_Evento` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Tipo_Evento` (
  `idTipo_Evento` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(20) NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idTipo_Evento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Eventos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Eventos` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Eventos` (
  `idEventos` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `salon` VARCHAR(15) NULL,
  `numPersonas` INT NOT NULL,
  `descripcion` VARCHAR(100) NULL,
  `costo` DOUBLE NOT NULL,
  `Tematica_idTematica` INT NOT NULL,
  `Tipo_Evento_idTipo_Evento` INT NOT NULL,
  PRIMARY KEY (`idEventos`),
  INDEX `fk_Eventos_Tematica1_idx` (`Tematica_idTematica` ASC),
  INDEX `fk_Eventos_Tipo_Evento1_idx` (`Tipo_Evento_idTipo_Evento` ASC),
  CONSTRAINT `fk_Eventos_Tematica1`
    FOREIGN KEY (`Tematica_idTematica`)
    REFERENCES `ProyectoBD`.`Tematica` (`idTematica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Eventos_Tipo_Evento1`
    FOREIGN KEY (`Tipo_Evento_idTipo_Evento`)
    REFERENCES `ProyectoBD`.`Tipo_Evento` (`idTipo_Evento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Tipo_Inventario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Tipo_Inventario` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Tipo_Inventario` (
  `idTipo_Inventario` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(20) NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idTipo_Inventario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Inventario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Inventario` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Inventario` (
  `IdInventario` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  `cantidad` INT NOT NULL,
  `precioCompra` DOUBLE NOT NULL,
  `precioVenta` DOUBLE NOT NULL,
  `Tipo_Inventario_idTipo_Inventario` INT NOT NULL,
  PRIMARY KEY (`IdInventario`),
  INDEX `fk_Inventario_Tipo_Inventario1_idx` (`Tipo_Inventario_idTipo_Inventario` ASC),
  CONSTRAINT `fk_Inventario_Tipo_Inventario1`
    FOREIGN KEY (`Tipo_Inventario_idTipo_Inventario`)
    REFERENCES `ProyectoBD`.`Tipo_Inventario` (`idTipo_Inventario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Cliente` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idCliente`, `Persona_idPersona`),
  INDEX `fk_Cliente_Persona1_idx` (`Persona_idPersona` ASC),
  CONSTRAINT `fk_Cliente_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `ProyectoBD`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Reservacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Reservacion` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Reservacion` (
  `idReservacion` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `descripcion` VARCHAR(25) NULL,
  `precio` DOUBLE NOT NULL,
  `Eventos_idEventos` INT NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  PRIMARY KEY (`idReservacion`),
  INDEX `fk_Reservas_Eventos1_idx` (`Eventos_idEventos` ASC),
  INDEX `fk_Reservacion_Cliente1_idx` (`Cliente_idCliente` ASC),
  CONSTRAINT `fk_Reservas_Eventos1`
    FOREIGN KEY (`Eventos_idEventos`)
    REFERENCES `ProyectoBD`.`Eventos` (`idEventos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Reservacion_Cliente1`
    FOREIGN KEY (`Cliente_idCliente`)
    REFERENCES `ProyectoBD`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Extras`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Extras` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Extras` (
  `idExtras` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `costo` DOUBLE NOT NULL,
  PRIMARY KEY (`idExtras`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`detalleEvento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`detalleEvento` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`detalleEvento` (
  `Extras_idExtras` INT NOT NULL,
  `Inventario_IdInventario` INT NOT NULL,
  `Eventos_idEventos` INT NOT NULL,
  INDEX `fk_detalleEvento_Extras1_idx` (`Extras_idExtras` ASC),
  INDEX `fk_detalleEvento_Inventario1_idx` (`Inventario_IdInventario` ASC),
  INDEX `fk_detalleEvento_Eventos1_idx` (`Eventos_idEventos` ASC),
  CONSTRAINT `fk_detalleEvento_Extras1`
    FOREIGN KEY (`Extras_idExtras`)
    REFERENCES `ProyectoBD`.`Extras` (`idExtras`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalleEvento_Inventario1`
    FOREIGN KEY (`Inventario_IdInventario`)
    REFERENCES `ProyectoBD`.`Inventario` (`IdInventario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalleEvento_Eventos1`
    FOREIGN KEY (`Eventos_idEventos`)
    REFERENCES `ProyectoBD`.`Eventos` (`idEventos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Factura`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Factura` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Factura` (
  `idFactura` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  `subtotal` DOUBLE NOT NULL,
  `ivaCero` DOUBLE NOT NULL,
  `ivaDoce` DOUBLE NOT NULL,
  `total` DOUBLE NOT NULL,
  `Eventos_idEventos` INT NOT NULL,
  PRIMARY KEY (`idFactura`),
  INDEX `fk_Factura_Eventos1_idx` (`Eventos_idEventos` ASC),
  CONSTRAINT `fk_Factura_Eventos1`
    FOREIGN KEY (`Eventos_idEventos`)
    REFERENCES `ProyectoBD`.`Eventos` (`idEventos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Proveedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Proveedor` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Proveedor` (
  `idProveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `direccion` VARCHAR(35) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idProveedor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Cargo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Cargo` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Cargo` (
  `idCargo` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(20) NOT NULL,
  `Descripcion` VARCHAR(45) NULL,
  PRIMARY KEY (`idCargo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Horario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Horario` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Horario` (
  `idHorario` INT NOT NULL AUTO_INCREMENT,
  `Hora_Inicio` TIME NOT NULL,
  `Hora_FIn` TIME NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idHorario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Empleado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Empleado` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Empleado` (
  `idEmpleado` INT NOT NULL AUTO_INCREMENT,
  `Persona_idPersona` INT NOT NULL,
  `Cargo_idCargo` INT NOT NULL,
  `Horario_idHorario` INT NOT NULL,
  PRIMARY KEY (`idEmpleado`, `Persona_idPersona`),
  INDEX `fk_Empleado_Persona1_idx` (`Persona_idPersona` ASC),
  INDEX `fk_Empleado_Cargo1_idx` (`Cargo_idCargo` ASC),
  INDEX `fk_Empleado_Horario1_idx` (`Horario_idHorario` ASC),
  CONSTRAINT `fk_Empleado_Persona1`
    FOREIGN KEY (`Persona_idPersona`)
    REFERENCES `ProyectoBD`.`Persona` (`idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empleado_Cargo1`
    FOREIGN KEY (`Cargo_idCargo`)
    REFERENCES `ProyectoBD`.`Cargo` (`idCargo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empleado_Horario1`
    FOREIGN KEY (`Horario_idHorario`)
    REFERENCES `ProyectoBD`.`Horario` (`idHorario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Compras`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Compras` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Compras` (
  `idCompras` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `cantidad` INT NOT NULL,
  `precio` DOUBLE NOT NULL,
  `Proveedor_idProveedor` INT NOT NULL,
  `Empleado_idEmpleado` INT NOT NULL,
  PRIMARY KEY (`idCompras`),
  INDEX `fk_Compras_Proveedor1_idx` (`Proveedor_idProveedor` ASC),
  INDEX `fk_Compras_Empleado1_idx` (`Empleado_idEmpleado` ASC),
  CONSTRAINT `fk_Compras_Proveedor1`
    FOREIGN KEY (`Proveedor_idProveedor`)
    REFERENCES `ProyectoBD`.`Proveedor` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compras_Empleado1`
    FOREIGN KEY (`Empleado_idEmpleado`)
    REFERENCES `ProyectoBD`.`Empleado` (`idEmpleado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Pago`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Pago` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Pago` (
  `idPago` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `importe` DOUBLE NOT NULL,
  `ivaCero` DOUBLE NOT NULL,
  `ivaDoce` DOUBLE NOT NULL,
  `Compras_idCompras` INT NOT NULL,
  `Inventario_IdInventario` INT NOT NULL,
  PRIMARY KEY (`idPago`),
  INDEX `fk_Pago_Compras1_idx` (`Compras_idCompras` ASC),
  INDEX `fk_Pago_Inventario1_idx` (`Inventario_IdInventario` ASC),
  CONSTRAINT `fk_Pago_Compras1`
    FOREIGN KEY (`Compras_idCompras`)
    REFERENCES `ProyectoBD`.`Compras` (`idCompras`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Pago_Inventario1`
    FOREIGN KEY (`Inventario_IdInventario`)
    REFERENCES `ProyectoBD`.`Inventario` (`IdInventario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ProyectoBD`.`Celular`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ProyectoBD`.`Celular` ;

CREATE TABLE IF NOT EXISTS `ProyectoBD`.`Celular` (
  `idCelular` INT NOT NULL,
  `numero` INT NOT NULL,
  `Cliente_idCliente` INT NOT NULL,
  `Cliente_Persona_idPersona` INT NOT NULL,
  PRIMARY KEY (`idCelular`),
  INDEX `fk_Celular_Cliente1_idx` (`Cliente_idCliente` ASC, `Cliente_Persona_idPersona` ASC),
  CONSTRAINT `fk_Celular_Cliente1`
    FOREIGN KEY (`Cliente_idCliente` , `Cliente_Persona_idPersona`)
    REFERENCES `ProyectoBD`.`Cliente` (`idCliente` , `Persona_idPersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
