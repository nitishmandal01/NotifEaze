# Notification Integration Service

This Spring Boot application provides a framework for integrating with multiple SMS, email, and notification vendors. It defines interfaces for SMS, email, and notification services, along with sample implementations for Gupshup and Kaylera.

## Project Structure

![Project Structure](https://drive.google.com/uc?id=1dfsp7Kn9t3gtGk-v6zTDhGOw5jLMPndL)


## Prerequisites

- Java
- Spring Boot
- IDE (Integrated Development Environment)

## Getting Started

To get started with this project, follow these steps:

1. Clone this repository to your local machine.
2. Open the project in your preferred IDE.
3. Run this App in IDE.
4. Use mock classes for testing purposes.
5. Test the APIs to send SMS and emails using the provided controllers.

## Implementing Vendor-Specific Interfaces

To integrate with specific vendor- Gupshup, we implemented the corresponding interfaces:

- `EmailService`
- `PushNotificationService`
- `SmsService`

Since direct integration with Gupshup was not available, we have utilized the provided mock classes (`GupshupMock`) to simulate API responses during testing.

## Usage

Once the project is set up and the vendor-specific interfaces are implemented, we can use the provided controllers to test the services. APIs are available for sending SMS and emails.

## Contributors
Nitish Kumar Mandal
- [Github](https://github.com/nitishmandal01)
- [LinkedIn](https://www.linkedin.com/in/thenitishmandal/)
- [Portfolio](https://nitishmandal01.github.io)
