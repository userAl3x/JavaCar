# 🚗 JavaCar - Sistema de Gestión de Alquiler de Vehículos

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Maven](https://img.shields.io/badge/Maven-3.8+-blue?style=flat-square&logo=apache-maven)
![JUnit](https://img.shields.io/badge/JUnit-4.13.2-green?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-yellow?style=flat-square)

Sistema de gestión de alquiler de vehículos desarrollado en Java siguiendo los principios de la **Programación Orientada a Objetos (POO)**. Este proyecto permite administrar diferentes tipos de vehículos disponibles para el alquiler, calcular precios con lógica específica para cada tipo de vehículo y gestionar los ingresos generados.

---

## 📋 Tabla de Contenidos

- [Características](#-características)
- [Arquitectura del Proyecto](#-arquitectura-del-proyecto)
- [Estructura de Clases](#-estructura-de-clases)
- [Funcionalidades Implementadas](#-funcionalidades-implementadas)
- [Requisitos](#-requisitos)
- [Instalación y Ejecución](#-instalación-y-ejecución)
- [Testing](#-testing)
- [Conceptos POO Aplicados](#-conceptos-poo-aplicados)
- [Autor](#-autor)

---

## ✨ Características

- ✅ **Jerarquía de clases** con herencia y abstracción
- ✅ **Interfaces** para definir comportamientos comunes (Alquilable)
- ✅ **Composición** con clases Motor y Rueda
- ✅ **Polimorfismo** en el cálculo de precios según tipo de vehículo
- ✅ **Encapsulación** con modificadores de acceso apropiados
- ✅ **Gestión de colecciones** para manejar flotas de vehículos
- ✅ **Cálculo de precios dinámico** con reglas específicas por categoría
- ✅ **Testing completo** con JUnit 4
- ✅ **Etiquetas ambientales** para clasificación ecológica

---

## 🏗️ Arquitectura del Proyecto

```
JavaCar/
├── src/
│   ├── main/java/org/JavaCar/
│   │   ├── Vehicle.java           # Clase abstracta base
│   │   ├── Coche.java            # Implementación de coche
│   │   ├── Moto.java             # Implementación de moto
│   │   ├── Furgoneta.java        # Implementación de furgoneta
│   │   ├── Alquilable.java       # Interfaz para objetos alquilables
│   │   ├── GestorAlquileres.java # Gestor de alquileres
│   │   ├── Motor.java            # Composición: Motor del vehículo
│   │   ├── Rueda.java            # Composición: Ruedas del vehículo
│   │   └── Main.java             # Clase principal de ejecución
│   └── test/java/org/JavaCar/
│       ├── VehicleTest.java      # Tests de la clase Vehicle
│       ├── MotorTest.java        # Tests de la clase Motor
│       ├── RodaTest.java         # Tests de la clase Rueda
│       ├── MotoTest.java         # Tests de Moto
│       ├── FurgonetaTest.java    # Tests de Furgoneta
│       └── AlquilableGestorTest.java # Tests de interfaz y gestor
├── pom.xml                        # Configuración Maven
└── README.md
```

---

## 🔧 Estructura de Clases

### Diagrama de Jerarquía

```
                    <<interface>>
                     Alquilable
                        ↑
                        │
                   Vehicle (abstract)
                   /    |    \
                  /     |     \
              Coche   Moto  Furgoneta
```

### Descripción de Clases

#### 1. **Alquilable (Interfaz)**
Define el contrato para objetos que pueden ser alquilados.
```java
public interface Alquilable {
    double calcularPrecio(int dias);
}
```

#### 2. **Vehicle (Clase Abstracta)**
Clase base abstracta para todos los vehículos.

**Atributos:**
- `matricula` (String) - Matrícula del vehículo
- `marca` (String) - Marca del vehículo
- `modelo` (String) - Modelo del vehículo
- `precioBase` (double) - Precio base por día
- `motor` (Motor) - Motor del vehículo (composición)
- `ruedas` (Rueda) - Ruedas del vehículo (composición)
- `etiquetaAmbiental` (String) - Etiqueta ambiental (ECO, C, B, etc.)

#### 3. **Coche (Clase)**
Representa un coche de alquiler.

**Atributos adicionales:**
- `numeroPlazas` (int) - Número de plazas del coche

**Cálculo de precio:**
```
Precio = precioBase × días
```

#### 4. **Moto (Clase)**
Representa una motocicleta de alquiler.

**Atributos adicionales:**
- `cilindrada` (int) - Cilindrada de la moto en cc

**Cálculo de precio:**
```
Precio = precioBase × días + (cilindrada >= 500 ? 5€/día : 0)
```

#### 5. **Furgoneta (Clase)**
Representa una furgoneta de alquiler.

**Atributos adicionales:**
- `capacidadCarga` (int) - Capacidad de carga en kg

**Cálculo de precio:**
```
Precio = precioBase × días + (capacidadCarga > 1000 ? 10€/día : 0)
```

#### 6. **Motor (Clase)**
Componente que representa el motor de un vehículo.

**Atributos:**
- `tipo` (String) - Tipo de motor (Gasolina, Diésel, Eléctrico)
- `potencia` (int) - Potencia en CV

#### 7. **Rueda (Clase)**
Componente que representa las ruedas de un vehículo.

**Atributos:**
- `marca` (String) - Marca de las ruedas
- `diametro` (int) - Diámetro de las ruedas en pulgadas

#### 8. **GestorAlquileres (Clase)**
Clase utilitaria para gestionar operaciones sobre colecciones de vehículos.

**Métodos:**
- `calcularIngresosTotales(List<Vehicle> vehiculos, int dias)` - Calcula los ingresos totales
- `filtrarPorPrecio(List<Vehicle> vehiculos, double precioMaximo)` - Filtra vehículos por precio máximo

---

## 🚀 Funcionalidades Implementadas

### 1. **Cálculo de Precios Dinámico**
Cada tipo de vehículo implementa su propia lógica de cálculo de precios:
- **Coches**: Tarifa plana por día
- **Motos**: Tarifa base + suplemento para motos grandes (≥500cc)
- **Furgonetas**: Tarifa base + suplemento para furgonetas de alta capacidad (>1000kg)

### 2. **Gestión de Ingresos**
El `GestorAlquileres` permite:
- Calcular ingresos totales de una flota de vehículos
- Filtrar vehículos según precio máximo de alquiler

### 3. **Composición de Objetos**
Los vehículos están compuestos por:
- Motor (tipo y potencia)
- Ruedas (marca y diámetro)

### 4. **Clasificación Ambiental**
Cada vehículo tiene una etiqueta ambiental para clasificación ecológica.

---

## 💻 Requisitos

- **Java**: JDK 17 o superior
- **Maven**: 3.8 o superior
- **JUnit**: 4.13.2 (gestionado por Maven)

---

## 📦 Instalación y Ejecución

### 1. Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/JavaCar.git
cd JavaCar
```

### 2. Compilar el Proyecto
```bash
cd JavaCar
mvn clean compile
```

### 3. Ejecutar el Programa Principal
```bash
mvn exec:java -Dexec.mainClass="org.JavaCar.Main"
```

### 4. Ejecutar Tests
```bash
mvn test
```

### Salida Esperada del Main
```
Los ingresos totales de los vehiculos por 7 dias son: 385000.0 €

Los vehiculos filtrados por precio son: [Cotxe{...}]
```

---

## 🧪 Testing

El proyecto incluye **6 clases de test** con cobertura completa:

### Tests Implementados

| Clase de Test | Descripción | Tests |
|--------------|-------------|-------|
| **VehicleTest** | Valida la clase abstracta Vehicle | 5 tests |
| **MotorTest** | Prueba la creación y funcionalidad de Motor | 2 tests |
| **RodaTest** | Verifica la clase Rueda y encapsulación | 2 tests |
| **MotoTest** | Prueba cálculo de precios para motos | 4 tests |
| **FurgonetaTest** | Valida cálculo de precios para furgonetas | 4 tests |
| **AlquilableGestorTest** | Prueba interfaz y gestor de alquileres | 2 tests |

### Aspectos Probados

- ✅ Creación correcta de objetos
- ✅ Cálculo de precios para todos los tipos de vehículos
- ✅ Lógica de suplementos (cilindrada y capacidad de carga)
- ✅ Encapsulación con atributos privados/protected
- ✅ Verificación de clase abstracta Vehicle
- ✅ Implementación correcta de la interfaz Alquilable
- ✅ Funcionalidades del GestorAlquileres

### Ejecutar Tests
```bash
mvn test
```

### Ver Reporte de Tests
Después de ejecutar los tests, los reportes se encuentran en:
```
target/surefire-reports/
```

---

## 📚 Conceptos POO Aplicados

### 1. **Abstracción**
- Clase abstracta `Vehicle` define la estructura común
- Los detalles específicos se implementan en subclases

### 2. **Herencia**
- `Coche`, `Moto` y `Furgoneta` heredan de `Vehicle`
- Reutilización de código y jerarquía lógica

### 3. **Polimorfismo**
- Método `calcularPrecio()` se implementa de forma diferente en cada subclase
- Permite tratar diferentes tipos de vehículos de manera uniforme

### 4. **Encapsulación**
- Atributos privados con getters públicos
- Atributos protected en Vehicle para acceso de subclases
- Ocultación de la implementación interna

### 5. **Interfaces**
- `Alquilable` define el contrato para objetos alquilables
- Garantiza que todos los vehículos implementen `calcularPrecio()`

### 6. **Composición**
- Vehicle "tiene un" Motor y "tiene unas" Ruedas
- Relación "has-a" en lugar de "is-a"

---

## 👨‍💻 Autor

**Alex Jiménez**

Desarrollado como proyecto académico de Programación Orientada a Objetos (POO) en Java.

---

## 📄 Licencia

Este proyecto está bajo licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.

---

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor:
1. Haz un fork del proyecto
2. Crea una rama para tu feature (`git checkout -b feature/NuevaFuncionalidad`)
3. Commit tus cambios (`git commit -m 'Añadir nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/NuevaFuncionalidad`)
5. Abre un Pull Request

---

## 📞 Contacto

Si tienes preguntas o sugerencias sobre el proyecto, no dudes en contactar.

---

<div align="center">
  <p>⭐ Si te ha gustado este proyecto, dale una estrella en GitHub ⭐</p>
  <p>Hecho con ❤️ y ☕ por Alex Jiménez</p>
</div>
