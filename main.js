console.log("Hello world");
// alert("Hello");

// Khai báo biến và không gán giá trị cho biến
let age;
age = 35;

// Khai báo biến và gán giá trị cho biến
let email = "hien@techmaster.vn";

const PI = 3.14;  // Khai báo hằng số

// Kiểu dữ liệu nguyên thủy Java : boolean, char, byte, short, int, long, float,double
// Kiểu dữ liệu trong JS number, string, boolean, null, undefined (Kiểu dữ liệu mặc định khi khai báo chưa gán giá trị), symbol (ES6)

const status = true;
const name1 = null;
const userId = undefined;

// ES6 : Template string
let name = "Bùi Hiên"
let year = 1997

function getAge(year) {
    return 2023 - year;
}

console.log(`Xin chào các bạn, mình tên là ${name}. Năm nay ${2023 - year} tuổi`);
console.log("Xin chào các bạn, mình tên là " + name + ". Năm nay " + (getAge(year)) +" tuổi");

console.log(1 + "0");       // chuỗi: "10" Toán tử cộng là nối chuỗi
console.log(1 - "0");       // 1    còn lại đều chuyển sang số ra số
console.log(2 * "2");       // 4
console.log("2" * "3");     // 6
console.log("9" / 3);       // 3
console.log("2" * "3a");    // NaN = Not a Number

// Method & Function
// Method được định nghĩa trong class, đi liền với đối tượng
// Function xử lý 1 tác vụ như Method và có thể gọi độc lập

// C1 : Regular function
function sum(a, b) {
    return a + b ;
}

// C2 : Function expression : gán function cho 1 biến   // Default Parameter (ES6)
const sum1 = function(a = 20, b = 30) {
    return a + b;
}

console.log(sum(3,4));
console.log(sum1(3,4));

console.log(sum1(10));     // a = 10, b = undefined => a + b = 10 + undefined = NaN
console.log(sum1());       // a = undefined, b = undefined => a + b = undefined + undefined = NaN

// C3 : Arrow function (ES6) : Loại bỏ từ khóa function và có =>
const sum2 = (a,b) => {
    return a + b;
}

    // Nếu có 1 câu lệnh return duy nhất
    const sum3 = (a,b) => a + b;

/*
    Scope có thể hiểu nôm na là “phạm vi sử dụng của biến”

    Có 3 loại scope:

        Global scope   : Một biến được coi là global scope (toàn cục) nếu biến đó được định nghĩa bên ngoài function
        Function scope : Một biến được coi là function scope nếu biến đó được định nghĩa bên trong function
        Block scope    : Một biến được coi là block scope nếu biến đó được định nghĩa bên trong cặp dấu {}

        Nếu 1 biến không có từ khóa khai báo biến, sẽ trở thành biến global
*/

function sum5(a,b) {
    let userName = "Phung Van P";
    console.log(userName);
    console.log(userName.length);
    return a + b;
}

console.log(sum5(3,4));

// console.log(userName);

{
    let fullName = "Phung Van Phu";
    console.log(fullName.concat("abc"));
}
// console.log(fullName);


function repeatString1(str) {
    let value = "";
    for(let i = 1; i <= 10 ; i++) {
        value += str;
    }
    return value;
}

console.log(repeatString1("a"));


function repeatString2(str) {
    let value = "";
    for(let i = 1; i < 10; i++) {
        value += str + "-";
    }
    value += str;
    return value;
}
console.log(repeatString2("a"));


function repeatString3(str,n) {
    let value = "";
    for(let i = 1; i < n; i++) {
        value += str + "-";
    }
    value += str;
    return value;
}
console.log(repeatString3("a",6));


function total() {
    let sum = 0;
    for(let i = 1; i <= 100; i++) {
        if(i % 5 == 0) {
            sum += i;
        } 
    }
    return sum;
}
console.log(total());

function sphereVolume(radius) {
    let volume = (4*Math.PI*Math.pow(radius,3))/3;
    return volume; 
}
console.log(sphereVolume(5));


