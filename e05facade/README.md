
# Sistema de Reservación de Vuelos - Patrón Facade

Este proyecto es una simulación de un sistema de **reservación de vuelos** implementado en Java utilizando el **Patrón de Diseño Facade**. El objetivo es ocultar la complejidad de varios subsistemas, como la gestión de vuelos, la disponibilidad de asientos, el sistema de pagos, el sistema de recompensas y el servicio de notificaciones, proporcionando una interfaz sencilla para los clientes a través de una **fachada**.

### Subsistemas

Cada subsistema realiza una función específica relacionada con el proceso de reservación de vuelos:

- **AuthenticationSystem**: Verifica la autenticación del usuario.
- **FlightManagement**: Busca vuelos disponibles entre dos destinos y verifica la clase de vuelo (económica, business, primera clase).
- **SeatAvailability**: Verifica la disponibilidad de asientos en el vuelo seleccionado.
- **PaymentSystem**: Procesa los pagos, calcula impuestos y valida las tarjetas de crédito.
- **RewardSystem**: Aplica puntos de recompensa basados en el monto gastado.
- **NotificationService**: Envía correos electrónicos de confirmación a los clientes.

### Facade

La clase **BookingFacade** simplifica el proceso de reserva de vuelo, encapsulando todas las operaciones necesarias de los subsistemas. Los clientes solo necesitan llamar al método `bookFlight` de la fachada, y esta se encargará de las operaciones internas.

```java
// Ejemplo de uso del BookingFacade
BookingFacade bookingFacade = new BookingFacade();
bookingFacade.bookFlight(
    "FrequentFlyer123", "password123", "New York", "Los Angeles", 
    "AA101", "Business", "1234-5678-9876-5432", 800.00, "customer@example.com"
);
```

## Requisitos

- **Java 8** o superior.
- Un IDE o entorno que permita la ejecución de proyectos Java (como IntelliJ IDEA, Eclipse, o la terminal con el compilador `javac`).

## Cómo Ejecutar el Proyecto

1. Clona este repositorio o descarga el código fuente.
2. Importa el proyecto en tu IDE de preferencia.
3. Asegúrate de que el proyecto esté correctamente configurado para usar al menos Java 8.
4. Navega a la clase `Client.java` que se encuentra en el paquete `com.airline.client`.
5. Ejecuta la clase `Client.java`. Esto realizará el proceso completo de reserva de vuelo utilizando la fachada.

El sistema realizará las siguientes operaciones:
- Autenticará al usuario.
- Buscará vuelos disponibles.
- Verificará la disponibilidad de asientos.
- Procesará el pago.
- Aplicará puntos de recompensa.
- Enviará una notificación de confirmación al correo electrónico del cliente.

## Ejemplo de Salida Esperada

```
Authenticating user: FrequentFlyer123
User authenticated successfully.
Finding flight from New York to Los Angeles in Business class.
Flight found in Business
Checking seat availability for flight: AA101 in Business class.
Seats available in Business
Processing payment with card: 1234-5678-9876-5432
Calculating tax for currency: USD
Payment processed. Total amount with tax: 920.0
Applying 200 reward points for user: FrequentFlyer123
Sending priority email to customer@example.com: Your flight from New York to Los Angeles has been booked in Business class.
Flight booking completed successfully.
```

## Extensiones y Mejora del Proyecto

Este proyecto es una base sólida para un sistema de reservación de vuelos y puede extenderse en varias direcciones:

- **Soporte para múltiples métodos de pago**: Agregar soporte para otros métodos como PayPal, Apple Pay, etc.
- **Notificaciones SMS o Push**: Mejorar el sistema de notificaciones para que incluya SMS o notificaciones push.
- **Manejo de errores**: Ampliar el manejo de excepciones y errores para situaciones como vuelos llenos o fallas en los pagos.
- **Persistencia de Datos**: Integrar una base de datos para almacenar los detalles de las reservas.

## Créditos

Este proyecto es un ejemplo educativo basado en el patrón de diseño **Facade**, y su objetivo es demostrar cómo encapsular la complejidad de múltiples subsistemas para facilitar el uso por parte del cliente.

