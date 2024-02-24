<details>
<summary>Tutorial 1</summary>
<details>
<summary>Reflection 1</summary>

1. You already implemented two new features using Spring Boot. Check again your source code and evaluate the coding standards that you have learned in this module. Write clean code principles and secure coding practices that have been applied to your code. If you find any mistake in your source code, please explain how to improve your code.

    In my opinion, the code provided in the tutorial is so clean that I question my programming skills. Each code file does not extend beyond my laptop screen and the indentation is consistent. The files are also neatly arranged in their respective folders which are indicated by the function of the files in them.

</details>

<details>
<summary>Reflection 2</summary>

1. After writing the unit test, how do you feel? How many unit tests should be made in a class? How to make sure that our unit tests are enough to verify our program? It would be good if you learned about code coverage. Code coverage is a metric that can help you understand how much of your source is tested. If you have 100% code coverage, does that mean your code has no bugs or errors?

    After writing unit tests, developers often gain confidence in their code, with at least one test per method being a standard practice. Code coverage, indicating the percentage of code executed by tests, is valuable but doesn't guarantee bug-free code at 100%. To ensure effective testing, scenarios, edge cases, and boundary conditions should be covered. Regularly update and refactor tests as code evolves, and seek feedback through code and test reviews. While high code coverage is beneficial, a focus on meaningful tests, combined with other testing methods, contributes to a more robust and reliable software testing strategy.


2. Suppose that after writing the CreateProductFunctionalTest.java along with the corresponding test case, you were asked to create another functional test suite that verifies the number of items in the product list. You decided to create a new Java class similar to the prior functional test suites with the same setup procedures and instance variables. What do you think about the cleanliness of the code of the new functional test suite? Will the new code reduce the code quality? Identify the potential clean code issues, explain the reasons, and suggest possible improvements to make the code cleaner!

    In my opinion, if two functional test suites have the same procedure setup and the same instance variables, they can be combined into one suite to reduce typing the same code many times.
</details>

</details>

<details>
<summary>Tutorial 2</summary>
You have implemented a CI/CD process that automatically runs the test suites, analyzes code quality, and deploys to a PaaS. Try to answer the following questions in order to reflect on your attempt completing the tutorial and exercise.

1. List the code quality issue(s) that you fixed during the exercise and explain your strategy
on fixing them.
    - Security on ci.yml: by limiting access to a GitHub action to read only.

2. Look at your CI/CD workflows (GitHub)/pipelines (GitLab). Do you think the current
implementation has met the definition of Continuous Integration and Continuous
Deployment? Explain the reasons (minimum 3 sentences)

    The implemented CI/CD workflows effectively embody the principles of Continuous Integration and Continuous Deployment. The `ci.yaml` workflow ensures rapid integration and early issue detection through automated testing on every push or pull request. The `scan.yaml` workflow enhances security by incorporating the Scorecard tool for continuous supply-chain vulnerability scanning. Additionally, the `sonarcloud.yaml` workflow contributes to code quality and ongoing improvement by integrating SonarCloud analysis on each push to the main branch. Together, these workflows form a comprehensive pipeline that aligns with CI/CD principles, promoting frequent integration, security validation, and continuous enhancement of code quality.


</details>

<details>
<summary>Tutorial 3</summary>
Apply the SOLID principles you have learned. You are allowed to modify the source code according to the principles you want to implement. To explain your principles, please answer the following questions: 1) Explain what principles you apply to your project; 2) Explain the benefits of applying SOLID principles to your project. Give an example, and 3) Explain the disadvantages if you do not apply SOLID principles to your project. Give an example. Write the answer in the README.md file.

1. - **Single Responsibility Principle (SRP)**: The Single Responsibility Principle is applied by ensuring that each class or module has only one reason to change. For example, `ProductRepository` and `CarRepository` have the single responsibility of managing the persistence of Product and Car entities, respectively.
    - **Open/Closed Principle (OCP):** The Open/Closed Principle is implemented by designing classes and modules that are open for extension but closed for modification. For instance, the controllers (`ProductController` and `CarController`) can be extended to add new features without modifying their existing code.

2. - **Flexibility**:OCP and SRP allow extending functionality without modifying existing code and can be done easily. This flexibility and convenience is valuable when we want to create an application that will continue to grow over time.
    - **Cohesion**: The advantage of the Single Responsibility Principle (SRP) is that it promotes high cohesion, meaning that each class or module has a single, well-defined responsibility, making the code more maintainable and understandable.
    - **Example**: For example, the application will have new features added. By following SRP, adding new features will be easier because each class in the code only handles one responsibility so developers can know which parts to change.

3. - **Code Rigidity**: Without OCP, modifying existing code becomes a necessity when extending functionality. This can lead to a rigid codebase that is resistant to changes and introduces a higher risk of introducing bugs.
    - **Maintenance Challenges**: Lack of SRP can result in classes or modules with multiple responsibilities. When changes are required, understanding the impact and making modifications becomes challenging.
    - **Example**: Consider a scenario where a new feature called `CarRating` is to be added to the application and this feature is written inside `CarRepository.java`. This scenario violates SRP because `CarRepository.java` handles two responsibilities namely managing the database and handling car ratings. These violations make the code difficult to read and maintain.
</details>

<details>
<summary>Tutorial 4</summary>
<details>
<summary>Reflection 1</summary>

1. Reflect based on Percival (2017) proposed self-reflective questions (in “Principles and Best Practice of Testing” submodule, chapter “Evaluating Your Testing Objectives”), whether this TDD flow is useful enough for you or not. If not, explain things that you need to do next time you make more tests.

   After following this week's tutorial, I realized that TDD flow is complicated but must be implemented because by using this flow, it is more likely that errors can be detected during the development stage compared to being detected during the maintain stage.

2. You have created unit tests in Tutorial. Now reflect whether your tests have successfully followed F.I.R.S.T. principle or not. If not, explain things that you need to do the next time you create more tests.
   
   In my opinion, the tests that have been created during the tutorial so far have followed the F.I.R.S.T. principle because the tests made so far have covered several possible happy paths and unhappy paths.
</details>
</details>