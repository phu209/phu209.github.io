// Bai 1:
// Tạo 1 thẻ p có id=“text”, có nội dung bất kỳ (có thể tạo bằng HTML hay Javascript - tùy chọn). Yêu cầu

// Đặt màu văn bản thành #777
// Đặt kích thước phông chữ thành 2rem
// Đặt nội dung HTML thành Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript.

document.body.insertAdjacentHTML("afterbegin",`<p id="text">abc</p>`);
const para = document.getElementById("text");
para.style.color = "#777";
para.style.fontSize = "2rem";
para.innerHTML = "Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript.";


// Bai 2
/*
<ul>
    <li>Item 1</li>
    <li>Item 2</li>
    <li>Item 3</li>
</ul>
*/

//Sử dụng vòng lặp để đặt màu chữ cho tất cả thẻ li thành màu blue


const li = document.querySelectorAll("li");

li.forEach(e => {
    e.style.color = "blue";
});


//Bai 3
/*
<ul id="list">
   <li>Item 1</li>
   <li>Item 2</li>
   <li>Item 3</li>
   <li>Item 4</li>
   <li>Item 5</li>
   <li>Item 6</li>
   <li>Item 7</li>
</ul>
*/

// Sử dụng javascript để thực hiện những công việc sau

// Thêm 3 thẻ <li> có nội dung Item 8, Item 9, Item 10 vào cuối danh sách

// Sửa nội dung cho thẻ <li> 1 thành màu đỏ (color)

// Sửa background cho thẻ <li> 3 thành màu xanh (background-color)

// Remove thẻ <li> 4

// Thêm thẻ <li> mới thay thế cho thẻ <li> 4 bị xóa ở bước trước, thẻ <li> mới có nội dung bất kỳ

const ul = document.getElementById("list");
const newList = "<li>Item 8</li><li>Item 9</li><li>Item 10</li>";
ul.insertAdjacentHTML("beforeend",newList);

const li1 = document.querySelector("li:first-child");
li1.style.color = "red";

const li3 = document.querySelector("li:nth-child(3)");
li3.style.backgroundColor = "blue";

const li4 = document.querySelector("li:nth-child(4)");
li4.parentElement.removeChild(li4);

li3.insertAdjacentHTML("afterend",`<li>Remove li4</li>`);