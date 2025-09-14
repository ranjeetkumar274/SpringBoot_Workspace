# 🚀 Spring Boot + Microservices Workspace

![GitHub repo size](https://img.shields.io/github/repo-size/ranjeetkumar274/SpringWorkspace?color=blue&style=for-the-badge)
![GitHub stars](https://img.shields.io/github/stars/ranjeetkumar274/SpringWorkspace?style=for-the-badge&color=yellow)
![GitHub forks](https://img.shields.io/github/forks/ranjeetkumar274/SpringWorkspace?style=for-the-badge&color=green)
![License](https://img.shields.io/github/license/ranjeetkumar274/SpringBoot_Workspace?style=for-the-badge&color=red)


> 📚 A **complete Spring Boot learning repository** — from IoC & Dependency Injection basics to building **SpringBoot + Microservices**.  
> Includes **step-by-step code examples** and **personal notes** 📒 for revision.

---

## 📖 Table of Contents + Notes  

| **Table of Contents** | **Notes** |
|------------------------|-----------|
| [Overview](#-overview) | [01 - Introduction Notes](Notes/14.%20Introduction%20Notes.txt) |
| [Learning Roadmap](#-learning-roadmap) | [02 - Spring Core Notes](Notes/13.%20Spring%20Core%20Notes.txt) |
| [Architecture](#-architecture) | [03 - Spring Boot Basics](Notes/12.%20Spring%20Boot%20Notes.txt) |
| [Tech Stack](#-tech-stack) | [04 - Spring MVC Notes](Notes/09.%20Spring%20Web%20MVC.txt) |
| [Getting Started](#-getting-started) | [05 - Spring Data JPA Notes](Notes/10.%20Data%20JPA%20Notes.txt) |
| [Contributing](#-contributing) | [06 - Security Notes](Notes/06.%20Spring%20Security%20Notes.txt) |
| [License](#-license) | [07 - Microservices Notes](Notes/07.%20Microservices%20Notes.txt)<br>[08 - Rest API Notes](Notes/08.%20REST%20API%20Notes.txt) |

---

## 📝 Overview
This repository is designed as a **self-paced course + code workspace** for mastering **Spring Boot and Microservices**.  

Each module folder contains:
- ✅ **Code examples**  
- ✅ **Excalidraw diagrams**  
- ✅ **Notes (txt files)** for revision  

---

## 🛤 Learning Roadmap
| Module | Topics Covered |
|--------|----------------|
| **01 - IoC & DI** | Inversion of Control, Dependency Injection |
| **02 - Spring Core** | Beans, ApplicationContext, Bean Lifecycle |
| **03 - Spring Boot Basics** | Starters, AutoConfig, Profiles |
| **04 - Spring MVC** | Controllers, REST APIs, Thymeleaf |
| **05 - Spring Data JPA** | Entities, Repositories, Queries |
| **06 - Security** | Authentication, Authorization |
| **07 - Microservices** | Service Discovery, API Gateway |

---

## 🏗 Architecture
Here’s the high-level Spring Boot application architecture:

![Spring Boot Architecture](./Untitled-2025-08-19-1219.excalidraw.svg)

---

## 🛠 Tech Stack
- **Java 17+**  
- **Spring Boot 3+**  
- **Spring Data JPA**  
- **Hibernate**  
- **Thymeleaf**  
- **Spring Security**  
- **MySQL**  


---

## 🚀 Getting Started

### Prerequisites
- **Java 17+** installed
- **Maven 3.6+** or **Gradle 7.0+** (some modules use Gradle)
- **MySQL 8.0+** (for JPA examples)
- **IDE** (IntelliJ IDEA, Eclipse, or VS Code)

### Quick Start
```bash
# Clone the repository
git clone https://github.com/ranjeetkumar274/SpringBoot_Workspace.git
cd SpringBoot_Workspace

# For Maven-based modules (most modules)
cd 01-IOC-DI-App
mvn clean compile exec:java

# For Gradle-based modules (e.g., 02-SpringBoot-App)
cd 02-SpringBoot-App
./gradlew bootRun

# For Spring Boot applications with Maven wrapper
cd 13-WebMVC-thymleaf
./mvnw spring-boot:run
```

### Module Structure
Each module is self-contained with its own:
- `pom.xml` - Maven dependencies
- `src/main/java` - Source code
- `src/main/resources` - Configuration files
- `README.md` (where applicable) - Module-specific instructions

### Running Examples
1. **IoC & DI Examples**: Start with `01-IOC-DI-App`
2. **Spring Boot Basics**: Explore `02-SpringBoot-App`
3. **Data JPA**: Try `05-SpringData-JPA-App` (requires MySQL setup)
4. **Web MVC**: Run `10-SpringWebMVC-App-2`
5. **REST APIs**: Test `19-SB-Rest-Api-1`

---

## 🤝 Contributing

We welcome contributions! Please follow these guidelines:

### How to Contribute
1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Commit** your changes (`git commit -m 'Add some amazing feature'`)
4. **Push** to the branch (`git push origin feature/amazing-feature`)
5. **Open** a Pull Request

### Contribution Guidelines
- Follow existing code style and formatting
- Add comments for complex logic
- Update documentation for new features
- Test your changes thoroughly
- Include relevant notes in the `Notes/` directory

### Areas for Contribution
- 📝 Additional code examples
- 🐛 Bug fixes and improvements
- 📚 Documentation enhancements
- 🧪 Test cases
- 🎨 Excalidraw diagrams

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

### MIT License Summary
- ✅ Commercial use
- ✅ Modification
- ✅ Distribution
- ✅ Private use
- ❌ Liability
- ❌ Warranty

---

## 🙏 Acknowledgments

- **Mr. Ashok** - Course Trainer ([AshokIT](https://ashokitech.com))
- **Spring Framework Team** - For the amazing framework
- **Community Contributors** - For valuable feedback and improvements

---

## 📞 Contact

**Ranjeet Kumar**
- GitHub: [@ranjeetkumar274](https://github.com/ranjeetkumar274)
- Course Content: [AshokIT Spring Boot Course](https://ashokitech.com/spring-boot-microservices-online-training)

---

⭐ **Star this repository if it helped you!** ⭐
