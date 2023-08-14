package vn.techmaster.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import vn.techmaster.demo.model.Bmi;

@RestController
@RequestMapping("/bmi")
public class BmiController {
    @GetMapping("")
    public String getBMI(@RequestParam double height, @RequestParam double weight) {
        return caculateBMI(height,weight);
    }

    @PostMapping("")
    public String postBMI(@RequestBody Bmi request) {
        double height = request.getHeight();
        double weight = request.getWeight();

        return caculateBMI(height,weight);
    }

    public String caculateBMI(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Height và weight phải là giá trị dương.");
        }
        double bmi = weight / (height * height);
        String result = "";
        if (bmi < 18.5) {
            result = "Thiếu cân";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            result = "Bình thường";
        } else if (bmi >= 25 && bmi < 29.9) {
            result = "Thừa cân";
        } else {
            result = "Béo phì";
        }

        return "Chỉ số BMI: " + bmi + ", Kết quả: " + result;
    }

    @ExceptionHandler(ResponseStatusException.class)
    public String handleInvalidType(ResponseStatusException e) {
        return e.getReason();
    }

}
