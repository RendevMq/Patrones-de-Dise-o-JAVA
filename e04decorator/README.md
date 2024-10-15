### README: Patrón Decorador en Java - Ejemplo de Codificación, Compresión y Registro de Operaciones

---

#### Descripción General:

Este proyecto es una implementación del **Patrón Decorador** en Java. El propósito del patrón Decorador es permitir que se agreguen **funcionalidades adicionales** a un objeto de manera flexible, **sin modificar el código** de las clases existentes. En este ejemplo, trabajamos con un sistema de manejo de datos que inicialmente solo permite leer y escribir en archivos de texto. Posteriormente, se agregan las siguientes funcionalidades utilizando decoradores:
- **Codificación de datos** (para asegurar la información).
- **Compresión de datos** (para ahorrar espacio).
- **Registro de operaciones** (para monitorear las acciones realizadas).

Estos decoradores se pueden combinar de forma dinámica y flexible, envolviendo un decorador con otro.

---

#### Componentes:

1. **Interfaz `DataSource`:**
    - Define las operaciones de **lectura** y **escritura** de datos.
    - Es la base sobre la cual se construyen todas las funcionalidades adicionales.

2. **Clase `FileDataSource`:**
    - Implementa la interfaz `DataSource`.
    - Proporciona los métodos para leer y escribir datos desde/hacia un archivo en formato de texto.
    - Esta clase representa la funcionalidad principal, y no tiene conocimiento de ninguna funcionalidad adicional como compresión o codificación.

3. **Clase Abstracta `DataSourceDecorator`:**
    - Es un **decorador abstracto** que también implementa la interfaz `DataSource`.
    - Su objetivo es delegar las operaciones de lectura y escritura al objeto `DataSource` que está envolviendo.
    - Sirve como clase base para otros decoradores concretos que añaden nuevas funcionalidades.

4. **Decorador `EncryptionDecorator`:**
    - Añade **codificación** a los datos antes de escribirlos en el archivo y decodifica los datos después de leerlos.
    - Útil para **proteger información sensible**.

5. **Decorador `CompressionDecorator`:**
    - Comprime los datos antes de escribirlos y los descomprime cuando se leen del archivo.
    - Esto permite **reducir el tamaño** de los datos almacenados.
    - Puede ajustarse el nivel de compresión si es necesario.

6. **Decorador `LoggingDecorator`:**
    - Registra las operaciones de lectura y escritura, mostrando mensajes en la consola.
    - Esta funcionalidad es útil para **monitorear** y **depurar** el sistema.
    - Este decorador imprime mensajes antes y después de cada operación, mostrando el progreso de las acciones.

---

#### Funcionamiento del Patrón Decorador en este Ejemplo:

El patrón Decorador es especialmente útil cuando se necesita agregar funcionalidades **sin modificar** el código original de una clase. Esto se logra creando **decoradores** que envuelven objetos y **añaden comportamiento** adicional antes o después de las operaciones de la clase original.

En este ejemplo, empezamos con una clase simple `FileDataSource` que puede leer y escribir datos. A medida que surgen nuevos requisitos (como la necesidad de codificar, comprimir o registrar las operaciones), en lugar de modificar `FileDataSource`, creamos decoradores independientes que se **acoplan dinámicamente**.

##### Orden de Decoración:
1. **`LoggingDecorator`:** Lo colocamos al principio para que registre cualquier operación realizada.
2. **`CompressionDecorator`:** Comprime los datos después de que se registran las operaciones, y los descomprime antes de leerlos.
3. **`EncryptionDecorator`:** Codifica los datos comprimidos antes de escribir y los decodifica al leer.

Esta combinación permite ejecutar las operaciones de manera encadenada, añadiendo múltiples comportamientos **sin alterar la clase base**.

---

#### Ventajas del Patrón Decorador:

1. **Extensibilidad sin modificar el código existente:**
    - El patrón Decorador nos permite añadir nuevas funcionalidades a un objeto sin cambiar su código fuente. En este caso, podemos añadir compresión, codificación y registro de operaciones al sistema de datos sin modificar la clase `FileDataSource`.

2. **Reutilización y Modularidad:**
    - Cada decorador se encarga de una tarea específica (compresión, codificación, registro). Esto permite **reutilizar** los decoradores en diferentes partes del código o en diferentes combinaciones, lo que fomenta un diseño más limpio y modular.

3. **Combinación Flexible de Funcionalidades:**
    - Los decoradores pueden **combinarse de manera flexible**, permitiendo aplicar una secuencia específica de funcionalidades según las necesidades del cliente. En este caso, podemos elegir aplicar primero la compresión, luego la codificación, o viceversa, según el caso de uso.

4. **Separación de Preocupaciones:**
    - Cada decorador tiene una **responsabilidad única**, lo que facilita el mantenimiento y la prueba de cada funcionalidad de manera independiente. No es necesario que la clase base maneje todas las funcionalidades.

5. **Evita la proliferación de subclases:**
    - Sin el patrón Decorador, tendríamos que crear muchas subclases para cada combinación posible de funcionalidades (ej. `CompressedFileDataSource`, `EncodedFileDataSource`, etc.). El patrón Decorador **evita esta explosión** de subclases, permitiendo crear decoradores independientes y combinarlos de manera flexible.

---

#### Ejemplo Práctico:

Si no usaras el patrón Decorador, tendrías que crear subclases como:

- `CompressedFileDataSource`
- `EncodedFileDataSource`
- `LoggedFileDataSource`
- `CompressedAndEncodedFileDataSource`
- `CompressedAndLoggedFileDataSource`
- `EncodedAndLoggedFileDataSource`
- `CompressedAndEncodedAndLoggedFileDataSource`

Y este número crecería exponencialmente cada vez que agregaras una nueva funcionalidad.

En cambio, con el patrón Decorador, solo necesitas crear decoradores individuales para cada funcionalidad (`CompressionDecorator`, `EncryptionDecorator`, `LoggingDecorator`) y puedes combinarlos como lo desees, en el orden que prefieras.

---

#### Escenario sin el Patrón Decorador:

Si no utilizáramos el patrón Decorador, habría que crear una subclase para cada nueva combinación de funcionalidades. Por ejemplo, para una `FileDataSource` que comprime y codifica, necesitarías una subclase que implemente ambas características. Si añadimos más funcionalidades (como el registro de operaciones), el número de subclases crecería exponencialmente. Esto llevaría a un **diseño rígido y difícil de mantener**.

---

#### Ejecución del Proyecto:

Este proyecto incluye un archivo de demostración que simula la escritura y lectura de un archivo utilizando los decoradores de compresión, codificación y registro de operaciones.

Para ejecutar el ejemplo:
1. Configura la estructura de carpetas descrita en este README.
2. Compila y ejecuta la clase `Demo.java` para ver cómo los datos son comprimidos, codificados y registrados.

---

#### Conclusión:

El patrón Decorador en este ejemplo demuestra cómo podemos **añadir funcionalidad de manera flexible y dinámica** sin modificar la clase base original. Con decoradores como la compresión, la codificación y el registro de operaciones, logramos un sistema altamente **modular, extensible** y **fácil de mantener**, donde las funcionalidades adicionales se pueden combinar y reutilizar de forma dinámica.

---
