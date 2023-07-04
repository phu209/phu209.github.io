const grades = [
    {name: 'John', grade: 8, sex: 'M'},
    {name: 'Sarah', grade: 12, sex: 'F'},
    {name: 'Bob', grade: 16, sex: 'M'},
    {name: 'Johnny', grade: 2, sex: 'M'},
    {name: 'Ethan', grade: 4, sex: 'M'},
    {name: 'Paula', grade: 18, sex: 'F'},
    {name: 'Donald', grade: 5, sex: 'M'},
    {name: 'Jennifer', grade: 13, sex: 'F'},
    {name: 'Courtney', grade: 15, sex: 'F'},
    {name: 'Jane', grade: 9, sex: 'F'}
   ]

//    Viết function tính thứ hạng trung bình của cả lớp
function avgGrades(arr) {
    let sum = 0;
    arr.forEach(avg => {
        sum += avg.grade;
    });
    return (sum/arr.length);
}
console.log(avgGrades(grades));


//    Viết function tính thứ hạng trung bình của nam trong lớp
//    Viết function tính thứ hạng trung bình của Nữ trong lớp
function findBySex(arr,sex) {
    return arr.filter((e) => e.sex === sex);
}
console.log(avgGrades(findBySex(grades,"M")));
console.log(avgGrades(findBySex(grades,"F")));


//    Viết function tìm học viên Nam có thứ hạng cao nhất trong lớp
//    Viết function tìm học viên Nữ có thứ hạng cao nhất trong lớp
function findMax (arr) {
    return Math.max(...arr.map((e) => e.grade));
}
console.log(findMax(findBySex(grades,"M")));
console.log(findMax(findBySex(grades,"F")));


//    Viết function tìm học viên Nam có thứ hạng thấp nhất trong lớp
//    Viết function tìm học viên Nữ có thứ hạng thấp nhất trong lớp
function findMin(arr) {
    return Math.min(...arr.map((e) => e.grade));
}
console.log(findMin(findBySex(grades,"M")));
console.log(findMin(findBySex(grades,"F")));


//    Viết function thứ hạng cao nhất của cả lớp
console.log(findMax(grades));

//    Viết function thứ hạng thấp nhất của cả lớp
console.log(findMin(grades));


//    Viết function lấy ra danh sách tất cả học viên Nữ trong lớp
console.log(findBySex(grades,"F"));


//    Viết function sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
function sortStudentsByName(arr) {
    return arr.sort((a,b) => a.name.localeCompare(b.name));
}
console.log(sortStudentsByName(grades));


//    Viết function sắp xếp thứ hạng học viên theo chiều giảm dần
function sortStudentsByGrade(arr) {
    return arr.sort((a,b) => b.grade - a.grade);
}
console.log(sortStudentsByGrade(grades));


//    Viết function lấy ra học viên Nữ có tên bắt đầu bằng “J”
function studentsStartingWithWord(arr,keyword) {
    return arr.filter((e) => e.name.includes(keyword));
}
console.log(studentsStartingWithWord(findBySex(grades,"F"),"J"));


//    Viết function lấy ra top 5 người có thứ hạng cao nhất trong lớp
function getTop5Students(arr) {
    return arr.slice(0,5);
}
console.log(sortStudentsByGrade(getTop5Students(grades)));