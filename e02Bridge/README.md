#  Patrón Bridge 
El Patrón Bridge es un patrón de diseño estructural que separa la abstracción de su implementación, permitiendo que ambas puedan evolucionar de manera independiente. En lugar de unir abstracción e implementación en una sola clase, este patrón usa una referencia hacia una implementación, permitiendo múltiples combinaciones entre ambas.

<p align="center">
  <img src="/IMG.png" alt="reto" width="800"/>
</p>

## Ejemplo del Sistema de Pago en Línea

## Objetivo:
El objetivo es diseñar un sistema de pagos en línea que permita a los clientes realizar pagos utilizando diferentes métodos de pago (tarjeta, monedero digital) a través de diferentes pasarelas de pago (Stripe, PayPal). Queremos que los métodos de pago (tarjeta, monedero) y las pasarelas de pago (Stripe, PayPal) sean independientes, de modo que puedan evolucionar por separado, y podamos combinar cualquier método de pago con cualquier pasarela.

## Necesidad:
- **Métodos de Pago:** El cliente puede pagar con tarjeta de crédito/débito o mediante un monedero digital (como Google Pay o Apple Pay).
- **Pasarelas de Pago:** Los pagos deben procesarse a través de diferentes pasarelas de pago (Stripe, PayPal, etc.).
La necesidad de aplicar el Patrón Bridge surge cuando queremos separar el método de pago (la abstracción) de la pasarela de pago (la implementación). Así, podríamos combinar cualquier método de pago con cualquier pasarela sin modificar mucho código.

### Clases Principales

- **Payment (Abstracción)**: Define la interfaz general para realizar un pago.
    - **CardPayment**: Implementa el pago con tarjeta.
    - **WalletPayment**: Implementa el pago con un monedero digital.

- **PaymentGateway (Implementación)**: Define la interfaz para las pasarelas de pago.
    - **StripeGateway**: Implementa la pasarela de pago para Stripe.
    - **PayPalGateway**: Implementa la pasarela de pago para PayPal.

### Cómo Funciona el Patrón Bridge en este Ejemplo

1. **Abstracción (Payment)**:
    - La clase `Payment` es la abstracción que define el comportamiento común de todos los pagos.
    - Las clases `CardPayment` y `WalletPayment` extienden esta abstracción para proporcionar implementaciones específicas de los métodos de pago.

2. **Implementación (PaymentGateway)**:
    - La interfaz `PaymentGateway` define cómo se deben procesar los pagos a través de una pasarela.
    - Las clases `StripeGateway` y `PayPalGateway` son implementaciones concretas de diferentes pasarelas de pago.

3. **Combinación Abstracción-Implementación**:
    - El patrón **Bridge** permite combinar cualquier método de pago (abstracción) con cualquier pasarela de pago (implementación) sin modificar el código existente. Se puede agregar un nuevo método de pago o una nueva pasarela simplemente implementando las respectivas clases, sin cambiar el comportamiento del sistema actual.
