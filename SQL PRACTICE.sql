CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    marks INT
);

INSERT INTO students (id, name, marks) VALUES
(1, 'Alice', 82),
(2, 'Bob', 67),
(3, 'Charlie', 91),
(4, 'David', 74),
(5, 'Eva', 88);

SELECT name, marks
FROM students
WHERE marks > 75;

SELECT name, marks
FROM students
WHERE marks > 75;
