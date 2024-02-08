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