# Patrón Composite

El Patrón Composite es un patrón de diseño estructural que permite tratar objetos individuales y compuestos de manera uniforme. Este patrón organiza los objetos en una jerarquía de forma que tanto los elementos simples como los compuestos (que agrupan varios objetos) puedan ser tratados de la misma forma, facilitando el manejo de estructuras jerárquicas complejas.
<p align="center">
  <img src="/IMG.png" alt="reto" width="800"/>
</p>

# Ejemplo - Gestión de Proyectos de Construcción 

Este proyecto implementa el **Patrón Composite** para la gestión de proyectos de construcción. Permite manejar tanto **tareas simples** como **subproyectos compuestos**, tratándolos de manera uniforme. El patrón composite facilita la creación de jerarquías de objetos, en este caso, tareas y subproyectos, donde las composiciones pueden contener otras composiciones o elementos simples.

## Objetivo

El objetivo de este proyecto es proporcionar una manera estructurada de gestionar proyectos de construcción que contienen tanto **tareas individuales** (como "Excavar", "Cimentar") como **subproyectos** (que consisten en varias tareas o subproyectos más pequeños). Usando el patrón composite, podemos tratar de manera uniforme tareas simples y compuestas, permitiendo que el sistema sea escalable y flexible.

## Estructura

La estructura del patrón se divide en tres partes:

1. **Componente (`ConstructionComponent`)**: Una interfaz que define las operaciones comunes que deben implementarse tanto para tareas simples como para subproyectos.

2. **Hoja (`SingleTask`)**: Una implementación de la interfaz que representa una tarea simple. No tiene subcomponentes.

3. **Composición (`SubProject`)**: Un grupo de tareas o subproyectos. También implementa la interfaz `ConstructionComponent` y puede contener múltiples componentes (tareas o subproyectos).

### Clases

- **`ConstructionComponent` (Interfaz común)**: Define los métodos necesarios para todas las tareas y subproyectos, como `getName()`, `getDetails()`, `getCost()`, `assignWorker()`, etc.

- **`BaseConstruction` (Clase abstracta)**: Proporciona una implementación básica de los métodos comunes, como `getName()` y `assignWorker()`. También implementa `add()`, `remove()`, y `getChild()` para lanzar una excepción por defecto, lo que significa que las clases que heredan de `BaseConstruction` pueden sobrescribir estos métodos según sea necesario.

- **`SingleTask` (Tarea simple)**: Representa una tarea individual que tiene un costo y un trabajador asignado. No admite subcomponentes.

- **`SubProject` (Proyecto compuesto)**: Representa un grupo de tareas o subproyectos. Puede contener varias tareas o subproyectos y permite agregar, eliminar y gestionar estos componentes.
