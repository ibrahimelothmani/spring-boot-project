# Store Application / تطبيق المتجر

## English Version

### Overview
This is a Spring Boot learning project that demonstrates the implementation of a store management system. The project uses modern Spring Boot features and reactive programming with R2DBC.

### Technologies Used
- Java 24
- Spring Boot 3.4.5
- Spring Web (Reactive)
- Spring Data R2DBC
- PostgreSQL
- H2 Database (for testing)
- Lombok
- Docker Compose
- Maven

### Features
- Reactive programming with Spring WebFlux
- Database integration with R2DBC
- Docker support
- Development tools integration
- Testing with TestContainers

### Prerequisites
- Java 24 or higher
- Maven
- Docker and Docker Compose
- PostgreSQL (if running without Docker)

### Getting Started
1. Clone the repository:
```bash
git clone https://github.com/ibrahimelothmani/spring-boot-project
```

2. Navigate to the project directory:
```bash
cd store
```

3. Run the application:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

### Docker Support
The project includes Docker Compose support. To run with Docker:
```bash
docker-compose up
```

### Testing
Run the tests using:
```bash
./mvnw test
```

---

## النسخة التونسية

### نظرة عامة
هذا مشروع تعليمي باستخدام Spring Boot يوضح كيفية تنفيذ نظام إدارة المتجر. يستخدم المشروع ميزات Spring Boot الحديثة والبرمجة التفاعلية مع R2DBC.

### التقنيات المستخدمة
- Java 24
- Spring Boot 3.4.5
- Spring Web (تفاعلي)
- Spring Data R2DBC
- PostgreSQL
- قاعدة بيانات H2 (للاختبار)
- Lombok
- Docker Compose
- Maven

### المميزات
- برمجة تفاعلية مع Spring WebFlux
- تكامل قاعدة البيانات مع R2DBC
- دعم Docker
- تكامل أدوات التطوير
- اختبار باستخدام TestContainers

### المتطلبات الأساسية
- Java 24 أو أحدث
- Maven
- Docker و Docker Compose
- PostgreSQL (إذا كنت لا تستخدم Docker)

### البدء
1. استنساخ المستودع:
```bash
git clone https://github.com/ibrahimelothmani/spring-boot-project
```

2. الانتقال إلى مجلد المشروع:
```bash
cd store
```

3. تشغيل التطبيق:
```bash
./mvnw spring-boot:run
```

سيبدأ التطبيق على `http://localhost:8080`

### دعم Docker
يتضمن المشروع دعم Docker Compose. للتشغيل باستخدام Docker:
```bash
docker-compose up
```

### الاختبار
تشغيل الاختبارات باستخدام:
```bash
./mvnw test
``` 