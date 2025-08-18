class UserMainCode(object):
    @classmethod
    def getCodeThroughStrings(cls, input1):
        total_length = sum(len(word) for word in input1.split())
        
        while total_length >= 10:
            total_length = sum(int(digit) for digit in str(total_length))
        
        return total_length
