Spring Data JPA Example

This is a basic Spring Boot project using Spring Data JPA with an H2 in-memory database.
It saves two users and prints them in the console when the app starts.

How to run in Eclipse:
1. Extract the ZIP file.
2. Open Eclipse.
3. Go to File → Import → Maven → Existing Maven Projects → Next.
4. Browse to the extracted folder and click Finish.
5. Wait for Maven to download dependencies.
6. Right-click the project → Run As → Spring Boot App.

Expected output:
All users:
1: John
2: Jane

Optional:
- Open browser at http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- User: sa

What to put on GitHub:
- pom.xml
- src/ folder
- README.md

Made for quick demo and learning. 🚀
