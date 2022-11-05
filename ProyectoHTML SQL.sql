CREATE SCHEMA proyecto;

create user 'usuario_proyecto'@'%' identified by 'Usuario_Proyecto';

grant all privileges on proyecto.* to 'usuario_proyecto'@'%';
flush privileges;

CREATE TABLE proyecto.cliente (
  id_cliente INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(20) NOT NULL,
  apellidos VARCHAR(30) NOT NULL,
  correo VARCHAR(25) NULL,
  telefono VARCHAR(15) NULL,
  PRIMARY KEY (`id_cliente`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;
  
INSERT INTO proyecto.cliente (id_cliente, nombre, apellidos, correo, telefono) VALUES
(1, 'Alberto', 'Aguila Coto',    'acoto@gmail.com',    '5766-2356'),
(2, 'Camila',  'Duran Rodriguez', 'cduran@gmail.com', '4389-7899'),
(3, 'Luis', 'Acuña Mata',     'lacuña@gmail.com',      '9988-3946');



