class UserMainCode(object):
    @classmethod
    def createPIN(cls, input1, input2, input3):
        units_min = min(input1 % 10, input2 % 10, input3 % 10)
        
        tens_min = min((input1 // 10) % 10,
                       (input2 // 10) % 10,
                       (input3 // 10) % 10)
        
        hundreds_min = min((input1 // 100) % 10,
                           (input2 // 100) % 10,
                           (input3 // 100) % 10)
        
        max_digit = max(
            input1 % 10, (input1 // 10) % 10, (input1 // 100) % 10,
            input2 % 10, (input2 // 10) % 10, (input2 // 100) % 10,
            input3 % 10, (input3 // 10) % 10, (input3 // 100) % 10
        )
        
        pin = max_digit * 1000 + hundreds_min * 100 + tens_min * 10 + units_min
        return pin
