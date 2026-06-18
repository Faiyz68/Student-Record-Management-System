# Student Record Management System (Java File I/O)

## Developer
* **Submission Date:** June 18, 2026
* **Presentation Date:** June 19, 2026

## System Design & Architecture
This system is designed using clean Object-Oriented Programming (OOP) principles to handle data persistence through various Java I/O streams.

### 1. Architectural Components
* **`Student.java` (Model):** Captures individual student entity details (ID, Name, Department, GPA). It implements `Serializable` to enable object-state preservation. Fields are strictly encapsulated using `private` access modifiers and exposed via public getters/setters.
* **`StudentRecordSystem.java` (Controller/Logic):** Manages data structures and file stream manipulations. It contains the core logic for adding, searching, updating, and deleting records, alongside reporting mechanics.
* **`Main.java` (View/User Interface):** Provides a fully interactive console-driven interface utilizing `java.util.Scanner` for direct human interaction.

### 2. Stream & Storage Implementation
* **Object Serialization (`ObjectOutputStream` / `ObjectInputStream`):** Used as the primary operational database mechanism. Entire collections of student structures are written and parsed directly to and from `students.ser`.
* **Text File I/O (`PrintWriter`):** Used to output structured, human-readable data summaries into `report.txt` containing metrics like average, highest, and lowest GPAs.
* **Buffered Streams (`BufferedInputStream` / `BufferedOutputStream`):** Integrated directly within the system's backup pipeline (`backup.ser`) to ensure optimized high-speed block data processing.

## How to Run the Application
1. Clone this repository to your local directory.
2. Compile all source files: `javac Main.java Student.java StudentRecordSystem.java`
3. Launch the operational ecosystem: `java Main`
4. Interact using the console menu instructions.
