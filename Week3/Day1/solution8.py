class UserMainCode(object):
    @classmethod
    def secondLastDigit(cls, input1):
        n = abs(input1)
        if n < 10:
            return -1
        return (n // 10) % 10
