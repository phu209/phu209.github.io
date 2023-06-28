//Bài 1:
function caculateFactorial(num) {
    if(num < 0) {
        return "Không tính giai thừa của số âm.";
    }else if (num == 0 || num == 1) {
        return 1;
    }else {
        let n = 1;
        for( let i = 2; i <= num; i++) {
            n *= i;
        }
        return n;
    }
}
console.log(caculateFactorial(5));

//Bài 2:
function reverseString(str) {
    let reverse = "";
    for(let i = str.length-1; i >= 0; i--) {
        reverse += str[i];
    }
    return reverse;
}
console.log(reverseString("Hello"));

//Bài 3:
function translate(countryCode) {
    switch(countryCode) {
        case "VN":
            return "Xin chào";
        case "EN":
            return "Hello";
        case "CN":
            return "Nǐ hǎo";
        case "JP":
            return "Konnichiwa";
        case "FR":
            return "Salut";
        default:
            return "Không tìm thấy mã quốc gia";
    }
}
console.log(translate("FR"));

//Bài 4:
function subString(str) {
    if(str.length <= 15) {
        return str;
    }else {
        let substring1 = str.substring(0,10) + "...";
        return substring1;
    }
}
console.log(subString("xinchaocacbandenvoiTechmaster"));
