package com.nikki;




import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/basic")
public class BasicCon {

   @GetMapping("/add")
   public ApiRes add(@RequestParam BigDecimal augend, @RequestParam BigDecimal addend ) {
      return getResult(augend.add(addend));
   }

   @GetMapping("/subtract")
   public ApiRes subtract(@RequestParam BigDecimal minuent, @RequestParam BigDecimal subtrahend) {
      return getResult(minuent.subtract(subtrahend));
   }

   @GetMapping("/multiply")
   public ApiRes multiply(@RequestParam BigDecimal multiplier, @RequestParam BigDecimal multiplicand) {
      return getResult(multiplier.multiply(multiplicand));
   }
   @GetMapping("/squareroot")
   public ApiRes squareroot(@RequestParam BigDecimal number) {
      return getResult(number.sqrt(new MathContext(10)));
   }


   @GetMapping("/divide")
   public ApiRes divide(@RequestParam BigDecimal dividend, @RequestParam BigDecimal divisor) {
      if (divisor.equals(BigDecimal.ZERO)) {
         return getResultFromError("no division by null");
      }
      return getResult(dividend.divide(divisor, RoundingMode.HALF_EVEN));
   }

}
