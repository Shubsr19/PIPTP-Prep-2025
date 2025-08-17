class UserMainCode(object):
    @classmethod
    def countEven(cls, input1, input2, input3, input4, input5):
        count = 0
        for num in (input1, input2, input3, input4, input5):
            if num % 2 == 0:
                count += 1
        return count
