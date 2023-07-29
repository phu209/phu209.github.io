//Bài 1. Viết function truyền vào mảng các chuỗi có độ dài bất kỳ. Kết quả trả về là 1 mảng các chuỗi có độ dài lớn nhất
function getStringHasMaxLength(arr) {
  let maxLength = 0;
  const strings = [];

  arr.forEach((str) => {
    const currentLength = str.length;
    if (currentLength > maxLength) {
      maxLength = currentLength;
    }
    if (currentLength === maxLength) {
      strings.push(str);
    }
  });

  return console.log(strings);
}
getStringHasMaxLength(["aba", "aa", "ad", "c", "vcd"]);



//Bài 2
//Viết function truyền vào 1 mảng các object user. Trả về mảng các user có age > 25 và isStatus = true
//Viết function truyền vào 1 mảng các object user. Trả về mảng các user có age tăng dần

users = [
  {
    name: "Bùi Công Sơn",
    age: 30,
    isStatus: true,
  },
  {
    name: "Nguyễn Thu Hằng",
    age: 27,
    isStatus: false,
  },
  {
    name: "Phạm Văn Dũng",
    age: 20,
    isStatus: false,
  },
];

function findUser(arr) {
  let a = [];
  arr.forEach((user) => {
    if (user.age > 25 && user.isStatus === true) {
      a.push(user);
    }
  });
  return console.log(a);
}
findUser(users);

function sortByAge(arr) {
  arr.sort((a, b) => a.age - b.age);

  return console.log(arr);
}
sortByAge(users);



//Bài 3. Viết function truyền vào 1 mảng các chuỗi. Trả về Object hiển thị xem mỗi phần tử trong mảng xuất hiện bao nhiêu lần
function getCountElement(strings) {
  const countMap = {};

  strings.forEach((str) => {
    if (countMap[str]) {
      countMap[str]++; 
    } else {
      countMap[str] = 1; 
    }
  });

  return console.log(countMap);
}

getCountElement(["one", "two", "three", "one", "one", "three"]);
