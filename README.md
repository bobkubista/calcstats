Your task is to process a sequence of integer numbers to determine the following statistics:

minimum value
maximum value
number of elements in the sequence
average value
For example: [6, 9, 15, -2, 92, 11]

minimum value = -2
maximum value = 92
number of elements in the sequence = 6
average value = 21.833333

## Build

Requires Java 25 and Maven 3.9 or newer.

- `mvn verify` runs the tests, JaCoCo coverage and the Spotless format check.
- `mvn spotless:apply` fixes the formatting when the check fails.

Jenkins on the kvm-server cluster builds every branch and sends the results to SonarQube.
