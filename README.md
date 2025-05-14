🎲 hundred_Prisoners
🔐 100 Prisoners Problem Simulator

This is a simple Java application that simulates the well-known 100 prisoners' problem.

To learn more about the problem, watch this great explanation from Veritasium on YouTube:
👉 [Veritasium - The 100 Prisoners Problem](https://www.youtube.com/watch?v=iSNsgj1OCLA&t=566s).
🧠 About the App

This app tests the success rate of the strategy described in the video above.
🚀 How to Run
  1. Clone the repository to your local machine,
    
  ```sh
    git clone https://github.com/BME-Jafar/hundred_Prisoners/
  ```
    
  2. Open a terminal inside the folder containing hundredPrisoners.jar.
  3. Run the program using the following command:
  ```java
    java -jar hundredPrisoners.jar <number_of_prisoners> <number_of_attempts>
  ```

🔧 Example:
  ```java
    java -jar hundredPrisoners.jar 100 10000
  ```

This command will run the simulation for 100 prisoners, repeated 10,000 times.

📊 Sample Output
  ```sh
    [numberOfSuccess=30, numberOfFailings=70, ratio=0.3]
  ```

This shows how many times the prisoners succeeded, failed, and the overall success ratio.
