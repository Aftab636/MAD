ResearchGate App
Project Overview
The ResearchGate App is a mobile application designed to replicate key features of the popular academic networking platform, ResearchGate. This project aims to provide users with functionalities like creating an account, logging in, and accessing their personal profile. The first phase of development focuses on building the foundational screens: login, home, and profile.

Objective
The main goal of this app is to facilitate a seamless platform for researchers to connect, share their research, and collaborate. The first deliverable focuses on building the basic user interface and integrating the logic for these screens.

Screens and Features
1. Login Screen
Purpose: Allows users to log in using their credentials (email and password).
Logic: Authentication system implemented to verify user credentials. Upon successful login, the user is directed to the Home Screen.
2. Home Screen
Purpose: Displays an overview of the user’s recent activity and suggested publications.
Logic: Fetches and displays user-specific data using a mock database. The UI is designed to be intuitive, showing the latest research and trending topics.
3. Profile Screen
Purpose: Allows users to view and update their profile information, such as their name, bio, and academic interests.
Logic: Displays the user's information from the database, with future plans to include editing capabilities.
Setup Instructions
Prerequisites
Android Studio installed
Git for version control
An active GitHub repository
Steps to Set Up Locally
Clone the Repository:
bash
Copy code
git clone https://github.com/Aftab636/MAD.git
Open in Android Studio:
Open Android Studio.
Select Open an Existing Project.
Navigate to the folder where the repository is cloned, and select it.
Install Dependencies:
Ensure all necessary SDKs are installed in Android Studio as prompted.
Run the Application:
Connect an emulator or Android device.
Run the project using the play button in Android Studio.
Technical Challenges
1. State Management:
Handling user session and state between different screens (login, home, and profile) was a challenge. Implementing proper session management and navigation between screens required careful coordination of logic and UI.
2. UI/UX Consistency:
Ensuring consistency between different screen designs was crucial. The design needed to be responsive, while also adhering to Material Design guidelines.
3. Authentication Logic:
Building the login authentication system involved integrating with mock databases. This system is structured to support future expansions such as OAuth login and user registration.
Future Plans
Feature Expansion: Integrate more screens to support publication sharing, research searching, and networking between researchers.
Database Integration: Implement a real-time database system like Firebase or an SQL-based backend to store user profiles, publications, and connections.
OAuth Integration: Support Google and LinkedIn logins to simplify the authentication process.
Profile Editing: Allow users to edit and update their profiles, including adding publications and academic achievements.
