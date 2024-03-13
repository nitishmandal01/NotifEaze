# Notification Integration Service

This Spring Boot application provides a framework for integrating with multiple SMS, email, and notification vendors. It defines interfaces for SMS, email, and notification services, along with sample implementations for Gupshup and Kaylera.

#Project Structure
![Image Description](https://drive.google.com/uc?id=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX)

## Prerequisites

- Java
- Spring Boot
- IDE (Integrated Development Environment)

## Getting Started

To get started with this project, follow these steps:

1. Clone this repository to your local machine.
2. Open the project in your preferred IDE.
3. Implement vendor-specific interfaces as required.
4. Use mock classes for testing purposes.
5. Create APIs to send SMS and emails using the provided controllers.

## Implementing Vendor-Specific Interfaces

To integrate with specific vendors like Gupshup and Kaylera, you need to implement the corresponding interfaces:

- `EmailService`
- `PushNotificationService`
- `SmsService`

Since direct integration with Gupshup and Kaylera is not required, you can utilize the provided mock classes (`GupshupMock` and `KayleraMock`) to simulate API responses during testing.

## Usage

Once the project is set up and the vendor-specific interfaces are implemented, you can use the provided controllers to test the services. APIs are available for sending SMS and emails.

## Contributors

- [Your Name](https://github.com/yourusername)

## License

This project is licensed under the [MIT License](LICENSE).
