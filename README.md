# ChallengeExchange
Conversor de monedas, tasas de cambio de divisas: Dolares, Euros, Pesos, etc
# Currency Converter

Este proyecto es una aplicación Java que utiliza la API de Exchange Rate para realizar conversiones de divisas. El proyecto está construido utilizando **Maven** para la gestión de dependencias y la estructura del proyecto.

## Descripción

El **Currency Converter** toma una cantidad de dinero en una divisa de origen y la convierte a una divisa de destino usando tasas de cambio actuales. La aplicación hace uso de la API de Exchange Rate para obtener las tasas de cambio actualizadas y la librería **Gson** para procesar los datos en formato JSON.

## Características

- Conversión de una divisa a otra utilizando tasas de cambio en tiempo real.
- Recuperación de tasas de cambio desde la API **Exchange Rate**.
- Implementación simple usando Java con una arquitectura modular.

## Requisitos

Para poder ejecutar este proyecto, necesitas tener instalados los siguientes elementos:

- **Java 11** o superior
- **Maven** para la gestión de dependencias

## Instalación

1. **Clona este repositorio:**

   ```bash
   git clone https://github.com/tu_usuario/currency-converter.git

## estructura del proyecto

currency-converter/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── alura/
│   │               ├── CurrencyConverter.java
│   │               ├── ExchangeRateAPI.java
│   │               └── Main.java
│   └── test/
│       └── java/
│           └── com/
│               └── alura/
│                   └── AppTest.java
│
├── pom.xml
└── README.md
