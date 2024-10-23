-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS railway;

-- Seleccionar la base de datos
USE railway;

-- Crear tabla Direccion
CREATE TABLE IF NOT EXISTS direccion (
    id_direccion INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL
);

-- Crear tabla Authority
CREATE TABLE IF NOT EXISTS authority (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    authority VARCHAR(255) NOT NULL
);

-- Crear tabla Cliente
CREATE TABLE IF NOT EXISTS cliente (
    documento VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    correo VARCHAR(255) UNIQUE NOT NULL,
    clave VARCHAR(255),
    celular VARCHAR(50),
    activo BOOLEAN,
    direccion INT,
    FOREIGN KEY (direccion) REFERENCES direccion(id_direccion)
);

-- Crear tabla Categoria
CREATE TABLE IF NOT EXISTS categoria (
    id_categoria INT PRIMARY KEY,
    nombre VARCHAR(255),
    descripcion VARCHAR(255)
);

-- Crear tabla Producto
CREATE TABLE IF NOT EXISTS producto (
    id_producto INT PRIMARY KEY,
    nombre VARCHAR(255),
    descripcion TEXT,
    valor INT,
    img LONGBLOB,
    categoria INT,
    FOREIGN KEY (categoria) REFERENCES categoria(id_categoria)
);

-- Crear tabla Factura
CREATE TABLE IF NOT EXISTS factura (
    id_factura INT PRIMARY KEY,
    total INT,
    fecha DATE
);

-- Crear tabla Carrito
CREATE TABLE IF NOT EXISTS carrito (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    activo BOOLEAN NOT NULL,
    cliente_documento VARCHAR(50),
    FOREIGN KEY (cliente_documento) REFERENCES cliente(documento)
);

-- Crear tabla Compra
CREATE TABLE IF NOT EXISTS compra (
    id_compra INT PRIMARY KEY,
    cantidad INT,
    factura INT,
    producto INT,
    cliente VARCHAR(50),
    FOREIGN KEY (factura) REFERENCES factura(id_factura),
    FOREIGN KEY (producto) REFERENCES producto(id_producto),
    FOREIGN KEY (cliente) REFERENCES cliente(documento)
);

-- Crear tabla EncuestaProducto
CREATE TABLE IF NOT EXISTS encuesta_producto (
    id_encuesta_producto INT PRIMARY KEY,
    puntaje INT,
    producto INT,
    FOREIGN KEY (producto) REFERENCES producto(id_producto)
);

-- Crear tabla EncuestaServicio
CREATE TABLE IF NOT EXISTS encuesta_servicio (
    id_encuesta_servicio INT PRIMARY KEY,
    puntaje_servicio_cliente INT,
    puntaje_diseno INT
);

-- Crear tabla Adicional
CREATE TABLE IF NOT EXISTS adicional (
    id_adicional INT PRIMARY KEY,
    nombre VARCHAR(255)
);

-- Crear tabla AdicionalCompra
CREATE TABLE IF NOT EXISTS adicional_compra (
    compra_idcompra INT,
    adicionales_idadicionales INT,
    PRIMARY KEY (compra_idcompra, adicionales_idadicionales),
    FOREIGN KEY (compra_idcompra) REFERENCES compra(id_compra),
    FOREIGN KEY (adicionales_idadicionales) REFERENCES adicional(id_adicional)
);

-- Crear tabla Authorities_Users (relación muchos a muchos entre Cliente y Authority)
CREATE TABLE IF NOT EXISTS authorities_users (
    usuario_id VARCHAR(50),
    authority_id BIGINT,
    PRIMARY KEY (usuario_id, authority_id),
    FOREIGN KEY (usuario_id) REFERENCES cliente(documento),
    FOREIGN KEY (authority_id) REFERENCES authority(id)
);

-- Crear tabla Producto_Carrito (relación muchos a muchos entre Producto y Carrito)
CREATE TABLE IF NOT EXISTS producto_carrito (
    carrito_id BIGINT,
    producto_id INT,
    PRIMARY KEY (carrito_id, producto_id),
    FOREIGN KEY (carrito_id) REFERENCES carrito(id),
    FOREIGN KEY (producto_id) REFERENCES producto(id_producto)
);
