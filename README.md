# Bengalensis Celandon Foundation Retake Exam

## Getting Started

- **Fork** this repository under your own account
- Clone your forked repository to your computer
- Commit your progress frequently and with descriptive commit messages
- All your answers and solutions should go in this repository
- Follow the styleguide
- Take care of the naming of classes, fields, variables, files, etc.

## Keep in mind

- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions,
  use your own words instead
- **Don't push your work** to GitHub until your mentor announces
  that the time is up

## Exercises

### Multiply items in a matrix

Write a method that takes a matrix as a parameter.

The function should:

- multiply each **odd** number by 2 in every **odd indexed row**
- multiply each **even** number by 2 in every **even indexed row**

and then returns altered matrix. We are talking about indexing from
developer's point of view (starting from 0). Zero is considered even number.

**Write 2 different unit test cases for this function**.

#### Example

Input

```text
[
  [1, 3, 6, 2],
  [7, 5, 6, 1],
  [3, 3, 1, 5],
  [9, 0, 5, 3]
]
```

Returned matrix

```text
[
  [1,  3,  12, 4],
  [14, 10, 6,  2],
  [3,  3,  1,  5],
  [18, 0,  10, 6]
]
```

### Worst songs

Write a method `worstYearInMusic(filename)` which can read and parse a file containing information about world's worst songs.
The method should receive one string parameter: the name of the file, and it should return the year
in which the highest amount of these awful songs was created.

Possible file reading exceptions should be handled by printing error message to the terminal.

#### Example

[Example input file can be found here.](./100worst.csv)

**Returned value for given file**

```text
1975
```

### Hospital simulator

Now we are going to create a simple hospital simulator game. We will need
patients, a hospital and different kinds of queues to handle our patients.
You can implement the necessary classes in any order, but we suggest you to
follow the order below.

#### Patient class

The *Patient* class doesn't depend on any other classes.
It has twwo methods:

- `getSeverity`, that retrieves the severity of patient's sickness.
- `treat`, which decreases the severity of said sickness by 1. *Even when treating repeatedly, the severity cannot go below 0!*

When creating a new patient, his/her severity is set to a random number between 1 and 10.

#### Queue class

If you have *Patient*s you can create an **abstract** *Queue* class. It will represent a way to hold the *Patient*s waiting for treatment.

- It has `queuePatientUp(patient)` method that adds a *Patient* to the queue.
- It has an **abstract** method `getNextPatient` that returns next patient in the queue.

The implementation is up to you, you can store the patients in any data structure that seems suitable.

#### Hospital class

Since you have *Queue* class and *Patient*s you can implement your *Hospital*
class as well.  The idea is that we are able to choose which kind of queue
hospital is using when creating it. It should fulfill the following requirements:

- It has a *Queue* field, which content is set through Hospital's constructor parameter.
- It has `addPatient(patient)` method that adds a *Patient* to this hospital's queue.
- It has `treatNextPatient` method that `treat`s the next patient in this hospital's queue.

#### ClassicQueue class

The classic queue is a specific queue type which is not abstract anymore. Its method
`getNextPatient` has the following specification:

- It returns the next patient as they joined the queue (first patient to arrive is served first).
- When you return this patient, also remove him/her from the queue.
- Returns `null` if the queue is empty

#### SafeQueue class

The safe queue is a specific queue type which is not abstract anymore. Its method
`getNextPatient` has the following specification:

- It always returns the patient with the highest severity.
- If there are more patients with the same severity you can return whichever.
- Returns `null` if the queue is empty

## Command line exercise

### Folder structure

- Take a look at this directory structure:

```text
computer-shop
 |--desktop
 |   |--.git
 |   |--instock
 |   |   └--summary.csv
 |   └--in-transit
 |       └--summary.csv
 └--laptop
     |--.git
     |--transit-summary.csv
     |--in-stock
     |   └--summary.csv
     └--in-transit
```

- Your task is to write commands in the correct order based on tasks listed below.
- Your current directory is `computer-shop/`
- Take careful note of which folders are git repositories!

### Your tasks

1. Rename `desktop/instock/` folder to `desktop/in-stock/`
1. Move `laptop/transit-summary.csv` file into `laptop/in-transit` folder while renaming it to `summary.csv`
1. Delete the last 2 lines from `laptop/in-stock/summary.csv`
1. Add and commit all the changes in **both** repositories

### Solution

```text
*type your answer here*
```
