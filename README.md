# Test Driven Development (TDD)

**Objective:** Building a `Calculator` and a `DateChecker` in Java, tested with `JUnit 5`, using Test Driven Development approach.

Commit history shows each step:
1. Build a failing implementation (production code)
2. Write failing unit test for each method
3. Rewrite the implementation (production code) to pass the test

## How to Run the Tests
Maven and a JDK that matches the version set in `pom.xml`
```bash
mvn test
```

## Test Results
See `output.txt`
- 30 test runs in total (16 in `CalculatorTest` and 14 in `DateCheckerTest`)
- 0 failures

## CalculatorTest
- `sum`
- `subtract`
- `multiply`
- `divide`
- `isEven`

### Design
- Covers edge cases for division (division by 0 & truncation)

## DateChecker
- `has31Days`

### Design 
- Returns `True` for any month that has 31 days
- Throw `IllegalArgumentException` for NULL month
- Always returns `False` for February

## TDD Process
1. Set up Maven project and added JUnit 5
2. For each behavior, I wrote a test first (failing), ran it to confirm it failed for the right reason
3. Wrote the smallest production code to pass it
4. Cleaned up the production code if needed (refactor)
5. Created commit with meaningful message for each stage

## Key takeaways
1. Writing the test first made me decide what the method should do before I wrote it
2. Returning `False` or `0` gives a clean failing test to start from
3. Test cases such as negative numbers in `isEven` are already handled in the existing code, so I should not add or change my production code. I had to use `git revert` on this commit. This showed me the rule that "write only enough code to pass the test"
4. Splitting tests so each checks one behavior made failures easier to read
