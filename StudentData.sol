
// SPDX-License-Identifier: MIT
pragma solidity ^0.8.20;

contract StudentData {

    // Structure to store student details
    struct Student {
        uint id;
        string name;
        uint marks;
    }

    // Array to store multiple students
    Student[] public students;

    // Function to add student details
    function addStudent(uint _id, string memory _name, uint _marks) public {
        students.push(Student(_id, _name, _marks));
    }

    // Function to display student details
    function getStudent(uint index) public view returns (uint, string memory, uint) {
        Student memory s = students[index];
        return (s.id, s.name, s.marks);
    }

    // Function to get total number of students
    function getStudentCount() public view returns (uint) {
        return students.length;
    }

    // Fallback function
    fallback() external payable {
    }
}
