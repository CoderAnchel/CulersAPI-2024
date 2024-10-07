# FC Barcelona API ⚽️

![image](https://github.com/user-attachments/assets/0b6bc082-e587-4cd2-81bf-2974b3073d22)

## Welcome to the FC Barcelona API!

A RESTful API developed in **Java** using **Spring Boot** and **MySQL**. This API provides endpoints for managing and retrieving information about FC Barcelona players, surpassing simpler implementations (https://github.com/CoderAnchel/FC-Barcelona-API) and offering a robust and scalable solution.This is my first API project in a more structured way with ORM and an MVC architecture. I hope to improve soon with new APIs that utilize tokens and are more secure, but I feel this is a good starting point.

## Project Structure

The project is organized into the following components:

![trueee](https://github.com/user-attachments/assets/f758c789-910c-47f6-bb13-f9c5965985bb)

## API Endpoints

The FC Barcelona API features dynamic endpoints that represent a significant improvement over the previous implementation in Express, which relied on a single endpoint. This transition enhances the flexibility and usability of the API, allowing for more specific data retrieval.

The API exposes the following endpoints:


### Example Usage

```bash
# Get all players
curl -X GET "http://localhost:8080/api/players"

# Get a player by name
curl -X GET "http://localhost:8080/api/players/Pedri"

# Get a player by number
curl -X GET "http://localhost:8080/api/players/numbers/30"

# Get players by nationality
curl -X GET "http://localhost:8080/api/players/nationality/Spain"
```

## Data Access and ORM

The API utilizes JdbcTemplate for efficient data access and mapping between the database and Java objects.

## Database Schema

The database schema consists of the following table (Example):

| id | name | nationality | weight | height | dateOfBirth | number | apparences | goals | assists | cleanSheets | saves |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| 1 | Pedri | España | 60kg | 1.74m | 2002-11-25 | 8 | 153 | 22 | 15 | null | null |

players: Stores information about each player, including their name, jersey number, nationality, and other relevant details.

## Conclusion 🎉

In summary, the adoption of dynamic endpoints in the FC Barcelona API marks a considerable step forward in API design, offering improved flexibility, a better user experience, and a foundation for future expansion compared to the previous Express implementation. This architectural shift not only streamlines data access but also aligns with best practices in API development.
