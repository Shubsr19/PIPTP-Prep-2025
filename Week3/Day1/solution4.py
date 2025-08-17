class UserMainCode(object):
    @classmethod
    def sumOfLastDigits(cls, input1, input2):
        return (abs(input1) % 10) + (abs(input2) % 10)
