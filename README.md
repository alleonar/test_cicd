# commande pour compiler

`javac -cp "lib/*" -d bin $(find src tests -name "*.java")`

# commande pour run les tests

`java -cp "bin;lib/*" org.junit.runner.JUnitCore CalculatorTest`

# Simple java compiler

![CI](https://github.com/alleonar/test_cicd/actions/workflows/ci.yml/badge.svg)

Pipeline CI/CD avec github actions:

calculator avec add et substract